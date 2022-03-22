
public class AnonymousClass {
	
	public static void main(String ... args) {		
	
		Runnable v1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println(" inside of an anonymous inner class!! ");
			}

			
		};
		
		Runnable v2 = ()-> System.out.println("inside of an expression lambda!!");
		
		v1.run();
		v2.run();
		
	}
}
