package collectionPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class SortMap {
	public static void main(String[] args) {
		// 39. Sort a Map by value
		Map<String, Integer> map = new HashMap<>();
		map.put("Banana", 4);
		map.put("Apple", 2);
		map.put("Orange", 1);
		map.put("Mango", 3);
		
		LinkedHashMap<String, Integer> collect = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,
				(e1,e2)->e1,LinkedHashMap::new));
		
		System.out.println("Map sorted by value:"+ collect);
	}
}
