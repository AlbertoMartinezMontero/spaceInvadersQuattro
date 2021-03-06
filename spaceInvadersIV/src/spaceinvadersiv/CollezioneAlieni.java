package spaceinvadersiv;

import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;


public class CollezioneAlieni {
    private ArrayList<Alien> alieni = new ArrayList<>();
      private ArrayList<ElementoDiGioco> lista = new ArrayList<>();

    public synchronized ElementoDiGioco get(int i) {
        return lista.get(i);
    }

    public synchronized void add(ElementoDiGioco e) {
        lista.add(e);
    }

    public synchronized void remove(ElementoDiGioco e) {
        lista.remove(e);
    }

    public synchronized int size() {
        return lista.size();
    }

    /**
     * Elimina i missili ormai usciti dallo schermo.
     * Chiamato dal thread di housekeeping
     */
    public synchronized void removeRockets() {
        Iterator<ElementoDiGioco> iter = lista.iterator();
        while (iter.hasNext()) {
            ElementoDiGioco p = iter.next();
            if (p instanceof Missile && !p.getButton().isVisible()) {
                System.out.println("p = " + p);
                // si noti l'uso del remove di iterator invece che della lista
                iter.remove();
                System.out.println("Rimosso " + p);
            }
        }
    }

    /**
     * Metodo per la gestione del moto di tutti gli elementi.
     * Chiamato dal SingleThread
     */
    public synchronized void manageElement() {
        lista.stream().forEach(e -> {
            if (e.hasToMove()) {
                e.move();
            } else {
                e.raggiuntoTarget();
                if (e.hasToMove()) {
                    e.move();
                }
            }
        });
    }
}

    

