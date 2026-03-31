import java.util.Scanner;

public class QuoAndRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int quotient = a / b;
        int remainder = a % b;
        System.out.println("The Quotient is " + quotient + " and Reminder is " + remainder + " of two numbers " + a + " and " + b);
    }
}