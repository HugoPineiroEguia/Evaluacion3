package boletin30;

import java.util.ArrayList;



public class Boletin30 extends javax.swing.JFrame {
    
    float a, b;
    String operador;

    public Boletin30() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        b3 = new javax.swing.JToggleButton();
        b1 = new javax.swing.JToggleButton();
        b2 = new javax.swing.JToggleButton();
        b6 = new javax.swing.JToggleButton();
        b4 = new javax.swing.JToggleButton();
        b5 = new javax.swing.JToggleButton();
        b9 = new javax.swing.JToggleButton();
        b7 = new javax.swing.JToggleButton();
        b8 = new javax.swing.JToggleButton();
        b0 = new javax.swing.JToggleButton();
        bdecimal = new javax.swing.JToggleButton();
        bresult = new javax.swing.JToggleButton();
        bdiv = new javax.swing.JToggleButton();
        bsuma = new javax.swing.JToggleButton();
        bprod = new javax.swing.JToggleButton();
        bresta = new javax.swing.JToggleButton();
        bAC = new javax.swing.JToggleButton();
        bOFF = new javax.swing.JToggleButton();
        tValores = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(0, 255, 153));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b3.setBackground(new java.awt.Color(102, 255, 153));
        b3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b3.setForeground(new java.awt.Color(51, 51, 51));
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        panel.add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 173, 70, 70));

        b1.setBackground(new java.awt.Color(102, 255, 153));
        b1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b1.setForeground(new java.awt.Color(51, 51, 51));
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        panel.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 173, 70, 70));

        b2.setBackground(new java.awt.Color(102, 255, 153));
        b2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b2.setForeground(new java.awt.Color(51, 51, 51));
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        panel.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 173, 70, 70));

        b6.setBackground(new java.awt.Color(102, 255, 153));
        b6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b6.setForeground(new java.awt.Color(51, 51, 51));
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        panel.add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 249, 70, 70));

        b4.setBackground(new java.awt.Color(102, 255, 153));
        b4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b4.setForeground(new java.awt.Color(51, 51, 51));
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        panel.add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 249, 70, 70));

        b5.setBackground(new java.awt.Color(102, 255, 153));
        b5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b5.setForeground(new java.awt.Color(51, 51, 51));
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        panel.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 249, 70, 70));

        b9.setBackground(new java.awt.Color(102, 255, 153));
        b9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b9.setForeground(new java.awt.Color(51, 51, 51));
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        panel.add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 325, 70, 70));

        b7.setBackground(new java.awt.Color(102, 255, 153));
        b7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b7.setForeground(new java.awt.Color(51, 51, 51));
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        panel.add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 325, 70, 70));

        b8.setBackground(new java.awt.Color(102, 255, 153));
        b8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b8.setForeground(new java.awt.Color(51, 51, 51));
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        panel.add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 325, 70, 70));

        b0.setBackground(new java.awt.Color(102, 255, 153));
        b0.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        b0.setForeground(new java.awt.Color(51, 51, 51));
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        panel.add(b0, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 401, 70, 70));

        bdecimal.setBackground(new java.awt.Color(102, 255, 153));
        bdecimal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bdecimal.setForeground(new java.awt.Color(51, 51, 51));
        bdecimal.setText(".");
        bdecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdecimalActionPerformed(evt);
            }
        });
        panel.add(bdecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 401, 70, 70));

        bresult.setBackground(new java.awt.Color(102, 255, 153));
        bresult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bresult.setForeground(new java.awt.Color(51, 51, 51));
        bresult.setText("=");
        bresult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bresultActionPerformed(evt);
            }
        });
        panel.add(bresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 401, 70, 70));

        bdiv.setBackground(new java.awt.Color(102, 255, 153));
        bdiv.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bdiv.setForeground(new java.awt.Color(51, 51, 51));
        bdiv.setText("/");
        bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivActionPerformed(evt);
            }
        });
        panel.add(bdiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 173, 70, 70));

        bsuma.setBackground(new java.awt.Color(102, 255, 153));
        bsuma.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bsuma.setForeground(new java.awt.Color(51, 51, 51));
        bsuma.setText("+");
        bsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsumaActionPerformed(evt);
            }
        });
        panel.add(bsuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 401, 70, 70));

        bprod.setBackground(new java.awt.Color(102, 255, 153));
        bprod.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bprod.setForeground(new java.awt.Color(51, 51, 51));
        bprod.setText("*");
        bprod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprodActionPerformed(evt);
            }
        });
        panel.add(bprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 249, 70, 70));

        bresta.setBackground(new java.awt.Color(102, 255, 153));
        bresta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bresta.setForeground(new java.awt.Color(51, 51, 51));
        bresta.setText("-");
        bresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brestaActionPerformed(evt);
            }
        });
        panel.add(bresta, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 325, 70, 70));

        bAC.setBackground(new java.awt.Color(0, 153, 255));
        bAC.setForeground(new java.awt.Color(51, 51, 51));
        bAC.setText("AC");
        bAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bACActionPerformed(evt);
            }
        });
        panel.add(bAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 146, -1));

        bOFF.setBackground(new java.awt.Color(204, 153, 0));
        bOFF.setForeground(new java.awt.Color(51, 51, 51));
        bOFF.setText("OFF");
        bOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOFFActionPerformed(evt);
            }
        });
        panel.add(bOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 146, -1));

        tValores.setBackground(new java.awt.Color(204, 255, 204));
        tValores.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        tValores.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        panel.add(tValores, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 298, 59));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
       tValores.setText(tValores.getText()+"3");
       a = Float.parseFloat(tValores.getText());
    }//GEN-LAST:event_b3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        tValores.setText(tValores.getText()+"1");
        a = Float.parseFloat(tValores.getText());
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        tValores.setText(tValores.getText()+"2");
        a = Float.parseFloat(tValores.getText());
    }//GEN-LAST:event_b2ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        tValores.setText(tValores.getText()+"6");
    }//GEN-LAST:event_b6ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        tValores.setText(tValores.getText()+"4");
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
       tValores.setText(tValores.getText()+"5");
    }//GEN-LAST:event_b5ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        tValores.setText(tValores.getText()+"9");
    }//GEN-LAST:event_b9ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        tValores.setText(tValores.getText()+"7");
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        tValores.setText(tValores.getText()+"8");
    }//GEN-LAST:event_b8ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        tValores.setText(tValores.getText()+"0");
    }//GEN-LAST:event_b0ActionPerformed

    private void bdecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdecimalActionPerformed
        if (!tValores.getText().contains(".")){
            tValores.setText(tValores.getText()+".");
        }
    }//GEN-LAST:event_bdecimalActionPerformed

    private void bresultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bresultActionPerformed
        b = Float.parseFloat(tValores.getText());
        switch (operador){
            case "+":
                tValores.setText(Float.toString(a+b));
                break;
            case"-":
                tValores.setText(Float.toString(a-b));
                break;
            case"*":
                tValores.setText(Float.toString(a*b));
                break;
            case"/":
                tValores.setText(Float.toString(a/b));
                break;
        }
    }//GEN-LAST:event_bresultActionPerformed

    private void bdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdivActionPerformed
       a = Float.parseFloat(tValores.getText());
       operador = "/";
       tValores.setText("");
    }//GEN-LAST:event_bdivActionPerformed

    private void bsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsumaActionPerformed
       a = Float.parseFloat(tValores.getText());
       operador = "+";
       tValores.setText("");
    }//GEN-LAST:event_bsumaActionPerformed

    private void bprodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprodActionPerformed
        a = Float.parseFloat(tValores.getText());
       operador = "*";
       tValores.setText("");
    }//GEN-LAST:event_bprodActionPerformed

    private void brestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brestaActionPerformed
       a = Float.parseFloat(tValores.getText());
       operador = "-";
       tValores.setText("");
    }//GEN-LAST:event_brestaActionPerformed

    private void bACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bACActionPerformed
        tValores.setText("");
    }//GEN-LAST:event_bACActionPerformed

    private void bOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOFFActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bOFFActionPerformed

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
            java.util.logging.Logger.getLogger(Boletin30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Boletin30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Boletin30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Boletin30.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Boletin30().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton b0;
    private javax.swing.JToggleButton b1;
    private javax.swing.JToggleButton b2;
    private javax.swing.JToggleButton b3;
    private javax.swing.JToggleButton b4;
    private javax.swing.JToggleButton b5;
    private javax.swing.JToggleButton b6;
    private javax.swing.JToggleButton b7;
    private javax.swing.JToggleButton b8;
    private javax.swing.JToggleButton b9;
    private javax.swing.JToggleButton bAC;
    private javax.swing.JToggleButton bOFF;
    private javax.swing.JToggleButton bdecimal;
    private javax.swing.JToggleButton bdiv;
    private javax.swing.JToggleButton bprod;
    private javax.swing.JToggleButton bresta;
    private javax.swing.JToggleButton bresult;
    private javax.swing.JToggleButton bsuma;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField tValores;
    // End of variables declaration//GEN-END:variables
}
