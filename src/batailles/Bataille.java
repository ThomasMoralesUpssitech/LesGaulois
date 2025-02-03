package batailles;

import java.util.List;
import java.util.Random;

import personnages.Equipement;
import personnages.Personnages;
import personnages.Soldat;

public class Bataille {
	private String contexte;
    private List<Personnages> attaquants;
    private List<Personnages> defenseurs;
    private int gagnant;

    public Bataille(String contexte, List<Personnages> attaquants, List<Personnages> defenseurs) {
        this.contexte = contexte;
        this.attaquants = attaquants;
        this.defenseurs = defenseurs;
    }

    public void decrireContexte() {
        System.out.println("Contexte de la bataille : " + contexte);
    }

    public void decrireCombattants() {
    	if (attaquants.size() == 1) {
    		System.out.println("L'attaquant est :");
        	for (Personnages a : attaquants) {
        		System.out.println("- Le " + a.donnerAuteur() + " " + a.getNom() + " (force : " + a.getForce() + ")");
        	}
        } else if (attaquants.isEmpty()) {
        	System.out.println("Il n'y a pas d'attaquants !");
        } else {
        	System.out.println("Les attaquants sont :");
        	for (Personnages a : attaquants) {
        		System.out.println("- Le " + a.donnerAuteur() + " " + a.getNom() + " (force : " + a.getForce() + ")");
        	}
        }
    	
        if (defenseurs.size() == 1) {
        	System.out.println("Le défenseur est :");
        	for (Personnages d : defenseurs) {
        		System.out.println("- Le " + d.donnerAuteur() + " " + d.getNom() + " (force : " + d.getForce() + ")");
        	}
        } else if (defenseurs.isEmpty()) {
        	System.out.println("Il n'y a pas de défenseurs !");
        } else {
        	System.out.println("Les défenseurs sont :");
        	for (Personnages d : defenseurs) {
        		System.out.println("- Le " + d.donnerAuteur() + " " + d.getNom() + " (force : " + d.getForce() + ")");
        	}
        }
    }

    public void preparerCombat() {
        System.out.println("Les combattants s'équipent et se préparent à l'affrontement...");
        for (Personnages a : attaquants) {
        	if (a instanceof Soldat) {
                Soldat soldat = (Soldat) a;
                soldat.ajouterEquipement(Equipement.BOUCLIER);
                soldat.ajouterEquipement(Equipement.CASQUE);
        		soldat.ajouterEquipement(Equipement.PLASTRON);
            }
        }
        for (Personnages d : defenseurs) {
        	if (d instanceof Soldat) {
                Soldat soldat = (Soldat) d;
                soldat.ajouterEquipement(Equipement.BOUCLIER);
                soldat.ajouterEquipement(Equipement.CASQUE);
        		soldat.ajouterEquipement(Equipement.PLASTRON);
            }
        }
    }

    public void decrireCombat() {
        System.out.println("Le combat commence !");
        Random rand = new Random();

        while (!attaquants.isEmpty() && !defenseurs.isEmpty()) {
            for (int i = 0; i < attaquants.size(); i++) {
                Personnages attaquant = attaquants.get(i);
                if (!defenseurs.isEmpty()) {
                    Personnages defenseur = defenseurs.get(rand.nextInt(defenseurs.size()));
                    attaquant.frapper(defenseur);
                    if (defenseur.estATerre()) {
                        System.out.println("Le " + defenseur.donnerAuteur() + " " + defenseur.getNom() + " est à terre !");
                        defenseurs.remove(defenseur);
                    }
                }
            }
            
            for (int i = 0; i < defenseurs.size(); i++) {
                Personnages defenseur = defenseurs.get(i);
                if (!attaquants.isEmpty()) {
                    Personnages attaquant = attaquants.get(rand.nextInt(attaquants.size()));
                    defenseur.frapper(attaquant);
                    if (attaquant.estATerre()) {
                        System.out.println("Le " + attaquant.donnerAuteur() + " " + attaquant.getNom() + " est à terre !");
                        attaquants.remove(attaquant);
                    }
                }
            }
        }
        
        if (defenseurs.isEmpty()){
        	gagnant = 1;
        }
        if (attaquants.isEmpty()) {
        	gagnant = 2;
        }
    }

    public void donnerResultat() {
        if (gagnant == 1) {
            System.out.println("Victoire des attaquants !");
        } else if (gagnant == 2) {
                System.out.println("Victoire des défenseurs !");
        } else {
            System.out.println("Personne n'a gagné !");
        }
    }
}
