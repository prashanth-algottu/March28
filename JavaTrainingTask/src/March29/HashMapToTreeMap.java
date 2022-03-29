
//9. Pgm to convert hashmap to treemap
package March29;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class HashMapToTreeMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(2, "sree");
		hm.put(1, "chinnu");
		
		
		TreeMap<Integer, String> tm = new TreeMap<Integer,String>();
		System.out.println(tm);
	
		for( Entry<Integer, String> f:hm.entrySet())
		{
			//System.out.println(f);
			tm.put(f.getKey(), f.getValue());
		}
		System.out.println(tm);
		
	}

}
