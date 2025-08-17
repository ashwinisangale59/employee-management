package aarrays;

import java.util.Arrays;

public class largestNumber {
	public static void main(String[] args) {
		// Find the largest number in an array
		int a[] = { 12, 13, 14, 15, 88, 90 };
		Arrays.stream(a).max().ifPresent(System.out::println);
		
		int max = 0;
		for (Integer i : a) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println(max);
	}
}
