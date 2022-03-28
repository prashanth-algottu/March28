package Day4;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StartWithAUsingLambda {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("aPrashanth");
		al.add("Chinnu");
		al.add("naveen");
		al.add("asujata");
		
		//System.out.println(al.stream().filter(i->i.contains("a")).collect(Collectors.toList()));
		
		al.forEach(i->{
			if(i.startsWith("C"))
			{
				System.out.println(i);
			}
		});
		
	}

}

