package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class listToUppercase {
//Convert list to uppercase using stream

	public static void main(String[] args) {
		List<String> list = Arrays.asList("mac", "ashu", "java", "code");
		List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());// Method reference
		System.out.println(collect);
		
		 List<String> collect2 =
				 list.stream().map(s-> Character.toUpperCase(s.charAt(0))+s.substring(1).toLowerCase()).collect(Collectors.toList());
		System.out.println(collect2);
		
		
		
	}
	
}
