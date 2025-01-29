package personnages;

public abstract class Personnages {
	private String nom;
	private int force;
	private String classe;
	
	public Personnages(String nom, int force) {
		this.nom = nom;
		this.setForce(force);
	}
	
	public Personnages(String classe, String nom, int force) {
		this.nom = nom;
		this.setForce(force);
		this.classe = classe;
	}
	
	public String getClasse() {
		return classe;
	}

	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}
	
	public void setForce(int force) {
		this.force = force;
	}

	public void parler(String texte) {
		System.out.println("Le " + donnerAuteur() + " " + nom + " : " + texte);
	}
	
	protected abstract String donnerAuteur();
	
	public void frapper(Personnages adversaire) {
		System.out.println("Le " + donnerAuteur() + " " + getNom() + " donne un grand coup de force " + getForce() + " au " + adversaire.donnerAuteur() + " " + adversaire.getNom());
		adversaire.recevoirCoup(getForce());
	}
	
	public void recevoirCoup(int coup) {
		if(coup >= getForce()) {
			setForce(0);
			parler("<< J'abandonne... >>");
		}
		else {
			setForce(getForce() - coup);
			parler("<< Aie ! >>");
		}
	}
	
	public boolean estATerre() {
        return getForce() <= 0;
    }
}
