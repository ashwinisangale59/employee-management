package lambda;

import java.util.Arrays;
import java.util.List;

public class StreamAPILambda {
	// Stream API + Lambda
	public static void main(String[] args) {
     List<Integer>list= Arrays.asList(1,2,3,4,5,6);
     int sum = list.stream()
     .filter(n->n%2==0) // predicate
     .mapToInt(n->n)  //integer to int
     .sum(); //sum of that
     System.out.println(sum);
     
	}
}
