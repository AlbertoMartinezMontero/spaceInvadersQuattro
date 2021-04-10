package spaceinvadersiv;

import javax.swing.JButton;

public class ThreadMissile implements Runnable {

    public static final long TIMEOUT = 2;

    //Inizzializiamo il missile
    Missile missile;

    public ThreadMissile(JButton jBM) {
        missile = new Missile(200.0, jBM);
    }

    @Override
    public void run() {

        while (true) {
            //Chiamiamo il metodo move() del missile
            missile.move();

            try {
                Thread.sleep(TIMEOUT);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
