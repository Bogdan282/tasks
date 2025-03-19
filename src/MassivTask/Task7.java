package MassivTask;

public class Task7 {
    //7. Напишите программу, которая сортирует массив целых чисел по убыванию.
    public static void main(String[] args) {
        int[] numArr = new int[10];
        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
        }
        System.out.print("Массив: ");
        numPrint(numArr);
        System.out.print("\nОтсортированный массив: ");
        numPrint(midArr(numArr));

    }
    public static void numPrint(int[] numArr) {
        for(int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + "");
        }
    }
    public static int[] midArr(int[] numArr) {
        for(int i = 1; i < numArr.length; i++) {
            int key = numArr[i];
            int j = i - 1;

            while (j >= 0 && numArr[j] < key) {
                numArr[j + 1] = numArr[j];
                j--;
            }
            numArr[j + 1] = key;
        }
        return numArr;
    }
}
