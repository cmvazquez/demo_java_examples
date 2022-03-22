
public class ThreadByClassThread extends Thread {
	
	private String threadName;
	
	public ThreadByClassThread(String threadName) {
		this.threadName = threadName;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println( threadName + " - "+ i);
		}
	}
	

}
