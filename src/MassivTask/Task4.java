package MassivTask;

public class Task4 {
    //4. Напишите программу, которая находит максимальный элемент в массиве целых чисел.
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int maxElement = Integer.MIN_VALUE;
        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
            System.out.print(numArr[i] + " ");
            if(numArr[i] > maxElement) {
              maxElement = numArr[i];
            }
        }
        System.out.println("\nМаксимальний елемент: " + maxElement);
    }
}
