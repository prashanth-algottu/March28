package March29;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapRelated {

	public static void main(String[] args) {
		
	HashMap<Integer,String> m = new HashMap<Integer,String>();
	//HashMap m = new HashMap();
	m.put( 101, "chinnu");
	m.put(102, "sree");
	m.put(106, "sree");
	m.put(105, "prashanth");
	m.put(103, "Shubam");
	
	System.out.println(m);
	
	System.out.println(m.get(101));
//	System.out.println(m.remove(106));
	System.out.println(m);
	
	// 2. Pgm to Check if a map contains mapping for a specified key
	
	System.out.println(m.containsKey(101));
	System.out.println(m.containsKey(107));
	System.out.println(m.containsValue("sree"));	
	System.out.println(m.containsValue("sujatha"));
	
	System.out.println(m.isEmpty());
	System.out.println(m.keySet()); // returmd all the ley as set
	System.out.println(m.values()); // returns all the values as collection
	
	//5. Pg to get the list of all keys in Map
	System.out.println(m.entrySet()); // returnd all the entries as set
	
	for(Object i:m.keySet())
	{
		System.out.println(i);
	}
	
	for(Object e:m.values()) {
		System.out.println(e);
	}
	
	for(Object i :m.keySet() ) // 101,102,103
	{
		System.out.println(i+ ":"+ m.get(i));
		
	}
	
	//System.out.println(m.clone());	
	Object clone = m.clone();
	
	System.out.println(clone);
	System.out.println("Entry set " +m.entrySet());	
	
	// 3. Pgm to get the value associated with a particular key and modify its value
	
	for(Entry s:m.entrySet())
	{
		System.out.println(s.getKey()+ " : "+s.getValue());
	}
	
	System.out.println(m);
	m.replace(101, "prashyu");
	System.out.println(m);
	m.replace(101, "prashyu", "prashanth");
	System.out.println(m);
	System.out.println(m.keySet());
	
	
	//4. Pgm to find the entry with the largest key in map
	Set<Integer> keySet = m.keySet();
	int i=0;
	for(int a : keySet)
	{		
		if(a>i)
		{
			i=a;
			
		}
		System.out.println("greater key value " +m.get(i));	
	}
	
	
	// 5. Pg to get the list of all keys in Map
	System.out.println(m.keySet());
	
	HashMap<Integer,String> m1 = new HashMap<Integer,String>();
	
	
	m1.put(20, "chinnu");
	m1.put(30, "Prashanth");
	m1.put(40, "Bujji");
	m1.put(50, "aruna");
	Scanner sc = new Scanner(System.in);
	
	
	

	
	

	
	
	
	
	
	
	
	
	}

}
