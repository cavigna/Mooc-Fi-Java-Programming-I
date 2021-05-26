
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name: ");
        String input = scanner.nextLine();


        while (!input.isEmpty()){

            System.out.println("Name: ");
            items.add(new Item(input));

            input = scanner.nextLine();
        }


        for(Item item : items){
            System.out.println(item);
        }

    }

    }

