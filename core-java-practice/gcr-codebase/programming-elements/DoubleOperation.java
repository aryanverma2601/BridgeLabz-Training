import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println("The results of Double Operations are " + (a + (b * c)) + ", " + ((a * b) + c) + ", " + (c + (a / b)) + ", " + ((a % b) + c));
    }
}