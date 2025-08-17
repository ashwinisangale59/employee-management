package collectionPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindCommonElements {
	public static void main(String[] args) {
		// 36. Find common elements in two lists
     List<Integer>list= Arrays.asList(1,2,3,4,5);

     List<Integer>list1= Arrays.asList(1,2,3,7,6);
     
     for(Integer i:list) {
    	 if(list1.contains(i )) {
    		 System.out.println(i);
    	 }
     }
	}
}
