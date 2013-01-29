package ch.sipama.core;

import ch.sipama.data.CodewortList;

public class HammingCode {
	
	public void setHammingCode(String codewort){
		
		for(int i = 0; i<CodewortList.getInstance().getCodewortList().size(); i++){
			char s[] = CodewortList.getInstance().getCodewortList().get(i).toCharArray();
			char hamming[] = new char[15];
			hamming[7]=' ';
			hamming[0]='0';
			hamming[1]=s[0];
			hamming[2]=s[1];
			hamming[4]=s[3];
			hamming[8]=s[4];
			hamming[9]=s[5];
			hamming[10]=s[6];
			hamming[12]=s[7];
			
			int pruef1 = (int) hamming[0] + (int) hamming[1] + (int) hamming[2];
			
			if(pruef1%2==0){
				hamming[3]='0';
			}else{
				hamming[3]='1';
			}
			
			
			
		}
		
		
	}
	

}
