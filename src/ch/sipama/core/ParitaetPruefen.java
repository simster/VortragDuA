package ch.sipama.core;

import java.util.ArrayList;

import ch.sipama.data.CodewortList;

public class ParitaetPruefen {

	public void stringVorher(){
		String str = new String();
		for(int i=0; i<CodewortList.getInstance().getParityCodewortList().size(); i++){
			str = str + CodewortList.getInstance().getParityCodewortList().get(i);
		}
		System.out.println(str);		
	}

	public void parAuswertung(String str){
		ArrayList<char[]> stringsNachher = new ArrayList<char[]>();
		int laenge = (str.length()/8);
		char[] c = new char[8];
		for(int i=1; i<=laenge; i++){
			c = str.substring(((i*8)-8),((i*8))).toCharArray();
			stringsNachher.add(c);
			int paritaet=0;
			for(int j=0; j<7; j++){
				if(c[j]=='1'){
					if(paritaet==0){
						paritaet=1;
					}else{
						paritaet=0;
					}	
				}
			}
			char[] v = CodewortList.getInstance().getParityCodewortList().get((i-1)).toCharArray();
			if(((int)v[7])-48==paritaet){
				if(CodewortList.getInstance().getStr()!=null){
					char code[] = CodewortList.getInstance().getStr().toCharArray();
					System.out.println("Buchstabe " + code[i-1] + ": " + new String(c) + " ok");
				}
				else{
					System.out.println("Wort " + (char)((i-1)+65) + ": " + new String(c) + " ok");
				}	
			}else{
				if(CodewortList.getInstance().getStr()!=null){
					char code[] = CodewortList.getInstance().getStr().toCharArray();
					System.out.println("Buchstabe " + code[(i-1)] + ": " + new String(c) + " Das Wort enthält einen Fehler!");
				}
				else{
					System.out.println("Wort " + (char)((i-1)+65) + ": " + new String(c) + " Das Wort enthält einen Fehler!");
				}	
			}
		}
	}
}
