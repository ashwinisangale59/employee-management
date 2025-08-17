package StringProgram;

public class CountWords {
	public static void main(String[] args) {
		// Count words in a string
		String str = "java is a good language";
		String[] split = str.split("\\s+");
       System.out.println("count of word in string :"+ split.length);
      
       for(String s:split) {//optional
    	   System.out.println(s);
       }
	}
}
