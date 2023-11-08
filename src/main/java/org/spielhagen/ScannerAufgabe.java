package org.spielhagen;
import java.util.Scanner;
public class ScannerAufgabe {

    public static void main(String[] args) {
        // Instanzieren des Scanners Objektes
        System.out.println("Bitte geben Sie ein Wort ein:");
        Scanner scanner = new Scanner(System.in);
        // Einlesen des Wortes
        String word = scanner.nextLine();

        // Gebe die Buchstaben des Wortes word einzeln aus
        System.out.println();
        System.out.println("Das Wort " + word + " besteht aus folgenden Buchstaben:");
        printingEachChar(word);
    }
public static void printingEachChar(String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }
}

/* Lösung von Achim
public class ScannerAufgabe {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter Username");

        String userName = myObj.nextLine(); // Read user input
        for(int i = 0; i < userName.length(); i++) {
            char letter = userName.charAt(i);
            System.out.println("Buchstabe " + i + " ist " + letter);
        }

    }
}
 */
