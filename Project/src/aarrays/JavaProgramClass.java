package aarrays;
import java.util.stream.IntStream;

public class JavaProgramClass {

	    public static void main(String[] args) {
	        String str = "As@#wi12";

	        long[] upperCount = {0};
	        long[] lowerCount = {0};
	        long[] digitCount = {0};
	        long[] specialCount = {0};

	        IntStream.range(0, str.length())
	                .forEach(i -> {
	                    char ch = str.charAt(i);
	                    if (Character.isUpperCase(ch)) {
	                        upperCount[0]++;
	                        System.out.println(ch + " type Uppercase index " + i + " count " + upperCount[0]);
	                    } else if (Character.isLowerCase(ch)) {
	                        lowerCount[0]++;
	                        System.out.println(ch + " type Lowercase index " + i + " count " + lowerCount[0]);
	                    } else if (Character.isDigit(ch)) {
	                        digitCount[0]++;
	                        System.out.println(ch + " type Digit index " + i + " count " + digitCount[0]);
	                    } else {
	                        specialCount[0]++;
	                        System.out.println(ch + " type SpecialCharacter index " + i + " count " + specialCount[0]);
	                    }
	                });

	        
	    }
	}
