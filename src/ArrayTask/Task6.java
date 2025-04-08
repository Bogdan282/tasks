package ArrayTask;

public class Task6 {
    //6. Напишите программу, которая сортирует массив целых чисел по возрастанию.
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
        int[] midArr = numArr;
        for(int i = 1; i < midArr.length; i++) {
            int key = midArr[i];
            int j = i - 1;

            while (j >= 0 && midArr[j] > key) {
                midArr[j + 1] = midArr[j];
                j--;
            }
            midArr[j + 1] = key;
        }
        return midArr;
    }
}
