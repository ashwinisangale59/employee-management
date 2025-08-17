package StringProgram;

import java.util.*;

public class CountfrequencySentence {
	public static void main(String[] args) {
		//Count frequency from Sentence each character
		String str="java is a good";
		String []ss =str.split("");
		Map<String,Integer>map= new HashMap<>();
		
		for(String s:ss) {
			if(!s.equals(" ")) {//if no space
				map.put(s, map.getOrDefault(s, 0)+1);
			}
			
		}
		System.out.println(map);
	}

}
