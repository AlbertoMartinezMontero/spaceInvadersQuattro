package spaceinvaders2;

import javax.swing.JButton;

public class Missile extends ElementiDiGioco {

    public Missile(double x, JButton b) {
        setButton(b);
        getButton().setVisible(true);
        setX(x);
        setButton(b);
        setTargetY(JFrame01.);
        setTargetX(x);
        setY(JFrame01.ROCKET_YMIN);
        setStepX(0);
        setStepY(-2);
    }

    @Override

    public void raggiuntoTarget() {
        System.out.println("Raggiunto target");
        // se sono arrivato alla quota più in alto
        if (getY() == JFrame01.ROCKET_YMAX) {
            // lo nasconde ...
            getButton().setVisible(false);

            // lo ferma
            setStepX(0);
            setStepY(0);
        } else {
            setTargetX(JFrame01.ROCKET_YMIN);
        }
    }
