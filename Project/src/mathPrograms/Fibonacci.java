package mathPrograms;

public class Fibonacci {
	// 23. Generate Fibonacci series
	public static void main(String[] args) {
		int n = 10;
		int a = 0,b=1;
		System.out.print("Fibonacci Series: " + a + " " + b);

		for(int i=2; i<n;i++) {
			int c=a+b;
			System.out.println( c);
			a=b;
			b=c;
		}

	}

}
