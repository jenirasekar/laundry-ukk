/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Apk_laundry_ukk;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ThinkPad T440s
 */
public class menu_member extends javax.swing.JFrame {
    private DefaultTableModel model = null;
    private PreparedStatement stat;
    private ResultSet rs;
    koneksi k = new koneksi();
    private int id_user = 0, id_outlet = 0;
    private String role = "";

    /**
     * Creates new form menu_outlet
     */
    public menu_member() {
        initComponents();

        k.connect();
        refreshTable();
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public void setId_outlet(int id_outlet) {
        this.id_outlet = id_outlet;
    }

    public void setRole(String role) {
        this.role = role;
    }

        //    method untuk menampilkan data dalam table
    public void refreshTable() {
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Nama");
        model.addColumn("Alamat");
        model.addColumn("Jenis Kelamin");
        model.addColumn("No. Telepon");
        tableMember.setModel(model);

        try {
            this.stat = k.getConn().prepareStatement("SELECT * FROM member");
            this.rs = stat.executeQuery();
            while (rs.next()) {
                Object[] data = {
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5)
                };
                model.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        tfID.setText("");
        tfNama.setText("");
        tfAlamat.setText("");
        tfTelp.setText("");
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
        jLabel5 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        tfNama = new javax.swing.JTextField();
        tfAlamat = new javax.swing.JTextField();
        tfTelp = new javax.swing.JTextField();
        tbInput = new javax.swing.JToggleButton();
        tbUpdate = new javax.swing.JToggleButton();
        tbDelete = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMember = new javax.swing.JTable();
        tbHome = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        cbJK = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU MEMBER");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("ID Member");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Nama lengkap");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Alamat");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("No telp");

        tfID.setEnabled(false);
        tfID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIDActionPerformed(evt);
            }
        });

        tfAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAlamatActionPerformed(evt);
            }
        });

        tbInput.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tbInput.setText("INPUT");
        tbInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbInputActionPerformed(evt);
            }
        });

        tbUpdate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tbUpdate.setText("UPDATE");
        tbUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbUpdateActionPerformed(evt);
            }
        });

        tbDelete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tbDelete.setText("DELETE");
        tbDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbDeleteActionPerformed(evt);
            }
        });

        tableMember.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMemberMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMember);

        tbHome.setText("Home");
        tbHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHomeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Jenis kelamin");

        cbJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan", "Non binary" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfID)
                    .addComponent(tfNama)
                    .addComponent(tfAlamat)
                    .addComponent(tfTelp, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                    .addComponent(cbJK, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbInput, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(tbUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(tbDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbHome)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbHome)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbJK, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbInput)
                    .addComponent(tbUpdate)
                    .addComponent(tbDelete))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIDActionPerformed

    private void tfAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAlamatActionPerformed

    private void tbUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbUpdateActionPerformed
        // TODO add your handling code here:
        try {
            this.stat = k.getConn().prepareStatement("UPDATE member " + "SET nama=?, alamat=?, jenis_kelamin=?, tlp=?" +
                    " " +
                    "WHERE id=?");
            stat.setString(1, tfNama.getText());
            stat.setString(2, tfAlamat.getText());
            stat.setString(3, cbJK.getSelectedItem().toString());
            stat.setString(4, tfTelp.getText());
            stat.setString(5, tfID.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah!");
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tbUpdateActionPerformed

    private void tbDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbDeleteActionPerformed
        // TODO add your handling code here:
        try {
            this.stat = k.getConn().prepareStatement("DELETE FROM member " + "WHERE id=?");
            stat.setString(1, tfID.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tbDeleteActionPerformed

    private void tbInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbInputActionPerformed
        // TODO add your handling code here:
        try {
            this.stat = k.getConn().prepareStatement("INSERT INTO member " + "VALUES(?, ?, ?, ?, ?)");
            stat.setInt(1, 0);
            stat.setString(2, tfNama.getText());
            stat.setString(3, tfAlamat.getText());
            stat.setString(4, cbJK.getSelectedItem().toString());
            stat.setString(5, tfTelp.getText());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan!");
            refreshTable();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_tbInputActionPerformed

    private void tableMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMemberMouseClicked
        // TODO add your handling code here:
        tfID.setText(model.getValueAt(tableMember.getSelectedRow(), 0).toString());
        tfNama.setText(model.getValueAt(tableMember.getSelectedRow(), 1).toString());
        tfAlamat.setText(model.getValueAt(tableMember.getSelectedRow(), 2).toString());
        cbJK.setSelectedItem(model.getValueAt(tableMember.getSelectedRow(), 3).toString());
        tfTelp.setText(model.getValueAt(tableMember.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tableMemberMouseClicked

    private void tbHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHomeActionPerformed
        // TODO add your handling code here:
        menu_utama mu = new menu_utama();
        mu.setId_user(id_user);
        mu.setId_outlet(id_outlet);
        mu.setRole(role);
        mu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tbHomeActionPerformed

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
            java.util.logging.Logger.getLogger(menu_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbJK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMember;
    private javax.swing.JToggleButton tbDelete;
    private javax.swing.JToggleButton tbHome;
    private javax.swing.JToggleButton tbInput;
    private javax.swing.JToggleButton tbUpdate;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfTelp;
    // End of variables declaration//GEN-END:variables
}
