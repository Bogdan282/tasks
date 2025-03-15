package lec14;

import java.util.Scanner;

public class phoneValid {
    //2. **Перевірка номера телефону:**
    //   Визначте, чи відповідає номер телефону формату `+380 (XX) XXX-XX-XX`, порівнюючи символи на певних позиціях та перевіряючи наявність необхідних роздільників (дужок, пробілів, дефісів).
    public static void main(String[] args) {
        String phoneNumber;
        Scanner scn = new Scanner(System.in);

        System.out.print("Введіть ваш номер телефону формату (+380 (XX) XXX-XX-XX) для перевірки: ");
        phoneNumber = scn.nextLine();
        if (numberValid(phoneNumber)) {
            System.out.println("Номер введено вірно.");
        } else {
            System.out.println("Номер введено не вірно.");
        }
    }

    public static boolean numberValid(String phoneNumber){
        String[] phoneArray = phoneNumber.split(" ");
        if (phoneArray[0].equals("+380")) {
            if (phoneArray[1].charAt(0) == '(' && phoneArray[1].charAt(3) == ')') {
                if (phoneArray[2].charAt(3) ==  '-' && phoneArray[2].charAt(6) == '-'){
                    return true;
                }
            }
        }

        return false;
    }
}
