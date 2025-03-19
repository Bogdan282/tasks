package MassivTask;

public class Task25 {
    //25. Напишите программу, которая находит сумму всех элементов двумерного массива.
    public static void main(String[] args) {
        int[][] numArr = new int[5][5];

        for(int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                numArr[i][j] = (int) (Math.random() * 10);
            }
        }

        for(int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                System.out.print(numArr[i][j] + " ");
            }
            System.out.println();
        }

        int totalSum = 0;

        for(int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                totalSum += numArr[i][j];
            }
        }
        System.out.println("Сумма всех элементов: " + totalSum);
    }
}
