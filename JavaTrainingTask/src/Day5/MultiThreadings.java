package Day5;

import java.util.Scanner;

class Addition extends Thread
{
	@Override
	public void run() {
		System.out.println("Addition started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		System.out.println("enter b value");
		int b = sc.nextInt();
		
		System.out.println(a+b);
		
		System.out.println("Additiona has completed");
		
	}
	
}

class PrintingNum extends Thread
{
	@Override
	public void run() {
		System.out.println("Printing numbers started");
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Printing numbers completed");
	}
}

class CharPrinting extends Thread
{
	@Override
	public void run() {
		System.out.println("Printing characters started");
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing characters completed");
		
	}
}




public class MultiThreadings {

	public static void main(String[] args) {
		
		Addition a = new Addition();
		PrintingNum p = new PrintingNum();
		CharPrinting c = new CharPrinting();
		
		a.start();
		p.start();
		c.start();
		
		

	}

}
