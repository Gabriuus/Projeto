/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class CrieSuaConta extends javax.swing.JFrame {

    /**
     * Creates new form Tela2
     */
    public CrieSuaConta() {
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

        jPanel2 = new javax.swing.JPanel();
        CadastroNome = new javax.swing.JTextField();
        CadastroConfirmarSenha = new javax.swing.JTextField();
        CadastroMail = new javax.swing.JTextField();
        CadastroCpf = new javax.swing.JTextField();
        CadastroSenha = new javax.swing.JTextField();
        CadastroSobrenome = new javax.swing.JTextField();
        CadastroNascimento = new javax.swing.JTextField();
        CadastroTelefone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btCriarConta = new javax.swing.JButton();
        btTenhoConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CadastroNome.setBackground(new java.awt.Color(236, 236, 236));
        CadastroNome.setBorder(null);
        CadastroNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroNomeActionPerformed(evt);
            }
        });
        jPanel2.add(CadastroNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 330, 40));

        CadastroConfirmarSenha.setBackground(new java.awt.Color(236, 236, 236));
        CadastroConfirmarSenha.setBorder(null);
        CadastroConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroConfirmarSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(CadastroConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 580, 320, 40));

        CadastroMail.setBackground(new java.awt.Color(236, 236, 236));
        CadastroMail.setBorder(null);
        jPanel2.add(CadastroMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 330, 40));

        CadastroCpf.setBackground(new java.awt.Color(236, 236, 236));
        CadastroCpf.setBorder(null);
        jPanel2.add(CadastroCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 330, 40));

        CadastroSenha.setBackground(new java.awt.Color(236, 236, 236));
        CadastroSenha.setBorder(null);
        CadastroSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(CadastroSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 330, 40));

        CadastroSobrenome.setBackground(new java.awt.Color(236, 236, 236));
        CadastroSobrenome.setBorder(null);
        jPanel2.add(CadastroSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 330, 40));

        CadastroNascimento.setBackground(new java.awt.Color(236, 236, 236));
        CadastroNascimento.setBorder(null);
        jPanel2.add(CadastroNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 320, 40));

        CadastroTelefone.setBackground(new java.awt.Color(236, 236, 236));
        CadastroTelefone.setBorder(null);
        jPanel2.add(CadastroTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 320, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Criar conta.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));
        jPanel2.add(btCriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 650, 240, 50));
        jPanel2.add(btTenhoConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 210, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 714, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastroNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CadastroNomeActionPerformed

    private void CadastroConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroConfirmarSenhaActionPerformed
       if(CadastroConfirmarSenha.getText() == null ? CadastroSenha.getText() != null : !CadastroConfirmarSenha.getText().equals(CadastroSenha.getText())){
                 JOptionPane.showMessageDialog(null, "Campo SENHA e REPITA A SENHA estão Diferentes!");}
    }//GEN-LAST:event_CadastroConfirmarSenhaActionPerformed

    private void CadastroSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroSenhaActionPerformed
        if(CadastroSenha.getText() == null ? CadastroConfirmarSenha.getText() != null : !CadastroSenha.getText().equals(CadastroConfirmarSenha.getText())){
                            JOptionPane.showMessageDialog(null, "Campo SENHA e REPITA A SENHA estão Diferentes!");}
    }//GEN-LAST:event_CadastroSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(CrieSuaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrieSuaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrieSuaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrieSuaConta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrieSuaConta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CadastroConfirmarSenha;
    private javax.swing.JTextField CadastroCpf;
    private javax.swing.JTextField CadastroMail;
    private javax.swing.JTextField CadastroNascimento;
    private javax.swing.JTextField CadastroNome;
    private javax.swing.JTextField CadastroSenha;
    private javax.swing.JTextField CadastroSobrenome;
    private javax.swing.JTextField CadastroTelefone;
    private javax.swing.JButton btCriarConta;
    private javax.swing.JButton btTenhoConta;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
