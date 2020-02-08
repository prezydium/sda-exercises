package pl.sda.krzysztof.sixthday;

import java.util.List;
import java.util.stream.Collectors;

public class AppSix {


    public static void main(String[] args) {
        List<String> words = WordsProvider.provide();

        List<String> wordsOnLetterD = words.stream()
                .filter(singleWord -> singleWord.startsWith("d"))
                .collect(Collectors.toList());
        System.out.println(wordsOnLetterD);

        List<String> shortWordsOnLetterA = words.stream()
                .filter(word -> word.startsWith("a") && word.length() <= 4)
                .collect(Collectors.toList());
        System.out.println(shortWordsOnLetterA);
    }
}
