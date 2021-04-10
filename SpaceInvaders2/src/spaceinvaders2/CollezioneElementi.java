
package spaceinvaders2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alber
 */
public class CollezioneElementi {
      private ArrayList<ElementiDiGioco> lista = new ArrayList<>();

    public synchronized ElementiDiGioco get(int i) {
        return lista.get(i);
    }

    public synchronized void add(ElementiDiGioco e) {
        lista.add(e);
    }

    public synchronized void remove(ElementiDiGioco e) {
        lista.remove(e);
    }

    public synchronized int size() {
        return lista.size();
    }

    /**
     * Elimina i missili ormai usciti dallo schermo.
     * Chiamato dal thread di housekeeping
     */
    public synchronized void removeMissile() {
        Iterator<ElementiDiGioco> iter = lista.iterator();
        while (iter.hasNext()) {
            ElementiDiGioco p = iter.next();
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

    
