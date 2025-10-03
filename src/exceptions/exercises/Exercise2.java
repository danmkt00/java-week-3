package exceptions.exercises;

/**
 *  Exercise 2:
 *  Create an array of 5 elements.
 *  Try to access index 10.
 *  Catch ArrayIndexOutOfBoundsException and print a message.
 */

public class Exercise2
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            arr[10] = 10;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Cannot reach this index.");
        }
    }
}
