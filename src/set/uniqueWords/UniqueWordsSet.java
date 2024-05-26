package set.uniqueWords;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordsSet {
    Set<String> wordsSet;

    public UniqueWordsSet() {
        this.wordsSet = new HashSet<>();
    }

    public void addWord(String word) {
        wordsSet.add(word);
    }

    public void removeWord(String word) {
        wordsSet.remove(word);
    }

    public boolean verifyWord(String word) {
        return wordsSet.contains(word);
    }

    public void showWords() {
        System.out.println(wordsSet);
    }
}
