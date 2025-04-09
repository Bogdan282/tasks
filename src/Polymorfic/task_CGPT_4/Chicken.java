package Polymorfic.task_CGPT_4;

public class Chicken extends Animal{
    @Override
    void makeSound() {
        System.out.println(this.name + " каже: Ку-ка-ре-ку!");
    }
    public Chicken(String name) {
        this.name = name;
    }
}
