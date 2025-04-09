package Polymorfic.task_1_2;

public class Main {
    /*1. Создай класс Animal с методом makeSound(). Наследники: Dog и Cat. В main() создай массив Animal[] и вызови makeSound().
            2. Добавь метод getType() в Animal и переопредели его в Dog и Cat. Выводи тип + звук в цикле.*/
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat()
        };
        for(Animal s : animals){
            s.makeSound();
            s.getType();
        }
    }
}
