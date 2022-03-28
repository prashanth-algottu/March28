package Day5;

@FunctionalInterface
interface chinnu
{
	void interMethod();
}

class ClassinMethod
{
	public static void methodInClass() // here parameters are same like interface method
	{
		System.out.println("this is from methodInClass");
	}
	
	public void instantMethod()  // here parameters are same like interface method
	{
		System.out.println("this is from instantMethod");
	}
}


// Student and ConstractorInterface related to contractor references

@FunctionalInterface
interface ConstractorInterface
{
	public Student display();
}

class Student
{
	public Student()
	{
		System.out.println("I am from Student costractor");
	}
}


public class StaticMethodReferences {

	public static void main(String[] args) 
	{
		// static method references
		// classname::methodname;
		
		chinnu c = ClassinMethod :: methodInClass; // here indirectly overrinding interMethod() in chinnu interface 
													//so parameters are must be same, return type also be same like overriding rules. 
		c.interMethod();
		
		// Runnable is also a interface
		Runnable ru = ClassinMethod :: methodInClass;
		Thread t = new Thread(ru);
		t.start();
		//c.interMethod();
		
		// instace method references
		// obj reference::methodname;
		
		ClassinMethod method = new ClassinMethod();
		
		chinnu c1= method::instantMethod;
		c1.interMethod();
		
		
		// constractor references
		// constractorName::new
		
		ConstractorInterface cc = Student::new;
		cc.display();
		
		
	}

}
