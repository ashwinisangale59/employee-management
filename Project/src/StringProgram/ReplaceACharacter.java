package StringProgram;

public class ReplaceACharacter {
	public static void main(String[] args) {
		// 8.ReplaceACharacter in a string
		String str="ashwinis";
		String replace= str.replace("i", "m");
		System.out.println(replace);
		
		String sb=str.replaceAll(str, "ashi");
		System.out.println(sb);
		String sd=str.replace(str, "3");
		System.out.println(sd);

	}
}
