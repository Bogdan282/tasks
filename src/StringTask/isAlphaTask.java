package StringTask;

import java.util.Scanner;

public class isAlphaTask {
    //46. **Видалення неалфавітних символів:**
    //    Пройдіться по рядку та сформуйте новий, додаючи лише ті символи, для яких метод `isalpha()` повертає True.
    public static void main(String[] args) {
        String stringWord;
        Scanner scn = new Scanner(System.in);

        System.out.print("Введіть рядок: ");
        stringWord = scn.nextLine();
        System.out.println("Тільки символи: " + onlyAlpha(stringWord));
    }
    public static String onlyAlpha(String stringWord) {
        char[] stringWordChar = stringWord.toCharArray();
        String onlyAlphaString = "";
        for(int i = 0; i < stringWordChar.length; i++) {
            if(Character.isAlphabetic(stringWordChar[i])) {
                onlyAlphaString += stringWordChar[i];
            }
        }
        return onlyAlphaString;
    }
}
