/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.laschicas.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author lggui
 */
public class CadastrarComoPopup extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarComoPopup
     */
    public CadastrarComoPopup() {
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

        acompanhanteCadastroRedirectButton = new javax.swing.JButton();
        gerenteCadastroRedirectButton = new javax.swing.JButton();
        clienteCadastroRedirectButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        acompanhanteCadastroRedirectButton.setText("Acompanhante");
        acompanhanteCadastroRedirectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acompanhanteCadastroRedirectButtonActionPerformed(evt);
            }
        });

        gerenteCadastroRedirectButton.setText("Gerente");
        gerenteCadastroRedirectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerenteCadastroRedirectButtonActionPerformed(evt);
            }
        });

        clienteCadastroRedirectButton.setText("Cliente");
        clienteCadastroRedirectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteCadastroRedirectButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Deseja se cadastrar como");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(acompanhanteCadastroRedirectButton, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(gerenteCadastroRedirectButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clienteCadastroRedirectButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(clienteCadastroRedirectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(gerenteCadastroRedirectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(acompanhanteCadastroRedirectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clienteCadastroRedirectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteCadastroRedirectButtonActionPerformed
            //this.setVisible(false);
            //new CadastroCliente().setVisible(true);
        JOptionPane.showMessageDialog(this,"Não temos a opção cliente disponível no momento");
    }//GEN-LAST:event_clienteCadastroRedirectButtonActionPerformed

    private void acompanhanteCadastroRedirectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acompanhanteCadastroRedirectButtonActionPerformed
            this.setVisible(false);
            new CadastroAcompanhante().setVisible(true);
    }//GEN-LAST:event_acompanhanteCadastroRedirectButtonActionPerformed

    private void gerenteCadastroRedirectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerenteCadastroRedirectButtonActionPerformed
            JOptionPane.showMessageDialog(this,"Não temos a opção gerente disponível no momento");
    }//GEN-LAST:event_gerenteCadastroRedirectButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarComoPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarComoPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarComoPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarComoPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarComoPopup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acompanhanteCadastroRedirectButton;
    private javax.swing.JButton clienteCadastroRedirectButton;
    private javax.swing.JButton gerenteCadastroRedirectButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
