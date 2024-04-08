import java.util.Scanner;

/**
 * This class contains a method to calculate the factorial of a given integer using recursion.
 * It takes user input for the integer and outputs its factorial.
 */
public class Problem4 {

    /**
     * Main method to read user input, call the factor method to calculate factorial, and output the result.
     * Time Complexity: O(n)
     * - The method calls itself recursively 'n' times.
     * - The worst-case time complexity occurs when the input number is 'n'.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(factor(number));
    }

    /**
     * Method to calculate the factorial of a given integer using recursion.
     * Time Complexity: O(n)
     * - The method calls itself recursively 'n' times.
     * - The worst-case time complexity occurs when the input number is 'n'.
     *
     * @param x The integer for which the factorial needs to be calculated.
     * @return The factorial of the input integer.
     */
    public static int factor(int x){
        // Base case: if 'x' is less than or equal to 1, return 'x'.
        if(x <= 1){
            return x;
        }
        // Recursive case: if 'x' is greater than 1, return 'x' multiplied by the factorial of 'x-1'.
        else{
            return x * factor(x - 1);
        }
    }
}
