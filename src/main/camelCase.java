package main;

import java.util.Scanner;

public class camelCase {
    //**Перетворення в camelCase:**
    //   Розбийте рядок за пробілами, перетворіть першу літеру кожного слова (крім першого) на верхній регістр та об’єднайте їх без пробілів.

    public static void main(String[] args) {
        String words;
        Scanner scn = new Scanner(System.in);

        System.out.print("Введите строку: ");
        words = scn.nextLine();
        System.out.print("Строка в camelCase: " + wordsToCamel(words));
    }
    public static String wordsToCamel(String words) {
        String[] wordsReg = words.split(" ");
        for(int i = 0; i < wordsReg.length; i++) {
            wordsReg[i] = wordsReg[i].toLowerCase();
        }
        for(int i = 1; i < wordsReg.length; i++) {
            wordsReg[i] = wordsReg[i].substring(0, 1).toUpperCase() + wordsReg[i].substring(1);
        }
        String camelString = "";
        for(int i = 0; i < wordsReg.length; i++) {
            camelString += wordsReg[i];
        }
        return camelString;
    }
}
