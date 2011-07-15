package problems;

import java.util.ArrayList;

/**The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem003 {

    
    private static ArrayList<Long> findPrimeFactors(Long number) {
        ArrayList<Long> primeFactors = new ArrayList<Long>();
        long total = 1;
        
        for (long i = 2; i < number && total < number; i++) {
           
            if (number%i == 0) {
                primeFactors.add(i);
                total *= i;
                //System.out.println(i);
            }            
        }
        
        return primeFactors;
    }
    
    private static long findMax(ArrayList<Long> numbers) {
        return numbers.get(numbers.size()-1);        
    }
    
    public static long findLargestPrimeFactorOf(long number) {
        
        return findMax(findPrimeFactors(number));
        
    }
    
    
    
}
