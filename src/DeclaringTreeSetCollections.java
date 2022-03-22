import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.ejemplos.objects.Person2;

public class DeclaringTreeSetCollections {
	public static void main(String ... args) {
		
		/* ========  TreeSet don't ==========
		 * Don't stored repeat values and 
		 * automatic order asc
		 */
		TreeSet<String> listTreeSet = new TreeSet<>();
		listTreeSet.add("zack");
		listTreeSet.add("john");
		listTreeSet.add("anna");
		listTreeSet.add("anna");
		listTreeSet.add("john");
		
		System.out.print(" List of String : \n ");
		System.out.print(listTreeSet.stream().collect(Collectors.joining(",")));
		
		Set<Person2> list2 = new TreeSet<>();		
		list2.add(new Person2(3, "zahara", 1));
		list2.add(new Person2(2, "benjamin", 15));
		list2.add(new Person2(1, "anasthasia", 20));
		System.out.print("\n \n List of persons : \n ");
		list2.stream().forEach(System.out::println);
		
	}
}
