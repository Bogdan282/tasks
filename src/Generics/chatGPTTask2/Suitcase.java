package Generics.chatGPTTask2;

public class Suitcase<T, U> {
    private T item;
    private U owner;

    public void pack(T item, U owner) {
        this.item = item;
        this.owner = owner;
    }

    public T getItem() {
        return item;
    }

    public U getOwner() {
        return owner;
    }
}
