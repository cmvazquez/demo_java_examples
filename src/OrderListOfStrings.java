import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.ejemplos.objects.Staff;

public class OrderListOfStrings {

	public static void main(String ... arg) {
		
		List<Staff> listItems = Arrays.asList(
                new Staff("rose", 30, new BigDecimal(10000)),
                new Staff("zack", 27, new BigDecimal(20000)),
                new Staff("ana", 33, new BigDecimal(30000))
        );
		
		
		List<String> listStrings = listItems.stream().sorted( (n1,n2) -> n1.getName().compareTo(n2.getName())  ).map(z -> z.getName()).collect(Collectors.toList());
        System.out.println(listStrings); //[mkyong, jack, lawrence]
		
        System.out.println("\n Checking skip method: \n");
        listStrings.stream().forEach(System.out::println);
        System.out.println("\n");
 	   listStrings.stream().skip(2).forEach(System.out::println);
 	   
 	   System.out.println("\n Checking filter and contains method: \n");
 		listStrings.stream().filter(p -> p.startsWith("a")).forEach(System.out::println);
 		
 		List<String> chains = Arrays.asList("anna","john","amelia","peter");
 		System.out.println("chains ---> "+ chains);
 		
 		Predicate<String> pred = p -> p.startsWith("a");
 		chains.stream().filter(pred.or(p -> p.startsWith("p"))).forEach(System.out::println);
 		//chains.stream().filter(p -> (p.startsWith("a") || p.startsWith("p"))).forEach(System.out::println);
 	
 		List<String> numbers = Arrays.asList("1","15","30");
 		System.out.println("sum ---> " + numbers.stream().map(p -> Integer.parseInt(p)).reduce((n1,n2) -> n1+n2) );
 		System.out.println("sum ---> " + numbers.stream().map(p -> Integer.parseInt(p)).reduce((n1,n2) -> n1+n2).get() );
 		
 		chains.stream().filter(p -> p.contains("e")).forEach(System.out::println);
	}
	
}
