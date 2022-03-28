package Day4;

import java.util.ArrayList;
import java.util.function.Function;

public class UsinfFunctionLambda {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(5);
		a.add(4);
		a.add(3);
		
		
		Function<Integer, Integer> f = (i)->i*i;
		
		for(int d:a)
		{
			System.out.println(f.apply(d));
			
		}
		

	}

}
