package Day1;

//final class so that this class can't be over ridden
final class Immutables
{
	// private members
	private String name;
	
	//to assain values we used constructor
	public Immutables(String name) {
		super();
		this.name = name;
	}
	
	//only getter are used so that we can only get the values
	public String getName() {
		return name;
	}
}

public class CustomeImmutableClass
{
	public static void main(String arg[])
	{
		Immutables im = new Immutables("prashanth");
		//Immutables im = new Immutables("chinnu");	
		System.out.println(im.getName());
	}
}
