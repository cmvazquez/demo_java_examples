
public class ThreadsDemo  {

	public static void main(String[] args) {
		
		ThreadsDemo app = new ThreadsDemo();
		
		//instanced from Extends Thread Class
		ThreadByClassThread h1 = new ThreadByClassThread("Thread 1");		
		// It's necessary to pass an instance from Runnable Interface
		Thread h2 = new Thread(new ThreadByRunnable("Thread 2")); 
		
		
		
		
		h1.start(); //start() method represent the thread is launched.
		h2.start();
		
		//This execution represent the thread that launch the Main( ) method
		for(int i=0; i<50; i++) {
			System.out.println("Thread 3 - " + i);
		}
		
	}
	
	


}
