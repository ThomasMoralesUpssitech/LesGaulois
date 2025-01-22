package personnages;

public class Gaulois extends Personnages{
	
	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	@Override
	
	protected String donnerAuteur() {
		return "gaulois";
	}
}
