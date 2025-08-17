package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
	public static void main(String[] args) {

		List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(12, 76, 89), Arrays.asList(76, 54),
				Arrays.asList(3, 2));
		List<Integer> collect = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(collect);

		List<List<Employee>> list = Arrays.asList(Arrays.asList(new Employee(1, "Ashwini", "IT", 75000)),
				Arrays.asList(new Employee(2, "mac", "HR", 50000)),
				Arrays.asList(new Employee(3, "Priya", "Finance", 60000)),
				Arrays.asList(new Employee(4, "Kiran", "IT", 90000)));
		List<Employee> collect2 = list.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(collect2);
	}
}
