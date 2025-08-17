import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Access {
	public static void main(String[] args) {
		// System.out.println("hello");
		String str = "ASDFSDFRRRTTTTT";
		// map string and integer count char
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		System.out.println(map);

	  Map<Character, Long> collect = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
System.out.println(collect);
	}
}
