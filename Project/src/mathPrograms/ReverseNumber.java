package mathPrograms;

import java.util.stream.Collectors;

public class ReverseNumber {
	public static void main(String[] args) {
		//25. Reverse a number

		int a=90;
		
		String str = new StringBuilder(
	            String.valueOf(a)
	                .chars()
	                .mapToObj(c -> String.valueOf((char) c))
	                .collect(Collectors.joining())
	        ).reverse().toString();
		
		int rev=Integer.parseInt(str);
		System.out.println(rev);
	}

}
