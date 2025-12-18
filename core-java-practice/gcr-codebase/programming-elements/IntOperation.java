import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println("The results of Int Operations are" + a+(b*c) + "," + ((a*b)+c) + "," + (c+(a/b)) + "," + ((a%b)+c));
    }
}
