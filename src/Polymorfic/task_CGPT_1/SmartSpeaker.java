package Polymorfic.task_CGPT_1;

public class SmartSpeaker extends SmartDevice{
    @Override
    void turnOn() {
        System.out.println("\uD83D\uDD0A Музыка играет");
    }
    @Override
    void turnOff() {
        System.out.println("\uD83D\uDD07 Музыка выключена");
    }
}
