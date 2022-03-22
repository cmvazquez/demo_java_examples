import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

	public static void main(String[] args) {
		Integer result = 0;
		
		//using BiFunction
		BiFunction<Integer, Integer, Integer> biFunc = (x1,x2) -> x1 + x2;		
		result = biFunc.apply(5, 5);
		System.out.println(result); 
		
		//using BinaryOperator
		BinaryOperator<Integer> binaryOp = (x1,x2) -> x1 + x2;
		result = binaryOp.apply(5, 5);
		System.out.println(result); 
		
		
		//another example using generic method
		Integer[] list = new Integer[5] ;		
		Arrays.fill(list, 2); //filled with 2's
		
		result = sumCustom(Arrays.asList(list), 0, binaryOp);
				System.out.println("The result using generticMethod method ---> " + result);
		
	}
	
	static <T> T sumCustom (List<T> list, T initialValue, BinaryOperator<T> binaryOp) {
		T resultAccumulate = initialValue;
		
		for(T elem: list) {
			
			resultAccumulate = binaryOp.apply(resultAccumulate, elem);
		}
		
		return resultAccumulate;
	}

}
