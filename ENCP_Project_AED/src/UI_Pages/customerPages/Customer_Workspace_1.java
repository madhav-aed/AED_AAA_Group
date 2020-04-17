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
import UI_Pages.*;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rohit
 */
public class Customer_Workspace_1 extends javax.swing.JPanel {

    /**
     * Creates new form Test_Panel_1
     */
    
    JPanel panelRight;
    UserAccount patient;
    Organization organization;
    Enterprise enterprise;
    EcoSystem business;
    DB4OUtil dB4OUtil;
    
    public Customer_Workspace_1(JPanel panelRight, UserAccount patient, Organization organization, Enterprise enterprise, EcoSystem business, DB4OUtil dB4OUtil) {
        
        
        initComponents();
        this.panelRight = panelRight;
        this.patient = patient;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        this.dB4OUtil = dB4OUtil;
        String name = "Jon" + " Snow";
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

        jLabel5 = new javax.swing.JLabel();
        bookAppointmentbt = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        medicalHistoryBtn = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        MyPaymentsBtn = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        emailName1Label = new javax.swing.JLabel();
        emailText1Label = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        emailName2Label = new javax.swing.JLabel();
        emailText2Label = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        btn_close = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(247, 247, 247));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(96, 83, 150));
        jLabel5.setText("Welcome");

        bookAppointmentbt.setBackground(new java.awt.Color(255, 255, 255));
        bookAppointmentbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bookAppointmentbtMousePressed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(96, 83, 150));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_stethoscope_40px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(96, 83, 150));
        jLabel6.setText("Book an appointment");

        jPanel11.setBackground(new java.awt.Color(232, 201, 232));

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

        javax.swing.GroupLayout bookAppointmentbtLayout = new javax.swing.GroupLayout(bookAppointmentbt);
        bookAppointmentbt.setLayout(bookAppointmentbtLayout);
        bookAppointmentbtLayout.setHorizontalGroup(
            bookAppointmentbtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bookAppointmentbtLayout.createSequentialGroup()
                .addGroup(bookAppointmentbtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookAppointmentbtLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel8))
                    .addGroup(bookAppointmentbtLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        bookAppointmentbtLayout.setVerticalGroup(
            bookAppointmentbtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookAppointmentbtLayout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        medicalHistoryBtn.setBackground(new java.awt.Color(255, 255, 255));
        medicalHistoryBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                medicalHistoryBtnPressed(evt);
            }
        });
        medicalHistoryBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(96, 83, 150));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_time_machine_40px_2.png"))); // NOI18N
        medicalHistoryBtn.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(96, 83, 150));
        jLabel19.setText("My Medical History");
        medicalHistoryBtn.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 120, 20));

        jPanel10.setBackground(new java.awt.Color(232, 201, 232));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                medicalHistoryBtnPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        medicalHistoryBtn.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 10));

        MyPaymentsBtn.setBackground(new java.awt.Color(255, 255, 255));
        MyPaymentsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MyPaymentsBtnMousePressed(evt);
            }
        });
        MyPaymentsBtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(96, 83, 150));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_wallet_40px.png"))); // NOI18N
        MyPaymentsBtn.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 75, -1));

        jPanel12.setBackground(new java.awt.Color(232, 201, 232));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        MyPaymentsBtn.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 10));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(96, 83, 150));
        jLabel20.setText("My Payments");
        MyPaymentsBtn.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 120, 20));

        jPanel7.setBackground(new java.awt.Color(247, 247, 247));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        emailName1Label.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        emailName1Label.setForeground(new java.awt.Color(96, 83, 150));
        emailName1Label.setText("Oscar");

        emailText1Label.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        emailText1Label.setForeground(new java.awt.Color(96, 83, 150));
        emailText1Label.setText("<html>\nNew incoming story on this side<br>\nNothing major happening\n</html>");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(emailName1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(emailName2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(emailText2Label, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(emailName2Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addGap(145, 145, 145))
        );

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(96, 83, 150));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_new_message_40px.png"))); // NOI18N
        jLabel16.setText("Recent mail");

        jPanel15.setBackground(new java.awt.Color(96, 83, 150));

        btn_close.setBackground(new java.awt.Color(96, 83, 150));
        btn_close.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_faq_56px_1.png"))); // NOI18N
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(btn_close)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_close, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(96, 83, 150));
        userNameLabel.setText("Welcome");

        jScrollPane1.setBackground(new java.awt.Color(247, 247, 247));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTable1.setBackground(new java.awt.Color(247, 247, 247));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Purpose of Visit", "Doctor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(247, 247, 247));
        jTable1.setRowHeight(20);
        jTable1.setSelectionBackground(new java.awt.Color(96, 83, 150));
        jScrollPane1.setViewportView(jTable1);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(96, 83, 150));
        jLabel23.setText("My Appointment History");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bookAppointmentbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(medicalHistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(MyPaymentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bookAppointmentbt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MyPaymentsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(medicalHistoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(77, 77, 77)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

    private void bookAppointmentbtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookAppointmentbtMousePressed
        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.add(new patientAppointmentJPanel(panelRight,patient,organization,enterprise,business,dB4OUtil));
        layout.next(panelRight);
        // Book appointment panel calling here
        
      
               
               
               
               
    }//GEN-LAST:event_bookAppointmentbtMousePressed

    private void medicalHistoryBtnPressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medicalHistoryBtnPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicalHistoryBtnPressed

    private void MyPaymentsBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyPaymentsBtnMousePressed
        // TODO add your handling code here:
        
        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.add(new patientBillJPanel(panelRight));
        layout.next(panelRight);
        // Book appointment panel calling here
               
    }//GEN-LAST:event_MyPaymentsBtnMousePressed
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MyPaymentsBtn;
    private javax.swing.JPanel bookAppointmentbt;
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel emailName1Label;
    private javax.swing.JLabel emailName2Label;
    private javax.swing.JLabel emailText1Label;
    private javax.swing.JLabel emailText2Label;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel medicalHistoryBtn;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
