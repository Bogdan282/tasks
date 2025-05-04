package Generics.chatGPTTask2;

public class Main {
    //В классе Suitcase<T, U>:
    //Поля: private T item; и private U owner;
    //Метод void pack(T item, U owner) — помещает предмет и владельца
    //Метод T getItem() — возвращает предмет
    //Метод U getOwner() — возвращает владельца
    //В main():
    //Создай чемодан, в котором лежит строка "ноутбук" и имя владельца "Ігор"
    //Создай второй чемодан: число 42 и владелец "Анна"
    public static void main(String[] args) {
        Suitcase<String, String> stringStringSuitcase = new Suitcase<>();
        stringStringSuitcase.pack("ноутбук", "Игорь");
        String text = stringStringSuitcase.getItem();
        System.out.println("В первом чемодане лежит ноутбук.");
        String text1 = stringStringSuitcase.getOwner();
        System.out.println("Чемодан принадлежит Игорю");

        Suitcase<Integer, String> integerStringSuitcase = new Suitcase<>();
        integerStringSuitcase.pack(42, "Анна");
        int i = integerStringSuitcase.getItem();
        String text3 = integerStringSuitcase.getOwner();
        System.out.printf("Чамодан с числом " + i + " принадлежит " + text3);
    }
}
