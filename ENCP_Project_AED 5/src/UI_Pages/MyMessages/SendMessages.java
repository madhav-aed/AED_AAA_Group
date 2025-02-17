/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Pages.MyMessages;

import Business.Customer.Patient;
import UI_Pages.customerPages.*;
import Business.Database.DB4OUtil;
import Business.Departments.Organization;
import Business.EcoSystem;
import Business.Enterprises.Enterprise;
import Business.Messages.Messages;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import UI_Pages.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rohit
 */
public class SendMessages extends javax.swing.JPanel {

    /**
     * Creates new form Test_Panel_1
     */
    
    JPanel panelRight;
    Patient userAccount;
    Organization organization;
    Enterprise enterprise;
    EcoSystem business;
    DB4OUtil dB4OUtil;
    
    public SendMessages(JPanel panelRight, Patient userAccount, Organization organization, Enterprise enterprise, EcoSystem business, DB4OUtil dB4OUtil) {
        
        
        initComponents();
        this.panelRight = panelRight;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        this.dB4OUtil = dB4OUtil;
        String name = userAccount.getfName() + " "+ userAccount.getfName();
        userNameLabel.setText(name);
    
    
        
        
        
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userNameLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        SenderLabel = new javax.swing.JLabel();
        SenderLabel2 = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        SenderLabel3 = new javax.swing.JLabel();
        subjectText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageText = new javax.swing.JTextArea();
        jPanel17 = new javax.swing.JPanel();
        btn_close2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(96, 83, 150));
        userNameLabel.setText("Welcome");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(96, 83, 150));
        jLabel6.setText("Welcome");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        SenderLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SenderLabel.setForeground(new java.awt.Color(96, 83, 150));
        SenderLabel.setText("Message");

        SenderLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SenderLabel2.setForeground(new java.awt.Color(96, 83, 150));
        SenderLabel2.setText("Email");

        emailTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTxtActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(96, 83, 150));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_paper_plane_48px.png"))); // NOI18N
        jLabel16.setText("Send Mail");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });

        SenderLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SenderLabel3.setForeground(new java.awt.Color(96, 83, 150));
        SenderLabel3.setText("Subject");

        subjectText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectTextActionPerformed(evt);
            }
        });

        messageText.setColumns(20);
        messageText.setRows(5);
        jScrollPane1.setViewportView(messageText);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SenderLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SenderLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subjectText, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1))))
                .addGap(32, 32, 32))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SenderLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SenderLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subjectText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addGap(336, 336, 336))
        );

        jPanel17.setBackground(new java.awt.Color(96, 83, 150));

        btn_close2.setBackground(new java.awt.Color(96, 83, 150));
        btn_close2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_close2.setForeground(new java.awt.Color(255, 255, 255));
        btn_close2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_back_to_40px.png"))); // NOI18N
        btn_close2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_close2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGap(0, 152, Short.MAX_VALUE)
                .addComponent(btn_close2))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_close2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(232, 201, 232));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void emailTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTxtActionPerformed

    private void subjectTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectTextActionPerformed

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        String username = emailTxt.getText();
        String subject = subjectText.getText();
        String message = messageText.getText();
        
        // look for username, if present proceed if( system.username){  }
        UserAccount recieverAccount = null;
        
      if (usernamePatternCorrect()==false){
           emailTxt.setForeground (Color.red);
           emailTxt.setBorder(BorderFactory.createLineBorder(Color.RED));
           JOptionPane.showMessageDialog(null, "Username should be in the format of xx_xx@xx.xx");
           return;
       } else{
           emailTxt.setForeground (Color.BLACK);
           emailTxt.setBorder(BorderFactory.createLineBorder(Color.black));
       }
    
      if (isAreaFull()==false){
           subjectText.setForeground (Color.red);
           subjectText.setBorder(BorderFactory.createLineBorder(Color.RED));
           messageText.setForeground (Color.red);
           messageText.setBorder(BorderFactory.createLineBorder(Color.RED));
           JOptionPane.showMessageDialog(null, "Cannot send empty messages. Try Telekinesis instead!");
           return;
       } else{
           subjectText.setForeground (Color.BLACK);
           subjectText.setForeground (Color.BLACK);
           messageText.setBorder(BorderFactory.createLineBorder(Color.black));
           messageText.setBorder(BorderFactory.createLineBorder(Color.black));
       }        
        
      
        //First search in across the networks
        recieverAccount = business.getUserAccountDirectory().getUserByUsername(username);
        
        if(recieverAccount == null){
            for(Network net : business.getNetworkList()){
                for(Enterprise et : net.getEnterpriseDirectory().getEnterpriseList()){
                    if(recieverAccount != null) break;
                    recieverAccount = et.getUserAccountDirectory().getUserByUsername(username);
                    if(recieverAccount == null){
                        for(Organization org : et.getOrganizationDirectory().getOrganizationList()){
                             recieverAccount = org.getUserAccountDirectory().getUserByUsername(username);
                             if(recieverAccount != null) break;
                        }
                    }                    
                }
                if(recieverAccount != null) break;
            }   
        }
        if(recieverAccount == null){
            // Now check if its another patient
            for(Patient p : business.getPatientDirectory().getPatientList()){
                if(p.getUserName().equals(username)) {recieverAccount = p; break;}
  
            }
        }

        if(recieverAccount == null){
            // Now check if its another patient
        
            JOptionPane.showMessageDialog(null, "Please check the username again!");
        
        
        }
        
        if(recieverAccount != null){
            Messages msg = new Messages(userAccount, recieverAccount, subjectText.getText(), messageText.getText(), new Date());
        
            // sending queue
            userAccount.getMyMessages().getSentMsgsList().getSentMsgs().add(msg);
            
            // sending queue
            recieverAccount.getMyMessages().getRecievedMsgsList().getRecievedMsgs().add(msg);
        
            // prompt queue
            
            JOptionPane.showMessageDialog(null, "Email sent successfully!");
        
            dB4OUtil.storeSystem(business);
        }
        
        
        
        // username found? then proceed to get his recieved messages, and add the message in MQ
        
        // Also add message in senders message queue
        
        
        
        
    }//GEN-LAST:event_jLabel16MousePressed

    private boolean usernamePatternCorrect(){
        Pattern p=Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m=p.matcher(emailTxt.getText());
        boolean b=m.matches();
        return b;
    }
    
    private boolean isAreaFull(){
        if(subjectText.getText().isEmpty()){
            return false;
        }
        if(messageText.getText().isEmpty()){
            return false;
        }
        return true;
    }    
    private void btn_close2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_close2MouseClicked
        // TODO add your handling code here:
        //  System.exit(0);
        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.remove(this);
        layout.previous(panelRight);

    }//GEN-LAST:event_btn_close2MouseClicked
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SenderLabel;
    private javax.swing.JLabel SenderLabel2;
    private javax.swing.JLabel SenderLabel3;
    private javax.swing.JLabel btn_close2;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea messageText;
    private javax.swing.JTextField subjectText;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
