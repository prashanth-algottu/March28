
//8. Pgm to convert list to map
package March29;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student
{
	private int rollNo;
	private String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
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
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	
	
}
public class ConvertingListToMap {

	
	public static void main(String[] args) 
	{
		List<Student> lt = new ArrayList<Student>();
		lt.add(new Student(1, "chinnu"));
		lt.add(new Student(5,"prashanth"));
		lt.add(new Student(2, "Sree"));
		lt.add(new Student(3,"Bujji"));
		lt.add(new Student(4, "aruna"));
		
		System.out.println(lt);
		
		Map<Integer, String> hs = new HashMap<Integer, String>();
	
		for(Student h:lt)
		{
			
			hs.put(h.getRollNo(), h.getName());
			
		}
		
		System.out.println(hs);

		
	}

}
