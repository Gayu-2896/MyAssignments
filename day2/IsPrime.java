package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 13; 
        boolean prime = true; 

        if (number <= 1) {
            prime = false; 
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    prime = false; 
                    break; 
                }
            }
        }

        if (prime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}


	
