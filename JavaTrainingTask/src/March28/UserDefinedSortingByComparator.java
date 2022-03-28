package March28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CompareName implements Comparator<Studentd>
{

	@Override
	public int compare(Studentd o1, Studentd o2) {
		String d1 = o1.getName();
		String d2 = o2.getName();
		return d1.compareTo(d2); //  return d2.compareTo(d1); it is for descending
	}
}

class CompareRollNo implements Comparator<Studentd>
{
	
	@Override
	public int compare(Studentd o1, Studentd o2) 
	{
		Integer d1 =o1.getRollNo();
		Integer d2 =o2.getRollNo();
		return d1.compareTo(d2); //  return d2.compareTo(d1); it is for descending
	}
}

class CompareRating implements Comparator<Studentd>
{
	@Override
	public int compare(Studentd o1, Studentd o2) {
		Integer d1 = o1.getRating();
		Integer d2 = o2.getRating();
		return d1.compareTo(d2);// return d2.compareTo(d1); it is for descending
	}
}

class Studentd
{
	private int rollNo;
	private String name;
	private int rating;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Studentd(int rollNo, String name, int rating) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", rating=" + rating + "]";
	}
	
	}
	
public class UserDefinedSortingByComparator {

	public static void main(String[] args) 
	{
	
		Studentd s1 = new Studentd(1, "Chinnu", 10);
		Studentd s2 = new Studentd(3,"Prashanth",9);
		Studentd s3 = new Studentd(2,"Shubham",5);
		Studentd s4 = new Studentd(4,"Sujatha",7);
		
		ArrayList<Studentd> ar = new ArrayList<Studentd>();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		ar.add(s4);
		
		//Collections.sort(ar);
		Collections.sort(ar,new CompareName());
		
		//Collections.sort(ar, new CompareRating());
		//Collections.sort(ar,new CompareRollNo());
		for (Studentd std : ar) {
			System.out.println(std);
		}

	}

}
