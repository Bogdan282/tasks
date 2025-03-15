package main;

import java.util.Scanner;

public class emailValid {
    public static void main(String[] args) {
        //1. **Перевірка email без regex:**
        //   Перевірте, чи містить рядок символ «@» та хоча б одну крапку після нього, а також що частини до та після «@» не є порожніми.

        Scanner scn = new Scanner(System.in);

        System.out.print("Укажите вашу почту: ");
        String email = scn.nextLine();
        if (validMail(email)) {
            System.out.println("Ваша почта прошла проверку!");
        } else {
            System.out.println("Вы допустили ошибку при вводе почты.");
        }


    }
    public static boolean validMail(String email){
        char[] emailArray = email.toCharArray();

        int SymbolIndex = 0;
        int dotIndex = 0;
        boolean SymbolValid = false;

        for (int i = 0; i < emailArray.length; i++){
            if (emailArray[i] == '@'){
                SymbolIndex = i;
                SymbolValid = true;
            }
        }
        if (SymbolValid) {
            for (int i = SymbolIndex; i < emailArray.length; i++) {
                if (emailArray[i] == '.'){
                    dotIndex = i;
                    if ((dotIndex - SymbolIndex) > 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}