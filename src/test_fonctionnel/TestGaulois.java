package test_fonctionnel;

import personnages.Druides;
import personnages.Equipement;
import personnages.Gaulois;
import personnages.Soldat;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 5);
		Soldat minus = new Soldat("Soldat", "Minus", 6);
		Druides panoramix = new Druides("Panoramix", 1);
		Gaulois obelix = new Gaulois("Obélix", 15);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois abracourcix = new Gaulois("Abracourcix", 5);
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		
		minus.ajouterEquipement(Equipement.BOUCLIER);
		minus.ajouterEquipement(Equipement.CASQUE);
		minus.ajouterEquipement(Equipement.PLASTRON);
		
		panoramix.fabriquerPotion(3,panoramix);
		panoramix.donnerPotion(asterix);
		panoramix.donnerPotion(obelix);
		panoramix.donnerPotion(assurancetourix);
		panoramix.donnerPotion(abracourcix);
		panoramix.donnerPotion(agecanonix);

		asterix.parler("Bonjour à tous.");
		minus.parler("UN GAU... UN GAUGAU...");

		while (!minus.estATerre() && !asterix.estATerre()) {
			asterix.frapper(minus);
			if (!minus.estATerre()) {
				minus.frapper(asterix);
			}
		}
	}
}
