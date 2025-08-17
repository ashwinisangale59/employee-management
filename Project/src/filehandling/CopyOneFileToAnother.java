package filehandling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopyOneFileToAnother {
	public static void main(String[] args)  {
        Path sourcePath = Paths.get("C:\\Users\\HP\\Downloads\\second.file");
        Path dest= Paths.get("C:\\Users\\HP\\Downloads\\first.file"); 
        try {
			Files.copy(sourcePath, dest);
			System.out.println("data copied");
		} catch (IOException e) {
			e.printStackTrace();
		}


	}
}
