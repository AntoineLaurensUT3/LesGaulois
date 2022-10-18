package personnages;

public class Musee {

	private Trophee trophees[] = new Trophee[200];
	private int nbTrophee = 0 ;
	
	
	public void donnerTrophee(Gaulois gaulois, Equipement equipement) {
		
		Trophee t = new Trophee(gaulois,equipement);
		trophees[nbTrophee] = t ; 
		nbTrophee++;
	}
	
	
} 
