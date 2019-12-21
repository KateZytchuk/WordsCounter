package WordsCounting.services;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class WordsCounter {

    private WordsCounter() {
    }

    private static String[] getAllWords(String str) {
        return Stream.of(str.split("[^A-Za-zА-Яа-я]+"))
                .map(String::toLowerCase)
                .toArray(String[]::new);
    }

    public static Map<String, Integer> getOccurrenceOfEachWord(String words) {
        String [] wordsArr = getAllWords(words);
        Map<String, Integer> result = new LinkedHashMap<>();
        for (String word : wordsArr) {
            result.put(word, result.containsKey(word) ? result.get(word) + 1 : 1);
        }
        return result;
    }
}
