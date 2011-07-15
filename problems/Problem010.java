package problems;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 *
 */
public class Problem010 {

    public static long sumOfPrimesUnderLimit(int limit ) {
        
        long sum = 5;
        int currentPrime = 0;
        
        for (int i = 5; i < limit; i = i + 2) {
            
            if (Problem007.isPrime(i)) {
                currentPrime = i;
                sum += currentPrime;                
            }
            
        }
        
        return sum;
        
    }
    
}
