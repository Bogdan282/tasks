package StringTask;

import java.util.Scanner;

public class numSum {
    //22. **Обчислення суми чисел у тексті:**
    //    Розбийте рядок на слова, перетворіть ті, що є числами (за допомогою `isdigit()`), і порахуйте їхню суму.

    public static void main(String[] args) {
        String stringNum;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введіть рядок: ");
        stringNum = scn.nextLine();
        System.out.println("Сума чисел з рядка: " + numSum(stringNum));
    }

    public static int numSum(String stringNum) {
        char[] numSumArr = stringNum.toCharArray();
        int numSum = 0;
        for (int i = 0; i < numSumArr.length; i++) {
            if(Character.isDigit(numSumArr[i])) {
                numSum += numSumArr[i] - '0';
            }
        }
        return numSum;
    }
}
