
import java.util.function.Function;

public class JavaHighOrderFunctions {

	private Function<String,String> functionConvertUpperCase = (x) -> "Title: "+ x.toUpperCase();
	
	
	public void printTitles (Function<String,String> paramFunction, String paramString) {	
		 System.out.println(paramFunction.apply(paramString));
		
	}
	
	public Function<String, String> concatenate( String paramIn){		
		return lambda -> paramIn + " - " +lambda ;
	}
	
	
	
	
	public static void main(String[] args) {
	
		JavaHighOrderFunctions myApp = new JavaHighOrderFunctions();
		
		myApp.printTitles(myApp.functionConvertUpperCase, "biology iii");
		String output = (myApp.concatenate("chemistry i")).apply("third Semester");
		System.out.println(output);

	}

}
