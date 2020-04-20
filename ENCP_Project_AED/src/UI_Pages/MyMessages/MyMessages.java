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
import Business.UserAccount.UserAccount;
import UI_Pages.*;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rohit
 */
public class MyMessages extends javax.swing.JPanel {

    /**
     * Creates new form Test_Panel_1
     */
    
    JPanel panelRight;
    Patient userAccount;
    Organization organization;
    Enterprise enterprise;
    EcoSystem business;
    DB4OUtil dB4OUtil;
    
    public MyMessages(JPanel panelRight, Patient userAccount, Organization organization, Enterprise enterprise, EcoSystem business, DB4OUtil dB4OUtil) {
        
        
        initComponents();
        this.panelRight = panelRight;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        this.dB4OUtil = dB4OUtil;
        init();   
    }
        
    public void init(){
        // Heading
        String name = userAccount.getfName() + " "+ userAccount.getfName();
        userNameLabel.setText(name);
    
        // Populate Table
        populateTable();
        
        
        panelMsg.setVisible(false);
        
        
    
    
    }
    public void populateTable()
    {
        
       DefaultTableModel model1 = (DefaultTableModel) myMessagesTbl.getModel();
       model1.setRowCount(0);
       for(Messages msg : userAccount.getMyMessages().getRecievedMsgsList().getRecievedMsgs())     {
                        Object[] row = new Object[6];
                            row[0] = msg;
                            row[1] = msg.getSubject(); // getTime();  // userAccount.getEmployee().getName();
                            row[2] = msg.getDate();  // userAccount.getEmployee().getId();
                            model1.addRow(row); 
                        
          }
       
               
        // Setting color of JTable
        
        
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.white);
       // headerRenderer.set(Color.BLACK);

        for (int i = 0; i < myMessagesTbl.getModel().getColumnCount(); i++) {
            myMessagesTbl.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
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

        composeEmail = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        btn_close = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myMessagesTbl = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelMsg = new javax.swing.JPanel();
        SenderLabel = new javax.swing.JLabel();
        SubjectLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(247, 247, 247));

        composeEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        composeEmail.setForeground(new java.awt.Color(96, 83, 150));
        composeEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_new_message_40px.png"))); // NOI18N
        composeEmail.setText("Compose A New Messages");
        composeEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                composeEmailKeyPressed(evt);
            }
        });

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

        myMessagesTbl.setBackground(new java.awt.Color(247, 247, 247));
        myMessagesTbl.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        myMessagesTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Subject", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        myMessagesTbl.setGridColor(new java.awt.Color(247, 247, 247));
        myMessagesTbl.setRowHeight(20);
        myMessagesTbl.setSelectionBackground(new java.awt.Color(96, 83, 150));
        jScrollPane1.setViewportView(myMessagesTbl);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(96, 83, 150));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_deleted_message_48px.png"))); // NOI18N
        jLabel17.setText("Delete Message");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(96, 83, 150));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_open_envelope_48px.png"))); // NOI18N
        jLabel18.setText("View Messages");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel18MousePressed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(96, 83, 150));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_outbox_48px_1.png"))); // NOI18N
        jLabel19.setText("My Outbox");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(96, 83, 150));
        jLabel6.setText("Welcome");

        panelMsg.setBackground(new java.awt.Color(247, 247, 247));

        SenderLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SenderLabel.setForeground(new java.awt.Color(96, 83, 150));
        SenderLabel.setText("Welcome");

        SubjectLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SubjectLabel.setForeground(new java.awt.Color(96, 83, 150));
        SubjectLabel.setText("Welcome");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout panelMsgLayout = new javax.swing.GroupLayout(panelMsg);
        panelMsg.setLayout(panelMsgLayout);
        panelMsgLayout.setHorizontalGroup(
            panelMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMsgLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SubjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panelMsgLayout.setVerticalGroup(
            panelMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMsgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMsgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMsgLayout.createSequentialGroup()
                        .addComponent(SenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SubjectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(560, 560, 560)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(composeEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))))))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(composeEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)))
                .addGap(18, 18, 18)
                .addComponent(panelMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

    private void composeEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_composeEmailKeyPressed
        
        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.add(new SendMessages(panelRight,userAccount,organization,enterprise,business,dB4OUtil));
        layout.next(panelRight);
        
    }//GEN-LAST:event_composeEmailKeyPressed

    private void jLabel18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MousePressed
        int selectedRow = myMessagesTbl.getSelectedRow();
        if(selectedRow >= 0)
        {
            panelMsg.setVisible(true);
            
        }        
    }//GEN-LAST:event_jLabel18MousePressed
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SenderLabel;
    private javax.swing.JLabel SubjectLabel;
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel composeEmail;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable myMessagesTbl;
    private javax.swing.JPanel panelMsg;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
