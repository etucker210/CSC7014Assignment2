/* ***********************************************************************
 *
 * File Name: Assignment2.java
 * Author:    Elijah Tucker
 * Last Edit: 14 Sep 2024
 *
 * Prompt:    Write a program (java, python, or C++) that reads a series
 *            of integers from the user and prints the sum of all even
 *            numbers, and the product of all odd numbers entered. The
 *            program should continue reading numbers until the user
 *            enters a negative number.
 *
 * Change Log:
 *
 * Date & Time         | Description
 * --------------------|-------------------------------------
 * 14 Sep 2024 11:54AM | Create the assignment class
 * 14 Sep 2024 12:29PM | Create the main function
 * 14 Sep 2024 12:37PM | Make the calculateProduct function
 * 14 Sep 2024         | Make the calculateSum function
 * 19 Sep 2024  7:32PM | finish the main of the assignment and test
 ************************************************************************/
import java.util.Scanner; //the class for input

public class Assignment2 {

    /* *******************************************************************
     *
     * Function name: main
     * Inputs:        args - String[] - the arguments passed when the
     *                                  program is called
     * Output:        none
     *
     * Description:   The main function that handles most of the code
     *
     ********************************************************************/
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int newValue;
        int product = 0;
        int sum = 0;

        //Give the instructions to the user
        System.out.println("This program takes an input from the user and" +
                " sums all even numbers and multiplies all odd numbers." +
                " A negative number will terminate the program.");

        System.out.print("Enter an integer: ");

        //get the first number
        newValue = input.nextInt();

        // If the number is positive keep going
        while ( newValue >= 0 ) {

            //If the number is even add the number to the sum otherwise
            //calculate the product
            if (newValue % 2 == 0) {

                sum = calculateSum(sum, newValue);

            } else {

                // if the odd number is the fist one, set that as the
                // first product otherwise multiply the last product
                // with the next number
                if (product == 0) {

                    product = newValue;

                } else {

                    product = calculateProduct(product, newValue);

                }
            }

            //prompt the user for the next number and get it from the user
            System.out.print("Enter an integer (a negative number will terminate the program): ");
            newValue = input.nextInt();

        }

        // tell the user the end product and the end sum
        System.out.println("The product of the odd numbers is " + product + ".");
        System.out.println("The sum of the even numbers is " + sum + ".");

    }

    /* *******************************************************************
     *
     * Function Name: calculateProduct
     * Input:         number1 - int - The first number to multiply
     *                number2 - int - The second number to multiply
     * Output:        int - the value of number1 times number2
     *
     * Description:   This function multiplies number1 and number2
     *
     ********************************************************************/

    private static int calculateProduct( int number1, int number2 ) {

        return number1 * number2;

    }

    /* *******************************************************************
     *
     * Function Name: calculateSum
     * Inputs:        number1 - int - The first number to add
     *                number2 - int - The second number to add
     * Output         int - The value of number1 plus number2
     *
     * Description:   This function adds number1 and number2
     *
     ********************************************************************/

    private  static  int calculateSum( int number1, int number2 ) {

        return number1 + number2;

    }
}
