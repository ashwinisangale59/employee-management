package ObjectOrientedConcepts;

public class InheritanceExample {

	public void m1() {
		System.out.println("parents class ");

	}

}

class InheritanceExample2 extends InheritanceExample {
	public void m2() {
		System.out.println("child class ");

	}
	public static void main(String[] args) {
		/*
		 * InheritanceExample a= new InheritanceExample2(); 
		 * a.m1();
		 */
		InheritanceExample2 ab= new InheritanceExample2();
		ab.m2();
		ab.m1();

		

	}
}
