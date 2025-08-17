package ObjectOrientedConcepts;

public class InterfaceImplementation implements InterfaceImplementation1 {

	
	public void m1() {
		System.out.println("hi");
	}

	public void m2() {
		System.out.println("by");

	}
	public static void main(String[] args) {
		InterfaceImplementation b= new InterfaceImplementation();
		b.m1();
		b.m2();
	}
}

interface InterfaceImplementation1 {
	abstract void m1();

	abstract void m2();

}