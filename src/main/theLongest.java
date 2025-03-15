package main;

import java.util.Scanner;

public class theLongest {
    //21. **Пошук найдовшого слова:**
    //    Розбийте рядок на слова та за допомогою циклу визначте слово з максимальною довжиною.

    public static void main(String[] args) {
        String wordString;
        Scanner scn = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        wordString = scn.nextLine();
        System.out.print("Найдовше слово: " + longWord(wordString));
    }
    public static String longWord(String wordString) {
        String[] wordLongMass = wordString.split(" ");
        String longestWord = "";

        for(int i = 0; i < wordLongMass.length; i++) {
            if(wordLongMass[i].length() > longestWord.length()) {
                longestWord = wordLongMass[i];
            }
        }
        return longestWord;
    }
}
