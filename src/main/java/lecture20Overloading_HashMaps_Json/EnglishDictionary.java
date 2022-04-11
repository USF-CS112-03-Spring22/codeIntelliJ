package lecture20Overloading_HashMaps_Json;

import java.util.HashMap;
import java.util.Map;

// Demonstrates how to use a HashMap
public class EnglishDictionary {
    public static void main(String[] args) {
        Map<String, String> dict = new HashMap<>();
        dict.put("boredom", "The state of being bored");
        dict.put("university", "A school that offers courses leading to a degree");

        System.out.println(dict.get("bat")); // will return null
        System.out.println(dict.get("university"));

        // Iterate over keys
        for (String key : dict.keySet()) {
            System.out.println("Key:" + key);
        }

        // Iterate over entries
        for (Map.Entry entry: dict.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
