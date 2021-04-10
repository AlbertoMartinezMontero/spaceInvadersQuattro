package spaceinvadersiv;

import java.util.ArrayList;
import java.util.Iterator;


public class CollezioneElemeniti {
    private ArrayList<ElementoDiGioco> listaElemento = new ArrayList<>();
    public synchronized ElementoDiGioco get(int i) {
        return listaElemento.get(i);
    }
     public synchronized void add(ElementoDiGioco e) {
        listaElemento.add(e);
    }
public synchronized void remove (ElementoDiGioco e){
    listaElemento.remove(e);
}
public synchronized int size() {
        return listaElemento.size();
    }
/**
     * Elimina i missili ormai usciti dallo schermo.
     * Chiamato dal thread di housekeeping
     */
public synchronized void removeMissile() {
        Iterator<ElementoDiGioco> iter = listaElemento.iterator();
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
        listaElemento.stream().forEach(e -> {
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



