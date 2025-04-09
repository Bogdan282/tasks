package Polymorfic.task_1_2;

public class Cat extends Animal{
    @Override
    public void makeSound(){
        System.out.println("Meow!");
    }

    @Override
    public void getType() {
        System.out.println("Type - Cat");
    }
}
