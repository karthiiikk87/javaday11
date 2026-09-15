package programs;

public class SmartDeviceTest {

    public static void main(String[] args) {

        SmartDevice bulb = new SmartBulb();
        SmartDevice fan = new SmartFan();
        SmartDevice ac = new SmartAC();

        bulb.turnOn();
        bulb.turnOff();

        fan.turnOn();
        fan.turnOff();

        ac.turnOn();
        ac.turnOff();
    }
}