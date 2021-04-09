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
    public void raggiuntoTarget(){}
    
    
    @Override
     public void move() {
        // mi muovo
        setX(getX() + getStepX());
        setY(getY() + getStepY());
    }
    
}

