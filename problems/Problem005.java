package problems;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 
 * without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 */
public class Problem005 {

    public static int findSmallest(int lowerLimit, int upperLimit) {
        int number = 0;
        boolean found = false;
        int counter = 1;
        
        while(!found) {
            
            for (int i = 11; i <= 20; i++) {
                if (counter%i==0) {
                    
                    found = true;
                    
                }else {
                    found = false;
                    break;
                }
            }
            
            if (found) {
                number = counter;
            }
            
            counter++;
        }
        
        return number;
    }
}
