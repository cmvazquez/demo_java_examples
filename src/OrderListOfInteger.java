import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.ejemplos.objects.Staff;

/***************************************************
 * This code is an example of concepts of java.
 * 
 * @author Claudia Martinez
 * @version 1.0.0
 * @since 02/december/2021
 *
 ***************************************************/
 
public class OrderListOfInteger {

	public static void main(String[] args) {

		

		try {
			//example 1
			System.out.println("Printing a ordened list");	
			
			List<Integer> list = Arrays.asList(20,10,3,5,30,1);				
			System.out.println("Original List :" + list);
			
			System.out.println("\n Option 1: List ordened using streams sorted() method :");
			String temp = list.stream().sorted().map(p-> p.toString()).collect(Collectors.joining(","));			
			System.out.println(temp);
			
			System.out.println("\n Option 2: Calculated a sum using a Streams:");
			Integer res = list.stream().filter(p-> p<=11).collect(Collectors.summingInt(p-> p));
			System.out.println(res);
			
			System.out.println("\n Option 3: Ordening the List ASC usin compareTo:");
			List<String> listTemp = list.stream().sorted((e1,e2) -> e1.compareTo(e2)).map(p -> p.toString()).collect(Collectors.toList());
			System.out.println( listTemp.stream().collect(Collectors.joining(",")) );
			
			System.out.println("\n Option 4: Ordening the List DESC using Collections.sort:");
			Collections.sort(list, (p1,p2) -> p2.compareTo(p1));			
			list.stream().forEach(System.out::println);
			
			int sumResul = list.stream().mapToInt( e -> e.intValue()).sum();
			System.out.println("\n sumResul---> " + sumResul);
			
			System.out.println("\n lista original ");
			list.forEach(p -> System.out.println(p));
			list.removeIf(p -> p < 10);
			System.out.println("\n lista borrada ");
			list.forEach(p -> System.out.println(p));
			
		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {
			System.out.println("release resources!!");
		}
	}
}
