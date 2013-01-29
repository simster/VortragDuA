package ch.sipama.core;

import java.util.Scanner;

public class Eingabeleser {

	//Instanzvariable
	private Scanner scanner;
	
	//Konstruktor
	public Eingabeleser()
    {
        scanner = new Scanner(System.in);
    }
	
	
	//Erwarten einer Eingabe bzw. dessen String zurückgeben
	public String gibEingabe() 
    {
        System.out.print("> ");   // Eingabebereitschaft anzeigen
        String eingabezeile = scanner.nextLine().trim().toLowerCase();
        return eingabezeile;
    }
	
	
}
