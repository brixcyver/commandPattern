package commandPattern;

import java.util.Scanner;

public class SmartHomeRemote {
    public static void main(String[] args) {
        SmartHomeSystem smartHome = new SmartHomeSystem();
        Fan fan = new Fan();
        AirConditioner airConditioner = new AirConditioner();
        Lights lights = new Lights();
        Tv tv = new Tv(); // Declare the TV instance here

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println(" === Choose a device to control === ");
            System.out.println();
            System.out.println("\t\t1. Fan");
            System.out.println("\t\t2. Air Conditioner");
            System.out.println("\t\t3. Lights");
            System.out.println("\t\t4. TV");
            System.out.println("\t\t5. Exit");
            System.out.println();
            System.out.print("Type the number of the device: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.println("1. Turn Fan On");
                    System.out.println("2. Turn Fan Off");
                    System.out.println("3. Turn Fan Sway On");
                    System.out.println("4. Turn Fan Sway Off");
                    int fanChoice = scanner.nextInt();
                    if (fanChoice == 1) {
                        smartHome.executeCommand(new FanOnCommand(fan));
                    } else if (fanChoice == 2) {
                        smartHome.executeCommand(new FanOffCommand(fan));
                    } else if (fanChoice == 3) {
                        smartHome.executeCommand(new FanSwayOnCommand(fan));
                    } else if (fanChoice == 4) {
                        smartHome.executeCommand(new FanSwayOffCommand(fan));
                    }
                    break;

                case 2:
                    System.out.println();
                    System.out.println("1. Turn Air Conditioner On");
                    System.out.println("2. Turn Air Conditioner Off");
                    int acChoice = scanner.nextInt();
                    if (acChoice == 1) {
                        smartHome.executeCommand(new AirConditionerOnCommand(airConditioner));
                    } else if (acChoice == 2) {
                        smartHome.executeCommand(new AirConditionerOffCommand(airConditioner));
                    }
                    break;

                case 3:
                    System.out.println();
                    System.out.println("1. Turn Lights On");
                    System.out.println("2. Turn Lights Off");
                    int lightsChoice = scanner.nextInt();
                    if (lightsChoice == 1) {
                        smartHome.executeCommand(new LightsOnCommand(lights));
                    } else if (lightsChoice == 2) {
                        smartHome.executeCommand(new LightsOffCommand(lights));
                    }
                    break;

                case 4:
                    System.out.println();
                    System.out.println("1. Turn TV On");
                    System.out.println("2. Turn TV Off");
                    int tvChoice = scanner.nextInt();
                    if (tvChoice == 1) {
                        smartHome.executeCommand(new TvOnCommand(tv));
                    } else if (tvChoice == 2) {
                        smartHome.executeCommand(new TvOffCommand(tv));
                    }
                    break;

                case 5:
                    System.out.println();
                    System.out.println("Thank you for using the Smart Home Remote.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
