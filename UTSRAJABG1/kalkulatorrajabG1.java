/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author RAJABB
 */
public class kalkulatorrajabG1 extends javax.swing.JFrame {
   String angka;
   double jumlah, angka1,angka2;
   int pilih;
   public kalkulatorrajabG1() {
        initComponents();
        angka="";
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tampil = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnBagi = new javax.swing.JButton();
        btnAngka7 = new javax.swing.JButton();
        btnAngka8 = new javax.swing.JButton();
        btnKali = new javax.swing.JButton();
        btnAngka9 = new javax.swing.JButton();
        btnAngka4 = new javax.swing.JButton();
        btnAngka5 = new javax.swing.JButton();
        btnAngka6 = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnAngka1 = new javax.swing.JButton();
        btnAngka3 = new javax.swing.JButton();
        btnAngka2 = new javax.swing.JButton();
        btnAngka0 = new javax.swing.JButton();
        btnKoma = new javax.swing.JButton();
        btnSamadengan = new javax.swing.JButton();
        btnpersen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tampil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Tampil.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Tampil.setText(" ");

        btnHapus.setBackground(new java.awt.Color(102, 255, 102));
        btnHapus.setText("C");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBagi.setBackground(new java.awt.Color(204, 204, 204));
        btnBagi.setText("/");
        btnBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBagiActionPerformed(evt);
            }
        });

        btnAngka7.setBackground(new java.awt.Color(204, 204, 204));
        btnAngka7.setText("7");
        btnAngka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka7ActionPerformed(evt);
            }
        });

        btnAngka8.setBackground(new java.awt.Color(204, 204, 204));
        btnAngka8.setText("8");
        btnAngka8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka8ActionPerformed(evt);
            }
        });

        btnKali.setBackground(new java.awt.Color(204, 204, 204));
        btnKali.setText("x");
        btnKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaliActionPerformed(evt);
            }
        });

        btnAngka9.setBackground(new java.awt.Color(204, 204, 204));
        btnAngka9.setText("9");
        btnAngka9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka9ActionPerformed(evt);
            }
        });

        btnAngka4.setBackground(new java.awt.Color(204, 204, 204));
        btnAngka4.setText("4");
        btnAngka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka4ActionPerformed(evt);
            }
        });

        btnAngka5.setBackground(new java.awt.Color(204, 204, 204));
        btnAngka5.setText("5");
        btnAngka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka5ActionPerformed(evt);
            }
        });

        btnAngka6.setBackground(new java.awt.Color(204, 204, 204));
        btnAngka6.setText("6");
        btnAngka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka6ActionPerformed(evt);
            }
        });

        btnKurang.setBackground(new java.awt.Color(204, 204, 204));
        btnKurang.setText("-");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(204, 204, 204));
        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnAngka1.setBackground(new java.awt.Color(204, 204, 204));
        btnAngka1.setText("1");
        btnAngka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka1ActionPerformed(evt);
            }
        });

        btnAngka3.setBackground(new java.awt.Color(204, 204, 204));
        btnAngka3.setText("3");
        btnAngka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka3ActionPerformed(evt);
            }
        });

        btnAngka2.setBackground(new java.awt.Color(204, 204, 204));
        btnAngka2.setText("2");
        btnAngka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka2ActionPerformed(evt);
            }
        });

        btnAngka0.setBackground(new java.awt.Color(204, 204, 204));
        btnAngka0.setText("0");
        btnAngka0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAngka0ActionPerformed(evt);
            }
        });

        btnKoma.setBackground(new java.awt.Color(204, 204, 204));
        btnKoma.setText(",");
        btnKoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKomaActionPerformed(evt);
            }
        });

        btnSamadengan.setBackground(new java.awt.Color(0, 255, 255));
        btnSamadengan.setText("=");
        btnSamadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSamadenganActionPerformed(evt);
            }
        });

        btnpersen.setBackground(new java.awt.Color(204, 204, 204));
        btnpersen.setText("%");
        btnpersen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpersenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAngka7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAngka8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAngka9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKali, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Tampil, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpersen, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAngka4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAngka5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAngka6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAngka3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAngka0, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKoma, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSamadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tampil, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBagi)
                    .addComponent(btnpersen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnAngka9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAngka8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAngka7)
                    .addComponent(btnKali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnAngka6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAngka5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAngka4)
                    .addComponent(btnKurang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnAngka3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAngka2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAngka1)
                    .addComponent(btnTambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKoma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSamadengan)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAngka0, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaliActionPerformed
        angka1=Double.parseDouble(angka);
        Tampil.setText("*");
        angka="";
        pilih=3;
    }//GEN-LAST:event_btnKaliActionPerformed

    private void btnAngka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka4ActionPerformed
       angka += "4";
       Tampil.setText(angka);
    }//GEN-LAST:event_btnAngka4ActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
      angka1=Double.parseDouble(angka);
      Tampil.setText("+");
      angka="";
      pilih=1;
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
     Tampil.setText("");
     angka1=0.0;
     angka2=0.0;
     jumlah=0.0;
     angka ="";
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKomaActionPerformed
        angka += ".";
        Tampil.setText(angka);
    }//GEN-LAST:event_btnKomaActionPerformed

    private void btnAngka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka1ActionPerformed
       angka += "1";
       Tampil.setText(angka); 
    }//GEN-LAST:event_btnAngka1ActionPerformed

    private void btnAngka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka2ActionPerformed
        angka += "2";
       Tampil.setText(angka);
    }//GEN-LAST:event_btnAngka2ActionPerformed

    private void btnAngka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka3ActionPerformed
        angka += "3";
       Tampil.setText(angka);
    }//GEN-LAST:event_btnAngka3ActionPerformed

    private void btnAngka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka5ActionPerformed
       angka += "5";
       Tampil.setText(angka);
    }//GEN-LAST:event_btnAngka5ActionPerformed

    private void btnAngka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka6ActionPerformed
        angka += "6";
       Tampil.setText(angka);
    }//GEN-LAST:event_btnAngka6ActionPerformed

    private void btnAngka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka7ActionPerformed
        angka += "7";
       Tampil.setText(angka);
    }//GEN-LAST:event_btnAngka7ActionPerformed

    private void btnAngka8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka8ActionPerformed
        angka += "8";
       Tampil.setText(angka);
    }//GEN-LAST:event_btnAngka8ActionPerformed

    private void btnAngka9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka9ActionPerformed
        angka += "9";
       Tampil.setText(angka);
    }//GEN-LAST:event_btnAngka9ActionPerformed

    private void btnBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBagiActionPerformed
       angka1=Double.parseDouble(angka);
       Tampil.setText("/");
       angka="";
       pilih=4;
    }//GEN-LAST:event_btnBagiActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
      angka1=Double.parseDouble(angka);
      Tampil.setText("-");
      angka="";
      pilih=2;

    }//GEN-LAST:event_btnKurangActionPerformed

    private void btnSamadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSamadenganActionPerformed
        switch(pilih){
        case 1:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 + angka2;
            angka = Double.toString(jumlah);
            Tampil.setText(angka);
            break;
        case 2:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 - angka2;
            angka = Double.toString(jumlah);
            Tampil.setText(angka);
            break;
        case 3:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 * angka2;
            angka = Double.toString(jumlah);
            Tampil.setText(angka);
            break;
        case 4:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 / angka2;
            angka = Double.toString(jumlah);
            Tampil.setText(angka);
            
        case 5:
            angka2 = Double.parseDouble(angka);
            jumlah = angka1 % angka2;
            angka = Double.toString(jumlah);
            Tampil.setText(angka);
            break;
            default:
            break;
        }    
    }//GEN-LAST:event_btnSamadenganActionPerformed

    private void btnAngka0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAngka0ActionPerformed
       angka += "0";
       Tampil.setText(angka);
    }//GEN-LAST:event_btnAngka0ActionPerformed

    private void btnpersenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpersenActionPerformed
        angka1=Double.parseDouble(angka);
       Tampil.setText("%");
       angka="";
       pilih=5;
    }//GEN-LAST:event_btnpersenActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulatorUts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulatorUts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulatorUts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulatorUts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulatorrajab().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tampil;
    private javax.swing.JButton btnAngka0;
    private javax.swing.JButton btnAngka1;
    private javax.swing.JButton btnAngka2;
    private javax.swing.JButton btnAngka3;
    private javax.swing.JButton btnAngka4;
    private javax.swing.JButton btnAngka5;
    private javax.swing.JButton btnAngka6;
    private javax.swing.JButton btnAngka7;
    private javax.swing.JButton btnAngka8;
    private javax.swing.JButton btnAngka9;
    private javax.swing.JButton btnBagi;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKali;
    private javax.swing.JButton btnKoma;
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnSamadengan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnpersen;
    // End of variables declaration//GEN-END:variables
}
