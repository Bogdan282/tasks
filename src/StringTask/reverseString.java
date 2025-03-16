package StringTask;

import java.util.Scanner;

public class reverseString {
    //11. **Реверс порядку слів:**
    //    Розбийте речення на слова, а потім створіть новий рядок, вставляючи слова у зворотному порядку, зберігаючи порядок символів у кожному слові.
    public static void main(String[] args) {
        String words;
        Scanner scn = new Scanner(System.in);

        System.out.print("Введите строку: ");
        words = scn.nextLine();
        System.out.println("Строка в обратном порядке: " + reverse(words));
    }
    public static String reverse(String words) {
        String reverseString = "";
        String wordsStringMass[] = words.split(" ");
        for (int i = wordsStringMass.length - 1; i >= 0; i--) {
            reverseString += (" " + wordsStringMass[i]);
        }
        return reverseString;
    }
}
