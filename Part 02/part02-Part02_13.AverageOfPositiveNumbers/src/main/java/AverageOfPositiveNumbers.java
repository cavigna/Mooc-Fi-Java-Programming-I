
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            } else if (number > 0) {
                counter += 1;
                sum += number;

            }

        }
        double result = 1.0 * sum / counter;
        if (result > 0) {
            System.out.println("Average of the numbers: " + result);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
