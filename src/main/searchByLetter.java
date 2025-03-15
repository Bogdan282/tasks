package main;

import java.util.Scanner;

public class searchByLetter {
    //24. **Пошук слова, що починається з певної літери:**
    //    Перевірте, чи містить текст слово, яке починається з заданої літери, перебираючи список слів та перевіряючи перший символ кожного.
    public static void main(String[] args) {
        String text;
        String serchBy;
        Scanner scn = new Scanner(System.in);

        System.out.print("Введіть текст: ");
        text = scn.nextLine();
        System.out.print("Перша літера слова: ");
        serchBy = scn.next();
        searchByLetterWord(text, serchBy);

    }
    public static void searchByLetterWord(String text, String searchBy) {
        String[] textString = text.split(" ");
        String[] SearchedWord;
        
        for(int i = 0; i < textString.length; i++) {
            if (textString[i].charAt(0) == searchBy.charAt(0)) {
                System.out.println(textString[i]);
            }
        }
    }
}
