package main;

import java.util.Scanner;

public class startWithTask {
    //72. **Перевірка, чи починається рядок заданим підрядком:**
    //    Аналогічно, використовуйте метод `startswith()` для перевірки початку рядка.
    public static void main(String[] args) {
        String wordString;
        String checkSubWord;
        Scanner scn = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        wordString = scn.nextLine();
        System.out.print("Слово для перевірки: ");
        checkSubWord = scn.nextLine();
        startsWith(wordString, checkSubWord);
    }
    public static void startsWith(String wordString, String checkSubWord) {
        if(wordString.startsWith(checkSubWord)) {
            System.out.println("Так, цей рядок починається з цього слова.");
        } else {
            System.out.println("Цей рядок не починається з вказаного слова.");
        }
    }
}
