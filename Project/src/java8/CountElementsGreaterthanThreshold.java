package java8;

import java.util.Arrays;
import java.util.List;

public class CountElementsGreaterthanThreshold {
	public static void main(String[] args) {
	//	Count elements greater than a threshold
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);
		int th=15;
		long collect = numbers.stream().filter(n->n>th).count();
		System.out.println("count is a: "+ collect);
	}
}
