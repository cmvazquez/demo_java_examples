
import java.util.HashSet;

import java.util.Set;

import java.util.stream.Collectors;


import com.ejemplos.objects.Person;
import com.ejemplos.objects.Person2;


public class DeclaringHashSetCollections {
	
	public static void main(String ... arg) {
		
		/*=========  HashSet <Strings> =====================		
		  - Don't stored repeat values and
		  - stored values unorder 
		*/
		
		Set<String> listSet = new HashSet<>();
		listSet.add("zzz");
		listSet.add("ccc");
		listSet.add("car");
		listSet.add("person");
		listSet.add("ccc");
		listSet.add("aaa");
		listSet.add("a");
		listSet.add("A");
		
		System.out.println("Original list of Set<String> stored values unorder way: \n " + listSet);
		System.out.println("List Set<String> ordened using streams: ");
		listSet.stream().sorted((a,b) -> a.compareTo(b)).forEach(System.out::println);
		
		
		
		// ============ HashSet<Person> =============
		Set<Person> listPersons = new HashSet<Person>();		
		listPersons.add(new Person(1, "zack", 15));
		listPersons.add(new Person(2, "john", 1));
		listPersons.add(new Person(3, "anderson",35));
		listPersons.add(new Person(4, "anna",28));
		listPersons.add(new Person(5, "zara", 1));
		
		
		System.out.println("\n Original List of  Set<Person> stored values unorder way: " );
		for(Person elem : listPersons) {
			System.out.println(elem.toString());
		}
		System.out.println(" List Set<Person> ordened using streams (compare method): ");
		listPersons.stream().sorted((e1,e2) -> e2.compareTo(e2) ).forEach(System.out::println);
		
		
		System.out.println(" List Set<Person2> ordened using streams (compareTo method): ");
		Set<Person2> listPersons2 = new HashSet<>() ;
		listPersons2.add(new Person2(1, "zack", 15));
		listPersons2.add(new Person2(2, "john", 1));	
		listPersons2.add(new Person2(4, "anna",28));
		
		listPersons2.stream().sorted((e1,e2) -> e1.getName().compareTo(e2.getName())).forEach(System.out::println);
		
		String varString = listPersons2.stream().map((e)-> e.toString()).collect(Collectors.joining(","));
		System.out.println(" value varString -> " + varString);
		
		
		String varStream = listPersons.stream().toString();		
		System.out.println(" value Stream -> " + varStream);
		listPersons.stream().forEach(System.out::print);
	}

}
