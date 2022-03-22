import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ejemplos.objects.Person;

public class InteratorExample {

	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		
		list.add(new Person(1,"amanda",12));
		list.add(new Person(2,"Hillary",30));
		list.add(new Person(3,"john",50));
		list.add(new Person(4,"peter",45));
		list.add(new Person(5,"amanda",25));
		
		Iterator<Person> i = list.iterator();
		
		while(i.hasNext()) {
			System.out.println("\n Persona---> " + i.next().toString());
		}

	}

}
