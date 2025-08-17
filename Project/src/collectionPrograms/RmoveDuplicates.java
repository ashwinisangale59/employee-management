package collectionPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

public class RmoveDuplicates {

	public static void main(String[] args) {
		System.out.println(isVaild("()"));

		 System.out.println(isVaild("(]"));

		 System.out.println(isVaild("{}"));

		 System.out.println(isVaild("0"));

	}

	public static boolean isVaild(String s) {
		Stack<Character> st = new Stack<>();
		for (char ch : s.toCharArray()) {
			if (ch == '(')
				st.push(')');
			else if (ch == '{')
				st.push('}');
			else if (ch == '[')
				st.push(']');
			else if (ch == ')' || ch == '}' || ch == ']') {
				if (st.isEmpty() || st.pop() != ch)
					return false;
			}

		}
		return st.isEmpty();
	}
}
