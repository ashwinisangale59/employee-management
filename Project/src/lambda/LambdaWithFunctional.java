package lambda;

public class LambdaWithFunctional {
	public static void main(String[] args) {
		/*
		 * Functional fun= (name)->{return name;}; String m1 = fun.m1("java");
		 * System.out.println(m1);
		 */
		Functional fun = (name) -> System.out.println(name);
		fun.m3();
		fun.m2("java");
		Functional.m4();

	}
}

interface Functional {
	// abstract String m1(String name);

	abstract void m2(String name);

	default void m3() {
		System.out.println("this is deafult method");
	}

	static void m4() {
		System.out.println("this static method");
	}
}