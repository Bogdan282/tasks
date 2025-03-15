package main;

import java.util.Scanner;

public class domenValid {
    public static void main(String[] args) {
        //3. **Виділення домену з URL:**
        //   Розбийте URL за символом «/» і виберіть ту частину, що містить доменне ім’я.

        String URL;
        Scanner scn = new Scanner(System.in);

        System.out.print("Введіть посилання: ");
        URL = scn.nextLine();

        System.out.println("Доменне ім'я: " + domenName(URL));
    }

    public static String domenName(String URL) {
        String[] URLMass = URL.split("/");
        return URLMass[2];
    }
}
