import java.util.Scanner;

public class NumberOfHandshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int handshakes = (n * (n - 1)) / 2;
        System.out.println("Number of handshakes: " + handshakes);
    }
}