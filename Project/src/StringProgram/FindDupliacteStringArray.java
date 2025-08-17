package StringProgram;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FindDupliacteStringArray {
	public static void main(String[] args) {
		String[] str = { "banana", "apple", "grapes", "banana" };

		Set<String> set = new HashSet<>();
		Set<String> dupSet = new HashSet<>();
		for (String i : str) {
			if (!set.add(i)) {
				dupSet.add(i);
			}
		}
		System.out.println(dupSet);

		//stream using
		Map<String, Long> collect = Arrays.stream(str).
		collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		collect.entrySet().stream()
		.filter(i->i.getValue()>1).forEach(i->System.out.println(i.getKey()+" "+ i.getValue()));
		
		
		
		
	}
}
