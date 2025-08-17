package java8;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbersList {
	public static void main(String[] args) {
		// Sum of all numbers in list
		List<Integer> list = Arrays.asList(12, 34, 56, 67, 87);
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("sum of all" + sum);
	}
}
