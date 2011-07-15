package problems;

/**
 * By listing the first six prime numbers: 
 * 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * 
 * What is the 10001st prime number?
 *
 */
public class Problem007 {

    public static int findNthPrimeNumber(int limit) {
        int prime = 0;
        int counter = 0;
        
        int counter2 = 2;
        
        while(counter < limit) {
            
            if (isPrime(counter2)) {
                counter++;
                prime = counter2;
            }                       
            
            counter2++;
        }
        
        return prime;
    }
    
    public static boolean isPrime(int n) {
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if (n%i==0) {
                return false;
            }
        }
        
        return true;
        
    }
    
}
