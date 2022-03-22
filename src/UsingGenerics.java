import com.ejemplos.objects.Person;

public class UsingGenerics {

	public static void main(String[] args) {
		
		
		GenericClass<String ,Double,Integer,Person> var = new GenericClass<>("test",25.6d,452,new Person(1, "anna", 25));
		
		
		var.shownNameClass();
	
	}
	
	
}
