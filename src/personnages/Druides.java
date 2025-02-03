package personnages;
import java.util.Random;

public class Druides extends Gaulois{
	
	public Druides(String nom, int force) {
		super(nom, force);
	}
	
	@Override
	public String donnerAuteur() {
		return "gaulois druide";
	}
	
	private int forcePotion;
	private int nbrPotions;
	
	public void fabriquerPotion(int nbrPotions, Personnages Druides) {
		Random random = new Random();
		forcePotion = random.nextInt(5) + 2;
		Druides.parler("<< J'ai concocté " + nbrPotions + " doses de potion magique. Elle a une force de " + forcePotion + " >>");
		this.nbrPotions = nbrPotions;
	}
	
	public void donnerPotion(Gaulois gaulois) {
        if ("Obélix".equals(gaulois.getNom())) {
        	parler("<< Non, Obélix Non !... Et tu le sais très bien ! >>");
        } else if (nbrPotions > 0) {
            gaulois.boirePotion(forcePotion);
            parler("<< Tiens " + gaulois.getNom() + " un peu de potion magique de force " + forcePotion + " >>");
            nbrPotions--;
        } else {
            parler("<< Désolé " + gaulois.getNom() + " il n'y a plus une seule goutte de potion >>");
        }
    }
}