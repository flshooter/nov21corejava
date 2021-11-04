package com.ss.cj_day_three_asgmt_one;

/**
 * @author Richard Croft
 */
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;


public class DirectoryList {
// Obtains directory listing of files and directories

	public static void main(String[] args) {
		// try/catch to protect against IOExceptions and display directories and files
		 try {
		      Path path = Paths.get("Source/test_dir_1"); // gets path for file name
		      FileLister lister = new FileLister(); // creates lister(SimpleFileVisitor implementation object 
		      Files.walkFileTree(path, lister); // calls walkFileTree
		    } catch (IOException ex) {
		      ex.printStackTrace();
		    }
	}
}
