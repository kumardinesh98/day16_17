package binarysearchword;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	static Scanner scanner;

	public static void main(String[] args) {
		Scanner newscan = new Scanner(System.in);
		String text = "";

		try {
			scanner = new Scanner(new File("D:/javapractice/day16-17/src/binarysearchword/test.txt"));
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		while (scanner.hasNext()) {
			text += scanner.nextLine();
		}
		String[] array = text.split(" ");
		Arrays.sort(array);
		System.out.println("enter the word to search");
		String findText = newscan.nextLine();
		Search search = new Search();
		int result = search.binarySearch(array, findText);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index" + result);

	}

}
