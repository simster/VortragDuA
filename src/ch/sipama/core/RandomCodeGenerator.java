package ch.sipama.core;

import java.util.Random;

import ch.sipama.data.CodewortList;

public class RandomCodeGenerator {

	//Instanzvariablen
	int laenge;
	int anz;

	public void codeWoerterGenerieren(int wortLaenge, int anzCodewoerter){
		laenge = wortLaenge;
		anz = anzCodewoerter;

		//Codewörter generieren
		Random zufall = new Random();

		for(int i=0; i< anz; i++){
			String wort = "";
			for(int j=0; j< laenge; j++){
				int zeichen = zufall.nextInt(2);
				wort = wort + zeichen;
			}		
			CodewortList.getInstance().getCodewortList().add(wort);
			System.out.println("Wort " + (char)(i+65) + ": " + wort);
		}
		System.out.println();
	}



}
