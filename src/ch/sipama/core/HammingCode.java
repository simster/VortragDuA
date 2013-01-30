package ch.sipama.core;

import ch.sipama.data.CodewortList;

public class HammingCode {

	private char[] code;

	public void setHammingCode(){

		//eingegebenes Wort abholen (falls vorhanden)
		if(CodewortList.getInstance().getStr()!=null){
			code = CodewortList.getInstance().getStr().toCharArray();
		}


		for(int i = 0; i<CodewortList.getInstance().getCodewortList().size(); i++){
			char s[] = CodewortList.getInstance().getCodewortList().get(i).toCharArray();
			char hamming[] = new char[15];
			hamming[7]=' ';
			hamming[0]='0';
			hamming[1]=s[0];
			hamming[2]=s[1];
			hamming[4]=s[2];
			hamming[8]=s[3];
			hamming[9]=s[4];
			hamming[10]=s[5];
			hamming[12]=s[6];


			int pruef1 = ((int) hamming[0] + (int) hamming[1] + (int) hamming[2]) - 3*48;
			if(pruef1%2==0){
				hamming[3]='0';
			}else{
				hamming[3]='1';
			}

			int pruef2 = ((int) hamming[0] + (int) hamming[1] + (int) hamming[4]) - 3*48;
			if(pruef2%2==0){
				hamming[5]='0';
			}else{
				hamming[5]='1';
			}

			int pruef3 = ((int) hamming[0] + (int) hamming[2] + (int) hamming[4]) - 3*48;
			if(pruef3%2==0){
				hamming[6]='0';
			}else{
				hamming[6]='1';
			}

			int pruef4 = ((int) hamming[8] + (int) hamming[9] + (int) hamming[10]) - 3*48;
			if(pruef4%2==0){
				hamming[11]='0';
			}else{
				hamming[11]='1';
			}

			int pruef5 = ((int) hamming[8] + (int) hamming[9] + (int) hamming[12]) - 3*48;
			if(pruef5%2==0){
				hamming[13]='0';
			}else{
				hamming[13]='1';
			}

			int pruef6 = ((int) hamming[8] + (int) hamming[10] + (int) hamming[12]) - 3*48;
			if(pruef6%2==0){
				hamming[14]='0';
			}else{
				hamming[14]='1';
			}

			CodewortList.getInstance().getHammingCodewortList().add(new String(hamming));
		}
	}

	public void hammingListeAusgeben(){
		for(int i = 0; i<CodewortList.getInstance().getCodewortList().size(); i++){
			if(code!=null){
				System.out.println("Buchstabe " + code[i] + ": " + CodewortList.getInstance().getHammingCodewortList().get(i));
			}
			else{
				System.out.println("Wort " + (char)(i+65) + ": " + CodewortList.getInstance().getHammingCodewortList().get(i));
			}	
		}
	}

}
