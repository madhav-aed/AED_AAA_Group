/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Pages.HomePages;

import Business.Customer.Patient;
import Business.Database.DB4OUtil;
import Business.Departments.Organization;
import Business.EcoSystem;
import Business.Enterprises.Enterprise;
import Business.UserAccount.UserAccount;
import UI_Pages.adminPages.Admin_WorkSpace;
import UI_Pages.customerPages.Create_New_Patient;
import UI_Pages.customerPages.Customer_WorkSpace;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Frame;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author proxc
 */
public class Query extends javax.swing.JFrame {

    /**
     * Creates new form Home17
     */
    
       
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public Query() {
        
                system = dB4OUtil.retrieveSystem();

        initComponents();
        containerPanel.setSize(750, 540);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerPanel = new javax.swing.JPanel();
        login = new javax.swing.JPanel();
        lbl_close = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);

        containerPanel.setBackground(new java.awt.Color(255, 255, 255));
        containerPanel.setPreferredSize(new java.awt.Dimension(800, 500));
        containerPanel.setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setMinimumSize(new java.awt.Dimension(778, 600));
        login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                loginMouseDragged(evt);
            }
        });
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginMousePressed(evt);
            }
        });

        lbl_close.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        lbl_close.setForeground(new java.awt.Color(51, 51, 51));
        lbl_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_multiply_60px.png"))); // NOI18N
        lbl_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_closeMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("<html>HQ - San Mateo, CA  2950 S. Delaware Street, Suite 201 <br>  San Mateo CA 94403   <br> Reception/General enquiries: +1 650 513 0514");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Contact");

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                .addGap(720, 720, 720)
                .addComponent(lbl_close, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginLayout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(jLabel7)
                    .addContainerGap(647, Short.MAX_VALUE)))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addComponent(lbl_close, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginLayout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addComponent(jLabel7)
                    .addContainerGap(474, Short.MAX_VALUE)))
        );

        containerPanel.add(login, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMousePressed
        // TODO add your handling code here:

        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_loginMousePressed

    private void loginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_loginMouseDragged

    private void lbl_closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMousePressed
        // TODO add your handling code here:
        // System.exit(0);
        dispose();
    }//GEN-LAST:event_lbl_closeMousePressed

    int xy, xx;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JPanel login;
    // End of variables declaration//GEN-END:variables
}
