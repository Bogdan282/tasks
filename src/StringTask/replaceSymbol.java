package StringTask;

import java.util.Scanner;

public class replaceSymbol {
    //47. **Заміна спеціальних символів на текстові сутності:**
    //    Використовуйте послідовні виклики `replace`, щоб замінити символи, такі як `&`, `<` та `>`, на їх відповідні текстові сутності.
    public static void main(String[] args) {
        String stringWord;
        Scanner scn = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        stringWord = scn.nextLine();
        System.out.println("Відредагований рядок: " + symbolReplace(stringWord));
    }
    public static String symbolReplace(String stringWord) {
        return stringWord.replace("<", " менше ").replace(">", " більше ".replace("&", "і"));
    }
}
