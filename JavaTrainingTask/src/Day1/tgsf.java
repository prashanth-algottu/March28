package Day1;

public class tgsf {

	public final static void main(String[] args) {
		Integer i = new Integer(4);
		System.out.println(i);

		int b=10;
		Integer z = Integer.valueOf(b);
		System.out.println(z);
		
		/*
		 * String bb = null; Integer z1 = Integer.valueOf(bb); System.out.println(z1);*/
		  int d=44;
		
		System.out.println(Integer.toString(d));
		int f = d+1;
		System.out.println(f);
		System.out.println(Integer.toHexString(65));
		System.out.println(Integer.toOctalString(45));
		StringBuffer na= new StringBuffer("naveen");
		System.out.println(na);
		na.delete(0, na.length());
		System.out.println(na.insert(0, "sujatha"));
		//na="ksnc";
		//String na="chinnu";
		//System.out.println(na);
		
		
	
	}

}
