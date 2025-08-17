package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class SumAllNumberslist {
	public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5,6);
        int sum = list.stream().mapToInt(Integer::new).sum();
        System.out.println(sum);
     
        OptionalInt min = list.stream().mapToInt(Integer::new).min();
        OptionalInt max = list.stream().mapToInt(Integer::new).max();
        System.out.println(min +" "+ max);

        
	}
}
