import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DeclaringTreeMapType {
	
	public static void main(String[] args) {
		/*
		 * =========== TreeMap ==========
		 * Do not accept repeated values
		 * elements order asc
		 */
		Map<String,Integer> listMap = new TreeMap<>();
		
		listMap.put("zzz", 45);
		listMap.put("ddd", 85);
		listMap.put("rrr", 74);
		listMap.put("uuu", 12);
		listMap.put("ddd", 100);
		listMap.put("aaa", 100);
		
		Set<Map.Entry<String,Integer>> listSet = listMap.entrySet();
		
		for(Map.Entry<String, Integer> elem: listSet ) {
			System.out.println("Key = "+ elem.getKey() + "  -  Value = "+ elem.getValue());
		}
	}
}
