package personnages;

public class Gaulois {
	
	private String nom;
	private int force;
	private int effetPotion=1;
	private int nb_trophees;
	private Equipement trophees[] = new Equipement[100];

		
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

	
//	private String prendreParole() {
//		return "Le gaulois"+ nom + ":";
//	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() +"«" + texte + "»");
		
	}
	
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
//		romain.recevoirCoup((force/3)*effetPotion);
//	}
		
	public void boirePotion(int forcePotion) {
		effetPotion+=forcePotion;
		parler("Merci Druide, je sens que ma force est "+ forcePotion +" fois decuplée");
	}
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		System.out.println(asterix.getNom());
		int popo=4;
		asterix.boirePotion(popo);
	}
		
	

	
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}

	

	public void frapper(Romain romain) {
		if(romain.getForce() < 1) {
			System.out.println("Ce romain est deja KO");
		}
		else {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());

		Equipement trophees[] = romain.recevoirCoup((force / 3) *effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
				nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
			}
		}
	}

	public void faireUneDonation(Musee musee) {
		
		if (nb_trophees != 0) {
			
			//TODO
		}
		
	}
}
