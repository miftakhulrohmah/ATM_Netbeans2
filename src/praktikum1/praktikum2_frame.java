/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author A455L
 */
public class praktikum2_frame extends javax.swing.JFrame {

    /**
     * Creates new form praktikum2_frame
     */
    public praktikum2_frame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        thasil = new javax.swing.JTextField();
        b4 = new javax.swing.JTextField();
        b3 = new javax.swing.JTextField();
        b2 = new javax.swing.JTextField();
        b1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("PROGRAM ARITMATKA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 20, 140, 20);

        jLabel2.setText("Jenis Aritmatika");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 70, 90, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Penjumlahan", "Pengurangan", "Perkalian", "Pembagian" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(130, 70, 140, 20);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("OPERASI"));
        jPanel1.setLayout(null);
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 20, 130, 30);

        jLabel4.setText("Jumlah bilangan");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 40, 80, 30);

        jLabel5.setText("Bilangan 1");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 90, 80, 20);

        jLabel6.setText("Bilangan 2");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 120, 80, 20);

        jLabel7.setText("Bilangan 3");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 150, 80, 20);

        jLabel8.setText("Bilangan 4");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 180, 80, 20);

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(100, 210, 63, 23);

        thasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thasilActionPerformed(evt);
            }
        });
        jPanel1.add(thasil);
        thasil.setBounds(80, 240, 110, 50);
        jPanel1.add(b4);
        b4.setBounds(120, 180, 100, 20);
        jPanel1.add(b3);
        b3.setBounds(120, 150, 100, 20);
        jPanel1.add(b2);
        b2.setBounds(120, 120, 100, 20);

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);
        b1.setBounds(120, 90, 100, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 130, 260, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void thasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thasilActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b1ActionPerformed

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
            java.util.logging.Logger.getLogger(praktikum2_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(praktikum2_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(praktikum2_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(praktikum2_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new praktikum2_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField b1;
    private javax.swing.JTextField b2;
    private javax.swing.JTextField b3;
    private javax.swing.JTextField b4;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField thasil;
    // End of variables declaration//GEN-END:variables
}
