package Spiel;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class game {


    public static int number = 21;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            int eingabe = scanner.nextInt();
            //eingabe(eingabe);
            number = number - eingabe;
            System.out.println("Noch da"+number);
        }while (number > 0);

    }

    private static int nim(int eingabe){

        int ausgabe = 4 - eingabe;
        System.out.println(ausgabe);
        return ausgabe;
    }

   // private static int eingabe(int eingabe){
    //
   //     System.out.println(eingabe);
   //     return eingabe;
   // }

}
