/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paket;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class PuzzleGame extends javax.swing.JFrame {
    Integer[] array;
  
    public PuzzleGame() {
        do{
            array = createShuffleArray();
        }while(!isSolvable());
        initComponents();
    }
    
    Integer[] createShuffleArray(){
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

		List<Integer> intList = Arrays.asList(intArray);

		Collections.shuffle(intList);

		intList.toArray(intArray);
                return intArray;
        }
    boolean isSolvable(){
        int countInversions = 0;
        
        for(int i = 0; i < 15; i++)
            for(int j = 0; j < i; j++)
            {
                if(array[j] > array[i])
                    countInversions++;
            }
        return countInversions % 2 == 0;
    }
    void checkWin(){
        if(jButton1.getText().equals("1") && jButton2.getText().equals("2") && jButton3.getText().equals("3")
                && jButton4.getText().equals("4") && jButton5.getText().equals("5") && jButton6.getText().equals("6")
                 && jButton7.getText().equals("7") && jButton8.getText().equals("8") && jButton9.getText().equals("9")
                 && jButton10.getText().equals("10") && jButton11.getText().equals("11") && jButton12.getText().equals("12")
                 && jButton13.getText().equals("13") && jButton14.getText().equals("14") && jButton15.getText().equals("15")){
            JOptionPane.showMessageDialog(null, "Well Done!");
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PuzzleGame");

        jButton1.setText(Integer.toString(array[0]));
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText(Integer.toString(array[1]));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText(Integer.toString(array[2]));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText(Integer.toString(array[3]));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText(Integer.toString(array[4]));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText(Integer.toString(array[5]));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton6ActionPerformed(evt);
            }
        });

        jButton7.setText(Integer.toString(array[6]));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText(Integer.toString(array[7]));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText(Integer.toString(array[8]));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText(Integer.toString(array[9]));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText(Integer.toString(array[10]));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText(Integer.toString(array[11]));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setText(Integer.toString(array[12]));
        jButton13.setActionCommand("13");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setText(Integer.toString(array[13]));
        jButton14.setActionCommand("1");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setText(Integer.toString(array[14]));
        jButton15.setActionCommand("15");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setActionCommand("16");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(evt.getSource()==jButton3){
            if(jButton3.getText() != ""){
                if(jButton2.getText() == ""){
                    jButton2.setText(jButton3.getText());
                    jButton3.setText("");
                        }
                else if(jButton4.getText() == ""){
                    jButton4.setText(jButton3.getText());
                    jButton3.setText("");
                        }
                else if(jButton7.getText() == ""){
                    jButton7.setText(jButton3.getText());
                    jButton3.setText("");
                        }
                checkWin();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(evt.getSource()==jButton1){
            if(jButton1.getText() != ""){
                if(jButton2.getText() == ""){
                    jButton2.setText(jButton1.getText());
                    jButton1.setText("");
                        }
                else if(jButton5.getText() == ""){
                    jButton5.setText(jButton1.getText());
                    jButton1.setText("");
                        }
                checkWin();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(evt.getSource()==jButton4){
            if(jButton4.getText() != ""){
                if(jButton3.getText() == ""){
                    jButton3.setText(jButton4.getText());
                    jButton4.setText("");
                        }
                else if(jButton8.getText() == ""){
                    jButton8.setText(jButton4.getText());
                    jButton4.setText("");
                        }
                checkWin();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(evt.getSource()==jButton2){
            if(jButton2.getText() != ""){
                if(jButton1.getText() == ""){
                    jButton1.setText(jButton2.getText());
                    jButton2.setText("");
                        }
                else if(jButton3.getText() == ""){
                    jButton3.setText(jButton2.getText());
                    jButton2.setText("");
                        }
                else if(jButton6.getText() == ""){
                    jButton6.setText(jButton2.getText());
                    jButton2.setText("");
                        }
                checkWin();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void JButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton6ActionPerformed
        if(evt.getSource()==jButton6){
            if(jButton6.getText() != ""){
                if(jButton2.getText() == ""){
                    jButton2.setText(jButton6.getText());
                    jButton6.setText("");
                        }
                else if(jButton5.getText() == ""){
                    jButton5.setText(jButton6.getText());
                    jButton6.setText("");
                        }
                else if(jButton7.getText() == ""){
                    jButton7.setText(jButton6.getText());
                    jButton6.setText("");
                        }
                else if(jButton10.getText() == ""){
                    jButton10.setText(jButton6.getText());
                    jButton6.setText("");
                        }
                checkWin();
            }
        }
    }//GEN-LAST:event_JButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if(evt.getSource()==jButton5){
            if(jButton5.getText() != ""){
                if(jButton1.getText() == ""){
                    jButton1.setText(jButton5.getText());
                    jButton5.setText("");
                        }
                else if(jButton6.getText() == ""){
                    jButton6.setText(jButton5.getText());
                    jButton5.setText("");
                        }
                else if(jButton9.getText() == ""){
                    jButton9.setText(jButton5.getText());
                    jButton5.setText("");
                        }
                checkWin();
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if(evt.getSource()==jButton7){
            if(jButton7.getText() != ""){
                if(jButton3.getText() == ""){
                    jButton3.setText(jButton7.getText());
                    jButton7.setText("");
                        }
                else if(jButton6.getText() == ""){
                    jButton6.setText(jButton7.getText());
                    jButton7.setText("");
                        }
                else if(jButton8.getText() == ""){
                    jButton8.setText(jButton7.getText());
                    jButton7.setText("");
                        }
                else if(jButton11.getText() == ""){
                    jButton11.setText(jButton7.getText());
                    jButton7.setText("");
                        }
                checkWin();
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if(evt.getSource()==jButton8){
            if(jButton8.getText() != ""){
                if(jButton4.getText() == ""){
                    jButton4.setText(jButton8.getText());
                    jButton8.setText("");
                        }
                else if(jButton7.getText() == ""){
                    jButton7.setText(jButton8.getText());
                    jButton8.setText("");
                        }
                else if(jButton12.getText() == ""){
                    jButton12.setText(jButton8.getText());
                    jButton8.setText("");
                        }
                checkWin();
            }
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if(evt.getSource()==jButton9){
            if(jButton9.getText() != ""){
                if(jButton5.getText() == ""){
                    jButton5.setText(jButton9.getText());
                    jButton9.setText("");
                        }
                else if(jButton10.getText() == ""){
                    jButton10.setText(jButton9.getText());
                    jButton9.setText("");
                }
                else if(jButton13.getText() == ""){
                    jButton13.setText(jButton9.getText());
                    jButton9.setText("");
                }
                checkWin();
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(evt.getSource()==jButton10){
            if(jButton10.getText() != ""){
                if(jButton9.getText() == ""){
                    jButton9.setText(jButton10.getText());
                    jButton10.setText("");
                        }
                else if(jButton6.getText() == ""){
                    jButton6.setText(jButton10.getText());
                    jButton10.setText("");
                        }
                else if(jButton11.getText() == ""){
                    jButton11.setText(jButton10.getText());
                    jButton10.setText("");
                        }
                else if(jButton14.getText() == ""){
                    jButton14.setText(jButton10.getText());
                    jButton10.setText("");
                        }
                checkWin();
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        if(evt.getSource()==jButton11){
            if(jButton11.getText() != ""){
                if(jButton10.getText() == ""){
                    jButton10.setText(jButton11.getText());
                    jButton11.setText("");
                        }
                else if(jButton7.getText() == ""){
                    jButton7.setText(jButton11.getText());
                    jButton11.setText("");
                        }
                else if(jButton12.getText() == ""){
                    jButton12.setText(jButton11.getText());
                    jButton11.setText("");
                        }
                else if(jButton15.getText() == ""){
                    jButton15.setText(jButton11.getText());
                    jButton11.setText("");
                        }
                checkWin();
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if(evt.getSource()==jButton12){
            if(jButton12.getText() != ""){
                if(jButton8.getText() == ""){
                    jButton8.setText(jButton12.getText());
                    jButton12.setText("");
                        }
                else if(jButton11.getText() == ""){
                    jButton11.setText(jButton12.getText());
                    jButton12.setText("");
                        }
                 else if(jButton16.getText() == ""){
                    jButton16.setText(jButton12.getText());
                    jButton12.setText("");
                        }
                checkWin();
            }
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if(evt.getSource()==jButton13){
            if(jButton13.getText() != ""){
                if(jButton9.getText() == ""){
                    jButton9.setText(jButton13.getText());
                    jButton13.setText("");
                        }
                else if(jButton14.getText() == ""){
                    jButton14.setText(jButton13.getText());
                    jButton13.setText("");
                        }
                checkWin();
            }
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if(evt.getSource()==jButton14){
            if(jButton5.getText() != ""){
                if(jButton13.getText() == ""){
                    jButton13.setText(jButton14.getText());
                    jButton14.setText("");
                        }
                else if(jButton10.getText() == ""){
                    jButton10.setText(jButton14.getText());
                    jButton14.setText("");
                        }
                else if(jButton15.getText() == ""){
                    jButton15.setText(jButton14.getText());
                    jButton14.setText("");
                        }
                checkWin();
            }
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        if(evt.getSource()==jButton15){
            if(jButton15.getText() != ""){
                if(jButton14.getText() == ""){
                    jButton14.setText(jButton15.getText());
                    jButton15.setText("");
                        }
                else if(jButton11.getText() == ""){
                    jButton11.setText(jButton15.getText());
                    jButton15.setText("");
                        }
                else if(jButton16.getText() == ""){
                    jButton16.setText(jButton15.getText());
                    jButton15.setText("");
                        }
                checkWin();
            }
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if(evt.getSource()==jButton16){
            if(jButton16.getText() != ""){
                if(jButton12.getText() == ""){
                    jButton12.setText(jButton16.getText());
                    jButton16.setText("");
                        }
                else if(jButton15.getText() == ""){
                    jButton15.setText(jButton16.getText());
                    jButton16.setText("");
                        }
                checkWin();
            }
        }
    }//GEN-LAST:event_jButton16ActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PuzzleGame game = new PuzzleGame();
                game.setVisible(true);
                game.setLayout(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
