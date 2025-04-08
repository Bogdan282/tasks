package Polimorf;

public class Main{
    public static void main(String[] args) {
        InputDevice[] inputDevices = {
                new Mouse(),
                new Keyboard()
        };
        for(InputDevice inputDevice : inputDevices){
            inputDevice.input();
        }
    }
}
