package exercises;
/**
 * Desc: Creating a count down timer of 10 seconds which will got refresh after 10 seconds using threads.
 * @author Aman Soni
 *
 */
public class ThreadTimer extends Thread{
	/**
	 * Number of time count down timer will got refresh.
	 */
	int timerCount;
	/**
	 * Initialize the count down timer.
	 * @param timerCount
	 */
	public ThreadTimer(int timerCount) {
		this.timerCount = timerCount;
	}
	
	@Override
	public void run() {
		/**
		 * Refresh the timer.
		 */
		while(this.timerCount>0) {
			/**
			 * Starting the timer. 
			 */
			int count = 0;
			/**
			 * Count to 10.
			 */
			while(count<10) {
				/**
				 * Count 1 second.
				 */
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException i) {
					System.out.println(i.getMessage());
				}
				/**
				 * Printing the timer count.
				 */
				System.out.println(++count);
			}
			this.timerCount--;
		}
	}

	public static void main(String[] args) {
		/**
		 * Creating a new count down timer with refresh count as 2.
		 */
		ThreadTimer t1 = new ThreadTimer(2);
		System.out.println("Starting count down timer of 10 seconds which will get refresh after 10 seconds");
		/**
		 * Starting the timer.
		 */
		t1.start();
	}

}
