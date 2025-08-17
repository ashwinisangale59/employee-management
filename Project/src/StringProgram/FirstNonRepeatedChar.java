package StringProgram;

import java.util.*;

public class FirstNonRepeatedChar {
	public static void main(String[] args) {
		// 7. Find the first non-repeated character
		String str = "ashwini";
         Map<Character,Integer> map= new HashMap<>();
         
         for(char ch:str.toCharArray()) {
        	 map.put(ch, map.getOrDefault(ch, 0)+1);
         }
         for(Map.Entry<Character, Integer>ent:map.entrySet()) {
        	 if(ent.getValue()>=1) {
        		 System.out.println(ent.getKey()+ " "+ ent.getValue());
        		 return;
        	 }
         }
	}
}
