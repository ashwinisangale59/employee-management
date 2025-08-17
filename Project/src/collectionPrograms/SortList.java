package collectionPrograms;

import java.util.*;

public class SortList {
//32. Sort a list of strings
	public static void main(String[] args) {
		List<String>list=Arrays.asList("sas","asa","dsa","gat");
	
		Collections.sort(list);
		System.out.println(list);
		
		List<Integer>it= Arrays.asList(34,13,23,43);
		Collections.sort(it);
		System.out.println(it);

		
	}

}
