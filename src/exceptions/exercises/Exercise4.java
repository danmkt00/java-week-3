package exceptions.exercises;

/**
 *  Exercise 4:
 *  Parse a string into an integer.
 *  If the string is not a number (e.g., "abc"),
 *  catch NumberFormatException.
 */

public class Exercise4 
{
    public static void main(String[] args)
    {
        String text = "abc"; // try changing to "123"

        try {
            int num = Integer.parseInt(text); // parse the string
            System.out.println("Parsed number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Invalid format: '" + text + "' is not a number.");
        }

    }
}




