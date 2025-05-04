package Generics.chatGPTTask1;

public class Main {
    //В классе Backpack<T>:
    //Поле private T item;
    //Метод void pack(T item) — кладёт предмет в рюкзак
    //Метод T unpack() — достаёт предмет из рюкзака
    //Метод boolean isEmpty() — возвращает true, если рюкзак пуст
    //В main():
    //Создай один рюкзак для строк (например, Backpack<String>)
    //Второй рюкзак — для целых чисел (Backpack<Integer>)
    //Покажи, что каждый рюкзак может работа    ть со своим типом без ошибок.

    public static void main(String[] args) {
        Backpack<String> stringBackpack = new Backpack<>();
        stringBackpack.pack("ананас");
        String text = stringBackpack.unpack();
        System.out.println("В рюкзаке лежит: " + text);

        Backpack<Integer> integerBackpack = new Backpack<>();
        integerBackpack.pack(123);
        int i = integerBackpack.unpack();
        System.out.println("В рюкзаке лежит число " + i);
    }
}
