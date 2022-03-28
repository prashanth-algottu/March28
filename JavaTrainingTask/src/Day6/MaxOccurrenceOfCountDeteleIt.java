
// 3. Create an ArrayList with Strings and count the occurrence of "Java" string and "Oracle" string. 
// whichever is occurring less times, delete it

package Day6;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MaxOccurrenceOfCountDeteleIt {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("oracle");
		al.add("oracle");
		al.add("oracle");
		al.add("java");
		al.add("oracle");
		al.add("oracle");
		al.add("oracle");
		al.add("java");
		al.add("java");
		System.out.println(al);
		int j=0;
		int o=0;
		
		for(String d : al)
		{
			if(d.equals("java"))
				j++;
				
			else if(d.equals("oracle"))
				o++;
		}

			if(j<o)
			{
		
				for(int i=0;i<=j;i++)
					al.remove("java");
			}
			else
			{
				//System.out.println(o);
				for(int i=0;i<=o;i++)
					al.remove("oracle");
				
			}
		System.out.println(al);

	}

}
