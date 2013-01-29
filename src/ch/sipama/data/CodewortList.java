package ch.sipama.data;

import java.util.ArrayList;

public class CodewortList {

	//Instanzvariablen
	private static CodewortList instance = null;
	private ArrayList<String> codewortList;
	private ArrayList<String> parityCodewortList;
	private ArrayList<String> hammingCodewortList;
	private String str;

	//Konstruktor
	private CodewortList(){
		setCodewortList(new ArrayList<String>());
	}

	//Sicherstellen, dass nur 1 Instanz dieser Klasse existiert
	public static CodewortList getInstance(){
		if(instance == null){
			instance = new CodewortList();
		}
		return instance;
	}

	
	//Getter und Setter für die Codewortliste
	public ArrayList<String> getCodewortList() {
		return codewortList;
	}

	public void setCodewortList(ArrayList<String> arrayList) {
		this.codewortList = arrayList;
	}
	
	public ArrayList<String> getParityCodewortList() {
		return parityCodewortList;
	}

	public void setParityCodewortList(ArrayList<String> parityCodewortList) {
		this.parityCodewortList = parityCodewortList;
	}

	public ArrayList<String> getHammingCodewortList() {
		return hammingCodewortList;
	}

	public void setHammingCodewortList(ArrayList<String> hammingCodewortList) {
		this.hammingCodewortList = hammingCodewortList;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}