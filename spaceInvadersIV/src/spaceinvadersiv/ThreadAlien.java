package spaceinvadersiv;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

public class ThreadAlien implements Runnable {

    public static final long TIMEOUT = 10;

    private CollezioneElementi coll = new CollezioneElementi();
    
   
    
    private ArrayList<ElementoDiGioco> lista = new ArrayList<>();
    //Inizzializare collezione alieni.  
    private List<Alien> listaAlieni = new ArrayList<>();
    Alien alien1;
    Alien alien2;
    Alien alien3;

    public ThreadAlien(JButton jBA1, JButton jBA2, JButton jBA3) {
        this.alien1 = alien1 = new Alien(50.0, jBA1);
         listaAlieni.add(alien1);
        //coll.add(alien1);
        this.alien2 = alien2 = new Alien(100.0, jBA2);
        listaAlieni.add(alien2);
        //coll.add(alien2);
        this.alien3 = new Alien(150.0, jBA3);
        listaAlieni.add(alien3);  
        //coll.add(alien3);
       
    }

    @Override
    public void run() {

        while (true) {

            //per ogni alieno chiamo il suo metodo move()
            listaAlieni.forEach(alien -> {
                alien.move();
            });
                //aspetto ms
                try {
                    Thread.sleep(TIMEOUT);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }
    }

