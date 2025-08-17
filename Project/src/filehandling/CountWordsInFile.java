package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsInFile {
	public static void main(String[] args) {
		String str = "C:\\Users\\HP\\Downloads\\output.file";
		int wordCount = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(str))) {
			String line;
			
			while ((line = br.readLine()) != null) {
				if (!line.trim().isEmpty()) {
					String[] words = line.trim().split("\\s+"); // splits on spaces, tabs, etc.
					wordCount += words.length;
				}
			}
			System.out.println("Total words in the file: " + wordCount);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
