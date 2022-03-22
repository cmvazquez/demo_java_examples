import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DeclaringHashMapType {

	public static void main(String[] args) {
		
		/*
		 * =========== HashMap ==========
		 * Do not accept repeated values
		 * elements unorder
		 */
		Map<String,Integer> listMap = new HashMap<>();
		
		listMap.put("zzz", 45);
		listMap.put("ddd", 85);
		listMap.put("rrr", 74);
		listMap.put("uuu", 12);
		listMap.put("ddd", 100);
		
		Set<Map.Entry<String,Integer>> listEntrys = listMap.entrySet();
		
		for(Map.Entry<String, Integer> elem: listEntrys) {			
			System.out.println("Key = "+ elem.getKey() + "  -  Value = "+ elem.getValue());
		}
		
		
		
	}
}
