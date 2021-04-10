package spaceinvadersiv;

import javax.swing.JButton;

public class ThreadTank implements Runnable {

    private Tank tank;
    public static final long TIMEOUT = 10;

    public ThreadTank(JButton jBT) {
        tank = new Tank(jBT);
    }

    @Override
    public void run() {
        tank.move();
    }
}
