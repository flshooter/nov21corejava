package com.ss.cj_day_two_asgmt_two;

/**
 * @author Richard Croft
 */
import java.util.Random;

// Finds element with maximum value in 2D array
// Displays position of first occurrence.
public class Max_of_two_d_array {

	public static void main(String[] args) {

		Random rndNumGen = new Random();
		int[][] arrToSearch = new int[3][10];
		int maxInt = 0;
		int maxRow = 0;
		int maxCol = 0;

		// Initialize array with random values
		for (int rowCnt = 0; rowCnt < 3; rowCnt++) {
			for (int colCnt = 0; colCnt < 10; colCnt++) {
				arrToSearch[rowCnt][colCnt] = rndNumGen.nextInt(99);
			}
		}

		// Display array System.out.println("Array to search for maximum value:");
		for (int[] row : arrToSearch) {
			for (int col : row) {
				System.out.printf("%4d", col);
			}
			System.out.println();
		}

		// Find maximum value in array
		for (int rowCnt = 0; rowCnt < 3; rowCnt++) {
			for (int colCnt = 0; colCnt < 10; colCnt++) {
				if (arrToSearch[rowCnt][colCnt] > maxInt) {
					maxInt = arrToSearch[rowCnt][colCnt];
					maxRow = rowCnt;
					maxCol = colCnt;
				}
			}
		}

		System.out.println("\nThe greatest value in the array is : " + maxInt);
		System.out.printf("The position in the array is: [%d][%d]", maxRow, maxCol);

	}

}
