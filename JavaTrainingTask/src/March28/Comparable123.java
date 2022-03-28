package March28;

import java.util.Iterator;
import java.util.TreeSet;

class Flights implements Comparable<Flights>
{
	private String  time;
	private int trainNo;
	private String departure;
	public Flights(String time, int trainNo, String departure) {
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
	public int compareTo(Flights o) {
		Integer s1 = this.trainNo;
		Integer s2 = o.trainNo;
		return s1.compareTo(s2);
		
	}	
}
public class Comparable123 {

	public static void main(String[] args) 
	{
		Flights f = new Flights("4:00", 123, "Laxmanchanda");
		Flights f1 = new Flights("5:00",254,"Nirmal");
		Flights f2 = new Flights("6:30",102,"Hyderabad");
		Flights f3 = new Flights("9:00",99,"Secundrabad");
		Flights f4 = new Flights("1:00",500,"Kacheguda");
		Flights f5 = new Flights("1:00",50,"Kacheguda");
		
		TreeSet<Flights> t = new TreeSet<Flights>();
		t.add(f);
		t.add(f1);
		t.add(f2);
		t.add(f3);
		t.add(f4);
		t.add(f5);
		
		Iterator<Flights> it = t.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
