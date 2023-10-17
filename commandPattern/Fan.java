package commandPattern;

public class Fan {
    private boolean isOn = false;
    private boolean isSwaying = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Fan is turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Fan is turned off.");
    }

    public void swayOn() {
        isSwaying = true;
        System.out.println("Fan is swaying.");
    }

    public void swayOff() {
        isSwaying = false;
        System.out.println("Fan is not swaying.");
    }
}
