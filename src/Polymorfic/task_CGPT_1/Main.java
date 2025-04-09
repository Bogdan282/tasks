package Polymorfic.task_CGPT_1;

public class Main {
//    Задача 1: "Умные домашние устройства"
//    Создай интерфейс SmartDevice с методами:
//    void turnOn();
//    void turnOff();
//    Реализуй его в 3-х классах:
//    SmartLamp → при включении пишет "💡 Лампа включена", при выключении — "💡 Лампа выключена"
//    SmartSpeaker → "🔊 Музыка играет" / "🔇 Музыка выключена"
//    SmartThermostat → "🌡️ Нагрев включен" / "🌡️ Нагрев выключен"
//    В main() создай массив SmartDevice[], добавь туда разные устройства и включи/выключи их в цикле.
    public static void main(String[] args) {
        SmartDevice[] smartDevices = {
                new SmartLamp(),
                new SmartSpeaker(),
                new SmartThermostat()
        };
        for(SmartDevice i : smartDevices) {
            i.turnOn();
            i.turnOff();
        }
    }
}
