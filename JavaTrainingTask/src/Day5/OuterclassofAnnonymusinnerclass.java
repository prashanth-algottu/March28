package Day5;



abstract class AnonymousInnerClass
{
	public abstract void diaplay();
}
public class OuterclassofAnnonymusinnerclass {

	public static void main(String[] args) 
	{
		AnonymousInnerClass an = new AnonymousInnerClass() {
			
			@Override
			public void diaplay() {
				System.out.println("I am from AnonymousInnerClass and display method");
				
			}
		};	
		an.diaplay();
		
	}

}
