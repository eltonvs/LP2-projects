import java.util.LinkedHashMap;
import java.util.Map;

public class WordCount {
    private Map<String, Integer> words;

    public WordCount(String text) {
        this.words = new LinkedHashMap<String, Integer>();

        for (String word: text.split(" ")) {
            this.words.put(word, (this.words.containsKey(word) ? this.words.get(word) + 1 : 1));
        }
    }

    public void showWordMap() {
        for (Map.Entry<String, Integer> word : words.entrySet()) {
            System.out.println(word.getKey() + ": " + word.getValue());
        }
    }
}
