package Telas;

import Banco.PessoaBD;
import Dados.Pessoa;
import javax.swing.JOptionPane;



public class CrieSuaConta extends javax.swing.JFrame {
    private String nome,sobrenome,telefone,cpf,email,senha;

    
    public CrieSuaConta() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        cadastroNome = new javax.swing.JTextField();
        cadastroMail = new javax.swing.JTextField();
        cadastroCpf = new javax.swing.JTextField();
        cadastroSobrenome = new javax.swing.JTextField();
        cadastroNascimento = new javax.swing.JTextField();
        cadastroTelefone = new javax.swing.JTextField();
        campoConfirmarSenha = new javax.swing.JPasswordField();
        campoSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btCriarConta = new javax.swing.JButton();
        btTenhoConta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cadastroNome.setBackground(new java.awt.Color(236, 236, 236));
        cadastroNome.setBorder(null);
        cadastroNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroNomeActionPerformed(evt);
            }
        });
        jPanel2.add(cadastroNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 330, 40));

        cadastroMail.setBackground(new java.awt.Color(236, 236, 236));
        cadastroMail.setBorder(null);
        jPanel2.add(cadastroMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 320, 30));

        cadastroCpf.setBackground(new java.awt.Color(236, 236, 236));
        cadastroCpf.setBorder(null);
        jPanel2.add(cadastroCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 330, 40));

        cadastroSobrenome.setBackground(new java.awt.Color(236, 236, 236));
        cadastroSobrenome.setBorder(null);
        jPanel2.add(cadastroSobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 330, 40));

        cadastroNascimento.setBackground(new java.awt.Color(236, 236, 236));
        cadastroNascimento.setBorder(null);
        jPanel2.add(cadastroNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 320, 40));

        cadastroTelefone.setBackground(new java.awt.Color(236, 236, 236));
        cadastroTelefone.setBorder(null);
        jPanel2.add(cadastroTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 320, 40));

        campoConfirmarSenha.setBackground(new java.awt.Color(236, 236, 236));
        campoConfirmarSenha.setBorder(null);
        campoConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoConfirmarSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(campoConfirmarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 580, 320, 40));

        campoSenha.setBackground(new java.awt.Color(236, 236, 236));
        campoSenha.setBorder(null);
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });
        jPanel2.add(campoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 580, 320, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Criar conta.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        btCriarConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarContaActionPerformed(evt);
            }
        });
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

    private void cadastroNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroNomeActionPerformed
        
    }//GEN-LAST:event_cadastroNomeActionPerformed

    private void campoConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoConfirmarSenhaActionPerformed
        
    }//GEN-LAST:event_campoConfirmarSenhaActionPerformed

    private void btCriarContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCriarContaActionPerformed
       Pessoa pessoa = new Pessoa();
       PessoaBD pessoaBD = new PessoaBD();
        
       nome= cadastroNome.getText();
       cpf= cadastroCpf.getText();
       senha = new String(campoSenha.getPassword());
       telefone = cadastroTelefone.getText();
       sobrenome = cadastroSobrenome.getText();
       email = cadastroMail.getText();
       
        pessoa.setNome(nome);
        pessoa.setSobrenome(sobrenome);
	pessoa.setCpf(cpf);
	pessoa.setTelefone(telefone);
	pessoa.setEmail(email);
        pessoa.setSenha(senha);
        
        if(pessoaBD.inserirPessoa(pessoa) == true)
	{
		JOptionPane.showMessageDialog(null, "Pessoa cadastrada com sucesso!!!", "Cadastro",JOptionPane.INFORMATION_MESSAGE);
	}
	else
	{
		JOptionPane.showMessageDialog(null, "Erro no cadastro", "Erro",JOptionPane.ERROR_MESSAGE);
	}
    }
    }//GEN-LAST:event_btCriarContaActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        
    }//GEN-LAST:event_campoSenhaActionPerformed

    
    public static void main(String args[]) {
      >
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrieSuaConta().setVisible(true);
            }
)};
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCriarConta;
    private javax.swing.JButton btTenhoConta;
    private javax.swing.JTextField cadastroCpf;
    private javax.swing.JTextField cadastroMail;
    private javax.swing.JTextField cadastroNascimento;
    private javax.swing.JTextField cadastroNome;
    private javax.swing.JTextField cadastroSobrenome;
    private javax.swing.JTextField cadastroTelefone;
    private javax.swing.JPasswordField campoConfirmarSenha;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
