package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListWithComma {
	public static void main(String[] args) {
       List<Integer>list= Arrays.asList(1,2,3,4,5,6);
       
      String join= list.stream().map(String::valueOf).collect(Collectors.joining(","));
      System.out.println(join);
	}
}
