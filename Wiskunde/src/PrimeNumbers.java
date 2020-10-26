
public class PrimeNumbers {



public static void main( String[] args ){
	
    for ( int n = 2; n <= 100; n++ )
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

