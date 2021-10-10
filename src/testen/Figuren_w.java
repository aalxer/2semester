package testen;
import java.util.ArrayList;

public class Figuren_w implements bewegung{
    ArrayList<Figur> Figuren_white = new ArrayList<>();

    public Figuren_w() {
        Figuren_white.add(new Figur("turm_links","im Spiel",'w',1,1));
        Figuren_white.add(new Figur("springer_links","im Spiel",'w',2,1));
        Figuren_white.add(new Figur("laefer_links","im Spiel",'w',3,1));
        Figuren_white.add(new Figur("koenig","im Spiel",'w',4,1));
        Figuren_white.add(new Figur("dame","im Spiel",'w',5,1));
        Figuren_white.add(new Figur("laefer_rechts","im Spiel",'w',6,1));
        Figuren_white.add(new Figur("springer_rechts","im Spiel",'w',7,1));
        Figuren_white.add(new Figur("turm_rechts","im Spiel",'w',8,1));

        for(int i=1 ; i<8 ; i++) {
            Figuren_white.add(new Figur("bauer_"+i,"im Spiel",'w',i,2));
        }

        String res = "du hast 'White' ausgewählt und bist der Spieler 1, deine " + this.Figuren_white.size() + " Figuren sind bereit !" + "\n";
        System.out.print(res);
    }

    public void bewegung(String name_input,int x_input, int y_input) {
        for(Figur figur:this.Figuren_white) {
            if(figur.getName().equals(name_input)) {
                int new_x = figur.getX() + x_input;
                int new_y = figur.getY() + y_input;

                figur.setX(new_x);
                figur.setY(new_y);

                String res = "Bewegung für Spiler 1" + "\n" + "Dein " + name_input + " befindet sich jetzt in: " + new_x + " x-Richtung, " + new_y + " y-Richtung." + "\n";
                System.out.print(res);
            }
        }
    }
}
