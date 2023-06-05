package week5_homework;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;

public class HashMap9 {


    public static void storeValues() {
        // Create aHashMap Object called people
        HashMap<String, Integer> people = new HashMap<>();

        // Add keys and values(Name, Age)
        people.put("John" , 32);
        people.put("Steve" , 30);
        people.put("Angie" , 33);

        for (String i : people.keySet()){
            System.out.println("Key : " + i + " value: " + people.get(i) );
        }

    }

    public static void main(String[] args) {
        storeValues();
    }

}