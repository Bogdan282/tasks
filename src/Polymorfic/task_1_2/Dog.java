package Polymorfic.task_1_2;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Wuf!");
    }
    @Override
    public void getType(){
        System.out.println("Type - Dog.");
    }
}
