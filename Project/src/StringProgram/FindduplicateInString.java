package StringProgram;

import java.util.HashMap;
import java.util.Map;

public class FindduplicateInString {
	public static void main(String[] args) {
// Find duplicate characters in a string
		String str = "ashwinisai";
		Map<Character, Integer> map = new HashMap<>();
		for (char s : str.toCharArray()) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		}
		System.out.println(map);
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("duplicate caharcter:" + entry.getKey() + " " + entry.getValue());
			}
		}
	}
}
