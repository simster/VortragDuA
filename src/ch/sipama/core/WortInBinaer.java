package ch.sipama.core;

import ch.sipama.data.CodewortList;

public class WortInBinaer {
	
	public void stringToBinaer(String str){
		char[] s = str.toCharArray();
		char[] code = {'0', '0', '0', '0', '0', '0', '0'};	
		
		for(int i = 0; i < str.length(); i++){
			char[] c = code;
			String by = Integer.toBinaryString((int) str.charAt(i));
			char[] b = by.toCharArray();
			
			for(int j=0; j<b.length; j++){
				c[((c.length-1)-(j))]=b[((b.length-1)-j)];
			}
			
			CodewortList.getInstance().getCodewortList().add(new String(c));
			System.out.println("Buchstabe " + s[i] + ": " + CodewortList.getInstance().getCodewortList().get(i));
		}
		}
		
		
	}
	
	
	
	
	


