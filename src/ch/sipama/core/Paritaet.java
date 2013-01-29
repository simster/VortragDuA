package ch.sipama.core;

import ch.sipama.data.CodewortList;

public class Paritaet {


	public void setEinDimParity(String codewort){
		char[] code = codewort.toCharArray();
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
			
			
			
			CodewortList.getInstance().getCodewortList().set(i, new String(s2));
			System.out.println("Buchstabe " + code[i] + ": " + CodewortList.getInstance().getCodewortList().get(i));
		}

	}





	public void setZweiDimParity(){

	}

}
