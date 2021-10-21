// Method 1 ( If Loop )

public class JavaExample {


	// Implementation of Main Function
	public static void main(String[] args) {

		// Here we setting to counter to 1, will break if it is 20, It will increment by 1.

		for(int number = 1;number <= 20;number++) {

			// Checking the modulo of 15 ( 15 is both divisible by 3 and 5.. So we are using it )
			// We could've used and too for a more dynamic experssion if it is divisble by both 3 and 5.
			// We are reffering 15 since that will make it look more complex.

			// MODULO is dividing and getting the remainder

			// Checks if the remainder is 0 after dividing the number by 15
			if ((number % 15) == 0) {

				System.out.println("FizzBuzz");

			} 

			// Checks if the remainder is 0 after dividing the number by 3
			else if ((number % 3) == 0) {

				System.out.println("Fizz");

			}

			// Checks if the remainder is 0 after dividing the number by 5
			else if ((number % 5) == 0) {

				System.out.println("Buzz");

			}

			// If none of the above statement is working/applied. This will print the number instead.

			else {

				System.out.println(String.valueOf(number));

			}

		}

		
	}


}