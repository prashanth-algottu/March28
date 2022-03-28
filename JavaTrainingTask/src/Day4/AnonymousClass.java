package Day4;


abstract class AbstarctChinnu
{
	abstract void abstractMethodChinnu();
}
public class AnonymousClass {

	public static void main(String[] args) {
		AbstarctChinnu chinnu = new AbstarctChinnu() {
			void abstractMethodChinnu()
			{
				System.out.println("calling abstractMethodchinnu");
			}
	

	};
	
	chinnu.abstractMethodChinnu();
}



}
