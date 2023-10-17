package commandPattern;

public class Tv {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("TV is turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("TV is turned off.");
    }
}
