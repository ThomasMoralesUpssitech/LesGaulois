package personnages;

public class Romain extends Personnages {
	
	public Romain(String nom, int force) {
		super(nom, force);
	}

	@Override
	protected String donnerAuteur() {
		return "romain";
	}
}
