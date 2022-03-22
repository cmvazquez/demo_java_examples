
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ParalellStream {

	
	public static void main (String ... args) {
		
		List<String> list1 = Arrays.asList("Julio", "Ricardo", "Claudia");
		
		Long ini = System.currentTimeMillis();
		List<String> list2=list1.stream().filter(p -> ! p.contains("Ricardo")).collect(Collectors.toList());
		Long fin = System.currentTimeMillis();
				
		System.out.println("tiempo stream secuencial -->" + (ini - fin));
		System.out.println("List 1 " + list1);
		System.out.println("List 2 " + list2);
		
		ini = System.currentTimeMillis();
		list2 = list1.stream().parallel().filter(p -> ! p.contains("Ricardo")).collect(Collectors.toList());
		
		list2 = list1.parallelStream().filter(p -> ! p.contains("Ricardo")).collect(Collectors.toList());
		fin = System.currentTimeMillis();
		
		System.out.println("tiempo stream paralelo -->" + (ini - fin));		
		System.out.println("List 1 " + list1);
		System.out.println("List 2 " + list2);
		
	}
}
