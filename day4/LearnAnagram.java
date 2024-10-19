package week1.day4;

import java.util.Arrays;

public class LearnAnagram {

	
	
	public static void main(String[] args) {
		
		String word = new String("stops");
		String word1 = new String("posts");
		
		int arrlength = word.length();
		System.out.println(arrlength);
		int arrlength1 = word1.length();
		System.out.println(arrlength1);
		
		char[] charArray = word.toCharArray();
		System.out.println(charArray);
		char[] charArray2 = word1.toCharArray();
		System.out.println(charArray2);
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
			
				for (int j = 0; j < charArray2.length; j++) {
				System.out.println(charArray2[j]);
				}
				Arrays.sort(charArray);
				Arrays.sort(charArray2);
		if (Arrays.equals(charArray, charArray2)) {
			System.out.println("it is anagram");
		} else {
			System.out.println("it is not an anagram");
		} 
		
}
}

	
		
		

