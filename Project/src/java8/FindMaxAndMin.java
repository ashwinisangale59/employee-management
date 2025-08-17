package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaxAndMin {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 3, 45, 56, 7);
		Optional<Integer> max = list.stream().max(Integer::compareTo);
		max.ifPresent(System.out::println);

		list.stream().min(Integer::compareTo).ifPresent(System.out::println);
	}
}
