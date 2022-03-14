package com.te.javabasics.Test;

import java.util.Arrays;

public class Duplicate_Array {

	public static void main(String[] args) {

		// Initialize array
		int[] arr = new int[] { 1, 2, 3, 4, 2, 7, 8, 8, 8, 3 };
		// prints the arrays
		System.out.println(Arrays.toString(arr));
		System.out.println("Duplicate elements in given array: ");
		// Searches for duplicate element
		for (int i = 0; i < arr.length; i++) {
			int count = 0;

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == arr[i] && j != i) {
					count++;
					arr[j] = '\n';

				}
			}
			if (arr[i] != '\n' && count > 0) {
				System.out.println(arr[i] + "");
			}

		}
	}
}
