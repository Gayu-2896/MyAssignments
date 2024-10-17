package week1.day3;

import java.util.Arrays;

public class LearnDuplicatesInArray {

	public static void main(String[] args) {
		int number[] = {2,3,3,4,6,6,3,1,5,5};
		int arrlength = number.length;
		System.out.println(arrlength);
		Arrays.sort(number);
	System.out.println("Arrays after SORTING: "+ number[0]);
	
	for (int i = 0; i < arrlength - 1; i++) {
        if (number[i] == number[i + 1]) {
            System.out.println("Print the Duplicates: " + number[i]);
        }
    }
}
}
