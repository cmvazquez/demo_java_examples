import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.LongConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class FactorialNumber {

	public static void main(String[] args) {
			
		//calculated a factorial
		
		//one way
		Scanner  scan = new Scanner(System.in);
		Integer vnum =0;		
		System.out.println("Please, capture a number for calculate its Factorial: \n");		
		vnum = scan.nextInt();			
		System.out.println("The factorial for " + vnum + " = " + factorial(vnum));		
		scan.close();
		
		
		
		// second way to calculate a factorial
		long factorialStream = LongStream.rangeClosed(1, vnum).reduce(1, (n1,n2)-> n1*n2);		
		System.out.println("The factorial for (using LongStream)--> " + vnum + " = " + factorialStream);
		
		//testing create a stream using Arrays.stream
		int[] listNums= {3,1,2,4,6,5};
		Arrays.stream(listNums).forEach(System.out::print);
		
		// thrid way to calculate a factorial
		int res = Arrays.stream(listNums).reduce(1, (a,b) -> (b == 0) ? 1 : a*b);
		System.out.println(" \n The factorial for " + Arrays.stream(listNums).max() + " = " + res);
		
		List<Integer> li =  Arrays.asList(3,1);		
		System.out.println(" Sum =" +  li.stream().reduce(0, Integer::sum));
		System.out.println(" Sum =" +  li.stream().collect(Collectors.summarizingInt(Integer::intValue)));
		System.out.println(" Sum =" +  li.stream().mapToInt(Integer::intValue).sum() );
		
	
		
	}	
	
	static Integer factorial(Integer n) {
		
		if(n == 0) {
			return 1;
		}
		
		
		return n * factorial(n-1);
	}
	
	
	
	
}
