/**
 * 
 */
package personnages;

/**
 * @author LRN3770A
 *
 */
public class Village {
	
	private String nom;
	private Chef chef;
	private int nbVillageois=0;
	private Gaulois villageois[];
	
	public Village(String nom, int nbVillageoisMax) {
		super();
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMax];
	}

	public String getNom() {
		return nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
		
	}
	
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef "+chef.getNom()+" vivent les legendaires gaulois : ");
		for(int i=0;i<nbVillageois;i++) {
			System.out.println("-"+villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des irreductibles",30);
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois obelix = new Gaulois("Obelix",25);
		
		village.setChef(abraracourcix);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		
	}
}
