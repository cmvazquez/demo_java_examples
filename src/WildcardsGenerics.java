import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ejemplos.objects.Person3;
import com.ejemplos.objects.Student;
import com.ejemplos.objects.Teacher;

public class WildcardsGenerics {

	public void printList(List<Student> paramList) {
		
		for(Student e : paramList) {
			System.out.println(e.getName());
		}
	}
	
	//implementing Wildcard (?) unbounded
	public void printUsingWildcardUnbounded(List<?> paramList) {
		for(Object e : paramList) {
			
			if(e instanceof Student) {
				
				System.out.println(((Student) e).getName());
			}
			else if(e instanceof Teacher) {
				
				System.out.println(((Teacher) e).getName());
			}
			
		}
	}
	
	//implementing Wildcard (?) Upper unbounded
	public void printUsingWildcardUpperBounded(List<? extends Person3> paramList) {
			for(Person3 e : paramList) {			
					
				System.out.println(e.getName());
				
				
			}
	}
	
	//implementing Wildcard (?) Upper unbounded
		public void printUsingWildcardLowerBounded(List<? super Student> paramList) {
				for(Object e : paramList) {			
						
					System.out.println(((Person3) e).getName());
					
					
				}
		}
		
	public static void main(String[] args) {
		
		WildcardsGenerics app = new WildcardsGenerics();
	
		List<Student> list = Arrays.asList(new Student("anna"), new Student("ben"),new Student("yohana"));
		List<Teacher> list2 = Arrays.asList(new Student("rod"), new Student("brad"),new Student("jordan"));
		List<Teacher> list3 = new ArrayList<>();
		
		//copy list3 to list2
		list2.addAll(list3);
		
		//printing student
		System.out.println("Printing Students");
		app.printList(list);
		System.out.println("Printing teachers method Unbounded Wildcard");
		app.printUsingWildcardUnbounded(list);
		System.out.println("Printing teachers method Upper bounded Wildcard");
		app.printUsingWildcardUpperBounded(list);
		System.out.println("Printing teachers method Lower bounded Wildcard");
		app.printUsingWildcardLowerBounded(list);
		
		//printing Teacher
		System.out.println("Printing teachers method Unbounded Wildcard");
		app.printUsingWildcardUnbounded(list2);
		System.out.println("Printing teachers method Lower bounded Wildcard");
		app.printUsingWildcardUpperBounded(list2);
		System.out.println("Printing teachers method Lower bounded Wildcard");
		app.printUsingWildcardLowerBounded(list2);
	}
}
