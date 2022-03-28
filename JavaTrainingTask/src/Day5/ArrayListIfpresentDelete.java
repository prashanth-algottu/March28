package Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListIfpresentDelete {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("chinnu");
		al.add("prashanth");
		al.add("sameera");
		al.add("Sujatha");
		al.add("f");
		Scanner sc = new Scanner(System.in);
		//al.stream().forEach();
		String d1=sc.next();
		for(String d:al)
		{
			System.out.println(d);
			
			if(d.equals(d1))
			{
				
				al.remove(d);
				System.out.println("hi");
			}
			
		}
		
		System.out.println(al);
		
	}

}
