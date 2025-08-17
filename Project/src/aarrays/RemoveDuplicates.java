package aarrays;

import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		// 13. Remove duplicates from an array
		int a[] = { 12, 23, 45, 12, 12 };
		Set<Integer> set = new HashSet<>();

		for (Integer i : a) {
			set.add(i);
		}
		System.out.println(set);
		Arrays.stream(a).distinct().forEach(System.out::println);
	}
}
