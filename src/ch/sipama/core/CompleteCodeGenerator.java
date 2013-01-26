package ch.sipama.core;

import ch.sipama.data.CodewortList;

public class CompleteCodeGenerator {
	
	int laenge;
	
	public void completeCodeGenerieren(int laenge){
		this.laenge = laenge;
		
		int anz = 1;
		for(int i=0; i< laenge; i++){
			anz = anz*2;
		}

		
		//1. Wort initialisieren
		char[] code = new char[laenge];
		for(int i=0; i<laenge; i++){
			code[i]='0';
		}
		
		for(int i=0; i< anz; i++){
			char[] c = code;
			
			String by = Integer.toBinaryString(i);
			char[] b = by.toCharArray();
			
			for(int j=0; j<b.length; j++){
				c[((c.length-1)-j)]=b[((b.length-1)-j)];
			}
			
			CodewortList.getInstance().getCodewortList().add(new String(c));
			System.out.println("Wort " + (char)(i+65) + ": " + CodewortList.getInstance().getCodewortList().get(i));
		}
		
		System.out.println();
		
	}
	

}