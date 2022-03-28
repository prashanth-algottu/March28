package Day2;

import java.util.HashSet;
import java.util.Set;

public class OverridingEqualsMethod {

	public static void main(String[] args) {
		int a=10;
		int b=10;
		//System.out.println(a==b);	// true
		
		String s1="chinnu";	
		String s2="chinnu";
		
		//System.out.println(s1.equals(s2)); // true coz in string class eqauls method is oveerriden from obj class
										// so that implementation is compares each charactor hence that is true in this case
		
		Employee e1 = new Employee(1, "chinnu");
		Employee e2 = new Employee(1, "chinnu");
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));  
		
		
		Set<Employee> emp = new HashSet<>();
		emp.add(e1);		// here even the values are same still set gives duplicatations to avoid this you have to override the hasCode()
		emp.add(e2);
		System.out.println(emp);
		System.out.println(emp);
		
		}

}

class Employee
{
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object obj) 
	{
		if(obj==null || getClass()!=obj.getClass())
		{
			return false;	
		}
		if(obj==this)
		{
			return true;
		}
		Employee e = (Employee)obj;
		return (this.getId()==e.getId());		
		
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	 @Override 
	 public int hashCode() 
	{	
		 final int prime=31; 
		 int result = 1; 
		 result = prime*result+id; 
		 result = prime*result+((name==null)?0:name.hashCode());
		 return result; 
	 }	
}