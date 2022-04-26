package fr.isika.machinecafe.domaine;

public class Boisson {
	
	private String type;
	private int quantite;
	private boolean sucre;
	
	//Constructeur utilisé lorsque l'utilisateur choisit sa boisson
	public Boisson(String type) {
		super();
		this.type = type;
	}
	
//Getters et setters des différents attributs
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public boolean isSucre() {
		return sucre;
	}
	public void setSucre(boolean sucre) {
		this.sucre = sucre;
	}

}
