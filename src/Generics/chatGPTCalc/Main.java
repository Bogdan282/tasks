package Generics.chatGPTCalc;

public class Main {

    public static void main(String[] args) {
        NumberBox<Integer> integerNumberBox = new NumberBox<>();
        integerNumberBox.setNumber(7);
        NumberBox<Double> doubleNumberBox = new NumberBox<>();
        doubleNumberBox.setNumber(3.5);

        System.out.println(integerNumberBox.square());
        System.out.println(doubleNumberBox.square());
    }
}
