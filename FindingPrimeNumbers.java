/**
 * www.programmingbydoing.com 
 * Finding Prime Numbers
 * Write a function like so:
 * public static boolean isPrime( int n )
 * The function should return the value true if n is a prime and false otherwise.
 * Remember that a number is prime if is isn't evenly divisible by anything except for 1 and itself.
 * You can figure this out by using a for loop inside the function.
 * Make the for loop run through all the numbers from 2 up to n. 
 * Inside the loop, use an if statement that determines if n is evenly divisible by your loop control variable.
 * If you find any number which divides it evenly, you can go ahead and return false from the function without 
 * finishing the loop.
 * If the loop finishes and doesn't find any numbers which divide it, then return true from the function.
 * After you finish writing the function write a main() that contains another for loop. 
 * Have it print out all the numbers from 2 to 20, and mark each prime number with a "<".
 * 
 */


package ProgrammingByDoing;

public class FindingPrimeNumbers {

public static void main( String[] args ){
	
    for ( int n = 1; n <= 20; n++ )
    {
        if (isPrime(n)) {
            System.out.println( n + " <");

        } else {
            System.out.println( n );
        }
    }   
}

public static boolean isPrime (int n ) {
	
	for (int x = 2; x < n;x++) {
		
        if (n%x == 0) {
            return false;      //this will return false and stop the function if it is divisible by any number.
    }
}
    return true;//this will return true if false is never returned as it can only reach this if nothing is returned before.
    
	}
}