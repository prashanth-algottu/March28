package Day4;

import java.util.function.Consumer;

public class UsingConsumerLambda {

	public static void main(String[] args) {
		
		Consumer<String> con = i->System.out.println(i);
		
		con.accept("Sree");

	}

}
