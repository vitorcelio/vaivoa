/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import bancodedados.Conexao;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTextField;

/**
 *
 * @author Vitor
 */
public class Cadastro extends javax.swing.JFrame {
    
    
    /**
     * Creates new form LoginECadastro
     */
    public Cadastro() {
        this.setUndecorated(true);
        
        initComponents();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setBackground(new Color(0,0,0,0));
        nver.setVisible(false);
        jPanel1.setBackground(new Color(0,0,0,0));
        ver.setBackground(new Color(0,0,0,0));
        nver.setBackground(new Color(0,0,0,0));
        cc.setBackground(new Color(0,0,0,0));
        ec2.setBackground(new Color(0,0,0,0));
        sair.setBackground(new Color(0,0,0,0));
        senha.setBackground(new Color(0,0,0,0));
        email.setBackground(new Color(0,0,0,0));
        nome.setBackground(new Color(0,0,0,0));
        usuario.setBackground(new Color(0,0,0,0));
    }

    public void close(){
        WindowEvent closewin = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closewin);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ec2 = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        cc = new javax.swing.JButton();
        nver = new javax.swing.JButton();
        ver = new javax.swing.JButton();
        senha = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        usuario = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ec2.setForeground(new java.awt.Color(102, 102, 255));
        ec2.setText("<html><body> <u>Fazer login?</u> </html></body>");
        ec2.setBorder(null);
        ec2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ec2.setOpaque(false);
        ec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ec2ActionPerformed(evt);
            }
        });
        jPanel1.add(ec2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, 80, 40));

        sair.setForeground(new java.awt.Color(0, 102, 102));
        sair.setText("<html>\n<body>\n<u>Fechar aplicação</u>\n</body>\n</html>");
        sair.setToolTipText("");
        sair.setBorder(null);
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair.setOpaque(false);
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jPanel1.add(sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, -1));

        cc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-cadastro.png"))); // NOI18N
        cc.setBorder(null);
        cc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cc.setOpaque(false);
        cc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccActionPerformed(evt);
            }
        });
        jPanel1.add(cc, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 480, 160, 40));

        nver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/naover-roxo.png"))); // NOI18N
        nver.setBorder(null);
        nver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nver.setOpaque(false);
        nver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nverActionPerformed(evt);
            }
        });
        jPanel1.add(nver, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 380, 40, 30));

        ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ver-roxo.png"))); // NOI18N
        ver.setBorder(null);
        ver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ver.setOpaque(false);
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }
        });
        jPanel1.add(ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 380, 40, 30));

        senha.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        senha.setForeground(new java.awt.Color(51, 51, 51));
        senha.setText("Senha");
        senha.setToolTipText("");
        senha.setBorder(null);
        senha.setOpaque(false);
        senha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                senhaFocusLost(evt);
            }
        });
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });
        jPanel1.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 370, 250, 40));

        email.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        email.setForeground(new java.awt.Color(51, 51, 51));
        email.setText("Email");
        email.setToolTipText("");
        email.setBorder(null);
        email.setOpaque(false);
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 280, 40));

        nome.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        nome.setForeground(new java.awt.Color(51, 51, 51));
        nome.setText("Nome Completo");
        nome.setToolTipText("");
        nome.setBorder(null);
        nome.setOpaque(false);
        nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nomeFocusLost(evt);
            }
        });
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });
        jPanel1.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 280, 40));

        usuario.setFont(new java.awt.Font("Malgun Gothic Semilight", 0, 12)); // NOI18N
        usuario.setForeground(new java.awt.Color(51, 51, 51));
        usuario.setText("Usuário");
        usuario.setToolTipText("");
        usuario.setBorder(null);
        usuario.setOpaque(false);
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
        jPanel1.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, 280, 40));

        jCheckBox1.setFont(new java.awt.Font("Dialog", 0, 9)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setText("<html>\n<head>\n<style>\n.cor{\ncolor: blue;\n}\n</style>\n</head>\n<body>\n<p>Sim, eu autorizo o recebimento de comunicações.<u class=\"cor\">saiba mais</u></p>\t\t\n</body>\t\n</html>");
        jCheckBox1.setBorder(null);
        jCheckBox1.setOpaque(false);
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(641, 440, 290, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TELA-CADASTRO.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/CADASTRO-FUNDO.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1060, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 1060, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_usuarioActionPerformed

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

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void nomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeFocusGained
        // TODO add your handling code here:
        if(nome.getText().equals("Nome Completo")){
            nome.setText("");
            
        }
    }//GEN-LAST:event_nomeFocusGained

    private void nomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeFocusLost
        // TODO add your handling code here:
        if(nome.getText().equals("")){
            nome.setText("Nome Completo");
        }
    }//GEN-LAST:event_nomeFocusLost

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        // TODO add your handling code here:
        if(email.getText().equals("Email")){
            email.setText("");
            
        }
    }//GEN-LAST:event_emailFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        // TODO add your handling code here:
        if(email.getText().equals("")){
            email.setText("Email");
        }
    }//GEN-LAST:event_emailFocusLost

    private void verActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verActionPerformed
        // TODO add your handling code here:
        senha.setEchoChar('\u0000');
        nver.setVisible(true);
        ver.setVisible(false);
    }//GEN-LAST:event_verActionPerformed

    private void nverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nverActionPerformed
        // TODO add your handling code here:
        senha.setEchoChar('*');
        nver.setVisible(false);
        ver.setVisible(true);
    }//GEN-LAST:event_nverActionPerformed

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

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void ccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccActionPerformed
        // TODO add your handling code here:
        
        
        try {
            Connection con = Conexao.faz_conexao();
            
            String cadastro = "insert into cadastro values(default,'"+usuario.getText()+"','"+nome.getText()+"','"+email.getText()+"','"+senha.getPassword()+"')";
            PreparedStatement stmt = con.prepareStatement(cadastro);
            stmt.execute();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }//GEN-LAST:event_ccActionPerformed

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

    private void ec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ec2ActionPerformed
        // TODO add your handling code here:
        close();
        Login abrirlogin = new Login();
        abrirlogin.setVisible(true);
    }//GEN-LAST:event_ec2ActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cc;
    private javax.swing.JButton ec2;
    private javax.swing.JTextField email;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nome;
    private javax.swing.JButton nver;
    private javax.swing.JButton sair;
    private javax.swing.JPasswordField senha;
    private javax.swing.JTextField usuario;
    private javax.swing.JButton ver;
    // End of variables declaration//GEN-END:variables
}
