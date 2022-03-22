
public class ThreadByRunnable implements Runnable {
	
	private String threadName;
	
	public ThreadByRunnable(String paramThreadName) {
		this.threadName = paramThreadName;
	}
	
	
	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println( this.threadName + " - "+ i);
		}
		
	}
	

}
