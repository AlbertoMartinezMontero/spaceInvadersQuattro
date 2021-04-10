/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders2;

import javax.swing.JButton;

/**
 *
 * @author alber
 */
public class Tank extends ElementiDiGioco {
public Tank(JButton b) {
        setButton(b);
        setX(JFrame01.TANK_XMIN);
        setY(JFrame01.MISSILE_YMIN);
        setTargetX(getX());
        setTargetY(getY());
        setStepX(2);
        setStepY(0);
    }

    @Override
    public void move() {
        // se devo andare a destra ...
        if (getTargetX() > getX()){
            // ... imposto step a +1
            setStepX(1);
        } else{
            // ... altrimenti a -1 (i.e. vado a sinistra)
            setStepX(-1);
        }
        // mi muovo
        setX(getX() + getStepX());
        setY(getY() + getStepY());
    }
    
}
