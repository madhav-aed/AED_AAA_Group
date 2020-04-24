/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Pages.hospitalEnterprise.doctorPages;

import Business.Billing.Bill;
import Business.Customer.Appointment;
import Business.Customer.Patient;
import Business.Database.DB4OUtil;
import Business.Departments.Organization;
import Business.EcoSystem;
import Business.Employees.Employee;
import Business.Enterprises.Enterprise;
import Business.Medical.PatientDocRecord;
import Business.Role.DoctorRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BillingWorkRequest;
import Business.WorkQueue.CustomerDoctorWorkRequest;
import Business.WorkQueue.CustomerLabWorkRequest;
import UI_Pages.customerPages.PatientMedicalHistory;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rohit
 */
public class Doctor_Work extends javax.swing.JPanel {

    JPanel rightPanel;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;
    EcoSystem business;
    DB4OUtil dB4OUtil;
    CustomerDoctorWorkRequest workReq;
    Patient p;
    HashSet<String> labTests;
    
    
    public Doctor_Work(JPanel userProcessContainer,
            CustomerDoctorWorkRequest workReq,
            UserAccount account, 
            Organization organization,
            Enterprise enterprise, 
            EcoSystem business,DB4OUtil dB4OUtil) {

            this.rightPanel = userProcessContainer;
           
            this.account = account;
            this.organization = organization;
            this.enterprise = enterprise;
            this.business = business;
            this.workReq = workReq;
            this.dB4OUtil = dB4OUtil;
            this.p = this.workReq.getPatient();
            initComponents();
            labTests = new HashSet<String>();
            init();
    }

    public void init(){
        // Set labels
        
        jLabel5.setText("Hello "+account.getEmployee().getName());
        jTextField1.setEnabled(false);
        jTextField1.setText(p.getfName() + " "+p.getLastName());
        patientMedicalLbl.setText("View "+p.getfName() +"'s Medical History");
        enterpriseLbl.setText(enterprise.getName());
        // Color combos and table && Setting color of JTable
        
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.white);
        for (int i = 0; i < jTable1.getModel().getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        // Set combo box color
        reqTestComboBox1.getEditor().getEditorComponent().setBackground(Color.white);
        
        
        // Emptying table
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);

    
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
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        btn_close = new javax.swing.JLabel();
        enterpriseLbl = new javax.swing.JLabel();
        btn_close1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        diagnosisTA = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        prescriptionTA = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        reqTestComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        patientMedicalLbl = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        myScheduleLbl = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1140, 510));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(96, 83, 150));
        jLabel5.setText("Hello  ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 32, 220, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(96, 83, 150));
        jLabel7.setText("Patient details");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 138, 115, 26));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(96, 83, 150));
        jLabel10.setText("Diagnosis");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 196, 124, -1));

        jPanel15.setBackground(new java.awt.Color(96, 83, 150));

        btn_close.setBackground(new java.awt.Color(96, 83, 150));
        btn_close.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });

        enterpriseLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        enterpriseLbl.setForeground(new java.awt.Color(247, 247, 247));
        enterpriseLbl.setText("Enterprise Name");

        btn_close1.setBackground(new java.awt.Color(96, 83, 150));
        btn_close1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_close1.setForeground(new java.awt.Color(255, 255, 255));
        btn_close1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_back_to_40px.png"))); // NOI18N
        btn_close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_close1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(enterpriseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_close)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_close1))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enterpriseLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addComponent(btn_close1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, -1, -1));

        jTextField1.setEditable(false);
        jTextField1.setPreferredSize(new java.awt.Dimension(270, 30));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 138, 146, -1));

        diagnosisTA.setColumns(20);
        diagnosisTA.setRows(5);
        jScrollPane2.setViewportView(diagnosisTA);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 222, 503, 184));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(96, 83, 150));
        jLabel13.setText("Prescription");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 412, 124, -1));

        prescriptionTA.setColumns(20);
        prescriptionTA.setRows(5);
        jScrollPane3.setViewportView(prescriptionTA);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 447, 503, 159));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/images/icons8-treatment.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 633, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(96, 83, 150));
        jLabel14.setText("Submit process report");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 607, -1, -1));

        jPanel12.setBackground(new java.awt.Color(232, 201, 232));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1357, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );

        add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 73, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(96, 83, 150));
        jLabel8.setText("Request Lab Tests");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 185, 144, 26));

        reqTestComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Complete Blood Count (CBC)", "Blood Pressure Test", "Blood Sugar Test", "Lipid Profile", "ECG Test", "Liver Function Test", "Urine Analysis", "Kidney Function Test", "Test For Vitamin D Deficiency", "Thyroid Function Tests", "Test For Prostate Cancer (For Men)", "Mammogram (For Women)", "Colonoscopy" }));
        add(reqTestComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 185, -1, 30));

        jScrollPane1.setBackground(new java.awt.Color(247, 247, 247));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTable1.setBackground(new java.awt.Color(247, 247, 247));
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lab Tests"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(247, 247, 247));
        jTable1.setRowHeight(20);
        jTable1.setSelectionBackground(new java.awt.Color(96, 83, 150));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 222, 424, 318));

        patientMedicalLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        patientMedicalLbl.setForeground(new java.awt.Color(96, 83, 150));
        patientMedicalLbl.setText("My Schedule");
        add(patientMedicalLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 175, 209, 41));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(232, 201, 232));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 375, -1, -1));

        myScheduleLbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        myScheduleLbl.setForeground(new java.awt.Color(96, 83, 150));
        myScheduleLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_time_machine_40px_2.png"))); // NOI18N
        myScheduleLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                myScheduleLblMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myScheduleLblMouseClicked(evt);
            }
        });
        add(myScheduleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 129, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Images/icons8_add_40px_1.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(962, 175, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_minus_40px_2.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1012, 222, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
 //       System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        
        String item = reqTestComboBox1.getSelectedItem().toString();
        
        labTests.add(item);
        
        populateTable();
        
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked

        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow>=0){
                String item = (String)jTable1.getValueAt(selectedRow, 0);
                labTests.remove(item);
                populateTable();
            
        }else{
            JOptionPane.showMessageDialog(null, "Please make a selection first.");
        }

        
        
        
        
    }//GEN-LAST:event_jLabel3MouseClicked
