package exercises;
import java.lang.Thread;
import java.util.*;
public class Sample extends Thread{
	@Override
	public void run() {
		Thread myThread = new Thread();
		myThread.start();
		System.out.println(Thread.currentThread().getState());	
		try {
			Thread.sleep(1000);
			
		}
		catch(InterruptedException ie) {
			System.out.println(ie.getMessage());
		}
		System.out.println(myThread.getState());
	}
	public static void main(String[] args) {
		Sample sam = new Sample();
		System.out.println(sam.getState());
		sam.start();
		System.out.println(sam.getState());
		
	}
}
