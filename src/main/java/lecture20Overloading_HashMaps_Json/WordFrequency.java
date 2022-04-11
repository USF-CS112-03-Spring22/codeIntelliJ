package lecture20Overloading_HashMaps_Json;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordFrequency {

    private Map<String, Integer> frequencies;

    public WordFrequency() {
        this.frequencies = new LinkedHashMap<>();
    }

    public void computeFrequencies(String[] words) {
       for (String word: words) {
           Integer count = frequencies.get(word);
           if (count == null) {
               frequencies.put(word, 1);
           }
           else {
               count++;
               frequencies.put(word, count);
           }
       }

    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String word: frequencies.keySet()) {
            sb.append(word + " : " + frequencies.get(word) + System.lineSeparator());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"cat", "ran", "away", "from", "another", "cat", "and", "dog", "that", "cat", "chased", "a", "dog" };
        WordFrequency data = new WordFrequency();
        data.computeFrequencies(words);
        System.out.println(data);
    }
}
