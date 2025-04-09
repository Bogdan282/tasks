package Polymorfic.task_CGPT_4;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cow("Jessica"),
                new Pig("Bob"),
                new Chicken("Meow"),
                new Pig("Hohol")
        };
        int pigCount = 0;
        for(Animal s : animals) {
            s.makeSound();
            if(s instanceof Pig) {
                ++pigCount;
            }
        }
        System.out.println("Свиней на фермі: " + pigCount);
    }
}
