/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.laschicas.gui;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import projeto.laschicas.domain.Acompanhante;
import projeto.laschicas.fachada.AcompanhanteFachada;

/**
 *
 * @author lggui
 */
public class CadastroAcompanhante extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro_Acompanhante
     */
     private Acompanhante acompanhante;
     
    public CadastroAcompanhante() {
        initComponents();
        try {
            preencherTabela();
        } catch (Exception ex) {
            
        }
    }
        public void preencherTabela() throws Exception{
        AcompanhanteFachada  fachada = new AcompanhanteFachada();
        ArrayList<Acompanhante> acompanhantesList = new ArrayList<>();
        acompanhantesList.addAll(fachada.getAllAcompanhantes());
        DefaultTableModel model = (DefaultTableModel)acompanhanteTable.getModel();
        Object[] data = new Object[6];
        
        for(int i =0;i<acompanhantesList.size();i++){
            data[0] = acompanhantesList.get(i).getId();
            data[1] = acompanhantesList.get(i).getNome();
            data[2] = acompanhantesList.get(i).getIdade();
            data[3] = acompanhantesList.get(i).getCpf();
            data[4] = acompanhantesList.get(i).getValorHora();
            data[5] = acompanhantesList.get(i).getDescricao();
            model.addRow(data);
        }
        
        
        /*for (Acompanhante acompanhantesList1 : acompanhantesList) {
            data[0] = acompanhantesList1.getId();
            data[1] = acompanhantesList1.getNome();
            data[2] = acompanhantesList1.getIdade();
            data[3] = acompanhantesList1.getCpf();
            data[4] = acompanhantesList1.getValorHora();
            data[5] = acompanhantesList1.getDescricao();
            model.addRow(data);
        }
        */
                
    }
        
        
        public void limparForm(){
            acompanhante.setId(null);
            inputNome.setText("");
            inputIdade.setText("");
            inputCpf.setText("");
            inputSexo.setText("");
            inputValorHora.setText("");
            inputDescricao.setText("");
        }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputDescricao = new javax.swing.JTextField();
        inputNome = new javax.swing.JTextField();
        inputIdade = new javax.swing.JTextField();
        inputCpf = new javax.swing.JTextField();
        inputValorHora = new javax.swing.JTextField();
        inputSexo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Cadastrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        limparFormButton = new javax.swing.JButton();
        alterarAcompanhanteButton = new javax.swing.JButton();
        preencherCamposButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        inputPesquisaAcompanhante = new javax.swing.JTextField();
        deletarAcompanhanteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        acompanhanteTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Idade");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("CPF");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Sexo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));
        getContentPane().add(inputDescricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 237, 30));
        getContentPane().add(inputNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 237, 32));
        getContentPane().add(inputIdade, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 237, 32));
        getContentPane().add(inputCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 237, 30));
        getContentPane().add(inputValorHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 237, 31));
        getContentPane().add(inputSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 237, 31));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Valor Hora");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setText("Descrição");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 374, -1, -1));

        Cadastrar.setText("Cadastrar");
        Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarClickButton(evt);
            }
        });
        getContentPane().add(Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 149, 34));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Cadastro de nova acompanhante");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 13, 355, 68));

        limparFormButton.setText("Limpar Campos");
        limparFormButton.setToolTipText("");
        limparFormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparFormButtonActionPerformed(evt);
            }
        });
        getContentPane().add(limparFormButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 147, 37));

        alterarAcompanhanteButton.setText("Alterar");
        alterarAcompanhanteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarAcompanhanteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(alterarAcompanhanteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 147, 34));

        preencherCamposButton.setText("Preencher Campos");
        preencherCamposButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preencherCamposButtonActionPerformed(evt);
            }
        });
        getContentPane().add(preencherCamposButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(904, 96, 250, 35));

        jLabel8.setText("Pesquisar Acompanhante");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 51, 152, 32));
        getContentPane().add(inputPesquisaAcompanhante, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 97, 260, 32));

        deletarAcompanhanteButton.setText("Deletar");
        deletarAcompanhanteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletarAcompanhanteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deletarAcompanhanteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 149, 34));

        acompanhanteTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Idade", "Cpf", "Valor Hora", "Descrição"
            }
        ));
        jScrollPane1.setViewportView(acompanhanteTable);
        if (acompanhanteTable.getColumnModel().getColumnCount() > 0) {
            acompanhanteTable.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 550, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarClickButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarClickButton
        
        Acompanhante acompanhante = new Acompanhante();
        // Passa os inputs do form pra uma acompanhante
        acompanhante.setNome(inputNome.getText());
        acompanhante.setIdade("".equals(inputIdade.getText())?0:Integer.parseInt(inputIdade.getText()));
        acompanhante.setCpf(inputCpf.getText());
        acompanhante.setSexo(inputSexo.getText()); //adicionar o campo sexo no banco de dados posteriormente
        acompanhante.setValorHora("".equals(inputValorHora.getText())?0.00:Double.parseDouble(inputValorHora.getText()));
        acompanhante.setDescricao(inputDescricao.getText());
     
        AcompanhanteFachada fachada = new AcompanhanteFachada();
        // Chama a fachada cadastrar acommpanhante no banco
        try {
            fachada.cadastraAcompanhante(acompanhante);
            JOptionPane.showMessageDialog(this, "Acompanhante adicionada com sucesso!");
            this.dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
        
    }//GEN-LAST:event_cadastrarClickButton

    private void limparFormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparFormButtonActionPerformed
        limparForm();
    }//GEN-LAST:event_limparFormButtonActionPerformed

    private void alterarAcompanhanteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarAcompanhanteButtonActionPerformed
        AcompanhanteFachada fachada = new AcompanhanteFachada();

        // Passa os inputs do form pra uma acompanhante
        acompanhante.setNome(inputNome.getText());
        acompanhante.setIdade("".equals(inputIdade.getText())?0:Integer.parseInt(inputIdade.getText()));
        acompanhante.setCpf(inputCpf.getText());
        acompanhante.setSexo(inputSexo.getText()); //adicionar o campo sexo no banco de dados posteriormente
        acompanhante.setValorHora("".equals(inputValorHora.getText())?0.00:Double.parseDouble(inputValorHora.getText()));
        acompanhante.setDescricao(inputDescricao.getText()); 
      
        try {
            fachada.alteraAcompanhante(acompanhante);
            JOptionPane.showMessageDialog(this, "Acompanhante atualizada com sucesso!");
            preencherTabela();
            limparForm();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
         
         
    }//GEN-LAST:event_alterarAcompanhanteButtonActionPerformed

    private void preencherCamposButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preencherCamposButtonActionPerformed
         AcompanhanteFachada fachada = new AcompanhanteFachada();
       
       try {
            acompanhante = fachada.getAcompanhanteByName(inputPesquisaAcompanhante.getText());
            
            inputNome.setText(acompanhante.getNome());
            inputIdade.setText(acompanhante.getIdade().toString());
            inputCpf.setText(acompanhante.getCpf());
            inputSexo.setText("F");
            inputValorHora.setText(acompanhante.getValorHora().toString());
            inputDescricao.setText(acompanhante.getDescricao());
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Acompanhante não encontrada!");
        }
        
    }//GEN-LAST:event_preencherCamposButtonActionPerformed

    private void deletarAcompanhanteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletarAcompanhanteButtonActionPerformed
          AcompanhanteFachada fachada = new AcompanhanteFachada();
        try {
            fachada.removeAcompanhante(acompanhante.getId());
            JOptionPane.showMessageDialog(this, "Acompanhante deletada com sucesso!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Acompanhante não pôde ser deletada! \n erro: "+ex.toString());
        }  
    }//GEN-LAST:event_deletarAcompanhanteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroAcompanhante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAcompanhante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAcompanhante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAcompanhante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAcompanhante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cadastrar;
    private javax.swing.JTable acompanhanteTable;
    private javax.swing.JButton alterarAcompanhanteButton;
    private javax.swing.JButton deletarAcompanhanteButton;
    private javax.swing.JTextField inputCpf;
    private javax.swing.JTextField inputDescricao;
    private javax.swing.JTextField inputIdade;
    private javax.swing.JTextField inputNome;
    private javax.swing.JTextField inputPesquisaAcompanhante;
    private javax.swing.JTextField inputSexo;
    private javax.swing.JTextField inputValorHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limparFormButton;
    private javax.swing.JButton preencherCamposButton;
    // End of variables declaration//GEN-END:variables
}
