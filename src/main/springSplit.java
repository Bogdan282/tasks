package main;

import java.util.Scanner;

public class springSplit {
    //23. **Розбиття тексту на речення:**
    //    Використовуючи знаки пунктуації (".", "!" та "?"), розділіть текст на окремі речення (наприклад, замінивши їх на спільний роздільник, а потім використовуючи `split`).
    public static void main(String[] args) {
        String text;
        Scanner scn = new Scanner(System.in);

        System.out.print("Введіть текст: ");
        text = scn.nextLine();
        System.out.println("Речення з тексту: ");
        stringSplit(text);
    }
    public static void stringSplit(String text) {
        String[] splitedText = text.split("[.!?\\s]");

        for(int i = 0; i < splitedText.length; i++) {
            if(!splitedText[i].trim().isEmpty()) {
                System.out.println(splitedText[i].trim());
            }
        }
    }
}
