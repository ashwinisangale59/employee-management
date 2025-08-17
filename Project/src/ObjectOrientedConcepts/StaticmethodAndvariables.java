package ObjectOrientedConcepts;

public class StaticmethodAndvariables {
	static int id;
	static String name;

	public static int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "StaticmethodAndvariables [toString()=" + super.toString() + "]";
	}

	public static void setId(int id) {
		StaticmethodAndvariables.id = id;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		StaticmethodAndvariables.name = name;
	}

	public static boolean m1() {
   System.out.println("this is an static method");
	return true;
	}

	public static void main(String[] args) {
		System.out.println(StaticmethodAndvariables.m1());
		StaticmethodAndvariables.setName("ashwini");
		
		System.out.println(StaticmethodAndvariables.getName());
		

		
	}
}
