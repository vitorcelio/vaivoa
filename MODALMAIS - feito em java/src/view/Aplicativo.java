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
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author Vitor
 */
public class Aplicativo extends javax.swing.JFrame {
    String vetor[] = new String[999];
    DefaultListModel lista = new DefaultListModel();
    /**
     * Creates new form Aplicativo
     */
    public Aplicativo() {
        this.setUndecorated(true);
        initComponents();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setBackground(new Color(0,0,0,0));
        gerar.setBackground(new Color(0,0,0,0));
        jPanel1.setBackground(new Color(0,0,0,0));
        cartao.setVisible(false);
        ucg.setVisible(false);
        gerar1.setBackground(new Color(0,0,0,0));
    }
    
    public void close(){
        WindowEvent closewin = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closewin);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cartao = new javax.swing.JLabel();
        ucg = new javax.swing.JLabel();
        gerar1 = new javax.swing.JButton();
        gerar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaCartoes = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cartao.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        cartao.setForeground(new java.awt.Color(255, 255, 255));
        cartao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartao.setText("jLabel1");
        jPanel1.add(cartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 180, 20));

        ucg.setBackground(new java.awt.Color(255, 255, 255));
        ucg.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        ucg.setForeground(new java.awt.Color(255, 255, 255));
        ucg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ucg.setText("jLabel1");
        jPanel1.add(ucg, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 160, 300, -1));

        gerar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-sair.png"))); // NOI18N
        gerar1.setBorder(null);
        gerar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gerar1.setOpaque(false);
        gerar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerar1ActionPerformed(evt);
            }
        });
        jPanel1.add(gerar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 50, -1, -1));

        gerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botao-gerarCartao.png"))); // NOI18N
        gerar.setBorder(null);
        gerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gerar.setOpaque(false);
        gerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gerarActionPerformed(evt);
            }
        });
        jPanel1.add(gerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        jPanel2.setBackground(new java.awt.Color(82, 100, 172));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Seu cartão virtual válido:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 460, 110));

        jScrollPane1.setBackground(new java.awt.Color(82, 100, 172));
        jScrollPane1.setBorder(null);

        listaCartoes.setBackground(new java.awt.Color(82, 100, 172));
        listaCartoes.setFont(new java.awt.Font("Bahnschrift", 1, 14)); // NOI18N
        listaCartoes.setForeground(new java.awt.Color(255, 255, 255));
        listaCartoes.setModel(lista);
        jScrollPane1.setViewportView(listaCartoes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 460, 380));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TELA-APP.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 1010, 610));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/CADASTRO-FUNDO.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 4, 1040, 640));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerarActionPerformed
        // TODO add your handling code here:
        ucg.setVisible(true);
        cartao.setVisible(true);
        Cartao card = new Cartao();
        try {
            int cont = 0;
            card.gerarNumeroCartao();
            cartao.setText(card.getNumeroCartao());
            ucg.setText(cartao.getText());
            //int nc = 0;
            //nc++;
            vetor[cont] = cartao.getText();
            
            lista.add(cont,vetor[cont]);
            cont++;
            
            
        } catch (ParseException ex) {
            Logger.getLogger(Aplicativo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_gerarActionPerformed

    private void gerar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gerar1ActionPerformed
        // TODO add your handling code here:
        close();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_gerar1ActionPerformed

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
            java.util.logging.Logger.getLogger(Aplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicativo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cartao;
    private javax.swing.JButton gerar;
    private javax.swing.JButton gerar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaCartoes;
    private javax.swing.JLabel ucg;
    // End of variables declaration//GEN-END:variables
}
