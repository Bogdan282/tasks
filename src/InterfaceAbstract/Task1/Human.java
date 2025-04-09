package InterfaceAbstract.Task1;

public class Human implements Speakable{
    @Override
    public void speak() {
        System.out.println("\uD83E\uDDCD Людина каже: Привіт!");
    }
}
