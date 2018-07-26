package Lesson9.map;

import java.util.*;

public class WordsCounter {

    public static void main(String[] args) {
        List<String> langs = langs();
        Map<String, Integer> langToCount = countWords(langs);
        System.out.println(langToCount);

        System.out.println(mostFrequentWord(langs));

        List<Map.Entry<String, Integer>> pairs = sortedByCount(langs);
        System.out.println(pairs);
    }

    private static List<Map.Entry<String, Integer>> sortedByCount(List<String> word) {
        List<Map.Entry<String, Integer>> pairs = new ArrayList<>(
                countWords(word).entrySet());

        Collections.sort(pairs, byValue().reversed());
        return pairs;
    }

    public static String mostFrequentWord(List<String> words) {
        Map<String, Integer> wordToCount = countWords(words);

        Map.Entry<String, Integer> maxPair = Collections.max(wordToCount.entrySet(), byValue());
        return maxPair.getKey();
    }

    private static Comparator<Map.Entry<String, Integer>> byValue() {
        return new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return Integer.compare(a.getValue(), b.getValue());
            }
        };
    }

    public static Map<String, Integer> countWords(
            List<String> words) {

        Map<String, Integer> wordToCount = new LinkedHashMap<>();

        List<String> wordsCopy = new ArrayList<>(words);
        Collections.reverse(wordsCopy);
        for (String word : wordsCopy) {
            if (wordToCount.containsKey(word)) {
                Integer count = wordToCount.get(word);
                wordToCount.put(word, count + 1);
            } else {
                wordToCount.put(word, 1);
            }
        }

        return wordToCount;
    }

    private static List<String> langs() {
        return Arrays.asList(
                "Python",
                "Java",
                "JavaScript",
                "Java",
                "Kotlin",
                "Java",
                "JavaScript",
                "Java",
                "JavaScript",
                "C#",
                "C#",
                "JavaScript",
                "Kotlin",
                "Java",
                "Kotlin",
                "C#",
                "C#",
                "Python",
                "C#",
                "Python",
                "Python"
        );
    }
}