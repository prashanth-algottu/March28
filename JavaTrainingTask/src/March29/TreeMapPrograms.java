package March29;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapPrograms {

	public static void main(String[] args) {
		TreeMap<Integer, String> tp = new TreeMap<Integer, String>();
		tp.put(95, "chinnu");
		tp.put(99, "sree");
		tp.put(80, "aruna");
		tp.put(93, "bujji");
		tp.put(100, "giri");
		System.out.println(tp);
		
		Set<Entry<Integer, String>> entrySet = tp.entrySet();
		
		for(Entry<Integer, String> s :tp.entrySet())
		{
			System.out.println(s);
		}
		System.out.println(tp.firstEntry());
		System.out.println(tp.lastEntry());
		System.out.println(tp.firstKey());
		System.out.println(tp.lastKey());
		//System.out.println(tp.pollFirstEntry());
		
		// 6. Pgm to use treemap to sort Students in ascending order and based on marks
		System.out.println("ascending order based on marks");
		System.out.println(tp.keySet());
		for(int s :tp.keySet() )
		{
			System.out.println(s+ " : "+ tp.get(s));
		}
		System.out.println(tp.descendingKeySet());
		
		//descending order based on marks
		
		System.out.println("descending order based on marks");
		for(Integer i: tp.descendingKeySet())
		{
			System.out.println(i+ " : "+tp.get(i));
		}

	}

}
