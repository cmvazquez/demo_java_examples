
public class SingletonPattern {
	
	private static SingletonPattern instance = null;
	public int x = 10;
	
	private SingletonPattern() {}
	
	public static SingletonPattern getInstance() {
		
		if(instance == null) {
				instance = new SingletonPattern();
		}
			
		return instance;
	}
	
	public static void main(String[] args) {
		
		SingletonPattern app = SingletonPattern.getInstance();
		SingletonPattern app2 = SingletonPattern.getInstance();
		
		
		app.x += 10;
		
		System.out.println("instance 1 ------- X = " + app.x);
		System.out.println("instance 2 ------- X = " + app2.x); 
	}
}
