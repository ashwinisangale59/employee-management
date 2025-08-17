package collectionPrograms;

import java.util.*;

public class IterateMap {
	public static void main(String[] args) {
		// Iterate a Map
		Map<Integer, String> map = new HashMap<>();

		map.put(3, "Apple");
		map.put(5, "Banana");
		map.put(2, "Orange");
		
		for(Map.Entry<Integer, String>en:map.entrySet()) {
			System.out.println(en.getKey()+" "+ en.getValue());
		}
	}

}
