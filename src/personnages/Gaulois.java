package personnages;

public class Gaulois extends Personnages{
	private int effetPotion;
	
	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	@Override
	public String donnerAuteur() {
		return "gaulois";
	}
	
	public void boirePotion(int forcePotion) {
	    this.effetPotion = forcePotion;
	}
	
	public int getForceAvecPotion() {
		if (effetPotion >= 1) {
			return getForce() * effetPotion;
		} else {
			return getForce();
		}
    }

	public void effetPotion() {
        if (effetPotion > 0) {
            effetPotion -= 0.5;
        }
    }
	
	@Override
	public void frapper(Personnages adversaire) {
        int forceUtilisee = getForceAvecPotion();
        System.out.println("Le " + donnerAuteur() + " " + getNom() + " donne un grand coup de force " + forceUtilisee + " au " + adversaire.donnerAuteur() + " " + adversaire.getNom());
        adversaire.recevoirCoup(forceUtilisee);
        effetPotion();
    }
}
