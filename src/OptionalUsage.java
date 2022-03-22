import java.util.Optional;
import java.util.function.Supplier;

public class OptionalUsage {
	
	public void probar(String param) {
		
		Optional<String> op = Optional.empty();		
		op = Optional.of(param);
		System.out.println(op.get());
	}
	
	public void orElse(String param) {
		
		Optional<String> op = Optional.empty();		
		op = Optional.ofNullable(param);
		System.out.println("Parameter received: " + op.orElse("Some value random"));
	}
	
	public void orElseGet(String param) {
		
		Optional<String> op = Optional.empty();		
		op = Optional.ofNullable(param);
		System.out.println(op.orElseGet(()-> "testing the option orElseGet()") );
	}
	
	public static void main(String[] args) {
		OptionalUsage app = new OptionalUsage();
		
		//Optional basic
		app.probar("Example 1");
		app.orElse(null);
		app.orElseGet(null);
		
		Supplier<String> s = ()-> "Testing Suppliers";
		
		System.out.println(s.get());
	}
}
