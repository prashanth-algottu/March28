package Day3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.io.Serializable;

public class Deserilization {

	public static void main(String[] args) {
		
		String path="/home/tectoro/Prashanth/prashanth.txt";
	
		try
		{
			
			FileInputStream stream = new FileInputStream("/home/tectoro/Prashanth/prashanth.txt");
			ObjectInputStream ois = new ObjectInputStream(stream);
			Student st = (Student) ois.readObject();
			System.out.println(st.getRoll());
			System.out.println(st.getName());
			System.out.println(st.getGame());
		}
		catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
			
		}
		catch (IOException io) {
			io.printStackTrace();
		}
		catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
			
		}
	}

}


