
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("First name: ");
            String nombre = scanner.nextLine();

            if(nombre.isEmpty()){
                break;
            }
            System.out.println("Last name: ");
            String apellido = scanner.nextLine();

            System.out.println("Identification number: ");
            String id = scanner.nextLine();


            infoCollection.add(new PersonalInformation(nombre, apellido, id));
        }


        for (PersonalInformation info : infoCollection){
            System.out.println(info.getFirstName() + " " + info.getLastName());
        }

    }
}
