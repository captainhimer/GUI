/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jfrom_lanjutan;

import javax.swing.JOptionPane;

/**
 *
 * @author MSI GF
 */
public class latihan3 extends javax.swing.JFrame {

    /**
     * Creates new form latihan3
     */
    public latihan3() {
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lebar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tinggi = new javax.swing.JTextField();
        panjang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hitung = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        sisi = new javax.swing.JTextField();
        hitung2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        hitung3 = new javax.swing.JButton();
        jari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Program Pencari Volume Bangun Ruang");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 30, 370, 40);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Masukkan Tinggi    :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 200, 150, 30);
        jPanel1.add(lebar);
        lebar.setBounds(240, 140, 220, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Masukkan Lebar     :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 140, 150, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("cm");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(480, 80, 150, 40);
        jPanel1.add(tinggi);
        tinggi.setBounds(240, 200, 220, 40);
        jPanel1.add(panjang);
        panjang.setBounds(240, 80, 220, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("cm");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(480, 140, 150, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("cm");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(480, 200, 150, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Masukkan Panjang  :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(58, 76, 150, 30);

        hitung.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hitung.setText("HITUNG");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });
        jPanel1.add(hitung);
        hitung.setBounds(280, 290, 140, 30);

        jTabbedPane1.addTab("Balok", jPanel1);

        jPanel2.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("cm");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(220, 100, 160, 30);
        jPanel2.add(sisi);
        sisi.setBounds(50, 100, 160, 30);

        hitung2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hitung2.setText("VOLUME");
        hitung2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitung2ActionPerformed(evt);
            }
        });
        jPanel2.add(hitung2);
        hitung2.setBounds(60, 150, 130, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Masukkan Panjang Sisi");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(50, 40, 160, 40);

        jTabbedPane1.addTab("Kubus", jPanel2);

        jPanel3.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("cm");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(260, 100, 40, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Masukkan Panjang Jari-Jari");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(60, 40, 200, 40);

        hitung3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hitung3.setText("VOLUME");
        hitung3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitung3ActionPerformed(evt);
            }
        });
        jPanel3.add(hitung3);
        hitung3.setBounds(80, 170, 130, 40);
        jPanel3.add(jari);
        jari.setBounds(60, 100, 190, 40);

        jTabbedPane1.addTab("Bola", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 130, 730, 530);

        setBounds(0, 0, 750, 706);
    }// </editor-fold>//GEN-END:initComponents

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
        int Panjang, Lebar, Tinggi;
        Panjang = Integer.parseInt(panjang.getText());
        Lebar = Integer.parseInt(lebar.getText());
        Tinggi = Integer.parseInt(tinggi.getText());
        int hasil = Panjang*Lebar*Tinggi;
        try{
            JOptionPane.showMessageDialog(null, "Volume Balok Adalah : "+hasil, "Luas", JOptionPane.INFORMATION_MESSAGE);
           }catch (Exception e){
                   JOptionPane.showMessageDialog(null, "Error:"+e,"Gagal", JOptionPane.WARNING_MESSAGE);
                   }
    }//GEN-LAST:event_hitungActionPerformed

    private void hitung2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitung2ActionPerformed
       int Sisi;
       Sisi = Integer.parseInt(sisi.getText());
       int hasil = Sisi*Sisi*Sisi;
       
       try{
           JOptionPane.showMessageDialog(null, "Luas Permukaan Kubus Adalah : "+hasil,"Luas",JOptionPane.INFORMATION_MESSAGE);
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error:"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_hitung2ActionPerformed

    private void hitung3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitung3ActionPerformed
       float Jari;
       Jari = Integer.parseInt(jari.getText());
       float hasil = (float) (4/3*3.14*Jari*Jari*Jari);
       
       try{
           JOptionPane.showMessageDialog(null, "Luas Permukaan Bola Adalah : "+hasil,"Luas",JOptionPane.INFORMATION_MESSAGE);
       }catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error:"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
       }
    }//GEN-LAST:event_hitung3ActionPerformed

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
            java.util.logging.Logger.getLogger(latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(latihan3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new latihan3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hitung;
    private javax.swing.JButton hitung2;
    private javax.swing.JButton hitung3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jari;
    private javax.swing.JTextField lebar;
    private javax.swing.JTextField panjang;
    private javax.swing.JTextField sisi;
    private javax.swing.JTextField tinggi;
    // End of variables declaration//GEN-END:variables
}