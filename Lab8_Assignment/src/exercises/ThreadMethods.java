package exercises;
/**
 * Desc: Inter thread communication.
 * @author Aman Soni
 *
 */
class Demo{
	/**
	 * Class attributes.
	 */
	private int num;
	boolean valueSet =false;
	
	/**
	 * A method which provide number.
	 */
	public synchronized void getNum() {
		/**
		 * Checking if the number is set.
		 */
		while(!valueSet) {
			/**
			 * If not then waiting for number to set.
			 */
			try {
				wait();
			}
			/**
			 * Handling thread exception while waiting.
			 */
			catch(InterruptedException i) {
				System.out.println(i.getMessage());
			}
		}
		/**
		 * Printing the number.
		 */
		System.out.println("Get: "+ num);
		/**
		 * Setting the valueSet again to false to ensure same number is not print again.
		 */
		valueSet = false;
		/**
		 * Notifying the producer to produce another number.
		 */
		notify();
	}
	
	/**
	 * Set the number.
	 * @param num
	 */
	public synchronized void setNum(int num) {
		/**
		 * Checking if the number is already present.
		 */
		while(valueSet) {
			/**
			 * If so then waiting for the number to consume.
			 */
			try {
				wait();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		/**
		 * Setting the new number for consumer.
		 */
		this.num = num;
		/**
		 * Printing the new number.
		 */
		System.out.println("Put: "+num);
		/**
		 * Setting the valueSet to true so that this will wait until consumer consumes it.
		 */
		valueSet = true;
		/**
		 * Notifying the waiting consumer.
		 */
		notify();
	}
}
/**
 * Consumer.
 * @author Aman Soni
 *
 */
class Take implements Runnable{
	private Demo s;
	public Take(Demo s) {
		this.s = s;
		/**
		 * Creating new thread.
		 */
		Thread t2 = new Thread(this,"Consumer");
		/**
		 * Running consumer thread.
		 */
		t2.start();
	}
	@Override
	public void run() {
		/**
		 * Consuming the number.
		 */
		while(true) {
			s.getNum();
		}
		
	}
	
}

/**
 * Producer.
 * @author Aman Soni
 *
 */
class Provide implements Runnable{
	private Demo s;
	public Provide(Demo s) {
		this.s = s;
		/**
		 * Creating new producer thread.
		 */
		Thread t1 = new Thread(this,"Producer");
		/**
		 * Running the producer.
		 */
		t1.start();
	}
	@Override
	public void run() {
		/**
		 * Producing the number.
		 */
		int i=0;
		while(i<=10) {
			s.setNum(i);
			i++;
		}
	}
		
}
public class ThreadMethods{
	public static void main(String[] args) {
		/**
		 * Creating a new object for demo.
		 */
		Demo d = new Demo();
		/**
		 * Running consumer and producer.
		 */
		new Provide(d);
		new Take(d);
	}
}
