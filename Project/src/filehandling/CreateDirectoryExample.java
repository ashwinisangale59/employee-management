package filehandling;

import java.io.File;

public class CreateDirectoryExample {
public static void main(String[] args) {
	String str = "C:\\Users\\HP\\Downloads\\ashwini.file";//create folder 
	File fileDirectory= new File(str);
	if(!fileDirectory.exists()) {
		boolean mkdirs = fileDirectory.mkdirs();// Use mkdirs() to create parent  file if not exists
		if(mkdirs) {
			System.out.println("fileDirectory created succssfully");
		}else {
		System.out.println("fileDirectory created failed");
		}
		
	}else {
		System.out.println(" file Directory already exists.");

	}
}
}
