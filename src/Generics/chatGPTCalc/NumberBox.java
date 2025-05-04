package Generics.chatGPTCalc;

public class NumberBox<T extends Number> {
    private T number;

    void setNumber(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    double square() {
        return number.doubleValue() * number.doubleValue();
    }
}
