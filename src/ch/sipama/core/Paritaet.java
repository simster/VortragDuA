package ch.sipama.core;

import ch.sipama.data.CodewortList;

public class Paritaet {

	private char[] code;

	public void setEinDimParity(){
		
		//eingegebenes Wort abholen (falls vorhanden)
		if(CodewortList.getInstance().getStr()!=null){
			code = CodewortList.getInstance().getStr().toCharArray();
		}
		
		//Einzelne Codewörter der Liste um ein Array-Platz erweitern und dem Paritätsbit ergänzen
		for(int i=0; i<CodewortList.getInstance().getCodewortList().size(); i++){
			char s[] = CodewortList.getInstance().getCodewortList().get(i).toCharArray();
			char[] s2 = new char[(s.length+1)];
			
			int paritaet=0;
			for(int j=0; j<s.length; j++){
				s2[j]=s[j];
				if(s[j]=='1'){
					if(paritaet==0){
						paritaet=1;
					}else{
						paritaet=0;
					}	
				}
			}
			char[] s3 = ("" + paritaet).toCharArray();
			s2[s.length] = s3[0];
			
			
			//neue Codewörter in parityCodewortList abspeichern
			CodewortList.getInstance().getParityCodewortList().add(new String(s2));
			if(code!=null){
				System.out.println("Buchstabe " + code[i] + ": " + CodewortList.getInstance().getParityCodewortList().get(i));
			}
			else{
				System.out.println("Wort " + (char)(i+65) + ": " + CodewortList.getInstance().getParityCodewortList().get(i));
			}	
		}
	}





	public void setZweiDimParity(){

	}

}
