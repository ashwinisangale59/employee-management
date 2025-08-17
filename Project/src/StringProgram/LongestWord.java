package StringProgram;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LongestWord {
	public static void main(String[] args) {
		//longest word from sentence
     String s="jav is a good";
      int max= 0;
      String[] str= s.split(" ");
      String longs="";
      for(String st:str){
    	  if(st.length()>max) {
    		  max=st.length();
    		  longs = st;
    		  
    	  }
    	  }
      System.out.println(longs);
      
      String longw= Arrays.stream(s.split(" "))
      .max((a,b)->Integer.compare(a.length(),b.length())).orElse("");
      System.out.println(longw);

	}

}
