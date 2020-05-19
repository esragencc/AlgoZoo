/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoZoo.game;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.*;

/**
 *
 * @author Ayberk, Görkem
 */
public class CodeView extends javax.swing.JPanel implements IAlgoZooView {
   // properties
   ArrayList<JLabel> jlabels;
   int updated;
   
   // constructor
   public CodeView() {
      initComponents();
      jlabels = new ArrayList<>();
      updated = 0;
   }
   
   // methods
   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      setOpaque(false);
      setLayout(null);
   }// </editor-fold>//GEN-END:initComponents

   @Override
   /**
    * 
    */
   public void updateView(AlgoZooModel azm) {
      /*
      Iterator itr = azm.getMovementPattern().iterator();

      while (itr.hasNext()) {
         if ((char) itr.next() == 'w') {
            jlabels.add(new JLabel());
            //jlabels.get(jlabels.size() - 1).setIcon(icon);
            //jlabels.get(jlabels.size() - 1).setBounds(x,y,100,50);
         } 
         else if ((char) itr.next() == 'a') {
            jlabels.add(new JLabel());
            //jlabels.get(jlabels.size() - 1).setIcon(icon);
            //jlabels.get(jlabels.size() - 1).setBounds(x,y,100,50);
         } 
         else if ((char) itr.next() == 's') {
            jlabels.add(new JLabel());
            //jlabels.get(jlabels.size() - 1).setIcon(icon);
            //jlabels.get(jlabels.size() - 1).setBounds(x,y,100,50);
         } 
         else if ((char) itr.next() == 'd') {
            jlabels.add(new JLabel());
            //jlabels.get(jlabels.size() - 1).setIcon(icon);
            //jlabels.get(jlabels.size() - 1).setBounds(x,y,100,50);
         }
      }*/
      if ( azm.getMovementPattern().isEmpty()) {
         jlabels.removeAll(jlabels);
         this.removeAll();
         this.repaint();
         updated = 0;
      }
      else {
         for ( int i = updated; i < azm.getMovementPattern().size(); i++) {
            if ( azm.getMovementPattern().get(i).equals('w')) {
               jlabels.add(new JLabel());
               add(jlabels.get(jlabels.size() - 1));
               jlabels.get(jlabels.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Up_Button.png")));
               if ( jlabels.size() >= 2) {
                  jlabels.get(jlabels.size() -1).setBounds(82, jlabels.get(jlabels.size()-2).getHeight() + jlabels.get(jlabels.size()-2).getY() + 10, 36, 50);
               }
               else {
                  jlabels.get(jlabels.size() - 1).setBounds(82,20,36,50);
               }
               updated++;
            }
            else if ( azm.getMovementPattern().get(i).equals('a')) {
               jlabels.add(new JLabel());
               add(jlabels.get(jlabels.size() - 1));
               jlabels.get(jlabels.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Left_Button.png")));
               if ( jlabels.size() >= 2) {
                  jlabels.get(jlabels.size() -1).setBounds(75, jlabels.get(jlabels.size()-2).getHeight() + jlabels.get(jlabels.size()-2).getY() + 10, 50, 36);
               }
               else {
                  jlabels.get(jlabels.size() - 1).setBounds(75,20,50,36);
               }
               updated++;
            }
            else if ( azm.getMovementPattern().get(i).equals('s')) {
               jlabels.add(new JLabel());
               add(jlabels.get(jlabels.size() - 1));
               jlabels.get(jlabels.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Down_Button.png")));
               if ( jlabels.size() >= 2) {
                  jlabels.get(jlabels.size() -1).setBounds(82, jlabels.get(jlabels.size()-2).getHeight() + jlabels.get(jlabels.size()-2).getY() + 10, 36, 50);
               }
               else {
                  jlabels.get(jlabels.size() - 1).setBounds(82,20,36,50);
               }
               updated++;
            }
            else if ( azm.getMovementPattern().get(i).equals('d')) {
               jlabels.add(new JLabel());
               add(jlabels.get(jlabels.size() - 1));
               jlabels.get(jlabels.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Right_Button.png")));
               if ( jlabels.size() >= 2) {
                  jlabels.get(jlabels.size() -1).setBounds(75, jlabels.get(jlabels.size()-2).getHeight() + jlabels.get(jlabels.size()-2).getY() + 10, 50, 36);
               }
               else {
                  jlabels.get(jlabels.size() - 1).setBounds(75,20,50,36);
               }
               updated++;
            }
            else if (azm.getMovementPattern().get(i).equals('f')) {
               jlabels.add(new JLabel());
               add(jlabels.get(jlabels.size() - 1));
               jlabels.get(jlabels.size() - 1).setIcon(new ImageIcon(getClass().getResource("/algoZoo/Icons/Buttons/Flower.png")));
               if ( jlabels.size() >= 2) {
                  jlabels.get(jlabels.size() -1).setBounds(76, jlabels.get(jlabels.size()-2).getHeight() + jlabels.get(jlabels.size()-2).getY() + 10, 48, 60);
               }
               else {
                  jlabels.get(jlabels.size() - 1).setBounds(76,20,48,60);
               }
               updated++;
               
            }
            
         }
      }
      
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   // End of variables declaration//GEN-END:variables
}
