/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Operator;

/**
 *
 * @author LENOVO
 */
public class OptionMenuOperator extends javax.swing.JInternalFrame {

    /**
     * Creates new form OptionMenu
     */
    public OptionMenuOperator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toClasstBtn = new javax.swing.JButton();
        showAbsenButton = new javax.swing.JButton();

        setTitle("OPTION MENU");

        toClasstBtn.setText("MASUK KELAS");
        toClasstBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toClasstBtnActionPerformed(evt);
            }
        });

        showAbsenButton.setText("LIHAT ABSENSI");
        showAbsenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAbsenButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showAbsenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toClasstBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(toClasstBtn)
                .addGap(26, 26, 26)
                .addComponent(showAbsenButton)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void toClasstBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toClasstBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_toClasstBtnActionPerformed

    private void showAbsenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAbsenButtonActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_showAbsenButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton showAbsenButton;
    private javax.swing.JButton toClasstBtn;
    // End of variables declaration//GEN-END:variables
}
