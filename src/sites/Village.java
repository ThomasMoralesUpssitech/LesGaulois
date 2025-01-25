package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] villageois = new Gaulois[50];
	private int nbrVillageois;

	public Village(Gaulois chef) {
		this.chef = chef;
	}
	
	public String getNomChef() {
		return chef.getNom();
	}
	
	public int getForceChef() {
		return chef.getForce();
	}
	
	public void ajouterVillageois(Gaulois habitant) {
		if (nbrVillageois < villageois.length) {
			villageois[nbrVillageois] = habitant;
			nbrVillageois++;
		} else {
			System.out.println("Village déjà plein");
		}
	}
	
	public void afficherVillageois() {
        System.out.println("Chef du village : " + getNomChef() + " de force " + getForceChef());
        System.out.println("Villageois :");
        for (int i = 0; i < nbrVillageois; i++) {
            System.out.println("- " + villageois[i].getNom() + " de force " + villageois[i].getForce());
        }
	}
	
	public void changerChef(Gaulois nvChef) {
		System.out.print("Le gaulois " + getNomChef() + " : 'Je laisse mon grand bouclier au grand ");
		chef = nvChef;
		System.out.println(getNomChef() + "'");
		System.out.println("Le gaulois " + getNomChef() + " : 'Merci !' ");
	}
}
