package permutations;

import java.util.ArrayList;

public class Permutations {
	static ArrayList<String> result1 = new ArrayList();

	  public static void swap(char[] chars, int i, int j)
	    {
	        char temp = chars[i];
	        chars[i] = chars[j];
	        chars[j] = temp;
	    }
	 
	    public static void permutations(char[] chars, int currentIndex)
	    {
	        if (currentIndex == chars.length - 1) {
	           // System.out.println(String.valueOf(chars));
	            result1.add(String.valueOf(chars));
	        }
	 
	        for (int i = currentIndex; i < chars.length; i++)
	        {
	            swap(chars, currentIndex, i);
	            permutations(chars, currentIndex + 1);
	            swap(chars, currentIndex, i);
	        }
	    }
	 
	    public static void findPermutations(String str) {
	        if (str == null || str.length() == 0) {
	            return;
	        }
	 
	        permutations(str.toCharArray(), 0);
	    }
	 
	    public static void main(String[] args)
	    {
	        String str = "dinesh";
	        findPermutations(str);
	        Itration itration = new Itration();
	        itration.permutationsItr(str);
	        if(result1.size() == itration.result.size()) {
	        	System.out.println("equal");
	        }
	        else {
	        	System.out.println("not equal");
	        }
	    }
	
}
