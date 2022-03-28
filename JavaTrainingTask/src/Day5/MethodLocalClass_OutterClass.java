package Day5;

public class MethodLocalClass_OutterClass 
{
	
	
	public void instanceMethod()
	{
		class MethodLocalClass_InnerClass
		{
			public void display()
			{
				System.out.println("I am from MethodLocal Inner Calss");
			}
		}
		
		MethodLocalClass_InnerClass mi = new MethodLocalClass_InnerClass();
		mi.display();
	}

	public static void main(String[] args) 
	{
		MethodLocalClass_OutterClass mo = new MethodLocalClass_OutterClass();
		mo.instanceMethod();

	}

}
