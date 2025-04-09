package Polymorfic.task_CGPT_4;

public class Cow extends Animal{
    @Override
    void makeSound() {
        System.out.println(this.name + " каже: Муу!");
    }
    public Cow(String name) {
        this.name = name;
    }
}
