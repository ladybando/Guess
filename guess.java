package com.company;

        import java.util.Scanner;

public class Guess {
    public static void main(String[] argv) {

        while (true) {
            System.out.print("Select a command: ");
            Scanner in = new Scanner(System.in);
            String cmd = in.next();
            System.out.print("Enter a value or \"Q\" to quit: ");

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
                case "P2K": {
                    double p = in.nextDouble();
                    double k = ((p / 2.2046) * .1);
                    System.out.println("Pounds: " + p + "  Kilograms: " + k);
                    break;
                }
                case "K2P": {
                    double k = in.nextDouble();
                    double p = (k * 2.20462);
                    System.out.println("Kilograms: " + k + "  Pounds: " + p);
                    break;
                }
                case "T2C": {
                    double t = in.nextDouble();
                    double c = (t * 0.0625);
                    System.out.println("Tablespoons: " + t + "  Cups: " + c);
                    break;
                }
                case "C2T": {
                    double c = in.nextDouble();
                    double t = (c * 16);
                    System.out.println("Cups: " + t + "  Tablespoons: " + c);
                    break;
                }
                case "D2E": {
                    double d = in.nextDouble();
                    double e = (d * 0.83);
                    System.out.println("Dollars: $" + d + "  Euros: €" + e);
                    break;
                }
                case "E2D": {
                    double e = in.nextDouble();
                    double d = (e * 1.20);
                    System.out.println("Euros: €" + e + "  Dollars: $" + d);
                    break;
                }
                case "Q": {
                    System.out.println("\n\"Q\" selected. Conversion complete. ");
                    System.exit(0);
                }

                default:
                    System.out.println("Unexpected value. Please try again: " + cmd);
            }
        }
    }
}
