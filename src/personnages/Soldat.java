package personnages;

import java.util.EnumSet;

public class Soldat extends Personnages {
	private EnumSet<Equipement> equipements;
	
	public Soldat(String classe, String nom, int force) {
		super(classe, nom, force);
		this.equipements = EnumSet.noneOf(Equipement.class);
	}

	@Override
	public String donnerAuteur() {
		return getClasse();
	}
	
	public void ajouterEquipement(Equipement equipement) {
		if (equipements.contains(equipement)) {
            System.out.println("Le " + donnerAuteur() + " " + getNom() + " possède déjà un " + equipement.name().toLowerCase() + " !");
        } else {
            equipements.add(equipement);
            System.out.println("Le " + donnerAuteur() + " " + getNom() + " équipe un " + equipement.name().toLowerCase());
        }
    }
	
	@Override
	public void recevoirCoup(int coup) {
	    for (Equipement equip : new Equipement[] { Equipement.BOUCLIER, Equipement.CASQUE, Equipement.PLASTRON }) {
	        if (equipements.contains(equip)) {
	            if (coup >= equip.getReduction()) {
	            	coup = coup - equip.getReduction();
	                System.out.println("Le " + donnerAuteur() + " " + getNom() + " perd son " + equip.name().toLowerCase() + " !");
	                equipements.remove(equip);
	            } else {
	            	coup = 0;
	            }
	        }
	    }

	    if(coup >= getForce()) {
			setForce(getForce() - getForce());
			parler("<< J'abandonne... >>");
		}
		else {
			setForce(getForce() - coup);
			parler("<< Aie ! >>");
		}
	}
}
