package Day3;

import java.util.ArrayList;

interface AddArray
{
	public void sum();
}


public class AddAllEleInArrayUsingLambda {

	static int d;
	public static void main(String[] args) {
		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(10);
		all.add(200);
		all.add(300);		
		for(int a : all)
		{
			AddArray g = ()->{
				d=d+a;
				System.out.println(d);
			};	
			g.sum();
		}
	}
}
