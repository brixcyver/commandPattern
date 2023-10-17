package commandPattern;

public class Lights {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Lights are turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Lights are turned off.");
    }
}
