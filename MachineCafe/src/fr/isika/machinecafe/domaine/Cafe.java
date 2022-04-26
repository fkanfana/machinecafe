package fr.isika.machinecafe.domaine;

//Café étant une Boisson, il hérite de la classe Boisson
public class Cafe extends Boisson {
	
	
	private boolean lait;
	
	//Appel au contructeur super de la classe mère Boisson
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
