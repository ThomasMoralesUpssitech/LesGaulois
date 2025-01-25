package personnages;

public class Soldat extends Personnages {
	public Soldat(String classe, String nom, int force) {
		super(classe, nom, force);
	}

	@Override
	
	protected String donnerAuteur() {
		return getClasse();
	}
}
