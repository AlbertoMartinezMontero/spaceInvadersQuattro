package spaceinvadersiv;

import javax.swing.JButton;

public class Missile extends ElementoDiGioco {
    
    public Missile(double x, JButton b) {
        setButton(b);
        getButton().setVisible(true);
        setX(x);
        setButton(b);
        setTargetY(JFrameIV.ROCKET_YMAX);
        setTargetX(x);
        setY(JFrameIV.ROCKET_YMIN);
        setStepX(0);
        setStepY(-2);
    }

}
