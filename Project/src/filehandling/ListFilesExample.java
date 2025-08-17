package filehandling;

import java.io.File;

public class ListFilesExample {
    public static void main(String[] args) {
        // Set the path of the folder to list
		String folderPath = "C:\\Users\\HP\\Downloads\\ashwini.file";

        File folder = new File(folderPath);

        // Check if it's a directory
        if (folder.exists() && folder.isDirectory()) {
            // Get all files and directories in the folder
            File[] fileList = folder.listFiles();

            if (fileList != null && fileList.length > 0) {
                System.out.println("Files and directories in: " + folderPath);
                for (File file : fileList) {
                    if (file.isFile()) {
                        System.out.println("File: " + file.getName());
                    } else if (file.isDirectory()) {
                        System.out.println("Directory: " + file.getName());
                    }
                }
            } else {
                System.out.println("The folder is empty.");
            }
        } else {
            System.out.println("The path is not a valid directory.");
        }
    }
}
