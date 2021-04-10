package spaceinvadersiv;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Collezione thread-safe.
 *
 * Tutti i metodi sono sincronizzati Le cancellazioni avvengono tramite remove
 * dell'iteratore
 */
public class CollezioneElementi {

    private ArrayList<ElementoDiGioco> listaElementiGioco = new ArrayList<>();

    public synchronized ElementoDiGioco get(int i) {
        return listaElementiGioco.get(i);
    }

    public synchronized void add(ElementoDiGioco e) {
        listaElementiGioco.add(e);
    }

    public synchronized void remove(ElementoDiGioco e) {
        listaElementiGioco.remove(e);
    }

    public synchronized int size() {
        return listaElementiGioco.size();
    }

    /**
     * Elimina i missili ormai usciti dallo schermo. Chiamato dal thread di
     * housekeeping
     */
    public synchronized void removeMissile() {
        Iterator<ElementoDiGioco> iter = listaElementiGioco.iterator();
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
     * Metodo per la gestione del moto di tutti gli elementi. Chiamato dal
     * SingleThread
     */
    public synchronized void manageElement() {
        listaElementiGioco.stream().forEach(e -> {
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
