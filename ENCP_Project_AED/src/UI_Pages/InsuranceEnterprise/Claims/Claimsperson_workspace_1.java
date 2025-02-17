/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Pages.InsuranceEnterprise.Claims;

import UI_Pages.InsuranceEnterprise.Manager.*;
import Business.Database.DB4OUtil;
import Business.Departments.Organization;
import Business.EcoSystem;
import Business.Enterprises.Enterprise;
import Business.Messages.Messages;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BillingWorkRequest;
import Business.WorkQueue.BuyInsuranceWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sudhanshu Gangele
 */
public class Claimsperson_workspace_1 extends javax.swing.JPanel {

    /**
     * Creates new form manager_workspace_1
     */
    JPanel panelRight;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    EcoSystem business;
    DB4OUtil dB4OUtil;
    
    
    public Claimsperson_workspace_1(JPanel panelRight, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business, DB4OUtil dB4OUtil) {
        initComponents();
        this.panelRight = panelRight;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        this.dB4OUtil = dB4OUtil;
        
        populateTable();
         setMyEmails();
        lblAgentName.setText("Welcome "+this.userAccount.getEmployee().getName());
    }
    
    
        public void setMyEmails(){
        int myInboxNumber = userAccount.getMyMessages().getRecievedMsgsList().getRecievedMsgsList().size();
 //       for(Messages msgs : patient.getMyMessages().getRecievedMsgsList().getRecievedMsgsList())
            if(myInboxNumber > 1){
                Messages msgs = userAccount.getMyMessages().getRecievedMsgsList().getRecievedMsgsList().get(myInboxNumber - 1);
                
                emailName1Label.setText(""+msgs.getSender());
                emailText1Label.setText(""+msgs.getSubject());                
            
                Messages lastButone  = userAccount.getMyMessages().getRecievedMsgsList().getRecievedMsgsList().get(myInboxNumber - 2);
                emailName2Label.setText(""+lastButone.getSender());
                emailText2Label.setText(""+lastButone.getSubject());                
            
            }
            else if(myInboxNumber == 1){
                Messages msgs = userAccount.getMyMessages().getRecievedMsgsList().getRecievedMsgsList().get(myInboxNumber - 1);
                
                emailName1Label.setText(""+msgs.getSender());
                emailText1Label.setText(""+msgs.getSubject());                
            
            //    Messages lastButone  = patient.getMyMessages().getRecievedMsgsList().getRecievedMsgsList().get(myInboxNumber - 2);
                emailName2Label.setText("                                               ");; // .setText(""+lastButone.getSender());
                emailText2Label.setText("                                               ");; //.setText(""+lastButone.getSubject());                
            
            }
            else if(myInboxNumber == 0){
//                Messages msgs = patient.getMyMessages().getRecievedMsgsList().getRecievedMsgsList().get(myInboxNumber - 1);
                
                emailName1Label.setText("No new messages");
                emailText1Label.setText("                                               ");;               
            
            //    Messages lastButone  = patient.getMyMessages().getRecievedMsgsList().getRecievedMsgsList().get(myInboxNumber - 2);
                emailName2Label.setText("                                               "); // .setText(""+lastButone.getSender());
                emailText2Label.setText("                                               "); //.setText(""+lastButone.getSubject());                
            
            }



            
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAgentName = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblCaimsCount = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnProcess = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustdetails = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lblSalesCount = new javax.swing.JLabel();
        lblPlanName = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        emailName1Label = new javax.swing.JLabel();
        emailText1Label = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        emailName2Label = new javax.swing.JLabel();
        emailText2Label = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(247, 247, 247));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAgentName.setBackground(new java.awt.Color(41, 216, 95));
        lblAgentName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAgentName.setForeground(new java.awt.Color(12, 115, 101));
        lblAgentName.setText("Kal Bugrara");
        add(lblAgentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 27, 320, 30));

        jLabel11.setBackground(new java.awt.Color(41, 216, 95));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(12, 115, 101));
        jLabel11.setText("Welcome back ");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 23, 130, 37));

        jPanel12.setBackground(new java.awt.Color(16, 190, 121));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 820, -1));

        jPanel1.setBackground(new java.awt.Color(247, 247, 247));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(12, 115, 101));
        jLabel7.setText("Pending Sales Requests");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCaimsCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblCaimsCount.setForeground(new java.awt.Color(12, 115, 101));
        lblCaimsCount.setText("50");
        jPanel5.add(lblCaimsCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 22, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(12, 115, 101));
        jLabel19.setText("Claims requests");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 130, 20));

        jPanel10.setBackground(new java.awt.Color(16, 190, 121));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 10));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(12, 115, 101));
        jLabel10.setText("Pending Claims Requests");

        btnProcess.setBackground(new java.awt.Color(16, 190, 121));
        btnProcess.setForeground(new java.awt.Color(255, 255, 255));
        btnProcess.setLabel("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(247, 247, 247));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tblCustdetails.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblCustdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Date", "File Number", "Name", "Plan", "Current Status"
            }
        ));
        tblCustdetails.setGridColor(new java.awt.Color(247, 247, 247));
        tblCustdetails.setRowHeight(20);
        tblCustdetails.setSelectionBackground(new java.awt.Color(153, 255, 153));
        tblCustdetails.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tblCustdetails);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        lblSalesCount.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblSalesCount.setForeground(new java.awt.Color(12, 115, 101));
        lblSalesCount.setText("500");

        lblPlanName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPlanName.setForeground(new java.awt.Color(12, 115, 101));
        lblPlanName.setText("Sales Requests");

        jPanel11.setBackground(new java.awt.Color(16, 190, 121));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSalesCount, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlanName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblSalesCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPlanName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel7.setBackground(new java.awt.Color(247, 247, 247));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        emailName1Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailName1Label.setForeground(new java.awt.Color(96, 83, 150));
        emailName1Label.setText("Oscar");

        emailText1Label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        emailText1Label.setForeground(new java.awt.Color(96, 83, 150));
        emailText1Label.setText("<html> New incoming story on this side<br> Nothing major happening </html>");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailName1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailText1Label))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emailName1Label, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailText1Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        emailName2Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailName2Label.setForeground(new java.awt.Color(96, 83, 150));
        emailName2Label.setText("Omar");

        emailText2Label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        emailText2Label.setForeground(new java.awt.Color(96, 83, 150));
        emailText2Label.setText("<html>\nNew incoming story on this side<br>\nNothing major happening\n</html>");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailName2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailText2Label, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emailName2Label, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailText2Label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(289, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(96, 83, 150));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_new_message_40px.png"))); // NOI18N
        jLabel16.setText("Recent mail");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 64, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 830, 630));
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable(){
            
            int countSaleReq = 0;
            int countClmReq = 0;
            DefaultTableModel dtm = (DefaultTableModel) tblCustdetails.getModel();
            dtm.setRowCount(0);
            
 
//                if(org.getOrganizationType().equals(Organization.Type.Sales_Organization.getValue())){
                    
//                for( WorkRequest workRequest: organization.getWorkQueue().getWorkRequestList()) {
//                    
//                   BuyInsuranceWorkRequest repWorkreq = (BuyInsuranceWorkRequest)workRequest;
//                    if(repWorkreq.getStatus().equals("In process")){
//                        Object[] row = new Object[5];
//                        row[0]=repWorkreq.getRequestDate();
//                        row[1]=repWorkreq;
//                        row[2]=repWorkreq.getPatient();
//                        row[3]=repWorkreq.getPatient().getPlanType();
//                        row[4]=repWorkreq.getStatus();
//                        dtm.addRow(row);
//                        
//                        //to update label to show pending claims request
//                        countSaleReq++;
//                        
//                    }
//                }
//                }
//                if(org.getOrganizationType().equals(Organization.Type.Claims_Organization.getValue())){
                for( WorkRequest workRequest: organization.getWorkQueue().getWorkRequestList()) {
                
                   BillingWorkRequest claimReq = (BillingWorkRequest)workRequest;
                    if(!(claimReq.getStatus().equals("In Process"))){
                        Object[] row = new Object[5];
                        row[0]=claimReq.getRequestDate();
                        row[1]=claimReq;
                        row[2]=claimReq.getPatient();
                        row[3]=claimReq.getPatient().getPlanType();
                        row[4]=claimReq.getStatus();
                        dtm.addRow(row);
                        
                        countClmReq++;
                   
                }
                }
//                }
    
            
//            lblSalesCount.setText(String.valueOf(countSaleReq));
            lblCaimsCount.setText(String.valueOf(countClmReq));
    }
    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblCustdetails.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
          
        }
        else{
//            BillingWorkRequest claimReq = (BillingWorkRequest)workRequest;
            BillingWorkRequest claimReq = (BillingWorkRequest)tblCustdetails.getValueAt(selectedRow, 1);
        
                claimsProcessPanel panel = new claimsProcessPanel(panelRight,userAccount,organization,enterprise,business,dB4OUtil,claimReq);
                 panelRight.add("claimsProcessPanel", panel);
                CardLayout layout = (CardLayout) panelRight.getLayout();
                 layout.next(panelRight);
 
            }

    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnProcess;
    private javax.swing.JLabel emailName1Label;
    private javax.swing.JLabel emailName2Label;
    private javax.swing.JLabel emailText1Label;
    private javax.swing.JLabel emailText2Label;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgentName;
    private javax.swing.JLabel lblCaimsCount;
    private javax.swing.JLabel lblPlanName;
    private javax.swing.JLabel lblSalesCount;
    private javax.swing.JTable tblCustdetails;
    // End of variables declaration//GEN-END:variables
}
