package ObjectOrientedConcepts;

public class CreateClassAndObject {
	String str;
	String s;
	String st;
	int year;
	String string;
	int i;

	public CreateClassAndObject(String str, String s, String st) {
		super();
		this.str = str;
		this.s = s;
		this.st = st;
	}
	// Constructor overloading

	public CreateClassAndObject(int year, String s, String st, String string) {
		super();
		this.year = year;
		this.s = s;
		this.st = st;
	}

	public CreateClassAndObject(int i) {
		super();
		this.i = i;
	}

	public void getAll() {
		System.out.println("Fname " + str);
		System.out.println("Lname " + s);
		System.out.println("Trade " + st);

		System.out.println("  /////");

		System.out.println("year " + year);
		System.out.println("F " + s);
		System.out.println("L " + st);
		System.out.println("T " + string);

	}

	// Method overloading

	public void getAll(int i) {
		System.out.println("overload " + i);
	}

	public static void main(String[] args) {
		CreateClassAndObject ob = new CreateClassAndObject("ashwini", "sanagle", "BE");
		CreateClassAndObject obb = new CreateClassAndObject(2021, "ashwini", "sanagle", "BE");

		ob.getAll();
		obb.getAll();
		ob.getAll(12);
	}

}
