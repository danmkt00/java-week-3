package exceptions.exercises;

/**
 * Exercise 1:
 * Write a program that divides two numbers.
 * Catch ArithmeticException when dividing by zero.
 * Print a friendly error message.
 */

public class Exercise1
{
    public static void main(String[] args)
    {
        try
        {
            int result = 10 / 0; // risky code
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}




