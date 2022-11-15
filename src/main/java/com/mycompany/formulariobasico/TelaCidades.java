/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.formulariobasico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.naming.spi.DirStateFactory;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Alexandre_Marinho
 */
public class TelaCidades extends javax.swing.JFrame {

    static String driverJDBC = "com.mysql.jdbc.Driver";//driver mysql
    static String url = "jdbc:mysql://localhost:3306/cidades";//local
    static String user = "root";//usuario
    static String senha = "";//senha
    static Connection conexao;

    public TelaCidades() {
        initComponents();
        try {//caso o driver exista
            Class.forName(driverJDBC);
            System.out.println("Driver carregado com sucesso!!");
        } catch (Exception e) {
            System.out.println("Erro no carregamento do driver - " + e.toString());
        }
        try {//tenta conecxão
            conexao = DriverManager.getConnection(url, user, senha);
            System.out.println("Conexão realizada com sucesso.");
        } catch (Exception e) {
            System.out.println("Falha na conexão com o BD - " + e.toString());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCod = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        txtPoupalacao = new javax.swing.JTextField();
        txtCid = new javax.swing.JTextField();
        txtPref = new javax.swing.JTextField();
        btnCad = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnLista = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCod.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtPoupalacao.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        txtCid.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        txtCid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidActionPerformed(evt);
            }
        });

        txtPref.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N

        btnCad.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnCad.setText("Cadastrar");
        btnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnLista.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnLista.setText("Listar");
        btnLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaActionPerformed(evt);
            }
        });

        btnLimpar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnExit.setText("Fechar");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel2.setText("População");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel3.setText("Nome da Cidade");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel4.setText("Nome do Prefeito");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPref)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(23, 23, 23)
                        .addComponent(txtPoupalacao, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCid))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnCad)
                .addGap(43, 43, 43)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLista)
                .addGap(42, 42, 42)
                .addComponent(btnLimpar)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(btnExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(txtPoupalacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPref, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCad)
                    .addComponent(btnExcluir)
                    .addComponent(btnLista)
                    .addComponent(btnLimpar))
                .addGap(37, 37, 37)
                .addComponent(btnExit)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ResultSet rs;
        String instSQL = "SELECT * FROM tbcidades WHERE cod = ?";
        String result = "";
        try {
            PreparedStatement ps = conexao.prepareStatement(instSQL);
            ps.setString(1, txtCod.getText());
            rs = ps.executeQuery();
            JOptionPane.showMessageDialog(null,
                    "Consulta realizada com sucesso.");
            rs.next();
            txtCod.setText(String.valueOf((rs.getString(1))));
            txtCid.setText(rs.getString(2));
            txtPref.setText(rs.getString(3));
            txtPoupalacao.setText(String.valueOf(rs.getString(4)));
        } catch (Exception e) {
            System.out.println("Falha na consulta - "
                    + e.toString());
            showMessageDialog(null,
                    "Falha na consulta - " + e.toString());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadActionPerformed
        String intsSQL = "INSERT INTO tbcidades VALUES(?, ?, ?, ?)";
        try {
            PreparedStatement ps = conexao.prepareStatement(intsSQL);
            ps.setInt(1, Integer.parseInt(txtCod.getText()));
            ps.setString(2, txtCid.getText());
            ps.setString(3, txtPref.getText());
            ps.setInt(4, Integer.parseInt(txtPoupalacao.getText()));
            ps.execute();
            System.out.println("Cadastro realizado com sucesso.");
            showMessageDialog(null,
                    "Cadastro realizado com sucesso.");
            btnLimpar.doClick();
        } catch (Exception e) {
            System.out.println("Falha no cadastro - " + e.toString());
            showMessageDialog(null,
                    "Falha no cadastro - " + e.toString());
        }
    }//GEN-LAST:event_btnCadActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtCod.setText(null);
        txtCid.setText(null);
        txtPref.setText(null);
        txtPoupalacao.setText(null);


    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        try {
            conexao.close();
            System.out.println("Conexão encerrada");
        } catch (Exception e) {
            System.out.println("Erro ao fechar conexão.");
        }
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        String instSQL = "DELETE FROM tbcidades WHERE cod = ?";
        try {
            PreparedStatement ps = conexao.prepareStatement(instSQL);
            ps.setString(1, txtCod.getText());
            ps.execute();
            System.out.println("Remoção realizada com sucesso.");
            showMessageDialog(null,
                    "Remoção realizada com sucesso.");
            btnLimpar.doClick();
        } catch (Exception e) {
            System.out.println("Falha na remoção - "
                    + e.toString());
            showMessageDialog(null,
                    "Falha na remoção - " + e.toString());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaActionPerformed
        ResultSet rs;
        String instSQL
                = "SELECT * FROM tbcidades";
        String result = "";

        try {
            Statement st = conexao.createStatement();
            rs = st.executeQuery(instSQL);
            showMessageDialog(null,
                    "Consulta realizada com sucesso.");
            while (rs.next()) {
                result += rs.getString(1) + " - "
                        + rs.getString(2) + " - "
                        + rs.getString(3) + " - "
                        + rs.getString(4) + "\n";
            }
            showMessageDialog(null, result,
                    "Cidades Cadastradas", INFORMATION_MESSAGE);
            btnLimpar.doClick();
        } catch (Exception e) {
            System.out.println("Falha na consulta - "
                    + e.toString());
            showMessageDialog(null,
                    "Falha na consulta - " + e.toString());
        }
    }//GEN-LAST:event_btnListaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCad;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCid;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtPoupalacao;
    private javax.swing.JTextField txtPref;
    // End of variables declaration//GEN-END:variables
}
