
import java.util.Scanner;

public class InAHoleInTheGround {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many times?");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            printText();
        }
    }

    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
    }
}
