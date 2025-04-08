package ArrayTask;

public class Task8 {
    //8. Напишите программу, которая инвертирует массив (переворачивает порядок элементов).
    public static void main(String[] args) {
        int[] numArr = new int[10];
        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) (Math.random() * 10);
        }
        System.out.print("Масив: ");
        for(int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }
        System.out.println();
        System.out.print("Інвертований масив: ");


        for(int i = 0; i < numArr.length / 2; i++) {
            int j = numArr.length - 1 - i;

            int temp = numArr[i];
            numArr[i] = numArr[j];
            numArr[j] = temp;
        }

        for(int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
        }
    }
}
