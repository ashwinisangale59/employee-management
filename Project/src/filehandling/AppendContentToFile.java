package filehandling;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class AppendContentToFile {
	public static void main(String[] args) {
		String s= "This is a paragraph being appended to the file.\n"
                + "It contains multiple lines and explains how to add paragraphs.\n"
                + "Appending paragraphs is useful for note-taking and documentation.\n\n";
		
      String str="C:\\Users\\HP\\Downloads\\output.file";
      
  	try {
        // Read all lines from the file to check for duplication
        List<String> lines = Files.readAllLines(Paths.get(str));
        String fileContent = String.join("\n", lines);

        if (fileContent.contains(s.trim())) {
            System.out.println("Paragraph already exists in the file. Skipping append.");
        } else {
        
      try(BufferedWriter fw= new BufferedWriter(new FileWriter(str,true))) {
		
		fw.write("hello ashwini\n");
		fw.write(s);
		System.out.println("data added");
		
	}
        }} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
