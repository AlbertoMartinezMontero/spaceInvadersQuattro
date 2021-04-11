package spaceinvadersiv;

import javax.swing.JButton;

public class Tank extends ElementoDiGioco {
    public Tank(JButton b) {
        setButton(b);
        setX(JFrameIV.TANK_XMIN);
        setY(JFrameIV.ROCKET_YMIN);
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
            setStepX(10);
        } else{
            // ... altrimenti a -1 (i.e. vado a sinistra)
            setStepX(-10);
        }
        // mi muovo
        setX(getX() + getStepX());
        setY(getY() + getStepY());
    }
    
}
