package insertonsort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Insertionsort {
	static Scanner scanner;

	public static void main(String[] args) {
		String text = "";

		try {
			scanner = new Scanner(new File("D:/javapractice/day16-17/src/insertonsort/test.txt"));
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		}
		while (scanner.hasNext()) {
			text += scanner.nextLine();
		}
		String[] array = text.split(" ");
		Sort sort = new Sort();
		sort.sortarray(array);
		System.out.println(Arrays.toString(array));

	}
}
