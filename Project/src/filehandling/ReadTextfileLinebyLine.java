package filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextfileLinebyLine {
	public static void main(String[] args)  {
		String str= "C:\\Users\\HP\\Downloads\\java_100_coding_problems.java";
	
		try(BufferedReader br= new BufferedReader(new FileReader(str))){
			String line;
			
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
