package InterfaceAbstract.Task1;

public class Main {
    public static void main(String[] args) {
        Speakable[] speakables= {
                new Human(),
                new Parrot()
        };
        for(Speakable s : speakables) {
            s.speak();
        }
    }
}
