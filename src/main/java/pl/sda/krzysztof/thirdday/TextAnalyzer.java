package pl.sda.krzysztof.thirdday;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextAnalyzer {

    public static void main(String[] args) {
        Map<Character, List<String>> mapOfWords = groupWordsByLetter("Ala has two cats and likes programming." +
                " May the force be with her");
        System.out.println(mapOfWords);
    }

    public static Map<Character, List<String>> groupWordsByLetter(String textToAnalyze) {
        Map<Character, List<String>> characterStringMap = new HashMap<>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (char letter : alphabet) {
            characterStringMap.put(letter, new ArrayList<>());
        }

        String[] splitText = textToAnalyze.split(" ");

        for (String oneWord : splitText) {
            Character firstLetterLowercase = oneWord.toLowerCase().charAt(0);
            characterStringMap.get(firstLetterLowercase).add(oneWord);
        }

        return characterStringMap;
    }
}
