package week1.day4;

public class LearnPalindrome {

	public static void main(String[] args) {
//	initializing 
		int input=121, output = 0,reminder;
		
		for (int i = input; i >0; i = i/10) {
			
		reminder = i%10;
		output = (output*10)+ reminder;
		}
		if (output==input) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}
	}
}
