package personnages;

import java.util.EnumSet;

public class Soldat extends Personnages {
	private EnumSet<Equipement> equipements;
	
	public Soldat(String classe, String nom, int force) {
		super(classe, nom, force);
		this.equipements = EnumSet.noneOf(Equipement.class);
	}

	@Override
	protected String donnerAuteur() {
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
		int reduction = equipements.stream().mapToInt(Equipement::getReduction).sum();
		equipements.forEach(e -> System.out.println("Le " + e.name().toLowerCase() + " absorbe " + e.getReduction() + " du coup"));
		coup = coup - reduction;
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
