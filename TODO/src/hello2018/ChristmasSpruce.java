package hello2018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class ChristmasSpruce {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader lect = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter esc = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(lect.readLine());
		node[] arr = new node[n + 1];

		node root = new node(1, new ArrayList<node>(), true);

		arr[1] = root;
		for (int i = 2; i <= n; i++) {

			int act = Integer.parseInt(lect.readLine());

			if (arr[i] == null) {
				node nAct = new node(i, new ArrayList<node>(), true);
				arr[i] = nAct;
			}

			if (arr[act] != null) {

				arr[act].nodes.add(arr[i]);
				if (arr[act].leaf)
					arr[act].leaf = false;
			} else {
				node nAct = new node(act, new ArrayList<node>(), false);
				arr[act] = nAct;
				arr[act].nodes.add(arr[i]);
			}

		}

		boolean spruce = true;

		for (int i = 1; i < arr.length && spruce; i++) {

			int cont = 0;

			if (!arr[i].leaf && !arr[i].check) {

				for (int j = 0; j < arr[i].nodes.size(); j++) {

					if (arr[i].nodes.get(j).leaf)
						cont++;

				}
				if (cont < 3)
					spruce = false;

			}

		}

		if (spruce)
			esc.write("Yes");
		else
			esc.write("No");
		esc.flush();
	}

}

class node {

	int val;
	ArrayList<node> nodes;
	boolean leaf;
	boolean check;

	node(int val, ArrayList<node> nodes, boolean leaf) {
		this.val = val;
		this.nodes = nodes;
		this.leaf = leaf;
		check = false;
	}

}
