package streamapi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountElementsGreaterThreshold {
	public static void main(String[] args) {
         List<Integer>list= Arrays.asList(1,2,3,46,7,87,65);
         
         List<Integer> collect = list.stream().filter(p-> p >10).collect(Collectors.toList());
         System.out.println(collect);
	}
}
