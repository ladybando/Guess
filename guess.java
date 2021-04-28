package com.company;

public class Guess {
    public static void main(String[] argv) {

        while (true) {
            System.out.print("Select a command: ");
            java.util.Scanner in = new java.util.Scanner(System.in);
            String cmd = in.next();
            System.out.print("Enter a value: ");

            switch (cmd.toUpperCase()) {
                case "F2C": {        // string match
                    double f = in.nextDouble();
                    double c = (f - 32) * 5. / 9.;
                    System.out.println("Fahrenheit: " + f + "  Celsius: " + c);
                    break;
                }
                case "C2F": {
                    double c = in.nextDouble();
                    double f = (c - 32) * 5 / 9;
                    System.out.println("Fahrenheit: " + f + "  Celsius: " + c);
                    break;
                }
                case "K2P": {
                    double k = in.nextDouble();
                    double p = (k * 2.20462);
                    System.out.println("Kilograms: " + k + "  Pounds: " + p);
                    break;
                }
                case "P2K":
                    double p = in.nextDouble();
                    double k = (p - 32) * 5 / 9;
                    System.out.println("Pounds: " + p + "  Kilograms: " + k);

                case "Q": {
                    System.out.println("Come convert again!");
                    System.exit(0);
                }

                default:
                    System.out.println("Unexpected value. Please try again: " + cmd);
            }

        }
    }
}