public int getRandomNumber(int min, int max) {
    return (int) ((Math.random() * (max - min)) + min);
}
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
            String d = diagnosisTA.getText();
            String p = prescriptionTA.getText();
            StringBuilder sb =  new StringBuilder();
       
            
            // NO INSURANCE
        if(labTests.isEmpty()){

            Patient patient = workReq.getPatient();
            Appointment apt = workReq.getAppointment();
            Date date = workReq.getAppointment().getDate();
           
            
            // 23
            workReq.setStatus("Attended");
                    
                    
            // Medical History Record 
            PatientDocRecord record =  patient.getMedHist().createPatientDoc();

            record.setApt(apt);
            record.setDiagnosis(d);
            record.setPrescription(p);
            record.setLabTests(sb);
            record.setPatient(patient);
            record.setDate(String.valueOf(date));
            record.setStatus("Attended");
            record.setPatientDocNumber(getRandomNumber(1000,2000));
           
            // Appointment status
            apt.setStatus("Attended");
            
            
            if(!(patient.getInsDetail() == null)){
              Enterprise e =   patient.getInsCompany();
              for(Organization org :e.getOrganizationDirectory().getOrganizationList()){
                    if (org.getOrganizationType().equals("Claims  Organization")){
                       
                        BillingWorkRequest bWR  = new BillingWorkRequest();
                        bWR.setPatient(patient);
                        bWR.setRequestDate(date);
                        bWR.setClaimedAmount("100");
                        bWR.setMessage("Doc Consultation");
                        bWR.setStatus("To Insurance Enterprise");
                        bWR.setTestType("Doctor");
                     
                        org.getWorkQueue().getWorkRequestList().add(bWR);                     
                    }
                }
            }
            else{
                
                
            // Billing Record
            Bill myBill = patient.getMyBillingHistory().createNewBill();
            myBill.setAppointment(apt);
            myBill.setBillStatus("Pending");
            

            // confirm
         //   boolean notPresent = ;

            myBill.setInsurancePresent(patient.getInsDetail() == null);
           
            
                         myBill.setPaidThroughSelf(100.00);
                         myBill.setBillStatus("Pending");
            }
            disableEverything();
            JOptionPane.showMessageDialog(null, "Patient "+patient.getfName()+" report generated.");
    
            dB4OUtil.storeSystem(business);
        }
  else if(!labTests.isEmpty()){
        
            Iterator<String> it = labTests.iterator();
            while(it.hasNext()){
                      sb.append(it.next());
                      sb.append("\n");
                }        
            Patient patient = workReq.getPatient();
            Appointment apt = workReq.getAppointment();
            Date date = workReq.getAppointment().getDate();

            // Medical History Record 
            PatientDocRecord record =  patient.getMedHist().createPatientDoc();

            record.setApt(apt);
            record.setDiagnosis(d);
            record.setPrescription(p);
            record.setLabTests(sb);
            record.setPatient(patient);
            record.setDate(String.valueOf(date));
            record.setStatus("Attended");
            record.setPatientDocNumber(getRandomNumber(1000,2000));
            
            
            // Appointment status
            apt.setStatus("Awaiting Lab Tests");
                    
            
            // Lab Work Request
                

        
        for(Organization o : enterprise.getOrganizationDirectory().getOrganizationList()){
            if(o.getOrganizationType().equals("Lab Organization"))
            {        
                    CustomerLabWorkRequest labWorkReq = new CustomerLabWorkRequest();
                    labWorkReq.setOrgRequested(o);
                    labWorkReq.setNetworkState(null);
                    labWorkReq.setHospital(enterprise);
                    labWorkReq.setSpecialistType("");
                    labWorkReq.setSender(patient);
                    labWorkReq.setWorkRequestType("Doc requested test");
                    labWorkReq.setRequestDate(new Date());
                    labWorkReq.setAppointmentDate(date);
                    labWorkReq.setStatus( "Doctor requested test");
                    labWorkReq.setRefBy("Self");
                    labWorkReq.setMessage("");
                    labWorkReq.setTestResult("");
                    
                    disableEverything();
                    JOptionPane.showMessageDialog(null, "Lab Tests for Patient "+patient.getfName()+" requested to Lab");
            
                    o.getWorkQueue().getWorkRequestList().add(labWorkReq);
                    dB4OUtil.storeSystem(business);
            
            }
        
        }
        /*
            if(labWorkReq == null){
                JOptionPane.showMessageDialog(null, "Lab Organization not present in "+enterprise.getName());
            
            } */
        }

    }//GEN-LAST:event_jLabel2MouseClicked

    private void btn_close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_close1MouseClicked
        // TODO add your handling code here:
                
        Component[] comps = this.rightPanel.getComponents();// k nnm,nm
        for(Component comp: comps){
            if(comp instanceof Doctor_Home){
                Doctor_Home manageAdmin = (Doctor_Home) comp;
                manageAdmin.populateLabTable(); //populateNetworkTable();
                manageAdmin.init();
            
            }
        
        
        }
        
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        rightPanel.remove(this);
        layout.previous(rightPanel);

    }//GEN-LAST:event_btn_close1MouseClicked

    private void myScheduleLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myScheduleLblMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_myScheduleLblMouseClicked

    private void myScheduleLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myScheduleLblMousePressed
        // TODO add your handling code here:
         CardLayout layout = (CardLayout)rightPanel.getLayout();
        rightPanel.add(new PatientMedicalHistory(rightPanel,this.p));
        layout.next(rightPanel);
        
    }//GEN-LAST:event_myScheduleLblMousePressed
    public void disableEverything(){
        diagnosisTA.setEnabled(false);
        prescriptionTA.setEnabled(false);
        jLabel1.setEnabled(false);
        jLabel3.setEnabled(false);
    
    }
    public void populateTable(){
       DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
       model1.setRowCount(0);
       for (String test : labTests)
               {
                    Object[] row = new Object[1];
                    row[0] = test;
                    model1.addRow(row); 
                                             
          }
    
  
        
        
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel btn_close1;
    private javax.swing.JTextArea diagnosisTA;
    private javax.swing.JLabel enterpriseLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel myScheduleLbl;
    private javax.swing.JLabel patientMedicalLbl;
    private javax.swing.JTextArea prescriptionTA;
    private javax.swing.JComboBox<String> reqTestComboBox1;
    // End of variables declaration//GEN-END:variables
}
