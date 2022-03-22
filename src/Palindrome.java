import java.util.Scanner;

import java.util.function.Function;
import java.util.function.Predicate;


public class Palindrome {

	public static void main(String[] args) {
		// Validate if the word received is a Palindrome
	
		
		StringBuilder word = new  StringBuilder();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, capture the word for validate if is a Palindrome: \n");
				
		word.append(scan.nextLine());
		
		
		Predicate<StringBuilder> isPalindrome = s -> s.toString().replace(" ","").compareTo(s.reverse().toString().replace(" ", ""))==0  ;
		Function<StringBuilder, String> printValidation = (p) -> isPalindrome.test(p) ? "Yes, It is a Palindrome!" : "Not, is not a Palindrome!";
		
		System.out.println(printValidation.apply(word) );

	}

}
