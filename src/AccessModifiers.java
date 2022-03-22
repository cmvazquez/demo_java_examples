import com.ejemplos.objects.Developer;

public class AccessModifiers {
	
	public void methodPublic() {
		System.out.println("This method is visible within this class,"
				+ " in other classes within this package and outside this packages.");
	}
	
	void methodPackage() {
		System.out.println("This method is visible within this class,"
				+ " in other classes within this package, but not outside this packages.");
	}
	
	protected void methodProtected() {
		System.out.println("This method is visible within this class,"
				+ " in other classes within this package and outside this packages only by subclasses.");
	}
	
	private void methodPrivate() {
		System.out.println("This method is visible only within this class.");
	}			
	

	public static void main(String[] args) {
	
		AccessModifiers app = new AccessModifiers();
		
		app.methodPackage();
		app.methodPublic();
		app.methodProtected();
		app.methodPrivate();

	}

}
