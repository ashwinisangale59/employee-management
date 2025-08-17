package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionListbyPredicate {
	public static void main(String[] args) {
    List<Integer>list= Arrays.asList(11,22,3,4,44,32);
      
    Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(i->i>22));
    
    System.out.println(collect.get(true));
    System.out.println(collect.get(false));
    
    List<Employee>li=Arrays.asList (new Employee(1, "ahgsggdg", "hd", 98473),
    		new Employee(1, "Ashwini", "IT", 75000),new Employee(1, "asde", "ba", 23443));
    
    Map<Boolean, List<Employee>> collect2 = li.stream().collect(Collectors.partitioningBy(t->t.getDepartment()=="hd"));

    System.out.println(collect2.get(true));
    System.out.println(collect2.get(false));

	}
}
