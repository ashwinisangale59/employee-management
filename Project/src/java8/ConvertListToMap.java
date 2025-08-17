package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ConvertListToMap {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 3, 4, 56, 54);
		
		Map<Integer, Integer> collect = list.stream().collect(Collectors.toMap(i->i, l->l));
		System.out.println(collect);
		Map<Integer, Integer> collect2 = IntStream.range(0, list.size()).boxed().collect(Collectors.toMap(i->i, list::get));
	System.out.println(collect2);
	
	System.out.println(ConvertListToMap.test());
	}
	
	public static int test() {
		int x=5;
	    try {
	        return x;
	    } catch(Exception e) {
	        return 2;
	    }finally {
	    	x=10;
	    	//return x;
	    }
	}

}
