import java.io.*;
import java.util.*;

public class WhatDoesTheFoxSay {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader lect = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(lect.readLine());

		for (int i = 0; i < n; i++) {
			String caso;
			String act[] = lect.readLine().split(" ");
			HashMap<String, animalWord> hm = new HashMap<String, animalWord>();

			for (int j = 0; j < act.length; j++) {

				pair parAct = new pair(j, act[j]);

				if (hm.containsKey(act[j])) {
					hm.get(act[j]).pairList.add(parAct);
				} else {
					hm.put(act[j], new animalWord(act[j]));
					hm.get(act[j]).pairList.add(parAct);
				}

			}
			while (!(caso = lect.readLine()).equals("what does the fox say?")) {
				String cAct[] = caso.split(" ");
				
					hm.remove(cAct[2]);
			}
			ArrayList<pair> ar = new ArrayList<pair>();
			for (String wAct : hm.keySet()) {
				while (!hm.get(wAct).pairList.isEmpty())
					ar.add(hm.get(wAct).pairList.remove());
			}

			Collections.sort(ar);
			for (int j = 0; j < ar.size(); j++) {
				System.out.print(ar.get(j).word + " ");
			}
			System.out.println();
		}
	}

}

class animalWord implements Comparable<animalWord> {

	Queue<pair> pairList;
	String w;

	public animalWord(String w) {
		this.w = w;
		pairList = new ArrayDeque<pair>();
	}

	@Override
	public int compareTo(animalWord o) {
		// TODO Auto-generated method stub
		return w.compareTo(o.w);
	}

}

class pair implements Comparable<pair> {
	int pos;
	String word;

	pair(int pos, String word) {
		this.pos = pos;
		this.word = word;
	}

	@Override
	public int compareTo(pair o) {
		// TODO Auto-generated method stub
		return pos - o.pos;
	}

}
