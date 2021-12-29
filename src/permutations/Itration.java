package permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Itration {
	static ArrayList<String> result = new ArrayList();
	

	private static void swap(char[] arr, int i, int j) {
		char c = arr[i];
		arr[i] = arr[j];
		arr[j] = c;
	}

	private static void reverse(char[] arr, int i, int j) {
		while (i < j) {
			swap(arr, i++, j--);
		}
	}

	public static void permutationsItr(String str) {
		if (str == null || str.length() == 0) {
			return;
		}

		if (str.length() == 1) {
			//System.out.print(str);
			//result.add(str);
			return;
		}

		char[] chars = str.toCharArray();
		Arrays.sort(chars);

		int n = str.length();

		while (true) {
			//System.out.print(String.valueOf(chars) + " ");
			result.add(String.valueOf(chars));
			int i = n - 1;
			while (chars[i - 1] >= chars[i]) {

				if (--i == 0) {
					return;
				}
			}

			int j = n - 1;
			while (j > i && chars[j] <= chars[i - 1]) {
				j--;
			}
			swap(chars, i - 1, j);
			reverse(chars, i, n - 1);
		}
	}
	
	
	 
}
