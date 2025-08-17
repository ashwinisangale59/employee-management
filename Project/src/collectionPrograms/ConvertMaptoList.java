package collectionPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertMaptoList {
	public static void main(String[] args) {
//40. Convert Map to List

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "asa");
		map.put(2, "had");
		map.put(3, "kah");
		/*
		 * List<Integer> keys = map.keySet() .stream() .collect(Collectors.toList());
		 * System.out.println(keys);
		 */

		List<Map.Entry<Integer, String>> list2 = new ArrayList();
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			list2.add(entry);
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}
