
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int stop = scanner.nextInt();
        System.out.println("Where from?");
        int start = scanner.nextInt();
        for(int i=start; i<=stop; i++){
            System.out.println(i);
        }
    }
}
