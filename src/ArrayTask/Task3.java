package ArrayTask;

public class Task3 {
    //3. Напишите программу, которая находит среднее значение элементов массива целых чисел.
    public static void main(String[] args) {
        int[] numMass = new int[10];
        int total = 0;



        for(int i = 0; i < numMass.length; i++) {
            numMass[i] = (int) (Math.random() * 10);
            total += numMass[i];
            System.out.print(numMass[i] + " ");
        }
        int mid = total / numMass.length;
        System.out.println();
        System.out.println(mid);
    }
}
