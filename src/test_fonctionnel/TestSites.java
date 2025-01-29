package test_fonctionnel;

import personnages.Gaulois;
import personnages.Soldat;
import sites.Camp;
import sites.Village;
import personnages.Druides;

public class TestSites {
	public static void main(String[] args) {
		Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
		Soldat minus = new Soldat("Soldat", "Minus", 2);
		
		Village villageGaulois = new Village(vercingetorix);
		Camp campRomain = new Camp(minus);
		
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois asterix = new Gaulois("Astérix", 5);
		Gaulois obelix = new Gaulois("Obélix", 15);
		Gaulois panoramix = new Druides("Panoramix", 2);
		Gaulois abracourcix = new Gaulois("Abracourcix", 5);
		
		Soldat brutus = new Soldat("Centurion", "Brutus", 5);
		Soldat milexcus = new Soldat("Soldat", "Milexcus", 2);
		Soldat tulliusOctopus = new Soldat("Tesserarius", "Tullius Octopus", 2);
		Soldat ballondebaudrus = new Soldat("Optio", "Ballondebaudrus", 3);
		Soldat briseradius = new Soldat("Soldat", "Briseradius", 4);
		Soldat chorus = new Soldat("Centurion", "Chorus", 4);
		
		vercingetorix.parler("Je suis un grand guerrier et je vais créer mon village");
		minus.parler("Je suis en charge de créer un nouveau camp romain");
		
		villageGaulois.ajouterVillageois(agecanonix);
		villageGaulois.ajouterVillageois(assurancetourix);
		villageGaulois.ajouterVillageois(asterix);
		villageGaulois.ajouterVillageois(obelix);
		villageGaulois.ajouterVillageois(panoramix);
		villageGaulois.ajouterVillageois(abracourcix);
		
		campRomain.ajouterSoldat(brutus);
		campRomain.ajouterSoldat(milexcus);
		campRomain.ajouterSoldat(tulliusOctopus);
		campRomain.ajouterSoldat(ballondebaudrus);
		
	}
}
