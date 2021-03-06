package spaceinvadersiv;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import javax.swing.JButton;

public class JFrameIV extends javax.swing.JFrame {

    public static final double STEP = 20.0;
    public static final double TANK_XMIN = 8.0;
    public static final double TANK_XMAX = 568.0;
    public static final double ALIEN_XMIN = TANK_XMIN;
    public static final double ALIEN_XMAX = TANK_XMAX;
    public static final double ROCKET_YMIN = 270.0;
    public static final double ROCKET_YMAX = 8.0;
    

    // CollezioneElementi collEl;  da creare
   Missile missile;
    Tank tank;
    CollezioneElementi coll = new CollezioneElementi();

    public JFrameIV() {
        initComponents();

        setSize(800, 800);
        Missile missile = new Missile(270,100,jButtonMissile);
//       coll.add(new Alien(50, jButtonAlien1));
//        coll.add(new Alien(100, jButtonAlien2));
//        coll.add(new Alien(150, jButtonAlien3));
        tank = new Tank(jButtonTank);
        //coll.add(tank);

        List<Alien> alieni = new ArrayList<>();
        Alien alien1 = new Alien(50, jButtonAlien1);
        Alien alien2 = new Alien(100, jButtonAlien2);
        Alien alien3 = new Alien(150, jButtonAlien3);
        alieni.add(alien1);
        alieni.add(alien2);
        alieni.add(alien3);
        ThreadAlien ta = new ThreadAlien(jButtonAlien1, jButtonAlien2, jButtonAlien3);
        ThreadMissile tm = new ThreadMissile(jButtonMissile);
        ThreadTank tt = new ThreadTank(jButtonTank);

        var exe = Executors.newCachedThreadPool();
        exe.submit(new Runnable() {
            @Override
            public void run() {
                exe.execute(ta);
                exe.execute(tm);
                exe.execute(tt);

                ta.run();
                tm.run();
                tt.run();
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonLeft = new javax.swing.JButton();
        jButtonFire = new javax.swing.JButton();
        jButtonRight = new javax.swing.JButton();
        jButtonTank = new javax.swing.JButton();
        jButtonMissile = new javax.swing.JButton();
        jButtonAlien1 = new javax.swing.JButton();
        jButtonAlien2 = new javax.swing.JButton();
        jButtonAlien3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonLeft.setText("<<");
        jButtonLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLeftActionPerformed(evt);
            }
        });

        jButtonFire.setText("fire");
        jButtonFire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFireActionPerformed(evt);
            }
        });

        jButtonRight.setText(">>");
        jButtonRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRightActionPerformed(evt);
            }
        });

        jButtonTank.setIcon(new javax.swing.ImageIcon("C:\\Users\\utente\\Documents\\GitHub\\spaceInvadersQuattro\\spaceInvadersIV\\src\\spaceinvadersiv\\photo_2021-04-09_15-44-25.jpg")); // NOI18N
        jButtonTank.setText("Tank");
        jButtonTank.setMaximumSize(new java.awt.Dimension(52, 51));
        jButtonTank.setMinimumSize(new java.awt.Dimension(52, 51));
        jButtonTank.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTankActionPerformed(evt);
            }
        });

        jButtonMissile.setIcon(new javax.swing.ImageIcon("C:\\Users\\utente\\Documents\\GitHub\\spaceInvadersQuattro\\spaceInvadersIV\\src\\spaceinvadersiv\\missile.png")); // NOI18N
        jButtonMissile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMissileActionPerformed(evt);
            }
        });

        jButtonAlien1.setIcon(new javax.swing.ImageIcon("C:\\Users\\utente\\Documents\\GitHub\\spaceInvadersQuattro\\spaceInvadersIV\\src\\spaceinvadersiv\\allien.png")); // NOI18N
        jButtonAlien1.setText("alien1");
        jButtonAlien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlien1ActionPerformed(evt);
            }
        });

        jButtonAlien2.setIcon(new javax.swing.ImageIcon("C:\\Users\\utente\\Documents\\GitHub\\spaceInvadersQuattro\\spaceInvadersIV\\src\\spaceinvadersiv\\allien.png")); // NOI18N
        jButtonAlien2.setText("alien2");

        jButtonAlien3.setIcon(new javax.swing.ImageIcon("C:\\Users\\utente\\Documents\\GitHub\\spaceInvadersQuattro\\spaceInvadersIV\\src\\spaceinvadersiv\\allien.png")); // NOI18N
        jButtonAlien3.setText("alien3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jButtonMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(jButtonTank, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonAlien2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAlien1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAlien3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonFire, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRight, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(443, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButtonAlien1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAlien2)
                .addGap(18, 18, 18)
                .addComponent(jButtonAlien3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonMissile)
                .addGap(151, 151, 151)
                .addComponent(jButtonTank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLeft)
                    .addComponent(jButtonFire)
                    .addComponent(jButtonRight))
                .addGap(141, 141, 141))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonTankActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTankActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTankActionPerformed

    private void jButtonLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLeftActionPerformed
        // tank.setTargetX(tank.getTargetX() - STEP);
        if (tank.getX() > 28.0) {
            tank.setX(tank.getX() - 20.0);
        } else {
            tank.setX(tank.getX());
        }


    }//GEN-LAST:event_jButtonLeftActionPerformed

    private void jButtonRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRightActionPerformed
        //tank.setTargetX(tank.getTargetX() + STEP);
        if (tank.getX() < 548.0) {
            tank.setX(tank.getX() + 20.0);
        } else {
            tank.setX(tank.getX());
    }//GEN-LAST:event_jButtonRightActionPerformed
    }
    private void jButtonMissileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMissileActionPerformed


    }//GEN-LAST:event_jButtonMissileActionPerformed

    private void jButtonAlien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlien1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAlien1ActionPerformed

    private void jButtonFireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFireActionPerformed
     missile.move();
        // if (missile != null && !missile.getButton().isVisible()) {
            //coll.remove(missile);
          //  missile = new Missile(tank.getX(), jButtonMissile);
           // coll.add(missile);
           // missile = new Missile(260.0, 100.0,jButtonMissile);
           
       // } else if (missile == null) {
          // JButton jButtonMissile = null;
           // missile = new Missile(tank.getX(), jButtonMissile);
          //  coll.add(missile);
         //   missile = new Missile(150.0,260.0, jButtonMissile);
        

    }//GEN-LAST:event_jButtonFireActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameIV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameIV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameIV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameIV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameIV().setVisible(true);
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
