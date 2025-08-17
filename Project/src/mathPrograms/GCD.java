package mathPrograms;

public class GCD {
	//Find GCD of two numbers
	public static void main(String[] args) {
		/*
		 * GCD(60, 36) = GCD(36, 60 % 36) → GCD(36, 24) = GCD(24, 36 % 24) → GCD(24, 12)
		 * = GCD(12, 24 % 12) → GCD(12, 0)
		 */

		 int a=36;
		 int b=60;
		 
		 while(b!=0) {
			 int temp=b;
			 b=a%b;
			 a=temp;
		 }
		System.out.println(a);
	}
}
