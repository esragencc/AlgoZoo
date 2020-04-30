/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.menus;

import javax.swing.JFrame;

/**
 *
 * @author Ayberk
 */
public class MenuScreen extends javax.swing.JFrame {

   /**
    * Creates new form WelcomeScreen
    */    
   public MenuScreen() {
      setUndecorated(true);
      initComponents();
      setExtendedState(JFrame.MAXIMIZED_BOTH);
      modeScreen.setVisible(false);
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeScreen = new javax.swing.JPanel();
        exitButton = new javax.swing.JLabel();
        playButton = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        modeScreen = new javax.swing.JPanel();
        testButton = new javax.swing.JLabel();
        learnButton = new javax.swing.JLabel();
        challengeButton = new javax.swing.JLabel();
        infoButton = new javax.swing.JLabel();
        returnButton = new javax.swing.JLabel();
        background2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        welcomeScreen.setPreferredSize(new java.awt.Dimension(1920, 1080));
        welcomeScreen.setLayout(null);

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Exit_Button.png"))); // NOI18N
        exitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitButtonMouseExited(evt);
            }
        });
        welcomeScreen.add(exitButton);
        exitButton.setBounds(790, 690, 330, 100);

        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Play_Button.png"))); // NOI18N
        playButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                playButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                playButtonMouseExited(evt);
            }
        });
        welcomeScreen.add(playButton);
        playButton.setBounds(790, 520, 330, 100);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Backgrounds/Welcome_Screen_Background.png"))); // NOI18N
        welcomeScreen.add(background);
        background.setBounds(0, 0, 1920, 1080);

        getContentPane().add(welcomeScreen);
        welcomeScreen.setBounds(0, 0, 1920, 1080);

        modeScreen.setLayout(null);

        testButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Test_Button.png"))); // NOI18N
        testButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        testButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                testButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                testButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                testButtonMouseExited(evt);
            }
        });
        modeScreen.add(testButton);
        testButton.setBounds(800, 760, 330, 100);

        learnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Learn_Button.png"))); // NOI18N
        learnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        learnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                learnButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                learnButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                learnButtonMouseExited(evt);
            }
        });
        modeScreen.add(learnButton);
        learnButton.setBounds(800, 420, 330, 100);

        challengeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Challenge_Button.png"))); // NOI18N
        challengeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        challengeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                challengeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                challengeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                challengeButtonMouseExited(evt);
            }
        });
        modeScreen.add(challengeButton);
        challengeButton.setBounds(800, 590, 330, 100);

        infoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Info_Button.png"))); // NOI18N
        infoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        modeScreen.add(infoButton);
        infoButton.setBounds(1830, 1000, 80, 70);

        returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Return_Button.png"))); // NOI18N
        returnButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        returnButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnButtonMouseExited(evt);
            }
        });
        modeScreen.add(returnButton);
        returnButton.setBounds(20, 990, 110, 80);

        background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Backgrounds/Mode_Screen_Background.png"))); // NOI18N
        modeScreen.add(background2);
        background2.setBounds(0, 0, 1920, 1080);

        getContentPane().add(modeScreen);
        modeScreen.setBounds(0, 0, 1920, 1080);

        pack();
    }// </editor-fold>//GEN-END:initComponents

   private void playButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseEntered
      playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Play_Button_Clicked.png")));
   }//GEN-LAST:event_playButtonMouseEntered

   private void playButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseExited
      playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Play_Button.png")));
   }//GEN-LAST:event_playButtonMouseExited

   private void playButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseClicked
      welcomeScreen.setVisible(false);
      modeScreen.setVisible(true);
   }//GEN-LAST:event_playButtonMouseClicked

   private void exitButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseEntered
      exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Exit_Button_Clicked.png")));
   }//GEN-LAST:event_exitButtonMouseEntered

   private void exitButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseExited
      exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Exit_Button.png")));
   }//GEN-LAST:event_exitButtonMouseExited

   private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
      System.exit(0);
   }//GEN-LAST:event_exitButtonMouseClicked

   private void testButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testButtonMouseClicked
      // TODO add your handling code here:
   }//GEN-LAST:event_testButtonMouseClicked

   private void testButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testButtonMouseEntered
      testButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Test_Button_Clicked.png")));
   }//GEN-LAST:event_testButtonMouseEntered

   private void testButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_testButtonMouseExited
      testButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Test_Button.png")));
   }//GEN-LAST:event_testButtonMouseExited

   private void learnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_learnButtonMouseClicked
      // TODO add your handling code here:
   }//GEN-LAST:event_learnButtonMouseClicked

   private void learnButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_learnButtonMouseEntered
      learnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Learn_Button_Clicked.png")));
   }//GEN-LAST:event_learnButtonMouseEntered

   private void learnButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_learnButtonMouseExited
      learnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Learn_Button.png")));
   }//GEN-LAST:event_learnButtonMouseExited

   private void challengeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_challengeButtonMouseClicked
      // TODO add your handling code here:
   }//GEN-LAST:event_challengeButtonMouseClicked

   private void challengeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_challengeButtonMouseEntered
      challengeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Challenge_Button_Clicked.png")));
   }//GEN-LAST:event_challengeButtonMouseEntered

   private void challengeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_challengeButtonMouseExited
      challengeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Challenge_Button.png")));
   }//GEN-LAST:event_challengeButtonMouseExited

   private void returnButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseClicked
      modeScreen.setVisible(false);
      welcomeScreen.setVisible(true);
   }//GEN-LAST:event_returnButtonMouseClicked

   private void returnButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseEntered
      returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Return_Button_Clicked.png")));
   }//GEN-LAST:event_returnButtonMouseEntered

   private void returnButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnButtonMouseExited
      returnButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Return_Button.png")));
   }//GEN-LAST:event_returnButtonMouseExited

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
         java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (InstantiationException ex) {
         java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (IllegalAccessException ex) {
         java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {
         java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      //</editor-fold>
      //</editor-fold>

      /* Create and display the form */
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new MenuScreen().setVisible(true);
         }
      });
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel background2;
    private javax.swing.JLabel challengeButton;
    private javax.swing.JLabel exitButton;
    private javax.swing.JLabel infoButton;
    private javax.swing.JLabel learnButton;
    private javax.swing.JPanel modeScreen;
    private javax.swing.JLabel playButton;
    private javax.swing.JLabel returnButton;
    private javax.swing.JLabel testButton;
    private javax.swing.JPanel welcomeScreen;
    // End of variables declaration//GEN-END:variables
}
