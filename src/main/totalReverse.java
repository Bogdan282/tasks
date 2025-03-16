package main;

import java.util.Scanner;

public class totalReverse {
    //58. **Реверсування всього рядка:**
    //    Напишіть функцію, яка перевертає весь рядок (усі символи у зворотному порядку).
    public static void main(String[] args) {
        String wordString;
        Scanner scn = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        wordString = scn.nextLine();
        reversString(wordString);
    }
    public static void reversString(String wordString) {
        //StringBuilder reversedString = new StringBuilder(wordString);
        //return reversedString.reverse().toString();
        char[] wordStringChar = wordString.toCharArray();
        System.out.print("Рядок навпаки: ");
        for(int i = wordStringChar.length - 1; i >= 0; i--) {
            System.out.print(wordStringChar[i]);
        }
    }
}
