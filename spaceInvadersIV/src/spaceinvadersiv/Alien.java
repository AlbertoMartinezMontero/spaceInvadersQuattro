package spaceinvadersiv;

import javax.swing.JButton;

public class Alien extends ElementoDiGioco {



    public Alien(double y, JButton b) {
        setButton(b);
        setY(y);
        setTargetX(JFrameIV.ALIEN_XMAX);
        setTargetY(y);
        setX(JFrameIV.ALIEN_XMIN);
        setStepX(1);
        setStepY(0);
    }

    @Override
    public void raggiuntoTarget() {
         System.out.println("Raggiunto target");
        // se ho raggiunto il target lato dx
        if (getX() == JFrameIV.ALIEN_XMAX) {
            // cambio il target a sx
            setTargetX(JFrameIV.ALIEN_XMIN);
        } else {
            // ... viceversa
            setTargetX(JFrameIV.ALIEN_XMAX);
        }
        // inverto lo step (i.e. rimbalzo)
        setStepX(-getStepX());
    }

    @Override
    public void move() {
        // mi muovo
        setX(getX() + getStepX());
        setY(getY() + getStepY());
    }

}
