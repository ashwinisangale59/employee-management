package ObjectOrientedConcepts;



class Overrideeee {
	public void m1(int i) {
		System.out.println("oveeride");
	}
}

 class MethodOverlodingOverriding extends Overrideeee {

	public static void main(String[] args) {

	}
	
	
	public void m1(int i) {
		System.out.println("oveeride");
	}
	
	
	public void m2(int i,int y) {
		System.out.println("overloding");
	}
	
	public void m2(int i) {
		System.out.println("overloding");
	}
	
}

