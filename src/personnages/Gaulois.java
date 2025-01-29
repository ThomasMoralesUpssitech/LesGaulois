package personnages;

public class Gaulois extends Personnages{
	private int effetPotion;
	
	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	@Override
	
	protected String donnerAuteur() {
		return "gaulois";
	}
	
	public void boirePotion(int forcePotion) {
	    this.effetPotion = forcePotion;
	}
	
	public int getForceAvecPotion() {
        return getForce() + effetPotion;
    }

	public void effetPotion() {
        if (effetPotion > 0) {
            effetPotion -= 0.5;
        }
    }
	
	@Override
	public void frapper(Personnages adversaire) {
        int forceUtilisee = getForceAvecPotion();
        System.out.println("Le " + donnerAuteur() + " " + getNom() + " donne un grand coup de force " + forceUtilisee/3 + " au " + adversaire.donnerAuteur() + " " + adversaire.getNom());
        adversaire.recevoirCoup(forceUtilisee/3);
        effetPotion();
    }
}
