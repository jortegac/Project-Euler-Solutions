package problems;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 *  we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *  
 *  Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */
public class Problem001 {

    /**Find the sum of all the multiples of 3 or 5 below the limit established.
     * @param limit
     * @return The sum of all the multiples of 3 or 5 below the limit
     */
    public static int sumOfMultiplesOf3Or5(int limit) {
        int total = 0;
        
        for (int i = 0; i < limit; i++) {
            
            if(isMultiple(i, 3) || isMultiple(i, 5)) {
                total += i;
            }            
        }        
        
        return total;
    }
    

    /** Checks if x is multiple of y
     * @param 	x
     * @param 	y
     * @return 	True - If x is multiple of y
     */			False - Otherwise
    private static boolean isMultiple(int x, int y) {
        
        boolean response = false;
        
        int result = x%y;
        
        if (result == 0) {
            response = true;
        }
        
        return response;
    }
}
