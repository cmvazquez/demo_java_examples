import java.util.Comparator;

import com.ejemplos.objects.Person;

public class NameComparatorPerson implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
