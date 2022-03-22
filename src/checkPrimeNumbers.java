import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;

public class checkPrimeNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Capture a number to checking it is prime number");
		
		Integer num = scan.nextInt();
		
		/*
		 * validate a number is primer or not using Wilson's Theorem
		 * a number is prime: 
		 * if [(n-1)! + 1] is multiple of n
		 * 
		 */
		
		Predicate<Integer> isPrimeNumber = p -> {
			int r = factorial(p - 1) + 1;
					
			if(r%p == 0 && p>=2)
				return true;
			else 
				return false;
			
		};
		
		UnaryOperator<Integer> uoFactorial = p -> IntStream.rangeClosed(1, p).reduce(1,(n1,n2) -> n1*n2);
		
		System.out.println("Calculate using UnaryOperator ----> " + uoFactorial.apply(num));
		
		Function<Integer,String> printing = p -> isPrimeNumber.test(p) 
											? "\n Yes, It`s Prime number!!! "
											: " \n Not, is not a prime number.";		
		System.out.println(printing.apply(num));

	}
	

	
	static int factorial (int number) {
		
		if(number == 0)
			return 1;
		
		return  number * factorial(number -1);
	}

}
