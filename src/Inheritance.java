
import com.ejemplos.objects.Cat;
import com.ejemplos.objects.Dog;


public class Inheritance extends Cat {

	

	
	public Inheritance(String pname, String pbreed, int page) {
		super(pname, pbreed, page);
	
	}

	public static void main(String[] args) {

		Inheritance varSubClass = new Inheritance("kaiser", "pitbull", 15);		
		
		
				
		if(varSubClass instanceof Dog) {
			System.out.println("It is a instance from Dog Class");
		}
		
		varSubClass.showBehavior();// this method was implemented by the subclass
		
	}

}
