package positive;
import java.util.*;
public class primenum {
	public static void main(String[] args) {
	    int number=0;               
	    for (int i=0; i<40; i++){
	        if(isPrime(i)){
	            System.out.println(i);
	            number++;          
	        }
	    }
	    System.out.println("number of primes is: " + number); 
	}
	public static boolean isPrime(int n) {
	    if (n == 1) {
	        return false;
	    }
	    for (int i = 2; i <= n / 2; i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;

	    }
}
