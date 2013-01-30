package ch.sipama.core;

import java.util.ArrayList;

import ch.sipama.data.CodewortList;

public class HammingPruefen {

	public void stringVorher(){
		String str = new String();
		for(int i=0; i<CodewortList.getInstance().getHammingCodewortList().size(); i++){
			str = str + CodewortList.getInstance().getHammingCodewortList().get(i);
		}
		System.out.println(str);		
	}
	
	
	public void hamAuswertung(String hamWort){
	
		ArrayList<char[]> stringsNachher = new ArrayList<char[]>();
		System.out.println(hamWort);
		
		
		
	}
	
	
	
}
