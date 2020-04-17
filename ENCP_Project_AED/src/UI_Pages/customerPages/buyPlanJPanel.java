/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Pages.customerPages;

import Business.Customer.Patient;
import Business.Database.DB4OUtil;
import Business.Departments.Organization;
import Business.EcoSystem;
import Business.Enterprises.Enterprise;
import Business.UserAccount.UserAccount;
import UI_Pages.Sudhanshu.*;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Sudhanshu Gangele
 */
public class buyPlanJPanel extends javax.swing.JPanel {

    /**
     * Creates new form buyPlanJPanel
     */
    
    JPanel panelRight;
 
    UserAccount patient;
    Organization organization;
    Enterprise enterprise;
    EcoSystem business;
    DB4OUtil dB4OUtil;
    buyPlanJPanel(JPanel panelRight, UserAccount patient, Organization organization, Enterprise enterprise, EcoSystem business, DB4OUtil dB4OUtil) {
        initComponents();
        this.panelRight = panelRight;
        this.patient = patient;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        this.dB4OUtil = dB4OUtil;
        
        btn_back.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        btnBronze = new java.awt.Button();
        jPanel5 = new javax.swing.JPanel();
        btnGold = new java.awt.Button();
        jPanel7 = new javax.swing.JPanel();
        btnPlatinum = new java.awt.Button();
        jPanel15 = new javax.swing.JPanel();
        btn_back = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(247, 247, 247));

        btnBronze.setBackground(new java.awt.Color(205, 127, 50));
        btnBronze.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnBronze.setForeground(new java.awt.Color(255, 255, 255));
        btnBronze.setLabel("Bronze");
        btnBronze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBronzeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnBronze, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addComponent(btnBronze, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 235, 370));

        jPanel5.setBackground(new java.awt.Color(247, 247, 247));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGold.setBackground(new java.awt.Color(212, 175, 55));
        btnGold.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnGold.setForeground(new java.awt.Color(255, 255, 255));
        btnGold.setLabel("Gold");
        btnGold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoldActionPerformed(evt);
            }
        });
        jPanel5.add(btnGold, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 130, 40));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 236, 370));

        jPanel7.setBackground(new java.awt.Color(247, 247, 247));

        btnPlatinum.setBackground(new java.awt.Color(211, 211, 211));
        btnPlatinum.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPlatinum.setForeground(new java.awt.Color(255, 255, 255));
        btnPlatinum.setLabel("Platinum");
        btnPlatinum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlatinumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(btnPlatinum, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(298, Short.MAX_VALUE)
                .addComponent(btnPlatinum, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(513, 110, 232, 370));

        jPanel15.setBackground(new java.awt.Color(96, 83, 150));

        btn_back.setBackground(new java.awt.Color(96, 83, 150));
        btn_back.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_back_to_40px.png"))); // NOI18N
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(btn_back)
                .addGap(36, 36, 36))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_back, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 230, 70));

        jLabel11.setBackground(new java.awt.Color(41, 216, 95));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(12, 115, 101));
        jLabel11.setText("Choose Plan ");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 23, 130, 37));

        jPanel11.setBackground(new java.awt.Color(232, 201, 232));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 940, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlatinumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlatinumActionPerformed
        // TODO add your handling code here:
                String plan = "Platinum";
        DetailsAndPurchasePlanJPanel panel = new DetailsAndPurchasePlanJPanel(panelRight, patient, organization, enterprise, business, dB4OUtil,plan);
        panelRight.add("DetailsAndPurchasePlanJPanel", panel);
        CardLayout layout = (CardLayout) panelRight.getLayout();
        layout.next(panelRight);
    }//GEN-LAST:event_btnPlatinumActionPerformed

    private void btnGoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoldActionPerformed
        // TODO add your handling code here:
                String plan = "Gold";
        DetailsAndPurchasePlanJPanel panel = new DetailsAndPurchasePlanJPanel(panelRight, patient, organization, enterprise, business, dB4OUtil,plan);
        panelRight.add("DetailsAndPurchasePlanJPanel", panel);
        CardLayout layout = (CardLayout) panelRight.getLayout();
        layout.next(panelRight);
    }//GEN-LAST:event_btnGoldActionPerformed

    private void btnBronzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBronzeActionPerformed
        // TODO add your handling code here:
        String plan = "Bronze";
        DetailsAndPurchasePlanJPanel panel = new DetailsAndPurchasePlanJPanel(panelRight, patient, organization, enterprise, business, dB4OUtil,plan);
        panelRight.add("DetailsAndPurchasePlanJPanel", panel);
        CardLayout layout = (CardLayout) panelRight.getLayout();
        layout.next(panelRight);
    }//GEN-LAST:event_btnBronzeActionPerformed

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        // TODO add your handling code here:
        //  System.exit(0);
        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.remove(this);
        layout.previous(panelRight);

    }//GEN-LAST:event_btn_backMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnBronze;
    private java.awt.Button btnGold;
    private java.awt.Button btnPlatinum;
    private javax.swing.JLabel btn_back;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
