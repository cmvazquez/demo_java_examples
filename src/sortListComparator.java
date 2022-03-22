import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.ejemplos.objects.Person;

public class sortListComparator {

	public static void main(String[] args) {
		
		List<Person> list = Arrays.asList(new Person(3,"zack",25),
				new Person(2,"rose",9),
				new Person(1,"anna",25));
		
		System.out.println("before sorting --> \n" + list.toString());
		Collections.sort(list,new NameComparatorPerson());
		System.out.println("after sorting --> \n" + list.toString());
		
		Collections.sort(list);

	}

}
