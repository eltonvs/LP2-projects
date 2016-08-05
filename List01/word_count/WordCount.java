import java.util.HashMap;
import java.util.Map;

public class WordCount {
    private Map<String, Integer> words;

    public WordCount(String text) {
        this.words = new HashMap<String, Integer>();

        for (String word: text.split(" ")) {
            if (this.words.containsKey(word)) {
                // Increment
                this.words.put(word, this.words.get(word) + 1);
            } else {
                // Add
                this.words.put(word, 1);
            }
        }
    }

    public void showWordMap() {
        for (Map.Entry<String, Integer> word : words.entrySet()) {
            System.out.println(word.getKey() + ": " + word.getValue());
        }
    }
}
