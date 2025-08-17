package StringProgram;

import java.util.*;

public class CountfrequencyWord {
	public static void main(String[] args) {
	//6. Countfrequency of characters
		
     // String str= "java is a good";
		String str="java";
      
      Map<Character,Integer> map= new HashMap<>();
      for(char ch:str.toCharArray()){
    	  map.put(ch, map.getOrDefault(ch, 0)+1);
      }
      System.out.println(map);
      
      for(Map.Entry<Character, Integer>entry:map.entrySet()) {
    	  System.out.println(entry.getKey()+" " + entry.getValue());
    	  
      }
      
      
	}

}
