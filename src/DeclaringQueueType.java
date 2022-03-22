import java.util.PriorityQueue;
import java.util.Queue;

public class DeclaringQueueType {

	public static void main(String[] args) throws InterruptedException {
		
		
		Queue<String> queue = new PriorityQueue<>();
		
		//for insert elements
		queue.offer("1 - anna");
		queue.offer("2- zack");
		queue.offer("3 - rose");
		
		System.out.println("Checking the element on the top of Queue -->" + queue.peek());
		
		System.out.print("First in are first out");
		while(! queue.isEmpty()) {
			System.out.println("\n element --->"+ queue.poll());
			Thread.sleep(1000);
		}

	}

}
