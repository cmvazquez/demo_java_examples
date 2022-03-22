import com.ejemplos.objects.Developer;

public class BackendDeveloper extends Developer {
	
	//String name = "field in subclass BackendDeveloper";
	
	void messages() {
		System.out.println(" method subclass: void messages() \n");
		System.out.println("testing value in the subclass this.name ->" + this.name);
		System.out.println("testing value public in the superclass super.name ->" + super.name);
		super.messagesProtected();
	}
	
	

	
	public static void main(String[] args) {
		BackendDeveloper app = new BackendDeveloper();
		
		app.messages();// declared in the subclass
		app.messagesProtected(); // declare in the superclass
		app.fieldProtected = "testing protected field";
		System.out.println(" app.fieldProtected --> " + app.fieldProtected);


	}

}
