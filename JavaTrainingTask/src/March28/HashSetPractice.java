package March28;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetPractice {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(20);
		hs.add("Chinnu");
		hs.add("mani");
		hs.add("Shubham");
		System.out.println(hs);
		//hs.clear();
		System.out.println(hs);
		Object clone = (HashSet)hs.clone();
		System.out.println(clone);
		System.out.println(hs.contains("Chinnu"));
		HashSet hs1 = new HashSet();
		hs1.add("sree");
		hs1.add("giri");
		hs1.add("uma");
		System.out.println(hs1);
		System.out.println(hs.add(hs1));
		System.out.println(hs);
		HashSet hs2 = new HashSet();
		hs2.add("Chinnu");
		hs2.add("sree");
		System.out.println(hs2);
		
		System.out.println(hs1);
		
		System.out.println(hs2.addAll(hs1));
		System.out.println(hs2);
		
		System.out.println(hs1);
		System.out.println(hs2.containsAll(hs1));
		System.out.println(hs2);
		System.out.println(hs);
		
		System.out.println(hs2.equals(hs1));
		System.out.println(hs2);
		HashSet hs3 = (HashSet)hs2.clone();
		System.out.println(hs3);
		System.out.println(hs2.equals(hs3));
		
		System.out.println(hs3.getClass());
		System.out.println(hs3.hashCode());
		System.out.println(hs3.isEmpty());
		
		hs1.clear();
		System.out.println(hs1.isEmpty());
		System.out.println(hs2);
		System.out.println(hs2.remove("uma"));
		System.out.println(hs2);
		System.out.println(hs2.remove("uma"));
		System.out.println(hs2);
		System.out.println(hs3);
		hs3.removeAll(hs2);
		System.out.println(hs3);
		
		System.out.println(hs2);
		hs2.retainAll(hs3);
		
		System.out.println(hs3);
		hs3.add("chinnu");
		hs3.add("sujatha");
		System.out.println(hs3);
		hs1.add("prashanth");
		hs1.add("praveen");
		hs1.add("chinnu");
		System.out.println(hs1);
		hs3.retainAll(hs1);
		System.out.println(hs3);
		
		
		
		System.out.println(hs1.size());
		
		System.out.println(hs1);
		
		//System.out.println(hs1.spliterator(); doubt
		
		System.out.println(hs1.toArray());	
		System.out.println(hs1);
		hs1.add("chinnu");
		System.out.println(hs1);
		Object[] array = hs1.toArray();
		for(Object s:array)
		{
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
