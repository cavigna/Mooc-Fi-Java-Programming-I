import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while(!input.equals("")){
            String[] palabra = input.split(" ");
            for (int i = 0; i < palabra.length; i++) {
                System.out.println(palabra[i]);
            }
            input = scanner.nextLine();
        }
       
    }

}