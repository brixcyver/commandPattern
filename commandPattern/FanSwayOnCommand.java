package commandPattern;

public class FanSwayOnCommand implements Command {
    private Fan fan;

    public FanSwayOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.swayOn();
    }
}
