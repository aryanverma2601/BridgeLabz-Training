import java.util.Scanner;

public class DistToKM {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter distance in miles: ");
    double kilometers = scanner.nextDouble();
    double miles = kilometers * 0.621371;
    System.out.printf("The total miles is " + miles + "mile for the given " +kilometers+ "km");
}
}
