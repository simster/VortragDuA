package ch.sipama.data;

import java.util.ArrayList;

public class CodewortList {

	//Instanzvariablen
	private static CodewortList instance = null;
	private ArrayList<String> codewortList;

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

}