import java.util.Scanner;

public class SimpleInterest {
    public static double calculate(double principal, double rate, double time) {
        return principal * rate * time / 100;
    }

    public static void main(String[] args) {
        double principal, rate, time;

        if (args.length >= 3) {
            try {
                principal = Double.parseDouble(args[0]);
                rate = Double.parseDouble(args[1]);
                time = Double.parseDouble(args[2]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid argument Please enter principal, rate, and time.");
                return;
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter principal amount:");
            principal = scanner.nextDouble();
            System.out.println("Enter rate:");
            rate = scanner.nextDouble();
            System.out.println("Enter time:");
            time = scanner.nextDouble();
            scanner.close();
        }

        double interest = calculate(principal, rate, time);
        System.out.println("Simple interest is: " + interest);
    }
}