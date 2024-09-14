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
 *
 ************************************************************************/

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
