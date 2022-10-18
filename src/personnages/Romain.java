package personnages;

public class Romain {
	
	private Equipement equipements[] = new Equipement[2];
	private int nbEquipement = 0;
	private String nom;
	private int force;
	private String texte;

	
	
	public Romain(String nom, int force) {
		assert force>0 : "Force doit etre >0";
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	
	
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	
//	public void recevoirCoup(int forceCoup) {
//		assert force>0 : "Force doit etre >0";
//		int forceInitiale = force;
//		force -= forceCoup;
//		if (force > 0) {
//			parler("Aïe");
//		} else {
//			parler("J'abandonne...");
//		}
//		assert forceInitiale>force : "la force du romain doit diminuer";
//	}
//	
	
	
	
	
	
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0 : "Force doit etre >0";
		int oldForce = force;
		forceCoup = CalculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
			equipementEjecte = ejecterEquipement();
		} else {
			parler("J'abandonne...");
		}

		// post condition la force à diminuer
		assert force < oldForce;
		return equipementEjecte;
	}

		

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom.toString() + " s'envole sous la force du coup. ");


		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] == null) {
				continue;
			} else {
				equipementEjecte[nbEquipementEjecte] =
						equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
				nbEquipement--;
			}
		}
		return equipementEjecte;
	}



	
	private int CalculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (!(nbEquipement == 0)) {
			texte += " Mais heureusement, grace à mon équipement sa force est diminué de ";
					
					for (int i = 0; i < nbEquipement;i++) {
						if (equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER) == true){
							System.out.println("Equipement bouclier");
							resistanceEquipement += 8;
						} else {
							System.out.println("Equipement casque");
							resistanceEquipement += 5;
						}
						
					}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
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
