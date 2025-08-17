package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinListElementsComma {
public static void main(String[] args) {
	List<String>list=Arrays.asList("ashwini","mac","java","Hello");
	
	String collect = list.stream().collect(Collectors.joining(","));
	System.out.println(collect);
}

}
