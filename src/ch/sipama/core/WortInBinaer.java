package ch.sipama.core;

import ch.sipama.data.CodewortList;

public class WortInBinaer {

	public void stringToBinaer(String str){
		//String in der CodewortList abspeichern
		CodewortList.getInstance().setStr(str);
		
		//String in ein CharArray umwandeln
			

		//Für jedes Element des CharArrays den Buchstaben in Binärcode umwandeln und in die CodewortList speichern
		for(int i = 0; i < str.length(); i++){
			char[] c = Integer.toBinaryString((int) str.charAt(i)).toCharArray();
			CodewortList.getInstance().getCodewortList().add(new String(c));
			
		}
	}
	
	
	public void listeAusgeben(){
		char[] s = CodewortList.getInstance().getStr().toCharArray();
		for(int i = 0; i < CodewortList.getInstance().getStr().length(); i++){
		System.out.println("Buchstabe " + s[i] + ": " + CodewortList.getInstance().getCodewortList().get(i));
		}
	}


}







