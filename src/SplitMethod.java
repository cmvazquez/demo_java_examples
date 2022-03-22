
public class SplitMethod {

	public static void main(String[] args) {
		
		String chain = "anna;rob;rose;zack";
		
		String [] vector = chain.split(";");
		System.out.println("values in vector---> \n");
		
		for(String elem : vector) {
			System.out.println("\n values -> " + elem);
		}
		
		chain = "mariah|peter|hilary|oscar";
		System.out.println("\n chain -->" + chain);
		vector = chain.split("\\|"); // It can use regular expressions
		
		for(String elem : vector) {
			System.out.println("\n values -> " + elem);
		}
		
	}

}
