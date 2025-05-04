package Generics.chatGPTTask4;

public class Main {
    public static void main(String[] args) {
        AverageCalculator<Integer> integerAverageCalculator = new AverageCalculator<>();
        Integer[] array = {1,2,3,4,5};
        double avg = integerAverageCalculator.calculateAverage(array);
        System.out.println(avg);
    }
}
