package spaceinvadersiv;

import javax.swing.JButton;

public class Missile extends ElementoDiGioco {

    public Missile(double y,double x, JButton b) {
        setButton(b);
           setX(8);
        setButton(b);
        setTargetY(JFrameIV.ROCKET_YMAX);
        setTargetX(x);
        setY(260.0);
        setStepX(0);
        setStepY(-2);
    }
    
    
    public Missile(double x, JButton b) {
        setButton(b);
       // getButton().setVisible(true);
        setX(x);
        setButton(b);
        setTargetY(JFrameIV.ROCKET_YMAX);
        setTargetX(x);
        setY(JFrameIV.ROCKET_YMIN);
        setStepX(0);
        setStepY(-2);
    }
 @Override
    public void raggiuntoTarget() {
        System.out.println("Raggiunto target");
        // se sono arrivato alla quota più in alto
        if (getY() == JFrameIV.ROCKET_YMAX) {
            // lo nasconde ...
            
           // getButton().setVisible(false);
            setY(JFrameIV.ROCKET_YMIN);
            
            // lo ferma
            setStepX(0);
            setStepY(0);
        } else {
          //  setTargetX(JFrameIV.ROCKET_YMIN);
        }
    }
}
