
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            lista.add(input);
        }
        double suma = 0.0;
        for (Integer i : lista) {
            suma += i;
        }
        System.out.println("Average: " + (suma / lista.size()));

    }


        
    
}
