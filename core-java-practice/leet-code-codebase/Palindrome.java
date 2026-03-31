import java.util.Scanner;
class Palindrome {
    public static void main(String[] args) {
        int num = 121, rev = 0, temp;

        temp = num;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }

        if (temp == rev)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome");
    }
}
