
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = scanner.nextInt();
        System.out.println("Give a number:");
        int number2 = scanner.nextInt();
        System.out.println(Math.sqrt(number+number2));

    }
}
