package spaceinvadersiv;

import javax.swing.JButton;

public class ThreadTank implements Runnable {

    private Tank tank;
    public static final long TIMEOUT = 10;

    private CollezioneElementi coll;

    public ThreadTank(JButton jBT) {
        tank = new Tank(jBT);
        //coll.add(tank);
    }

    @Override
    public void run() {
        while (true) {
            //coll.manageElement();

            try {
                Thread.sleep(TIMEOUT);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        //tank.move();

    }
}
