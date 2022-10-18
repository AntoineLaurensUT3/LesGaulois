package histoire;

import personnages.Romain;
import personnages.Druide;
import personnages.Equipement;
import personnages.Gaulois;


public class Scenario {

	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Asterix",8);
		Romain minus = new Romain("Minus",16);
		Druide panoramix = new Druide("Panoramix",5,10);
		Gaulois obelix = new Gaulois("Obelix",20);

		
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.parler("Non, Obélix !... Tu n'auras pas de potion magique !");
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		asterix.boirePotion(6);
		asterix.parler("Bonjour");
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
	}
	

}
