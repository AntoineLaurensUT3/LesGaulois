package personnages;

public class Romain {
	
	private Equipement equipements[] = new Equipement[2];
	private int nbEquipement = 0;
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		assert force>0 : "Force doit etre >0";
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}


	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	
	public void recevoirCoup(int forceCoup) {
		assert force>0 : "Force doit etre >0";
		int forceInitiale = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert forceInitiale>force : "la force du romain doit diminuer";
	}
	
	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
		case 2:
			System.out.println("Le soldat "+nom+" est déja bien protégé !");
			break;
		case 1:
			if(equipements[0] == equipement) {
				System.out.println("Le soldat "+nom+" possede déja un "+equipement);
			}
			else {
				equipements[1]=equipement;
				System.out.println("Le soldat "+nom+" s'equipe d'un "+equipement);
				nbEquipement++;
			}
			
			break;
		
		default:
			equipements[0]=equipement;
			System.out.println("Le soldat "+nom+" s'equipe d'un "+equipement);
			nbEquipement++;
		}
		
		
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		minus.parler("salut");
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
	
}
