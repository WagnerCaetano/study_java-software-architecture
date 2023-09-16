package BehavioralDesignPatterns.CommandPattern;

public class BehavioralPatternCommand {

    public static void main(String[] args) {
        Switcher switcher = new Switcher();

        Light light = new Light();
        TurnOnCommand onCommand = new TurnOnCommand(light);
        TurnOffCommand offCommand = new TurnOffCommand(light);

        switcher.addCommand(offCommand);
        switcher.addCommand(onCommand);

        switcher.executeCommands();
    }
}