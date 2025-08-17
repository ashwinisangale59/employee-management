package collectionPrograms;

import java.util.*;

public class ConvertListSet {
	public static void main(String[] args) {
		// Convert list to set
		List<Integer> list = Arrays.asList(12, 13, 44, 32, 322);
		Set<Integer> set = new HashSet<>();
		for (Integer it : list) {
			set.add(it);
		}
		System.out.println(set);
		
		
		
		
	}

}



