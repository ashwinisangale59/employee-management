package collectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveNullsfromList {
	public static void main(String[] args) {
		// 37. Remove nulls from list
		   List<Integer>list1=new ArrayList<>();
	         list1.add(1);
	         list1.add(null);
	         list1.add(1);
	         list1.add(4);
	        
	         list1.removeIf(i -> i == null);

	         System.out.println(list1);
	         Iterator<Integer> iterator = list1.iterator();
	         while (iterator.hasNext()) {
	             if (iterator.next() == null) {
	                 iterator.remove();  
	             }
	         }
	         System.out.println(list1);
	         
	}
}

