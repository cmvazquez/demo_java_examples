import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DeclaringStackType {

	public static void main(String[] args) throws InterruptedException {
	
	List<String> listNames	= Arrays.asList("1 - joe", "2 - sebastian","3 - john");
	Stack<String> stack = new Stack<>();
	
	stack.addAll(listNames);
	
	stack.addElement("4 - anna");
	stack.push("5 - rob");
	stack.push("6 - zack");
	
	System.out.println("\n peek() of the Stack ---> " + stack.peek());
	
	while( !stack.isEmpty()) {
		System.out.println("\n Last in, First out (LIFO) ---> " + stack.pop() );
		Thread.sleep(1000);
	}
	
	
	
	
	}

}
