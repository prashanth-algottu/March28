package Day4;

public class OuterClass
{
	private int data=100;
	
	class InnerClass
	{
		private void msg()
		{
			System.out.println("data is = "+data);
		}
	}

	public static void main(String[] args) 
	{
		OuterClass ou = new OuterClass();
		InnerClass inn = ou.new InnerClass();
		inn.msg();
	}

}
