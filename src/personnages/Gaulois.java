package personnages;

public class Gaulois {
	
	private String nom;
	private int force;
	private int effetPotion=1;
	
		
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}


	public String getNom() {
		return nom;
	}


	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	
	private String prendreParole() {
		return "Le gaulois"+ nom + ":";
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() +"�" + texte + "�");
		
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force/3);
	}
		
	public void boirePotion(int forcePotion) {
		effetPotion+=forcePotion;
		parler("Merci Druide, je sens que ma force est "+ forcePotion +" fois decupl�e");
	}
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		System.out.println(asterix.getNom());
		int popo=4;
		asterix.boirePotion(popo);
	}
		
}
