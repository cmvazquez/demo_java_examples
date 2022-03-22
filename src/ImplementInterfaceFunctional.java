

import com.ejemplos.interfaces.FunctionalInterfaceExample;


public class ImplementInterfaceFunctional {
	


	public static void main(String[] args) {


		int x = 1;
		int y = 3;
		
		//Part 1: implementing a functional Interface whith lambda expression		
		FunctionalInterfaceExample varInterface = (n1,n2)-> n1 + n2;		
		System.out.println("The result1 "+ x + " + "+y+" = " + varInterface.add(x, y) );
		
		
		//Part 2: Implementing a anonymous inner class		
		FunctionalInterfaceExample varInterface2 = new FunctionalInterfaceExample() {			
			@Override
			public int add(int a, int b) {
				
				return a + b ;
			}
		};
		
		System.out.println("The result2 "+ x + " + "+y+" = " + varInterface2.add(x, y) );
		
	}

}
