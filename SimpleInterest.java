import java.util.Scanner;

public class SimpleInterest {
    public static double calculate(double principal, double rate, double time) {
        return principal * rate * time / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter principal amount:");
        double principal = scanner.nextDouble();
        System.out.println("Enter rate:");
        double rate = scanner.nextDouble();
        System.out.println("Enter time:");
        double time = scanner.nextDouble();

        double interest = calculate(principal, rate, time);
        System.out.println("Simple interest is: " + interest);

        scanner.close();
    }
}