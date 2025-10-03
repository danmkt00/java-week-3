package collections.exercises;

import java.util.HashMap;
import java.util.Map;

/**
 TODO:
 1. Create a Map<String, String> phoneBook (name → phone number).
 2. Add 3 entries.
 3. Print all entries.
 4. Retrieve one number by name.
 5. Remove one entry.
*/
public class Exercise3
{
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Dan", "1123-123-123");
        phoneBook.put("Ban", "1123-12312-31");
        phoneBook.put("John", "1123-1231-1231231");

        System.out.println(phoneBook);

        System.out.println(phoneBook.get("Dan"));

        phoneBook.remove("Ban");

        System.out.println(phoneBook);
    }
}
