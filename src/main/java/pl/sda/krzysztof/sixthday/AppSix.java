package pl.sda.krzysztof.sixthday;

import java.util.List;
import java.util.stream.Collectors;

public class AppSix {


    public static void main(String[] args) {
        List<String> words = WordsProvider.provide();

        thirdTask(words);
    }

    private static void firstTask(List<String> words) {
        List<String> wordsOnLetterD = words.stream()
                .filter(singleWord -> singleWord.startsWith("d"))
                .collect(Collectors.toList());
        System.out.println(wordsOnLetterD);
    }

    private static void secondTask(List<String> words) {
        List<String> shortWordsOnLetterA = words.stream()
                .filter(word -> word.startsWith("a") && word.length() <= 4)
                .collect(Collectors.toList());
        System.out.println(shortWordsOnLetterA);
    }

    private static void thirdTask(List<String> words) {
        List<String> uppercaseWords = words.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.toList());
        System.out.println(uppercaseWords);
    }
}
