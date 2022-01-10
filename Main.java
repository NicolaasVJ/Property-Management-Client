import java.awt.Color;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.Border;
import javax.swing.BorderFactory;
import javax.swing.border.MatteBorder;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
       this.setTitle("Main Menu");
        
        //border for menu
        
        MatteBorder menu=BorderFactory.createMatteBorder(0,0,1,0, Color.white);
        lblClientProperty.setBorder(menu);
        lblLoanCalculator.setBorder(menu);
        lblOwnerProperty.setBorder(menu);
        lblProperty.setBorder(menu);
        lblTypeProperty.setBorder(menu);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblTypeProperty = new javax.swing.JLabel();
        lblProperty = new javax.swing.JLabel();
        lblLoanCalculator = new javax.swing.JLabel();
        lblOwnerProperty = new javax.swing.JLabel();
        lblClientProperty = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 32, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        lblTypeProperty.setBackground(new java.awt.Color(0, 51, 51));
        lblTypeProperty.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTypeProperty.setForeground(new java.awt.Color(255, 255, 255));
        lblTypeProperty.setText("Property Types");
        lblTypeProperty.setOpaque(true);
        lblTypeProperty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTypePropertyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTypePropertyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTypePropertyMouseExited(evt);
            }
        });

        lblProperty.setBackground(new java.awt.Color(0, 51, 51));
        lblProperty.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblProperty.setForeground(new java.awt.Color(255, 255, 255));
        lblProperty.setText("Properties");
        lblProperty.setOpaque(true);
        lblProperty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPropertyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPropertyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPropertyMouseExited(evt);
            }
        });

        lblLoanCalculator.setBackground(new java.awt.Color(0, 51, 51));
        lblLoanCalculator.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblLoanCalculator.setForeground(new java.awt.Color(255, 255, 255));
        lblLoanCalculator.setText("Loan Calculator");
        lblLoanCalculator.setOpaque(true);
        lblLoanCalculator.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoanCalculatorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLoanCalculatorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLoanCalculatorMouseExited(evt);
            }
        });

        lblOwnerProperty.setBackground(new java.awt.Color(0, 51, 51));
        lblOwnerProperty.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblOwnerProperty.setForeground(new java.awt.Color(255, 255, 255));
        lblOwnerProperty.setText("Property Owners");
        lblOwnerProperty.setOpaque(true);
        lblOwnerProperty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOwnerPropertyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOwnerPropertyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOwnerPropertyMouseExited(evt);
            }
        });

        lblClientProperty.setBackground(new java.awt.Color(0, 51, 51));
        lblClientProperty.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblClientProperty.setForeground(new java.awt.Color(255, 255, 255));
        lblClientProperty.setText("Clients");
        lblClientProperty.setOpaque(true);
        lblClientProperty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClientPropertyMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblClientPropertyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblClientPropertyMouseExited(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MainScreen.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTypeProperty)
                        .addGap(76, 76, 76)
                        .addComponent(lblOwnerProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblClientProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)))
                .addComponent(lblLoanCalculator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTypeProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOwnerProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblClientProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLoanCalculator, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblPropertyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPropertyMouseEntered
        lblProperty.setBackground(Color.WHITE);
        lblProperty.setForeground(new Color(0,51,51));
    }//GEN-LAST:event_lblPropertyMouseEntered

    private void lblPropertyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPropertyMouseExited
        lblProperty.setBackground(new Color(0,51,51));
        lblProperty.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblPropertyMouseExited

    private void lblTypePropertyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTypePropertyMouseEntered
        lblTypeProperty.setBackground(Color.WHITE);
        lblTypeProperty.setForeground(new Color(0,51,51));
    }//GEN-LAST:event_lblTypePropertyMouseEntered

    private void lblTypePropertyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTypePropertyMouseExited
        lblTypeProperty.setBackground(new Color(0,51,51));
        lblTypeProperty.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblTypePropertyMouseExited

    private void lblOwnerPropertyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOwnerPropertyMouseEntered
        lblOwnerProperty.setBackground(Color.WHITE);
        lblOwnerProperty.setForeground(new Color(0,51,51));
    }//GEN-LAST:event_lblOwnerPropertyMouseEntered

    private void lblOwnerPropertyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOwnerPropertyMouseExited
        lblOwnerProperty.setBackground(new Color(0,51,51));
        lblOwnerProperty.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblOwnerPropertyMouseExited

    private void lblClientPropertyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClientPropertyMouseEntered
        lblClientProperty.setBackground(Color.WHITE);
        lblClientProperty.setForeground(new Color(0,51,51));
    }//GEN-LAST:event_lblClientPropertyMouseEntered

    private void lblClientPropertyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClientPropertyMouseExited
        lblClientProperty.setBackground(new Color(0,51,51));
        lblClientProperty.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblClientPropertyMouseExited

    private void lblLoanCalculatorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoanCalculatorMouseEntered
        lblLoanCalculator.setBackground(Color.WHITE);
        lblLoanCalculator.setForeground(new Color(0,51,51));
    }//GEN-LAST:event_lblLoanCalculatorMouseEntered

    private void lblLoanCalculatorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoanCalculatorMouseExited
        lblLoanCalculator.setBackground(new Color(0,51,51));
        lblLoanCalculator.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblLoanCalculatorMouseExited

    private void lblTypePropertyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTypePropertyMouseClicked
        
        TypeProperty_Window typeform = new TypeProperty_Window();
        typeform.setVisible(true);
        typeform.pack();
        typeform.setLocationRelativeTo(null);
        typeform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_lblTypePropertyMouseClicked

    private void lblClientPropertyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClientPropertyMouseClicked
        Client_Window clientform = new Client_Window();
        clientform.setVisible(true);
        clientform.pack();
        clientform.setLocationRelativeTo(null);
        clientform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_lblClientPropertyMouseClicked

    private void lblOwnerPropertyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOwnerPropertyMouseClicked
        
        Owner_Window ownerform = new Owner_Window();
        ownerform.setVisible(true);
        ownerform.pack();
        ownerform.setLocationRelativeTo(null);
        ownerform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_lblOwnerPropertyMouseClicked

    private void lblPropertyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPropertyMouseClicked
        
        Property_Window propertyform = new Property_Window();
        propertyform.setVisible(true);
        propertyform.pack();
        propertyform.setLocationRelativeTo(null);
        propertyform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_lblPropertyMouseClicked

    private void lblLoanCalculatorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoanCalculatorMouseClicked
        
        LoanCalc_Window loanform = new LoanCalc_Window();
        loanform.setVisible(true);
        loanform.pack();
        loanform.setLocationRelativeTo(null);
        loanform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_lblLoanCalculatorMouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblClientProperty;
    private javax.swing.JLabel lblLoanCalculator;
    private javax.swing.JLabel lblOwnerProperty;
    private javax.swing.JLabel lblProperty;
    private javax.swing.JLabel lblTypeProperty;
    // End of variables declaration//GEN-END:variables
}
