package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeObjectFile {
	public static void main(String[] args) {
		Student student = new Student(1, "Ashwini", "1234");
		String str = "C:\\Users\\HP\\Downloads\\student.ser";
		try (FileOutputStream file = new FileOutputStream(str); ObjectOutputStream bf = new ObjectOutputStream(file)) {

			bf.writeObject(student);

			System.out.println("SerializeObject to file");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

class DeSerializeObjectFile {
	public static void main(String[] args) {
		Student student = new Student(1, "Ashwini", "1234");
		String str = "C:\\Users\\HP\\Downloads\\student.ser";

		try (FileInputStream file = new FileInputStream(str); ObjectInputStream bf = new ObjectInputStream(file)) {

			bf.readObject();
			System.out.println("DeSerializeObject to file");
			System.out.println(student);

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}

class Student implements Serializable {
	private int id;
	private String name;
	private transient String secret; // it will not a part of serilaze its make a transient

	public Student(int id, String name, String secret) {
		super();
		this.id = id;
		this.name = name;
		this.secret = secret;
	}

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

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", secret=" + secret + "]";
	}

}