package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertListUppercase {
	public static void main(String[] args) {
      List<String>list= Arrays.asList("aaa","bbb","ccc");
     List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
     System.out.println(collect);
     
      
	}
}
