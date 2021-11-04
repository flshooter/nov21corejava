package com.ss.cj_day_three_asgmt_two;

/**
 * @author Richard Croft
 */
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;


public class FileAppend {

	public static void main(String[] args) {
		
		String fileName = "Source/test.txt";
		String text = "Writing text to existing file.";
		try {
			Path path = Paths.get(fileName); // gets path object for file name
			Files.write(path, text.getBytes(), StandardOpenOption.WRITE); // writes to file
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
}
		