package commandPattern;

public class AirConditioner {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Air conditioner is turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Air conditioner is turned off.");
    }
}
