import java.util.Scanner;

public class YardsAndMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distanceInFeet = sc.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        System.out.println("Your distance in yards is " + yards +  " while in miles is " + miles);
    }
}
