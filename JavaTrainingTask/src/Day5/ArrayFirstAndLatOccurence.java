package Day5;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArrayFirstAndLatOccurence {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("chinnu");
		al.add("psammerar");
		al.add("psujathar");
		
		System.out.println(al.stream().filter(i->i.startsWith("p")).filter(i->i.endsWith("r")).collect(Collectors.toList()));

	}

}
