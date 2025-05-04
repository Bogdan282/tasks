package Generics.chatGPTTask3;

public class Main {
    //Создай утилитный класс Utils с обобщённым методом swap, который меняет местами два элемента массива любого типа.
    //Метод public static <T> void swap(T[] array, int i, int j)
    //В main() протестируй:
    //массив String[] — например, {"яблоко", "банан", "вишня"}
    //массив Integer[] — например, {1, 2, 3, 4}
    public static void main(String[] args) {
        Utils<Integer> integerUtils = new Utils<>();
        String[] fruits = {"яблоко", "банан", "вишня"};
        for(int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }

        integerUtils.swap(fruits,1,2);

        for(int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
    }
}
