
//4. Create a LinkedList with Strings, check whether a given string exists, get the first and 
//last index of a particular string.
package Day6;

import java.util.LinkedList;
import java.util.Scanner;

public class GetFirstAndLastIndexOfStringIfPresent {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("chinnu");
		ll.add("naresh");
		ll.add("sujatha");
		ll.add("sameera");
		ll.add("sujadtha");
		ll.add("sujatha");
		ll.add("naresh");
		ll.add("sreee");
	
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		for(String s : ll)
		{
			if(n.equals(s))
			{
				System.out.print("First Index : ");
				System.out.println(ll.indexOf(n));
				System.out.print("last Index : ");
				System.out.println(ll.lastIndexOf(n));
				break;
			}
		}
		

	}

}
