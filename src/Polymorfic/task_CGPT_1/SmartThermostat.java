package Polymorfic.task_CGPT_1;

public class SmartThermostat extends SmartDevice{
    @Override
    void turnOff() {
        System.out.println("\uD83C\uDF21\uFE0F Нагрев выключен");
    }

    @Override
    void turnOn() {
        System.out.println("\uD83C\uDF21\uFE0F Нагрев включен");
    }
}
