package personnages;

public abstract class Personnages {
	private String nom;
	private int force;
	private String classe;
	
	public Personnages(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public Personnages(String classe, String nom, int force) {
		this.nom = nom;
		this.force = force;
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
	
	public void parler(String texte) {
		System.out.println("Le " + donnerAuteur() + " " + nom + " : " + texte);
	}
	
	protected abstract String donnerAuteur();
	
	public void frapper(Personnages adversaire) {
		System.out.println("Le " + donnerAuteur() + " " + getNom() + " donne un grand coup de force " + getForce()/3 + " au " + adversaire.donnerAuteur() + " " + adversaire.getNom());
		adversaire.recevoirCoup(force/3);
	}
	
	public void recevoirCoup(int coup) {
		if(coup >= force) {
			force = 0;
			parler("J'abandonne...");
		}
		else {
			force = force - coup;
			parler("Aie !");
		}
	}
	
	public boolean estATerre() {
        return force <= 0;
    }
}
