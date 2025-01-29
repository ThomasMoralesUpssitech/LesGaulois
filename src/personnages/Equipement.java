package personnages;

public enum Equipement {
	CASQUE(2),
    PLASTRON(3),
    BOUCLIER(3);

	private int reduction;
	
	Equipement(int reduction) {
		this.reduction = reduction;
	}
	
	public int getReduction() {
		return reduction;
	}
}
