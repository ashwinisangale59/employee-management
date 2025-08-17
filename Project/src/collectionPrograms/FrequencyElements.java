package collectionPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class FrequencyElements {
	public static void main(String[] args) {
		// 33. Find frequency of elements in list
		List<String> str = Arrays.asList("asa", "dsa", "aad", "hfg");
		
		Map<Character, Integer> map = new HashMap<>();

		for (String s : str) {
			for(char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
			}
		}
		System.out.println(map);

	}
}
