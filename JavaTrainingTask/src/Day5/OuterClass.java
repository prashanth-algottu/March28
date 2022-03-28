package Day5;

public class OuterClass {
	
	private class InnerClass
	{
		public void display()
		{
			System.out.println("I am from Inner class");
		}
	}

	public void print()
	{
		InnerClass in = new InnerClass();
		in.display();
	}
	public static void main(String[] args) 
	{
		// one way of calling
		OuterClass ot = new OuterClass();
		ot.new InnerClass().display();
		
		// second way of calling
		ot.print();

	}

}
