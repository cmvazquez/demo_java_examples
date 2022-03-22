import com.ejemplos.interfaces.IOperation;

public class SyntaxisLambdaExpression {

	public static void main(String[] args) {
		
		// IOperation operation = (a,b) -> a+b;
		
		/*
		IOperation operation = (Integer a,Integer b) ->{
			return a + b ;
		};
		*/
		/*
		IOperation operation = (a,b)-> {
			System.out.println("Sum = ");
			return a+b;
		};
		operation.sum(5, 3);
		
		*/
		
		IOperation operation = (a,b)->{
			Integer x = 2;
			Integer y = 4;
			x+=a;
			y+=b;
			return x+ y;
		};
		
		
		System.out.println(operation.sum(5, 3) );
		

	}

}
