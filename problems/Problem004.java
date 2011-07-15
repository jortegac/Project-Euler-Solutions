package problems;

/**
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product of two 2-digit numbers is 9009 = 91  99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem004 {

    private static String reverseString(String input) {        
        
        int length = input.length();
        int last = length - 1;
                
        char[] output =  input.toCharArray();      
        
        for (int i = 0; i < length / 2; i++) {
            char buffer = output[i];           
            output[i] = output[last - i];
            output[last - i] = buffer;           
        }
        
        return new String(output);        
    }
    
    private static boolean isPalindrome(String input) {
        return input.equalsIgnoreCase(reverseString(input)) ? true : false;        
    }
    
    public static int findLargestPalindrome(int numberOfDigits) {
        
        int largest = 0;
        System.out.println(largest);
        
        int mult = 0;
        
        for (int i = (int) (Math.pow(10, numberOfDigits) - 1); i > Math.pow(10, numberOfDigits-1); i--) {
            for (int j = (int) (Math.pow(10, numberOfDigits) - 1); j > Math.pow(10, numberOfDigits-1); j--) {
                
                mult = i*j;               
                
                if (mult <= largest) {
                    System.out.println("Break");
                    break;
                }
                
                if (isPalindrome(String.valueOf(mult))) {
                    largest = mult;
                }
                
            }
        }
        return largest;
    }
}
