package Generics.chatGPTTask4;

public class AverageCalculator<T extends Number> {
    public double calculateAverage(T[] array) {
        double total = 0.0;

        for(T number : array) {
            total += number.doubleValue();
        }

        return total / array.length;
    }
}
