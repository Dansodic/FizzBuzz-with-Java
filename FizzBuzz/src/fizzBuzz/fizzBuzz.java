//Daniel Kenny 20/08/19
//An example of how to solve the fizzbuzz problem with Java.
package fizzBuzz;

public class fizzBuzz {

	public static void main(String[] args) {
		
		for(int i = 1; i <=100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if(i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if(i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
		}

	}

}
