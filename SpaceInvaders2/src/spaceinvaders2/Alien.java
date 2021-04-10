package spaceinvaders2;

import javax.swing.JButton;

public class Alien extends ElementiDiGioco{

    public Alien(JButton b, double y) {
        setButton(b);
        setY(y);
        setTargetX(JFrame01.ALIEN_XMAX);
        setTargetY(y);
        setX(JFrame01.ALIEN_XMIN);
        setStepX(1);
        setStepY(0);

    }
}
