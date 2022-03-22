import java.util.ArrayDeque;
import java.util.Deque;

public class DeclaringDequeType {

	public static void main(String[] args) {
		
		Deque<String> listDeque = new ArrayDeque<>();
		
		listDeque.add("1 - anna");
		listDeque.add("2 - rob");
		listDeque.add("3 - zack");
		
		//Deque it for short form  "double ended queue"
		//do not accept null values
		
		System.out.println("Peek value on deque --->" + listDeque.peek());
		
		listDeque.addFirst("0 - frank");
		listDeque.addLast("4 - rose");
		
		while( ! listDeque.isEmpty()) {
			
			
			System.out.println("\n extract values with poll() --->" + listDeque.poll());
			
			System.out.println("\n extract values with pop() --->" + listDeque.pop());
			
		}
	}

}
