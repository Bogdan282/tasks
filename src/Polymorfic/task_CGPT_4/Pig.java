package Polymorfic.task_CGPT_4;

public class Pig extends Animal{
    @Override
    void makeSound() {
        System.out.println(this.name + " каже: Хрю-Хрю!");
    }
    public Pig(String name) {
        this.name = name;
    }
}
