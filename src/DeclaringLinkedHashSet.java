import java.util.LinkedHashSet;
import java.util.Set;




public class DeclaringLinkedHashSet {

	public static void main(String[] args) {
		
		/*
		 * LinkedHashSet
		 * 
		 * Don't allow repeat it values, 
		 * Respect the original order by inserted the values 
		 */
		
		Set<String> list = new LinkedHashSet<>();
		
        list.add("bbb");
        list.add("aaa");
        list.add("bbb");
        list.add("aaa");
        list.add("ccc");
        list.add("ddd");
        
		System.out.print("\n List of Strings : \n ");
		list.stream().forEach(System.out::println);
		
		
	
	}
	
	

}
