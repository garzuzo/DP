package hello2018;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class ModularExponentation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader lect = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter esc = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(lect.readLine());
		BigInteger m = new BigInteger(lect.readLine());
		BigInteger two = new BigInteger("2");

		esc.write(m.mod(two.pow(n))+"\n");
		esc.flush();
	}

}
