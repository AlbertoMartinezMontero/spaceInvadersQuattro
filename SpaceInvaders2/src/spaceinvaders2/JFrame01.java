
package spaceinvaders2;
import java.awt.Point;
/**
 *
 * @author alber
 */
public class JFrame01 extends javax.swing.JFrame {
    public static final double STEP = 20.0;
    public static final double TANK_XMIN = 8.0;
    public static final double TANK_XMAX = 568.0;
    public static final double ALIEN_XMIN = TANK_XMIN;
    public static final double ALIEN_XMAX = TANK_XMAX;
    public static final double MISSILE_YMIN = 270.0;
    public static final double MISSILE_YMAX = 8.0;

    CollezioneElementi coll;
    Missile rocket;
    Tank tank;
    /**
     * Creates new form JFrame01
     */
    public JFrame01() {
        initComponents();
        setSize(800, 600);
        coll = new CollezioneElementi();
        coll.new Alien(jButtonAlien1, 50));
        coll.add(new Alien(jButtonAlien2,100));
        coll.add(new Alien( jButtonAlien3, 150));
        tank = new Tank(jButtonTank);
        coll.add(tank);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAlien3 = new javax.swing.JButton();
        jButtonAlien2 = new javax.swing.JButton();
        jButtonAlien1 = new javax.swing.JButton();
        jButtonMissile = new javax.swing.JButton();
        jButtonTank = new javax.swing.JButton();
        jButtonFire = new javax.swing.JButton();
        jButtonRight = new javax.swing.JButton();
        jButtonLeft = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAlien3.setIcon(new javax.swing.ImageIcon("C:\\Users\\alber\\Documents\\jarvis\\insieme\\spaceInvadersQuattro\\allien.png")); // NOI18N

        jButtonAlien2.setIcon(new javax.swing.ImageIcon("C:\\Users\\alber\\Documents\\jarvis\\insieme\\spaceInvadersQuattro\\allien.png")); // NOI18N

        jButtonAlien1.setIcon(new javax.swing.ImageIcon("C:\\Users\\alber\\Documents\\jarvis\\insieme\\spaceInvadersQuattro\\allien.png")); // NOI18N

        jButtonMissile.setIcon(new javax.swing.ImageIcon("C:\\Users\\alber\\Documents\\jarvis\\insieme\\spaceInvadersQuattro\\missile.png")); // NOI18N

        jButtonTank.setIcon(new javax.swing.ImageIcon("C:\\Users\\alber\\Documents\\jarvis\\insieme\\spaceInvadersQuattro\\tank.png")); // NOI18N

        jButtonFire.setText("fire");

        jButtonRight.setText(">>");

        jButtonLeft.setText("<<");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAlien3)
                            .addComponent(jButtonAlien2)
                            .addComponent(jButtonAlien1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButtonLeft)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonTank)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonRight)
                                .addGap(35, 35, 35)
                                .addComponent(jButtonFire))
                            .addComponent(jButtonMissile))))
                .addContainerGap(585, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAlien3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAlien2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAlien1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addComponent(jButtonMissile)
                .addGap(48, 48, 48)
                .addComponent(jButtonTank)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLeft)
                    .addComponent(jButtonRight)
                    .addComponent(jButtonFire))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlien1;
    private javax.swing.JButton jButtonAlien2;
    private javax.swing.JButton jButtonAlien3;
    private javax.swing.JButton jButtonFire;
    private javax.swing.JButton jButtonLeft;
    private javax.swing.JButton jButtonMissile;
    private javax.swing.JButton jButtonRight;
    private javax.swing.JButton jButtonTank;
    // End of variables declaration//GEN-END:variables
}
