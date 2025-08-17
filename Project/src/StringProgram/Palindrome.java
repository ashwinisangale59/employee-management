package StringProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrome {
public static void main(String[] args) {
	//Check if a string is a palindrome
	String str="mam";
	String s[]=str.split("");
	List<String>list=Arrays.asList(s);
	Collections.reverse(list);
	String sy=String.join("", list);
	if(str.equals(sy)) {
		System.out.println("string palindrome");
	}else {
		System.out.println("string is not  palindrome");

	}
	
	//another way
	String sb= new StringBuilder(str).reverse().toString();
	if(str.equals(sb)) {
		System.out.println("string palindrome");
	}else {
		System.out.println("string is not  palindrome");

	}
}
}
