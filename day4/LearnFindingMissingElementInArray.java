package week1.day4;

import java.util.Arrays;

public class LearnFindingMissingElementInArray {

	public static void main(String[] args) {
//		find the missing element in the given array
//		int= {1,4,3,2,8,6,7};
//		output= 5;
		int [] missingNumber = {1,4,3,2,8,6,7};
		int arrlength = missingNumber.length;
System.out.println(arrlength);
//sort the array
Arrays.sort(missingNumber);
for (int i = 0; i < missingNumber.length; i++) {
	if(missingNumber[i]!= i+1)
	{
System.out.println("missing number is " + (i+1));
break;
	}
	}
	}
}

