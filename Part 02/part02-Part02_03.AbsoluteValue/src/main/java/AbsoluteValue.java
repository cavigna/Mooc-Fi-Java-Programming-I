
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int number = scanner.nextInt();
        if (number < 0) {
            number *= -1;
        }

        System.out.println(number);

    }
}
