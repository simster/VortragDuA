package ch.sipama.core;

import java.util.ArrayList;
import ch.sipama.data.CodewortList;

public class Start {

	public static void main(String[] args) {

		//Eine beliebige Anzahl Wörter generieren mit einer beliebigen Länge nach dem Zufallsprinzip
		RandomCodeGenerator randomGenerator = new RandomCodeGenerator();
		randomGenerator.codeWoerterGenerieren(8, 6);
		
		HammingAbstand hamming = new HammingAbstand();
		hamming.hammingAbstandBestimmen(0, "");
		
		CodewortList.getInstance().setCodewortList(new ArrayList<String>());
		System.out.println();
		
		
		
		//Eine beliebige Länge für einen Code vorgeben und alle möglichen Codewörter generieren
		CompleteCodeGenerator ccg = new CompleteCodeGenerator();
		ccg.completeCodeGenerieren(5);
		
//		HammingAbstand hamming = new HammingAbstand();
		hamming.hammingAbstandBestimmen(0, "");
		
		CodewortList.getInstance().setCodewortList(new ArrayList<String>());
		System.out.println();
		
		
		
		//Ein beliebiges Wort in Buchstaben aufteilen und diese in Binärcode umwandeln
		String str = "zuerich";
		System.out.println("Das Wort " + str + " binär dargestellt:");
		
		System.out.println();
		
		WortInBinaer wib = new WortInBinaer();
		wib.stringToBinaer(str);
		System.out.println();
		hamming.hammingAbstandBestimmen(1, str);
		
		System.out.println();
		Paritaet par = new Paritaet();
		par.setEinDimParity(str);
		System.out.println();
		hamming.hammingAbstandBestimmen(1, str);
		
		
	}
	
}
