package hello2018;
import java.io.*;
import java.util.*;
public class domino {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		Scanner lect=new Scanner(System.in);
		
		while(lect.hasNext()) {
			int caso=lect.nextInt();
			
			ArrayList<ficha> hs=new ArrayList<ficha>();
			
			for (int i = 0; i <= caso; i++) {
				
				for (int j = 0; j <= caso; j++) {
					
					ficha act=new ficha(i,j);
					
					hs.add(act);
					
					
				}
				
			}
			System.out.println(hs.size());
			
			
			
			
			
		}
		
		
	}

}

class ficha implements Comparable<ficha> {

	int e1;
	int e2;

	ficha(int e1, int e2) {

		this.e1 = e1;
		this.e2 = e2;
	}

	@Override
	public int compareTo(ficha o) {
		// TODO Auto-generated method stub
		return o.e1 == e1 && o.e2 == e2 || o.e1 == e2 && o.e2 == e1 ? 0 : 1;
	}

}
