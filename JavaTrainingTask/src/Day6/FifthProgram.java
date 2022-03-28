
//5. Create a LinkedList of Employee objects and a new employee at specified index, get the 
//first occurrence of "John" and delete all the repeated occurrences of any Employees

package Day6;

import java.util.LinkedList;


class Employee
{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

	public Employee(String name) {
		super();
		this.name = name;
	}
	
}


//5. Create a LinkedList of Employee objects and a new employee at specified index, get the 
//first occurrence of "John" and delete all the repeated occurrences of any Employees

public class FifthProgram {

	public static void main(String[] args) {
	
		LinkedList<Employee> ll = new LinkedList<Employee>();
		ll.add(new Employee("prashanth"));
		ll.add(new Employee("prashanth"));
		ll.add(new Employee("john"));
		ll.add(new Employee("prashanth"));
		ll.add(new Employee("naresh"));
		ll.add(new Employee("naveen"));
		System.out.println(ll);
		ll.remove("prashnath");
		System.out.println(ll.indexOf("john"));
		System.out.println(ll);
		
		
		
		
		
	}

}
