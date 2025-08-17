package StringProgram;

import java.util.Arrays;

public class Removewhite {
public static void main(String[] args) {
	//5. Removewhite spaces from a string
	String str="java is a good ";
	String s= str.replaceAll("\\s+", "");
	System.out.println("space remove:"+ s);
       
	  String k = "java is a good";
      String[] b = k.split(" ,"); // now it will split correctly
      System.out.println(Arrays.toString(b)); 
}
}
