
//2. Create an ArrayList and check whether a given string is present, if yes, delete it.

package Day6;

import java.util.ArrayList;
import java.util.Scanner;

public class GivenStringIsPresenThenDelete {

	public static void main(String[] args) 
	{
		ArrayList<String> al =new ArrayList();
		al.add("sree");
		al.add("chinu");
		al.add("sujatha");
		al.add("sameera");
		System.out.println(al);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to delete");
		String s =sc.next();
		int i=0;
		
		// By using for each
	/*	for(String a : al )
		{
			i++;
			if(s.equals(a))
			{
				//System.out.println(i-1);
				
				al.remove(al.remove(i-1));
				break;
			}
		}
		System.out.println(al); */
		
		if(al.contains(s))
		{
			al.remove(s);
			System.out.println(al);
		}
	}

}










