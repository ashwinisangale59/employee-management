package streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionListPredicate {
	public static void main(String[] args) {

		List<Integer>list= Arrays.asList(1,2,3,45,6);
		Map<Boolean,List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(i->i%2==0));
		
		System.out.println("even"+ collect.get(true));
		System.out.println ("odd"+ collect.get(false));

		
	}
}
