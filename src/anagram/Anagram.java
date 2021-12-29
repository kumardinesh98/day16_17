package anagram;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	static boolean areAnagram(String[] str1, String[] str2){
		int n1 = str1.length;
		int n2 = str2.length;
		if (n1 != n2) {
			return false;
		}

		Arrays.sort(str1);
		Arrays.sort(str2);

		for (int i = 0; i < n1; i++) {
			if (! str1[i] .equals(str2[i])) {
				return false;

			}
		}
		System.out.println("noooooo");
		return true;
			
		
	}
	 
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter thr first word");
		String word1 = scanner.nextLine();

		System.out.println("enter thr first word");
		String word2 = scanner.nextLine();
        String str1[] = word1.split("");
        String str2[] = word2.split("");;
       
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                               + " anagram of each other");
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");
	}
		     
	
}
