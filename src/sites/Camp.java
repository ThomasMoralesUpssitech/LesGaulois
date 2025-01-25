package sites;

import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat ancienCommandant;
	private Soldat[] soldats = new Soldat[80];
	private int nbrSoldat;

	public Camp(Soldat commandant) {
		this.commandant = commandant;
	}
	
	public String getNomCommandant() {
		return commandant.getNom();
	}
	
	public String getClasseCommandant() {
		return commandant.getClasse();
	}
	
	public int getForceCommandant() {
		return commandant.getForce();
	}
	
	public void ajouterSoldat(Soldat militaire) {
		if (nbrSoldat < soldats.length) {
			soldats[nbrSoldat] = militaire;
			nbrSoldat++;
		} else {
			System.out.println("Camp déjà plein");
		}
	}
	
	public void afficherSoldats() {
        System.out.println("Chef du camp : " + getClasseCommandant() + " " + getNomCommandant() + " de force " + getForceCommandant());
        System.out.println("Soldats :");
        for (int i = 0; i < nbrSoldat; i++) {
            System.out.println("- " + soldats[i].getClasse() + " " + soldats[i].getNom() + " de force " + soldats[i].getForce());
        }
	}
	
	public void changerCommandant(Soldat nvCommandant) {
		ancienCommandant = commandant;
		commandant = nvCommandant;
		if ("Centurion".equalsIgnoreCase(getClasseCommandant())) {
			System.out.println("Le romain " + getNomCommandant() + " : 'Moi " + getNomCommandant() + " je prends la direction du camp romain'");
		} else {
			System.out.println("Le romain " + getNomCommandant() + " : 'Je ne suis pas suffisamment gradé pour prendre la direction du camp romain'");
			commandant = ancienCommandant;
		}
	}
}
