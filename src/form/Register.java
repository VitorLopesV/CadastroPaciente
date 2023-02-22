package form;

import entities.Patient;
import java.util.Locale;
import java.util.Scanner;

public class Register {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Patient patient = new Patient();

        //VARIÁVEL DE CONDIÇÃO
        char looping;

        do {

            System.out.print("ENTER THE PATIENT IS NAME: ");
            patient.name = sc.nextLine();
            System.out.print("ENTER PATIENT AGE: ");
            patient.age = sc.nextInt();
            System.out.print("ENTER THE PATIENT IS RACE: ");
            sc.nextLine();
            patient.race = sc.nextLine();
            System.out.print("ENTER PATIENT WEIGHT: ");
            patient.weight = sc.nextDouble();
            System.out.print("ENTER THE PATIENT IS DISEASE: ");
            sc.nextLine();
            patient.illness = sc.nextLine();
            System.out.print("THE PATIENT IS CASTRATED (YES / NO) ? ");
            patient.castrated = sc.nextLine();
            System.out.print("\n");

            //CONDIÇÃO DE LOPPING
            System.out.print("WOULD YOU LIKE TO MAKE A NEW RECORD (y/n) ?");
            looping = sc.nextLine().charAt(0);
            System.out.print("\n");

        }
        while (looping == 'y') ;
    }
}