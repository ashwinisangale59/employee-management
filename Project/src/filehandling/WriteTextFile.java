package filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
	public static void main(String[] args) {
		String str= "hello java";
		
		try(BufferedWriter br= new BufferedWriter(new FileWriter("C:\\Users\\HP\\Downloads\\output.file"))) {
			br.write(str);
			System.out.println("data write succssfully");
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
