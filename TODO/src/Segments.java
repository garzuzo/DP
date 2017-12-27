import java.io.*;
import java.util.*;

public class Segments {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);

		int num = lector.nextInt();

		int form = (num * (num + 1)) / 2;
		
		if (num != 1)
			System.out.println((int)Math.abs((form - Math.pow(2, num - 2))));
		else
			System.out.println(1);
	}

}
