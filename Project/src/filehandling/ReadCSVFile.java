package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {
	public static void main(String[] args) {

		String str = "C:\\Users\\HP\\Downloads\\students.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(str))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");

				for(String value:data) {
					System.out.println(value + "\t");
				}
				System.out.println();
			}
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
