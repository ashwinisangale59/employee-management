package aarrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargest {
	public static void main(String[] args) {
		//12. Find the second largest number
		int a[] = {12,23,44,566,78};
		Optional<Integer>opt=Arrays.stream(a)
				.boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
            System.out.println(opt);
            
            List<Integer>list= Arrays.asList(1,1);
            Optional<Integer> first = 
            		list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
            System.out.println(first);
	}

}
