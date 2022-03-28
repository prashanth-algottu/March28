package Day4;

import java.util.ArrayList;
import java.util.function.Predicate;


// accept parameter and returns boolean
public class UsingPredicate {

	public static void main(String[] args) {
		
		ArrayList<Integer> ch = new ArrayList<Integer>();
		ch.add(10);
		ch.add(15);
		ch.add(30);
		
		Predicate<Integer> p = (i)->i>14;
		for(int a:ch)
		{
			System.out.println(p.test(a));
		}

	}

}
