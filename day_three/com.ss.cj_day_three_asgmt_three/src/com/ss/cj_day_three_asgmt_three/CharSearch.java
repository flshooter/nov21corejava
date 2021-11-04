package com.ss.cj_day_three_asgmt_three;

/**
 * @author Richard Croft
 */

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CharSearch {

	public static void main(String[] args) {
		String fileName = "Source/sample_text.txt";
		List<String> fileContents = new ArrayList<String>();
		int charCount = 0;
		char testChar = ' ';

		Scanner input = new Scanner(System.in); // open scanner for input

		System.out.println("Please enter a letter of the alphabet."); // prompt user for input
		testChar = input.next().charAt(0); // store input in testChar
		input.close(); // close scanner

		// try/catch block to read file contents
		try {
			Path path = Paths.get(fileName);
			fileContents.addAll(Files.readAllLines(path));
		} catch (IOException e) {
			e.printStackTrace();
		}

		// count character occurrences in file contents
		for (String line : fileContents) {
			for (int cnt = 0; cnt < line.length(); cnt++) {
				if (line.charAt(cnt) == testChar) {
					charCount++;
				}
			}
		}
		// display character count
		System.out.println("The character " + testChar + " occurs " + charCount + " times.");
	}

}
