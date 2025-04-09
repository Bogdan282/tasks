package Polymorfic.task_CGPT_1;

public class SmartLamp extends SmartDevice{
    @Override
    void turnOn() {
        System.out.println("\uD83D\uDCA1 Лампа включена");
    }

    @Override
    void turnOff() {
        System.out.println("\uD83D\uDCA1 Лампа выключена");
    }
}
