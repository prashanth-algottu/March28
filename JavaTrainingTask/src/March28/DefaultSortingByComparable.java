
package March28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.stream.Collectors;

class Flight implements Comparable<Flight>
{
	private String  time;
	private int trainNo;
	private String departure;
	public Flight(String time, int trainNo, String departure) {
		super();
		this.time = time;
		this.trainNo = trainNo;
		this.departure = departure;
	}
	@Override
	public String toString() {
		return "Flights [time=" + time + ", trainNo=" + trainNo + ", departure=" + departure + "]";
	}
	@Override
	public int compareTo(Flight o) {
		Integer s1 = this.trainNo;
		Integer s2 = o.trainNo;
		//return s1.compareTo(s2); 
		return s2.compareTo(s1); //it is for descending
		
	}	
}
public class DefaultSortingByComparable {

	public static void main(String[] args) 
	{
		Flight f = new Flight("4:00", 123, "Laxmanchanda");
		Flight f1 = new Flight("5:00",254,"Nirmal");
		Flight f2 = new Flight("6:30",102,"Hyderabad");
		Flight f3 = new Flight("9:00",99,"Secundrabad");
		Flight f4 = new Flight("1:00",500,"Kacheguda");
		Flight f5 = new Flight("1:00",50,"Kacheguda");
		
		TreeSet<Flight> t = new TreeSet<Flight>();
		t.add(f);
		t.add(f1);
		t.add(f2);
		t.add(f3);
		t.add(f4);
		t.add(f5);
		
		
		Iterator<Flight> it = t.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
