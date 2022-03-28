package Day3;

import java.util.ArrayList;
import java.util.function.Predicate;


interface Functional
{
	public void inter();
}
public class PrintEleUsingLambda 
{

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("chinnu");
		al.add("Sujatha");
		al.add("Naveen");
		al.add(100.25);
		
	
		for( Object st : al)
		{
			
			Functional f = ()->System.out.println(st);
			f.inter();
		}

	}

}
