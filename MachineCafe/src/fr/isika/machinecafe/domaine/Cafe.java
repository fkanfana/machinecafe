package fr.isika.machinecafe.domaine;

//Caf� �tant une Boisson, il h�rite de la classe Boisson
public class Cafe extends Boisson {
	
	
	private boolean lait;
	
	//Appel au contructeur super de la classe m�re Boisson
	public Cafe(String type) {
		super(type);
	}

//Getter et setter de l'attribut booleen lait
	public boolean isLait() {
		return lait;
	}

	public void setLait(boolean lait) {
		this.lait = lait;
	}

}
