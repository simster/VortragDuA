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
		
		String auswertung0=null;
		String auswertung1;
		int z=-1;
		
		ArrayList<char[]> stringsNachher = new ArrayList<char[]>();
		int laenge = (hamWort.length()/7);
		char[] c = new char[7];
		for(int i=1; i<=laenge; i++){
			int r1=0;
			int r2=0;
			int r3=0;
			c = hamWort.substring(((i*7)-7),(i*7)).toCharArray();
			stringsNachher.add(c);

			int pruef1 = (((int) c[0] + (int) c[1] + (int) c[2]) - 3*48)%2;
			if(pruef1 != ((int)c[3]-48)){
				r1=4;
			}

			int pruef2 = (((int) c[0] + (int) c[1] + (int) c[4]) - 3*48)%2;
			if(pruef2 != ((int)c[5]-48)){
				r2=2;
			}



			int pruef3 = (((int) c[0] + (int) c[2] + (int) c[4]) - 3*48)%2;
			if(pruef3 != ((int)c[6]-48)){
				r3=1;
			}


			if(i%2==1){
				z++;
				if((r1+r2+r3)!=0){
					auswertung0= " Das " + (r1+r2+r3+7) + ". Bit wurde falsch übertragen!";
				}else{
					auswertung0= " ok";
				}
				
			}else{
				if((r1+r2+r3)!=0){
					auswertung1= " - Das " + (r1+r2+r3) + ". Bit wurde falsch übertragen!";
				}else{
					auswertung1= " - ok";
				}
				
				char code[] = CodewortList.getInstance().getStr().toCharArray();
				System.out.println("Buchstabe " + code[z] + ": " + CodewortList.getInstance().getHammingCodewortList().get(z) + " <-> "+ new String(stringsNachher.get(i-2))  + new String(stringsNachher.get(i-1))+ auswertung0 + auswertung1);
				
			}
		}
	}
}
