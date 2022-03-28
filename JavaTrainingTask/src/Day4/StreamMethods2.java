package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods2 {

	public static void main(String[] args) {
		String h = "chinnu";
		System.out.println(h.startsWith(h, 'z'));
		
		List<Integer> list1 = List.of(10,20,25,45,26);
		// list1.add(48); 
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(25);
		list2.add(3);
		list2.add(6);
		
		List<Integer> list3 = Arrays.asList(10,25,4,6);
		
		System.out.println(list1);
		
		// print even numbers without using streams
		
		List<Integer> newList = new ArrayList<Integer>();
		
		
		for(int a : list1)
		{
			if(a%2==0)
			{
				newList.add(a);
			}
		}
		System.out.println(newList);
		
//---------------------------------------------------------------------------------------------------------
		
		// print even numbers with using streams
		
		
		System.out.println(list1);
		
		List<Integer> l = list1.stream().filter(a->a%2==0).collect(Collectors.toList());
		System.out.println(l);
		
		list1.stream().
		
		System.out.println(list2);
		List<Integer> list = list2.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list);
		
		
		// Greater than 20
		System.out.println();
		System.out.println(list1);
		
		//List<Integer> collect = list1.stream().filter(i->i>20).collect(Collectors.toList());
		System.out.println(list1.stream().filter(i->i>20).collect(Collectors.toList()));
		
		
		// String names using Streams
		
		String names[]= {"chinnu","prashanth","praveen"  };
		Stream<String> stream = Stream.of(names);
		stream.forEach(i->{
			//System.out.println((i.startsWith("c")));
			if(i.startsWith("p"))
			{
				System.out.println(i);
			}
		});

	}

}
