package batailles;

public class Conteur {

    public Conteur() {
    }

    public void conterBataille(Bataille bataille) {
        System.out.println("Le conteur raconte une nouvelle bataille !");
        bataille.decrireContexte();
        bataille.decrireCombattants();
        bataille.preparerCombat();
        bataille.decrireCombat();
        bataille.donnerResultat();
    }
}
