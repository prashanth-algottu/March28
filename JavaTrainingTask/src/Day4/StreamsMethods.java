package Day4;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsMethods {
	public static void main(String[] args) 
	{
		List<Integer> list = List.of(10, 5, 6);
		
		System.out.println(list.stream().map(i->i*i).collect(Collectors.toList()));
		 	
		System.out.println(list.stream().collect(Collectors.toList()));
		
		System.out.println("printing 1st form");
		list.stream().forEach(i->System.out.println(i));
		
		System.out.println("printing 2nd form");
		list.stream().forEach(System.out::println);
		
		System.out.println("Sorted 1st form");
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		
		System.out.println("Sorted 2nd form");
		list.stream().sorted().forEach(i->System.out.println(i));
		
		System.out.println("Sorted 3rd form");
		list.stream().sorted().forEach(System.out::println);
		
		
		System.out.println("Sorted 4th form mean in the form of list");
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		
		System.out.println("Minimum of x,y");
		System.out.println(list.stream().min((x,y)->x.compareTo(y)).get());
		 
		System.out.println("Max of x,y");
		System.out.println(list.stream().max((x,y)->x.compareTo(y)).get());
		
		

		
	}

}
