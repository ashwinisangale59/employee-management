package ObjectOrientedConcepts;

public class EncapsulationExample {
	private int id;
	private String name;
	private String address;
	private float salray;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getSalray() {
		return salray;
	}

	public void setSalray(float salray) {
		this.salray = salray;
	}

	@Override
	public String toString() {
		return "EncapsulationExample {" + "id=" + id + ", name='" + name + '\'' + ", address='" + address + '\''
				+ ", salary=" + salray + '}';
	}

	public static void main(String[] args) {
		System.out.println("This is Encapsulation example");
		EncapsulationExample ad = new EncapsulationExample();
		ad.setAddress("asa");
		System.out.println(ad.toString());
	}

}
