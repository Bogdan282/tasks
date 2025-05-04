package Generics.test1;

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.put("Hello");

        String text = stringBox.get();
        System.out.println(text);

        Box<Integer> integerBox = new Box<>();
        integerBox.put(123);
        int i = integerBox.get();
        System.out.println(i);
    }
}
