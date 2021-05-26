
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cubo =1;
        while(true){
            String numeroString = scanner.nextLine();
            if(numeroString.equals("end")){
                break;
            }else{
                int numero = Integer.valueOf(numeroString);
                System.out.println(numero*numero*numero);
            }
        }

    }
}
