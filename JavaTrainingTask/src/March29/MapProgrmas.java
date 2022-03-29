package March29;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class MapProgrmas {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> map = new HashMap();
		
		
		map.put(20, "chinnu");
		map.put(30, "Prashanth");
		map.put(40, "Bujji");
		map.put(50, "aruna");
		//System.out.println(map);
		Scanner sc = new Scanner(System.in);
		int key=sc.nextInt();
		
		//m1.remove(f);
		
		Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext())
		{
			Entry<Integer,String> entry = iterator.next();
			System.out.println(entry.getKey());
			
		}
		
		
		
		
		
		
		/*
		for(Entry<Integer, String> g :m1.entrySet() )
		{
			
			if(g.getKey()==f)
				m1.remove(f);
			
		}
		System.out.println(m1);
		
		*/
		
		
		
		
		
		
		
		
	/*	
		int f=sc.nextInt();
		
		Set<Entry<Integer,String>> set = m1.entrySet();
		Iterator<Entry<Integer, String>> it = set.iterator();
		while(it.next() != null)
		{
			
			System.out.println("hj");
		}
		
*/
	}

}
