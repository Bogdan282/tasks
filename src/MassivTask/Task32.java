package MassivTask;

public class Task32 {
    //32. Напишите программу, которая находит сумму элементов главной диагонали двумерного массива.
    public static void main(String[] args) {
        int[][] numArr = new int[4][4];

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

        //Сумма элементов главной диагонали двумерного массива.
        int sumDiag = 0;
        int diagPos = 0;
        for(int i = 0; i < numArr.length; i++) {
            sumDiag += numArr[i][diagPos];
            diagPos++;
        }
        System.out.println("Сумма элементов главной диагонали " + sumDiag);
    }
}
