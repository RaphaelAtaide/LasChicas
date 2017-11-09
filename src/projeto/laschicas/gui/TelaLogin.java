/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.laschicas.gui;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import projeto.laschicas.domain.Acompanhante;

/**
 *
 * @author lggui
 */
public class TelaLogin extends javax.swing.JFrame {

    /**
     * Creates new form TelaLogin
     */
    public TelaLogin() {
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

        LoginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputPassword = new javax.swing.JTextField();
        inputUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cadastroLink = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LoginButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginOnClick(evt);
            }
        });
        getContentPane().add(LoginButton);
        LoginButton.setBounds(520, 400, 208, 38);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Usuário");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(360, 270, 59, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(370, 340, 48, 22);
        getContentPane().add(inputPassword);
        inputPassword.setBounds(470, 330, 327, 41);

        inputUsuario.setName(""); // NOI18N
        getContentPane().add(inputUsuario);
        inputUsuario.setBounds(470, 260, 327, 41);

        jLabel3.setText("Ainda não faz parte do nosso sistema?");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(520, 450, 221, 16);

        cadastroLink.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        cadastroLink.setText("Cadastre-se");
        cadastroLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroLinkMouseClicked(evt);
            }
        });
        getContentPane().add(cadastroLink);
        cadastroLink.setBounds(580, 490, 98, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projeto/laschicas/gui/background.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-140, -200, 1770, 1380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginOnClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginOnClick
        String name;
        String pass;
        String errorMsg ="";
        
        name = inputUsuario.getText().trim();
        pass = inputPassword.getText().trim();
        
        if( name == null || "".equals(name)){
            errorMsg+="Campo usuário precisa ser preenchido \n";
        }
        if(pass == null || "".equals(pass)){
            errorMsg+="Campo senha não pode ser vazio";
        }
        
        if(!"".equals(errorMsg)){
            JOptionPane.showMessageDialog(this, errorMsg);
        }else{
            JOptionPane.showMessageDialog(this, "Usuário logado com sucesso");
            this.setVisible(false);
            new CadastroAcompanhante().setVisible(true);
        }
    }//GEN-LAST:event_loginOnClick

    private void cadastroLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroLinkMouseClicked
                new CadastrarComoPopup().setVisible(true);
                //TelaLogin.this.dispose();
    }//GEN-LAST:event_cadastroLinkMouseClicked

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JLabel cadastroLink;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JTextField inputUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
