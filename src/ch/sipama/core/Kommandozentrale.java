package ch.sipama.core;

import java.util.ArrayList;
import ch.sipama.data.CodewortList;

public class Kommandozentrale {

	private Eingabeleser leser;
	private RandomCodeGenerator rGenerator = new RandomCodeGenerator();
	private CompleteCodeGenerator ccg = new CompleteCodeGenerator();
	private WortInBinaer wib = new WortInBinaer();
	private HammingAbstand hAbstand = new HammingAbstand();
	private Paritaet par = new Paritaet();
	private HammingCode hamc = new HammingCode();

	public Kommandozentrale(){
		leser = new Eingabeleser();
	}


	public void starten()
	{
		boolean fertig = false;

		willkommenstextAusgeben();

		while(!fertig) {
			String eingabe = leser.gibEingabe();

			if(eingabe.contains("exit")) {
				fertig = true;
			}
			else{
				int methode = Integer.parseInt(eingabe);
				switch (methode) {
					case 0: hammingAbstand();
					break;
					case 1: random();
					break;
					case 2: completeCode();
					break;
					case 3: eigenesWort();
					break;
					case 4: setParity();
					break;
					case 5: setHammingCode();
					break;
				
				//	                    default: monthString = "Invalid month";
				//	                             break;
				}
				//	                System.out.println(monthString);


			}


		}
		//	        abschiedstextAusgeben();
	}


	public void willkommenstextAusgeben(){
		System.out.println("Vortrag 'Fehlerkorrigierende und fehlererkennende Codes " + 
				"- der praktische Teil:");
		System.out.println("Trage die Nummer ein, um eine Methode zu starten");
	}


	public void startzustand(){
		CodewortList.getInstance().setCodewortList(new ArrayList<String>());
		CodewortList.getInstance().setHammingCodewortList(new ArrayList<String>());
		CodewortList.getInstance().setParityCodewortList(new ArrayList<String>());
		CodewortList.getInstance().setStr(null);
	}

	public void hammingAbstand(){
		System.out.println("Welche Liste soll verglichen werden?");
		System.out.println("Setze a für die unveränderte Liste, b für die Liste mit Paritätsbit und c für den Hamming-Code");
		String fall=leser.gibEingabe();
		hAbstand.hammingAbstandBestimmen(fall);
	}

	public void random(){
		startzustand();
		int wortlaenge;
		int anzCodewoerter;
		System.out.println("Wie viele Zeichen sollen die Codewörter enthalten?");
		wortlaenge = Integer.parseInt(leser.gibEingabe());
		System.out.println("Wie viele Codewörter sollen generiert werden?");
		anzCodewoerter= Integer.parseInt(leser.gibEingabe());
		rGenerator.codeWoerterGenerieren(wortlaenge, anzCodewoerter);

	}

	public void completeCode(){
		startzustand();
		int wortlaenge;
		System.out.println("Wie viele Zeichen sollen die Codewörter enthalten?");
		wortlaenge = Integer.parseInt(leser.gibEingabe());
		ccg.completeCodeGenerieren(wortlaenge);
	}


	public void eigenesWort(){
		startzustand();
		String belWort;
		System.out.println("Tippe das Wort ein, welches buchstabenweise in einen Binärcode umgewandelt werden soll:");
		belWort=leser.gibEingabe();
		wib.stringToBinaer(belWort);
	}

	
	public void setParity(){
		par.setEinDimParity();
	}
	

	public void setHammingCode(){
		hamc.setHammingCode();
	}
	
	//		
	//		//Ein beliebiges Wort in Buchstaben aufteilen und diese in Binärcode umwandeln
	//		String str = "zuerich";
	//		System.out.println("Das Wort " + str + " binär dargestellt:");
	//		
	//		System.out.println();
	//		
	//		WortInBinaer wib = new WortInBinaer();
	//		wib.stringToBinaer(str);
	//		System.out.println();
	//		hamming.hammingAbstandBestimmen(1, str);
	//		
	//		System.out.println();
	//		Paritaet par = new Paritaet();
	//		par.setEinDimParity(str);
	//		System.out.println();
	//		hamming.hammingAbstandBestimmen(1, str);
	//		
	//		System.out.println();
	//		
	//		
	//		CodewortList.getInstance().setCodewortList(new ArrayList<String>());
	//		wib.stringToBinaer(str);
	//		
	//		
	//		hamc.setHammingCode(str);
	//		hamming.hammingAbstandBestimmen(1, str);












}
