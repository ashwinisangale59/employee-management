package streamapi;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListtoMap {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(11);
		list.add(111);
		System.out.println("this is list" + list);
		
		Map<Integer, Integer> map=	list.stream().collect(Collectors.toMap(
				Function.identity(),  
		        Integer::new));
	
		System.out.println(map);

	}
}
