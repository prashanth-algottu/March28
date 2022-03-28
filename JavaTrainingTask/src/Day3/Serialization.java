package Day3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization {

	public static void main(String[] args) {
		Student st = new Student(1, "chinnu", "Skating");
		String path="/home/tectoro/Prashanth/prashanth.txt";
		
		try
		{
			FileOutputStream stream = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(stream);
			oos.writeObject(st);
			oos.flush();
		}
		catch (FileNotFoundException fnf) {
			fnf.printStackTrace();
		}
		catch (IOException io) {
			io.printStackTrace();
		}
		
		
	}

}

class Student implements Serializable
{
	private int roll;
	private String name;
	private String game;
	
	
	
	public Student(int roll, String name, String game) {
		super();
		this.roll = roll;
		this.name = name;
		this.game = game;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	
}
