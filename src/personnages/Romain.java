package personnages;

public class Romain {
	private String nom;
	private int force;
	private String texte;
	
	public Romain(String nom, int force) {
		this.nom=nom;
		this.force=force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println("Le romain " + nom + " : " + texte);
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
}
