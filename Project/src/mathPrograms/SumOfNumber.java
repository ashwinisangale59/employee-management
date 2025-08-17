package mathPrograms;

public class SumOfNumber {
	public static void main(String[] args) {
		int a = 1234;
		int rev = String.valueOf(a).chars().map(Character::getNumericValue).sum();
		System.out.println(rev);
		
		int aa[]= {1,2,3,4};
		int sum=0;
		for(Integer i:aa) {
			sum+=i;
		}
		System.out.println(sum);

	}

}
