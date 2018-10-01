/*
 * Evan Robertson
 * October 1st 2018
 * Determines area of pool with user inputing l and w
 */

package variablevalues;

import java.util.Scanner;

/**
 *
 * @author evrob0095
 */
public class VariableValues {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner
        Scanner keyedInput = new Scanner (System.in);
        
        //Variables
        int num1;
        int num2;
        int area;
        
        //Execution
        System.out.println("Your putting in a brand spanking new pool in your backyard, enter the length of this pool in meters below");
        num1 = keyedInput.nextInt();
        System.out.println("Enter the width of you brand spanking new pool in meters ");
        num2 = keyedInput.nextInt();
        area = num1*num2;
        System.out.println("The area of your brand spanking new pool is " + area + " meters squared");
        
    }
    
}
