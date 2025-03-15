package main;

import java.util.Scanner;

public class replaceTask {
    //6. **Заміна емодзі на текст:**
    //   Створіть функцію, яка за допомогою послідовних викликів `replace` замінює відомі емодзі (наприклад, 😊) на їх текстові позначення (наприклад, `:smile:`).
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Введіть речення з символом: ");
        String emoji = scn.nextLine();
        System.out.println("Відредаговане речення: " + emojiReplace(emoji));
    }
    public static String emojiReplace(String emoji) {
        String newEmoji = emoji.replace("\uD83D\uDE0A", ":smile:");
        return newEmoji;
    }
}
