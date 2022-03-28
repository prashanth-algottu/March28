package March28;

class Student 
{
	String name;
	int roll;
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
}


public class Exam {

	public static void main(String[] args) {
		
		String n= new String("Prah");
		String g=new String("Prah");
		
		if(n==g)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
		System.out.println("new");
		
		Student s1 = new Student("Chinnu", 10);
		Student s2 = new Student("Chinnu", 10);
		if(s1==s2)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}

}
