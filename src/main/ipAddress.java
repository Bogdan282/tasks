package main;

import java.util.Scanner;

public class ipAddress {
    //33. **Валідація IP-адреси:**
    //    Розбийте рядок за крапками, переконайтеся, що отримано рівно 4 частини, та перевірте, чи кожна частина є числом від 0 до 255.
    public static void main(String[] args) {
        String ip;
        Scanner scn = new Scanner(System.in);

        System.out.print("Введіть ІР-адрессу: ");
        ip = scn.nextLine();
        ipValid(ip);

    }
    public static void ipValid(String ip) {
        String[] oktets = ip.split("\\.");
        boolean valid = true;
        if(oktets.length == 4) {
            for(int i = 0; i < oktets.length; i++) {
                if(Integer.parseInt(oktets[i]) < 0 || Integer.parseInt(oktets[i]) > 255) {
                    valid = false;
                    break;
                } else {
                    valid = true;
                }
            }
        } else {
            valid = false;
        }
        if (valid) {
            System.out.println("ІР-адресса пройшла перевірку!");
        } else {
            System.out.println("В вашій ІР-адрессі є помилка!");
        }
    }
}
