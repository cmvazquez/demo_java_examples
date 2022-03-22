import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SetStandardFunctionalInterfaces {
	 public static void main(String[] args) {
		
		 // ============ Predicate ===============
		 //Syntax: Predicate<Type p> namePredicate
		 // take an argument
		 // return boolean
		 //execute method test()
		 
		Predicate<String> fp = p -> p.length()>5;		 
		System.out.println( fp.test("gold") ? "Yes, more than 5 letters": "Not");
		
		Predicate<String> starwithA = p -> p.startsWith("A");
		Predicate<String> starwithB = p -> p.startsWith("B");
		
		//check is start with A or B
		boolean res = starwithA.or(starwithB).test("AHHHB");
		System.out.println( res? "Yes": "Not");
		
		//check is start with A or B
		boolean res2 = starwithA.or(p -> p.length()==5).test("AAB");
		System.out.println( res2? "Yes": "Not");
		
		 // ============ Consumer ===============
		//Syntax: Consumer<Type p> nameConsumer
		 // take an argument
		 // return nothing
		//execute method accept()
		
		Consumer<String> fconsumer = p -> System.out.print(p);		 
		fconsumer.accept("Testing consumer \n");		
		fconsumer.andThen(p ->System.out.print("concatenate another string")).accept("first chain ");;
		
		
		 // ============ Fuction ===============
		//Function<Type received,Type return> nameFunction
		 // take an argument
		 // return a result (type or object)
		//execute method apply()
		
		Function<String,Integer> functionDemo = p -> p.length();
		functionDemo.apply(" \n Testing");
		System.out.println("\n Testing a function --->" + functionDemo.apply("Testing"));
		
		// ============ Supplier ===============
		//Syntaxis: Supplier<Type result> nameSupplier
		// Don't take an argument
		// return a result 
		//execute method get()
		
		Supplier<String> supplier = () -> "12-may-2021";
		System.out.println(" \n Testing supplier = "+ supplier.get());
		
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MMM/yyyy");
		Supplier<String> supplierDateFormat = () -> formatDate.format(Calendar.getInstance().getTime());
		
		System.out.println("Date --->" + supplierDateFormat.get());
		
		// ============ UnaryOperartor ===============
		//Syntax: UnaryOperator<Type p> nameUnaryOperator
		 //takes an argument
		//return a result the same type of the argument
		//execute method apply()
		
		Function<Integer, Integer> func1 = n -> n *2;
		System.out.println("Value Function --->" + func1.apply(2));
		
		UnaryOperator<Integer> unary = n-> n*2;
		System.out.println("Value UnaryOperator --->" + unary.apply(2));
			
	}
}
