package Generics.chatGPTTask1;

public class Backpack<T> {

    private T item; // Создаём переменнут айтем, тип данных берётся тот который указывается при создании обьекта.

    public void pack(T item) {
        this.item = item;
    }

    public T unpack() {
        return item;
    }
}
