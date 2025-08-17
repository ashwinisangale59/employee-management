package StringProgram;

import java.util.HashMap;
import java.util.Map;

public class Countvowels{
public static void main(String[] args) {
	//4. Countvowels and consonants
	String str="ashwini";
	String s="aeiouAEIOU";
	int con=0;
	Map<Character,Integer>map= new HashMap<>();
	
	for(char ch:str.toCharArray()) {
		if(s.indexOf(ch)!=-1){
          	map.put(ch, map.getOrDefault(ch, 0)+1);
		}else {
			con++;
		}
	}
       System.out.println(map);
       System.out.println(con);

}
}
