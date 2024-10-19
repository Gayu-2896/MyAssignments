package week1.day4;

public class LearnFibonacciSeries {

	public static void main(String[] args) {
//		Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1
int first = 0;//assumption
int sec = 1;
		
	for (int i = 0; i <8; i++) {
		int result = first+sec;
	System.out.println(first+sec);
	first = sec;
	sec = result;
	}
	}

}
