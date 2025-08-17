package mathPrograms;

import java.util.stream.Collectors;

public class NumIsPalindrome {
	public static void main(String[] args) {
		// Check if number is palindrome
		String number = "121";

		String sb = new StringBuilder(
		    number.chars()
		          .mapToObj(c -> String.valueOf((char) c))
		          .collect(Collectors.joining())
		).reverse().toString();

		System.out.println("Reversed string: " + sb);

			
		
	}
}
