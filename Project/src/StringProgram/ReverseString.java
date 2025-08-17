package StringProgram;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
	
public static void main(String[] args) {
	String str="ashwini";
	char[] ch= str.toCharArray();
	for(int i=ch.length-1; i>=0;i--) {
        System.out.print(ch[i]);
	}
	System.out.println( );

	//stream api using 
	String[] s= str.split("");
	List<String>list= Arrays.asList(s);
	Collections.reverse(list);
	String st= String.join("", list);
	System.out.println(st);
}
}
