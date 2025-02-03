package test_fonctionnel;

import java.util.ArrayList;
import java.util.List;

import batailles.Bataille;
import batailles.Conteur;
import personnages.Personnages;
import personnages.Gaulois;
import personnages.Soldat;

public class TestBataille {
	public static void main(String[] args) {
        Conteur conteur = new Conteur();

        Gaulois asterix = new Gaulois("Astérix", 5);
        Gaulois obelix = new Gaulois("Obélix", 15);
        Soldat minus = new Soldat("Soldat", "Minus", 6);
        
        List<Personnages> attaquants = new ArrayList<>();
        attaquants.add(asterix);
        attaquants.add(obelix);

        List<Personnages> defenseurs = new ArrayList<>();
        defenseurs.add(minus);
        
        Bataille bataille = new Bataille("Astérix et Obélix croise un romain", attaquants, defenseurs);

        conteur.conterBataille(bataille);
    }
}
