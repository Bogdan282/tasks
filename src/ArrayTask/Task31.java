package ArrayTask;

public class Task31 {
    //31. Напишите программу, которая меняет местами два ряда в двумерном массиве.
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

        //Меняем местами
        int[] tmp = new int[4];
        tmp = numArr[0];
        numArr[0] = numArr[2];
        numArr[2] = tmp;

        System.out.println("=======");

        for(int i = 0; i < numArr.length; i++) {
            for (int j = 0; j < numArr[i].length; j++) {
                System.out.print(numArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
