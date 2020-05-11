/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.game;

import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author dogaersoy
 */
public class SelectionController extends javax.swing.JPanel {

   // properties
   AlgoZooModel azm;
   ArrayList<JButton> buttons;

   // constructors
   /**
    * Creates new form SelectionController
    */
   public SelectionController(AlgoZooModel azm) {
      this.azm = azm;
      buttons = new ArrayList<>();
      initComponents();
      addAllButtons();
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      upButton = new javax.swing.JButton();
      downButton = new javax.swing.JButton();
      rightButton = new javax.swing.JButton();
      leftButton = new javax.swing.JButton();
      resetButton = new javax.swing.JButton();
      jButton1 = new javax.swing.JButton();

      setBackground(new java.awt.Color(0, 255, 255));

      upButton.setText("UP");
      upButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            upButtonActionPerformed(evt);
         }
      });

      downButton.setText("DOWN");
      downButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            downButtonActionPerformed(evt);
         }
      });

      rightButton.setText("RIGHT");
      rightButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            rightButtonActionPerformed(evt);
         }
      });

      leftButton.setText("LEFT");
      leftButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            leftButtonActionPerformed(evt);
         }
      });

      resetButton.setText("RESET");
      resetButton.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            resetButtonActionPerformed(evt);
         }
      });

      jButton1.setText("PLAY");
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(42, 42, 42)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
               .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
               .addComponent(leftButton, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
               .addComponent(rightButton, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
               .addComponent(downButton, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
               .addComponent(upButton, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
               .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(51, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(31, 31, 31)
            .addComponent(upButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(downButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(31, 31, 31)
            .addComponent(rightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(37, 37, 37)
            .addComponent(leftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(53, 53, 53)
            .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(46, 46, 46)
            .addComponent(jButton1)
            .addContainerGap())
      );
   }// </editor-fold>//GEN-END:initComponents

    private void addAllButtons() {
      buttons.add(jButton1);
      buttons.add(downButton);
      buttons.add(leftButton);
      buttons.add(rightButton);
      buttons.add(upButton);
      buttons.add(resetButton);
      
    }
    
    private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upButtonActionPerformed
       azm.addMovementPattern('w');
    }//GEN-LAST:event_upButtonActionPerformed

    private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downButtonActionPerformed
       azm.addMovementPattern('s');
    }//GEN-LAST:event_downButtonActionPerformed

    private void rightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightButtonActionPerformed
       azm.addMovementPattern('d');
    }//GEN-LAST:event_rightButtonActionPerformed

    private void leftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftButtonActionPerformed
       azm.addMovementPattern('a');
    }//GEN-LAST:event_leftButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
       azm.initNewGame();
       for ( JButton b : buttons) {
          b.setEnabled(true);
       }
    }//GEN-LAST:event_resetButtonActionPerformed

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      azm.play();
      for ( JButton b : buttons) {
          b.setEnabled(false);
       }
      
   }//GEN-LAST:event_jButton1ActionPerformed

   public void resetSelectionController() {
       for ( JButton b : buttons) {
          b.setEnabled(true);
       }
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton downButton;
   private javax.swing.JButton jButton1;
   private javax.swing.JButton leftButton;
   private javax.swing.JButton resetButton;
   private javax.swing.JButton rightButton;
   private javax.swing.JButton upButton;
   // End of variables declaration//GEN-END:variables
}
