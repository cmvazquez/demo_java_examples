import java.util.Arrays;
import java.util.stream.Stream;

public class DeclaringVectors {
	
	public static void main(String ... args) {
		
		//option 1
		Integer[] vectorInteger = new Integer[] {12,45,78,96,35};
		System.out.println("Option 1 :");
		for(Integer e : vectorInteger)
			System.out.println(e);
		System.out.println("Option 1 - testing Strams.of() ");
		Stream.of(vectorInteger).filter(e-> e>50).forEach(System.out::println);
		
		//option 2
		int[] vectorInt =  {12,45,78,14};
		System.out.println("Option 2 :" );
		for(int e : vectorInt)
			System.out.println(e);
		
		//option 3
		int[] vectorInt2 = new int[5];
		Arrays.fill(vectorInt2, 1); // filled the array with 1
		System.out.println("Option 3 :" );
		for(int e : vectorInt2)
			System.out.println(e);
		
		//option 4
		int[] vectorInt8 = new int[10];
		int[] vectorInt3 = new int[] {78,12,75,1,4};
		System.out.println("Option 4 :");
		for(int e : vectorInt3)
			System.out.println(e);
		
		//option 5
		System.out.println("Option 5 :");
		Arrays.fill(vectorInt3,0,4,2);//fill the arrays indicating, start index position, total elements will insert, value of elemnt to insert	 
		for(int e : vectorInt3)
			System.out.println(e);
		
		//option 6
		System.out.println("Option 6 :");
		int[] arrayCopied = Arrays.copyOf(vectorInt3,12);
		for(int e : arrayCopied)
			System.out.println(e);
		
		System.out.println("Option 7 :");
		
		System.out.println("Option7 - testing Arrays.stream() ");		
		Arrays.stream(arrayCopied).filter(e-> e>1).forEach(System.out::println);	
		
		System.out.println("Option7 - testing Strams.of() ");
		Stream.of("Esto es una prueba").forEach(System.out::println);
		
		System.out.println("Summing an arrays of int elements --->" +   Arrays.stream(arrayCopied).sum());
		
	}
}
