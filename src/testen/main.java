package testen;

public class main {
    public static void main(String[] args) {

        //in diesem Fall kann mein Spieler nur die Funktion bewegung aus der Klasse benutzen, weil unser Interface nur die Bwegung ermöglicht
        bewegung spieler1 = new Figuren_w();
        bewegung spieler2 = new Figuren_b();
        //Ohne interface:
        //Figuren_b spieler2 = new Figuren_b();

        spieler1.bewegung("turm_links", 3, 4);
        spieler2.bewegung("springer_rechts", 3, 5);
        spieler1.bewegung("turm_links", 5, 1);
    }
}
