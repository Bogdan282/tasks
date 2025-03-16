package MassivTask;

public class Task1 {
    //1. Напишите программу, которая создает массив из 10 целых чисел и выводит его на экран.
    public static void main(String[] args) {
        int[] numArray = new int[10];
        for(int i = 0; i < numArray.length; i++){
            numArray[i] = (int) (Math.random() * 10);
            System.out.print(numArray[i] + " ");
        }
    }
}
