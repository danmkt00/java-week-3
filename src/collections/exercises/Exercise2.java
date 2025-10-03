package collections.exercises;

import java.util.HashSet;
import java.util.Set;

/**
 TODO:
 1. Create a Set<String> cities.
 2. Add at least 5 city names, including one duplicate.
 3. Print all cities (verify no duplicates).
 4. Check if a given city exists.
*/

public class Exercise2
{
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Chernivtsi");
        cities.add("Chernivtsi");
        cities.add("Luhansk");
        cities.add("Kyiv");
        cities.add("Crimea");
        cities.add("Kherson");
        cities.add("Donetsk");
        cities.add("Kyiv");      // duplicate

        // Print all cities
        System.out.println(cities);

        // Check if a specific city exists
        System.out.println(cities.contains("Kherson")); // true
    }
}
