package ch.sipama.core;

import ch.sipama.data.CodewortList;

public class HammingAbstand {

	public void hammingAbstandBestimmen(String fall){
		
		switch (fall) {
			case "a": fallA();
			break;
			case "b": fallB();
			break;
			case "c": fallC();
			break;
			default: fallA();
			break;
			
		}
	}
	
	
	//Tabelle mit Hammingabstand ausgeben (normlae, unveränderte Liste)
	public void fallA(){
		if(CodewortList.getInstance().getCodewortList().size()==0){
			System.out.println("Es sind noch keine Daten vorhanden um den Hammingabstand zu bestimmen.");
			System.out.println("Rufe zuerst eine Methode auf, um eine Liste mit Codewörtern zu erstellen.");
		}
		else{
			int anz=CodewortList.getInstance().getCodewortList().size();
			int minAbstand=CodewortList.getInstance().getCodewortList().size();

			//Tabelle für Hamming-Abstände bereitstellen
			String[][] hammingtable = new String[(anz+1)][(anz+1)];

			//Tabellenspalten und -zeilen beschriften:
			hammingtable[0][0]="-";

			if(CodewortList.getInstance().getStr()==null){
				for(int i = 1; i<(anz+1); i++){
					int j = 64;
					hammingtable[0][i] = "" +(char)(j+i);
					hammingtable[i][0] = "" +(char)(j+i);
				}
			}
			else{
				for (int i = 0; i<anz; i++){
					char[] s = CodewortList.getInstance().getStr().toCharArray();

					hammingtable[0][i+1] = "" + s[i];
					hammingtable[i+1][0] = "" + s[i];
				}
			}


			//Hamming-Abstand bestimmen
			for(int i=0; i<anz; i++){

				String wort = CodewortList.getInstance().getCodewortList().get(i);
				char[] a = wort.toCharArray();

				for(int j=0; j<anz; j++){
					String vergleich = CodewortList.getInstance().getCodewortList().get(j);
					char[] b = vergleich.toCharArray();

					int hamming = 0;

					for(int k=0; k<wort.length(); k++){
						if(a[k] != b[k]){
							hamming++;
						}					 
					}
					hammingtable[(i+1)][(j+1)] = "" + hamming;
					if(hamming<minAbstand && i!=j){
						minAbstand = hamming;
					}
				}
			}

			//Tabelle mit Hammingabstand ausgeben:
			for (int row = 0; row < hammingtable.length; row++) {
				for (int col = 0; col < hammingtable[row].length; col++) {
					System.out.print(hammingtable[row][col] + " ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("Der kleinste Hamming-Abstand beträgt " + minAbstand + ".");
		}
	}
	
	
	//Tabelle mit Hammingabstand der Liste mit Paritätsbit ausgeben
	public void fallB(){
		if(CodewortList.getInstance().getParityCodewortList().size()==0){
			System.out.println("Es sind noch keine Daten vorhanden um den Hammingabstand zu bestimmen.");
			System.out.println("Rufe zuerst eine Methode auf, um eine Liste mit Codewörtern zu erstellen.");
		}
		else{
			int anz=CodewortList.getInstance().getParityCodewortList().size();
			int minAbstand=CodewortList.getInstance().getParityCodewortList().size();

			//Tabelle für Hamming-Abstände bereitstellen
			String[][] hammingtable = new String[(anz+1)][(anz+1)];

			//Tabellenspalten und -zeilen beschriften:
			hammingtable[0][0]="-";

			if(CodewortList.getInstance().getStr()==null){
				for(int i = 1; i<(anz+1); i++){
					int j = 64;
					hammingtable[0][i] = "" +(char)(j+i);
					hammingtable[i][0] = "" +(char)(j+i);
				}
			}
			else{
				for (int i = 0; i<anz; i++){
					char[] s = CodewortList.getInstance().getStr().toCharArray();

					hammingtable[0][i+1] = "" + s[i];
					hammingtable[i+1][0] = "" + s[i];
				}
			}


			//Hamming-Abstand bestimmen
			for(int i=0; i<anz; i++){

				String wort = CodewortList.getInstance().getParityCodewortList().get(i);
				char[] a = wort.toCharArray();

				for(int j=0; j<anz; j++){
					String vergleich = CodewortList.getInstance().getParityCodewortList().get(j);
					char[] b = vergleich.toCharArray();

					int hamming = 0;

					for(int k=0; k<wort.length(); k++){
						if(a[k] != b[k]){
							hamming++;
						}					 
					}
					hammingtable[(i+1)][(j+1)] = "" + hamming;
					if(hamming<minAbstand && i!=j){
						minAbstand = hamming;
					}
				}
			}

			//Tabelle mit Hammingabstand ausgeben:
			for (int row = 0; row < hammingtable.length; row++) {
				for (int col = 0; col < hammingtable[row].length; col++) {
					System.out.print(hammingtable[row][col] + " ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("Der kleinste Hamming-Abstand beträgt " + minAbstand + ".");
		}
	}
	
	
	//Tabelle mit Hammingabstand des Hamming-Codes ausgeben
	public void fallC(){
		if(CodewortList.getInstance().getHammingCodewortList().size()==0){
			System.out.println("Es sind noch keine Daten vorhanden um den Hammingabstand zu bestimmen.");
			System.out.println("Rufe zuerst eine Methode auf, um eine Liste mit Codewörtern zu erstellen.");
		}
		else{
			int anz=CodewortList.getInstance().getHammingCodewortList().size();
			int minAbstand=CodewortList.getInstance().getHammingCodewortList().size();

			//Tabelle für Hamming-Abstände bereitstellen
			String[][] hammingtable = new String[(anz+1)][(anz+1)];

			//Tabellenspalten und -zeilen beschriften:
			hammingtable[0][0]="-";

			if(CodewortList.getInstance().getStr()==null){
				for(int i = 1; i<(anz+1); i++){
					int j = 64;
					hammingtable[0][i] = "" +(char)(j+i);
					hammingtable[i][0] = "" +(char)(j+i);
				}
			}
			else{
				for (int i = 0; i<anz; i++){
					char[] s = CodewortList.getInstance().getStr().toCharArray();

					hammingtable[0][i+1] = "" + s[i];
					hammingtable[i+1][0] = "" + s[i];
				}
			}


			//Hamming-Abstand bestimmen
			for(int i=0; i<anz; i++){

				String wort = CodewortList.getInstance().getHammingCodewortList().get(i);
				char[] a = wort.toCharArray();

				for(int j=0; j<anz; j++){
					String vergleich = CodewortList.getInstance().getHammingCodewortList().get(j);
					char[] b = vergleich.toCharArray();

					int hamming = 0;

					for(int k=0; k<wort.length(); k++){
						if(a[k] != b[k]){
							hamming++;
						}					 
					}
					hammingtable[(i+1)][(j+1)] = "" + hamming;
					if(hamming<minAbstand && i!=j){
						minAbstand = hamming;
					}
				}
			}

			//Tabelle mit Hammingabstand ausgeben:
			for (int row = 0; row < hammingtable.length; row++) {
				for (int col = 0; col < hammingtable[row].length; col++) {
					System.out.print(hammingtable[row][col] + " ");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println("Der kleinste Hamming-Abstand beträgt " + minAbstand + ".");
		}
		
	}
	
	
	
}
