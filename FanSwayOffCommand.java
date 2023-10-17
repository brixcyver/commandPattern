package commandPattern;

public class FanSwayOffCommand implements Command {
    private Fan fan;

    public FanSwayOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.swayOff();
    }
}
