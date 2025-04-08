package ArrayTask;

public class Task9 {
    //9. Напишите программу, которая проверяет, все ли элементы массива одинаковы.
    public static void main(String[] args) {
        int[] numArr = new int[5];

        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
        }

        System.out.print("Массив: ");
        for(int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }

        boolean allSame = true;

        for(int i = 0; i < numArr.length; i++) {
            int numOne = numArr[i];
            for(int j = 0; j < numArr.length; j++) {
                if(numOne == numArr[j]) {
                    allSame = true;
                } else {
                    allSame = false;
                    break;
                }
            }
        }
        System.out.println();
        if(allSame) {
            System.out.println("Все числа одинаковые.");
        } else {
            System.out.println("Числа не одинаковые.");
        }
    }
}
