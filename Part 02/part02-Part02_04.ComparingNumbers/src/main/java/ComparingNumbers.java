
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int first = scanner.nextInt();
        System.out.println("Give a number: ");
        int second = scanner.nextInt();
        if (first > second) {
            System.out.println(first + " is greater than " + second + ".");

        } else if (first == second) {
            System.out.println(first + " is equal to " + second + ".");
        } else {
            System.out.println(first + " is smaller than " + second + ".");
        }

    }
}
