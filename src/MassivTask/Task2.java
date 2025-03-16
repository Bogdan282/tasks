package MassivTask;

public class Task2 {
    //2. Напишите программу, которая находит сумму всех элементов массива целых чисел.
    public static void main(String[] args) {
        int[] numArr = new int[5];
        int totalSum = 0;
        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
            System.out.print(numArr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < numArr.length; i++) {
            totalSum += numArr[i];
        }
        System.out.println(totalSum);
    }
}
