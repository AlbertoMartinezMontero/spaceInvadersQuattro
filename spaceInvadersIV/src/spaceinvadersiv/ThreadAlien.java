package spaceinvadersiv;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

public class ThreadAlien implements Runnable {

    public static final long TIMEOUT = 10;
    //Inizzializare collezione alieni. 
    private List<Alien> listaAlieni = new ArrayList<>();
    Alien alien1;
    Alien alien2;
    Alien alien3;

    public ThreadAlien(JButton jBA1, JButton jBA2, JButton jBA3) {
        alien1 = new Alien(TIMEOUT, jBA1);
        listaAlieni.add(alien1);
        alien2 = new Alien(TIMEOUT, jBA2);
        listaAlieni.add(alien2);
        alien1 = new Alien(TIMEOUT, jBA3);
        listaAlieni.add(alien3);

    }

    @Override
    public void run() {

        while (true) {

            //per ogni alieno chiamo il suo metodo move()
            for (Alien alien: listaAlieni){
                alien.move();
            }
                    //aspetto ms
                     try {
                Thread.sleep(TIMEOUT);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}
