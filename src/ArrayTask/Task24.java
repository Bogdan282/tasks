package ArrayTask;

public class Task24 {
    //24. Напишите программу, которая создает двумерный массив и выводит его на экран.
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
    }
}
