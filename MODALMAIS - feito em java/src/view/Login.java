/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import bancodedados.Conexao;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Vitor
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
       this.setUndecorated(true);
        
        initComponents();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setBackground(new Color(0,0,0,0));
        nver.setVisible(false);
        erro.setVisible(false);
        jPanel1.setBackground(new Color(0,0,0,0));
        ver.setBackground(new Color(0,0,0,0));
        nver.setBackground(new Color(0,0,0,0));
        usuario.setBackground(new Color(0,0,0,0));
        senha.setBackground(new Color(0,0,0,0));
        sair.setBackground(new Color(0,0,0,0));
        sair1.setBackground(new Color(0,0,0,0));
        voltar.setBackground(new Color(0,0,0,0));
        entrar.setBackground(new Color(0,0,0,0));
    }

    public void close(){
        WindowEvent closewin = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closewin);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        sair1 = new javax.swing.JButton();
        aviso = new javax.swing.JLabel();
        entrar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        erro = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        usuario = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        nver = new javax.swing.JButton();
        ver = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/ENTRAR.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sair1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-sair.png"))); // NOI18N
        sair1.setBorder(null);
        sair1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair1.setOpaque(false);
        sair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sair1ActionPerformed(evt);
            }
        });
        jPanel1.add(sair1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        aviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aviso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/log.png"))); // NOI18N
        jPanel1.add(aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 390, 240));

        entrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-entrar.png"))); // NOI18N
        entrar.setBorder(null);
        entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrar.setOpaque(false);
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });
        jPanel1.add(entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 430, -1, -1));

        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-sair.png"))); // NOI18N
        sair.setBorder(null);
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair.setOpaque(false);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jPanel1.add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 50, -1, -1));

        erro.setForeground(new java.awt.Color(255, 255, 255));
        erro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(erro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 210, 20));

        voltar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        voltar.setForeground(new java.awt.Color(102, 204, 255));
        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-voltar.png"))); // NOI18N
        voltar.setBorder(null);
        voltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltar.setOpaque(false);
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        jPanel1.add(voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 30, -1));

        usuario.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuário");
        usuario.setToolTipText("");
        usuario.setBorder(null);
        usuario.setOpaque(false);
        usuario.setSelectionColor(new java.awt.Color(255, 255, 255));
        usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usuarioFocusLost(evt);
            }
        });
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 270, 40));

        senha.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        senha.setForeground(new java.awt.Color(255, 255, 255));
        senha.setText("Senha");
        senha.setToolTipText("");
        senha.setBorder(null);
        senha.setOpaque(false);
        senha.setSelectionColor(new java.awt.Color(255, 255, 255));
        senha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                senhaFocusLost(evt);
            }
        });
        jPanel1.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 230, 30));

        nver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/naover-branco.png"))); // NOI18N
        nver.setBorder(null);
        nver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nver.setOpaque(false);
        nver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nverActionPerformed(evt);
            }
        });
        jPanel1.add(nver, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 40, 30));

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ver-branco.png"))); // NOI18N
        ver.setBorder(null);
        ver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ver.setOpaque(false);
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });
        jPanel1.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 40, 30));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TELA-LOGIN.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1010, 610));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/CADASTRO-FUNDO.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 1040, 640));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioFocusGained
        // TODO add your handling code here:
        //  jTextField1.setText("");
        if(usuario.getText().equals("Usuário")){
            usuario.setText("");
        }
    }//GEN-LAST:event_usuarioFocusGained

    private void usuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usuarioFocusLost
        // TODO add your handling code here:
        if(usuario.getText().equals("")){
            usuario.setText("Usuário");
        }
    }//GEN-LAST:event_usuarioFocusLost

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_usuarioActionPerformed

    private void senhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaFocusGained
        // TODO add your handling code here:
        if(senha.getText().equals("Senha")){
            senha.setText("");
        }
    }//GEN-LAST:event_senhaFocusGained

    private void senhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaFocusLost
        // TODO add your handling code here:
        if(senha.getText().equals("")){
            senha.setText("Senha");
        }
    }//GEN-LAST:event_senhaFocusLost

    private void nverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nverActionPerformed
        // TODO add your handling code here:
        senha.setEchoChar('*');
        nver.setVisible(false);
        ver.setVisible(true);
    }//GEN-LAST:event_nverActionPerformed

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        // TODO add your handling code here:
        senha.setEchoChar('\u0000');
        nver.setVisible(true);
        ver.setVisible(false);
    }//GEN-LAST:event_verActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        close();
        Cadastro voltarcad = new Cadastro();
        voltarcad.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        // TODO add your handling code here:
        close();
        if(usuario.getText().equals("admin") || senha.getPassword().equals("admin")){
            Aplicativo aplicativo = new Aplicativo();
            aplicativo.setVisible(true);
        }
        
//        try {
//            Connection con = Conexao.faz_conexao();
//            String login = "select * from cadastro where usuario=? and senha=?";
//            PreparedStatement stmt = con.prepareStatement(login);
//            
//            stmt.setString(1, usuario.getText());
//            stmt.setString(2, new String (senha.getPassword()));
//            
//            ResultSet rs = stmt.executeQuery();
//            
//            if(rs.next()){
//                Aplicativo app = new Aplicativo();
//                app.setVisible(true);
//            }else{
//                erro.setVisible(true);
//                erro.setText("Seu usuário ou senha são inválidos!");
//                
//            }
//            
//            stmt.close();
//            con.close();
//            
//        } catch (Exception e) {
//            System.out.println("O erro foi: " + e);
//        }
    }//GEN-LAST:event_entrarActionPerformed

    private void sair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sair1ActionPerformed
        // TODO add your handling code here:
        aviso.setVisible(false);
        sair1.setVisible(false);
    }//GEN-LAST:event_sair1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aviso;
    private javax.swing.JButton entrar;
    private javax.swing.JLabel erro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nver;
    private javax.swing.JButton sair;
    private javax.swing.JButton sair1;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField usuario;
    private javax.swing.JButton ver;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
