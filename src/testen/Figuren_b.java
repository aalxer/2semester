package testen;
import java.util.ArrayList;

public class Figuren_b implements bewegung{
    ArrayList<Figur> Figuren_black = new ArrayList<>();

    public Figuren_b() {
        Figuren_black.add(new Figur("turm_links","im Spiel",'w',1,8));
        Figuren_black.add(new Figur("springer_links","im Spiel",'w',2,8));
        Figuren_black.add(new Figur("laefer_links","im Spiel",'w',3,8));
        Figuren_black.add(new Figur("koenig","im Spiel",'w',4,8));
        Figuren_black.add(new Figur("dame","im Spiel",'w',5,8));
        Figuren_black.add(new Figur("laefer_rechts","im Spiel",'w',6,8));
        Figuren_black.add(new Figur("springer_rechts","im Spiel",'w',7,8));
        Figuren_black.add(new Figur("turm_rechts","im Spiel",'w',8,8));

        for(int i=1 ; i<8 ; i++) {
            Figuren_black.add(new Figur("bauer_"+i,"im Spiel",'w',i,7));
        }

        String res = "du hast 'Black' ausgewählt und bist der Spieler 2, deine " + this.Figuren_black.size() + " Figuren sind bereit !" + "\n";
        System.out.print(res);
    }

    public void bewegung(String name_input,int x_input, int y_input) {
        for(Figur figur:this.Figuren_black) {
            if(figur.getName().equals(name_input)) {
                int new_x = figur.getX() + x_input;
                int new_y = figur.getY() - y_input;

                figur.setX(new_x);
                figur.setY(new_y);

                String res = "Bewegung für Spiler 2" + "\n" + "Dein " + name_input + " befindet sich jetzt in: " + new_x + " x-Richtung, " + new_y + " y-Richtung."+ "\n";
                System.out.print(res);
            }
        }
    }

    public void output() {
        System.out.println("Hallo!");
    }
}
