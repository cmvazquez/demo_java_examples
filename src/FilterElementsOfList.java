import java.util.Arrays;
import java.util.List;





public class FilterElementsOfList {
	
	//private static Logger LOG = LoggerFactory.getLogger(FiltrarElementosLista.class);
	
	public static void main(String[] args) {
		try {
			
			List<Integer> list = Arrays.asList(5,3,6,8,1);
			
			System.out.println("Lista original --->" + list);
			
			//filtrar los elementos de la lista menores que 10
			//list.stream().filter(n -> n<10).forEach( r -> System.out.println(r));		
			
			list.stream().filter(n -> n%2 !=0).forEach(r -> System.out.println(r));	
			
			List<String >list2 = Arrays.asList("Maria","Elena","Ana","Manuel");
			
			
			System.out.println("Lista original --->" + list2);
			// list2.stream().filter(r -> r.startsWith("M")).forEach(System.out::println);
			list2.stream().filter(r -> r.startsWith("M")).forEach(System.out::println);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
