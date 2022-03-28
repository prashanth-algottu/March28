package Day1;

public class StringImmute {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Prashanth");
		
		System.out.println(s);
		
		s.delete(0, s.length());
		System.out.println(s);
		System.out.println("Deleted");
		
		s.insert(0, "chinnu"); 
		System.out.println(s);
		
		//char c = '2';
		int i = 'a';
		System.out.println(i);
		System.out.println(Character.isUpperCase(97));
		
		
	}
	
}
