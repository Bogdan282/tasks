package main;

import java.util.Scanner;

public class creditCard {
    //17. **Маскування конфіденційних даних:**
    //    Замініть частину рядка (наприклад, номер кредитної картки) на символи `*`, залишаючи видимими лише останні чотири цифри.

    public static void main(String[] args) {
        String card;
        Scanner scn = new Scanner(System.in);

        System.out.print("Введите банковскую карту: ");
        card = scn.nextLine();
        System.out.println("Скрыто: " + cardShadow(card));
    }
    public static String cardShadow(String card) {
        card = card.replace(" ", "");
        if (card.length() == 16) {
            card = "*".repeat(11) + card.substring(12);
            return card;
        }
        return "Error";
    }
}
