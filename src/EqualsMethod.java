import com.ejemplos.objects.Person;

public class EqualsMethod {

	public static void main(String[] args) {
	
		// creating two object with same values.
		Person per1 = new  Person(1,"anna",45);
		Person per2 = new  Person(3,"anna",45);
		
		Person per3 = per1;
		
		//original equals() method, consider different objects, even when them have de the same values.
		if (per1.equals(per2) ) //Return: No, is not the same object.
			System.out.println("Same object");	
		else 
			System.out.println("No, is not the same object.");
		
		//original equals() method, comparing object with the same instance.
		if (per1.equals(per3) )
			System.out.println("Same object");	
		else 
			System.out.println("No, is not the same object.");

		
		//original equals() method, comparing hashcode()
		if (per1.hashCode() == per2.hashCode() ) 
			System.out.println("Same hashcode");	
		else 
			System.out.println("No, is not the same hashcode	.");

				
	}

}
