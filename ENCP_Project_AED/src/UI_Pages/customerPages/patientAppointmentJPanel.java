/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Pages.customerPages;

import Business.Database.DB4OUtil;
import Business.Departments.Organization;
import Business.EcoSystem;
import Business.Employees.Employee;
import Business.Enterprises.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;

/**
 *
 * @author Sudhanshu Gangele
 */
public class patientAppointmentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form patientAppointmentJPanel
     */
    
    JPanel rightPanel;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    EcoSystem business;
    DB4OUtil dB4OUtil;
    WorkRequest workReq ;
    public patientAppointmentJPanel(JPanel panelRight, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business, DB4OUtil dB4OUtil){
        initComponents();
        this.rightPanel = panelRight;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        this.dB4OUtil = dB4OUtil;
   //     this.workReq = business.getNetworkList()
        //populateSpecialistComboBox();
           
    }

    public String[] populateDoctorComboBox(String s1){
//      DONOT DELETE ---UNCODE WHEN THE OBJECT CALL IS DONE

//        int count = 0;
//        String sp[] = new String[10];
//           
//          ArrayList<Employee> empList;
//          
//          empList = business.getEmployeeDirectory().getEmployeeList();
//          
//          for(Employee emp:empList ){
//              if(emp.getDocSpeciality().equals(s1)){
//                  sp[count] = emp.getName();
//                  count++;
//                }
//          }
          
         
        
        String s[] = new String[10]; 
         if(s1.equals("Primary Physician")){
            s[0]="Julia Brown";
         }
         if(s1.equals("Cardiologist")){
            s[0]="Deepak BalaSubramaniam";
            s[1]="Zhang Wei";
         }
         if(s1.equals("Rheumatologist")){
            s[0]="Ryan Gosling";
            s[1]="Emma Watson";
         }
         if(s1.equals("General Surgeon")){
            s[0]="Bruce Lee";
            s[1]="Jackie Chan";
         }
         if(s1.equals("Psychiatrist")){
            s[0]="Rihanna";
            s[1]="Kal Penn";
         }
         if(s1.equals("Dermatologist")){
            s[0]="Cameroon Diaz";
            s[1]="Charlize Theron";
         }
         if(s1.equals("Neurologist")){
            s[0]="Erner Werhard";
            s[1]="James Cameroon";
         }
         
//       comboBoxSpecialistType.setModel(dm);
        return s;
    }
    
    
       public String[] populateSpecialistComboBox(String s1){
//         DONOT DELETE ------ Uncode when the object call is successfully done -------

//          String sp[] = new String[10];
//           
//          ArrayList<Employee.DocType> docSpecializationList;
//          
//          docSpecializationList = business.getEmployeeDirectory().getDocSpecializationList();
//          
//         if((s1.equals("Lab Appointment"))||(s1.equals("Tests for Insurance"))){
//            sp[0]= "Lab Technician";
//         }
//           
//          if(s1.equals("Doctor Appointment"))   {
//              
//              if(docSpecializationList.contains(Employee.DocType.PrimaryPhysician)){
//              sp[0] ="Primary Physician";
//              }
//
//              if(docSpecializationList.contains(Employee.DocType.Cardiologist)){
//              sp[1] ="Cardiologist";
//              }
//              if(docSpecializationList.contains(Employee.DocType.Rheumatologist)){
//              sp[2] ="Rheumatologist";
//              }
//              if(docSpecializationList.contains(Employee.DocType.Surgeon)){
//              sp[3] ="General Surgeon";
//              }
//              if(docSpecializationList.contains(Employee.DocType.Psychiatrist)){
//              sp[4] ="Psychiatrist";
//              }
//              if(docSpecializationList.contains(Employee.DocType.Dermatologist)){
//              sp[5] ="Dermatologist";
//              }
//              if(docSpecializationList.contains(Employee.DocType.Neurologist)){
//              sp[6] ="Neurologist";
//              }
//       }

        String s[] = new String[10]; 
         if((s1.equals("Lab Appointment"))||(s1.equals("Tests for Insurance"))){
            s[0]= "Lab Technician";
         }
         if(s1.equals("Doctor Appointment")){
             s[0]= "Primary Physician";
             s[1]= "Cardiologist";
             s[2]= "Rheumatologist";
             s[3]= "General Surgeon";
             s[4]= "Psychiatrist";
             s[5]= "Dermatologist";
             s[6]= "Neurologist";
       }

        return s;
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
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        comboBoxSpecialistType = new javax.swing.JComboBox<>();
        comboBoxAppmntType = new javax.swing.JComboBox<>();
        comboBoxDoctor = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBooking = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        btn_close = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        labelIcon = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblAppointmentDate = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        lblAppointmentDoc1 = new javax.swing.JLabel();
        btnBookAppointment = new java.awt.Button();
        btnCancel = new java.awt.Button();
        btnChange = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTrackAppointment = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(96, 83, 150));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Make Appointment");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(96, 83, 150));
        jLabel8.setText("Appointment Type");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(96, 83, 150));
        jLabel14.setText("Specialist");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(96, 83, 150));
        jLabel15.setText("Date");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(96, 83, 150));
        jLabel16.setText("Doctor");

        comboBoxSpecialistType.setEditable(true);
        comboBoxSpecialistType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxSpecialistTypeItemStateChanged(evt);
            }
        });
        comboBoxSpecialistType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxSpecialistTypeActionPerformed(evt);
            }
        });

        comboBoxAppmntType.setEditable(true);
        comboBoxAppmntType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lab Appointment", "Doctor Appointment", "Tests for Insurance", " " }));
        comboBoxAppmntType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxAppmntTypeItemStateChanged(evt);
            }
        });
        comboBoxAppmntType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxAppmntTypeActionPerformed(evt);
            }
        });

        comboBoxDoctor.setEditable(true);
        comboBoxDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxSpecialistType, javax.swing.GroupLayout.Alignment.TRAILING, 0, 159, Short.MAX_VALUE)
                            .addComponent(comboBoxAppmntType, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxDoctor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxAppmntType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxSpecialistType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 320, 390));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(96, 83, 150));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Booking History");

        jScrollPane1.setBackground(new java.awt.Color(247, 247, 247));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tblBooking.setBackground(new java.awt.Color(247, 247, 247));
        tblBooking.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblBooking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Allan", "XLS", "2hrs"},
                {"Brian", "React", "1hr"},
                {"Romeo", "C#", "3 Days"},
                {"Alex", "C++ ", "10 hrs"}
            },
            new String [] {
                "Date", "Doctor ", "Appointment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblBooking.setGridColor(new java.awt.Color(247, 247, 247));
        tblBooking.setRowHeight(20);
        tblBooking.setSelectionBackground(new java.awt.Color(96, 83, 150));
        jScrollPane1.setViewportView(tblBooking);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 570, 220));

        jPanel15.setBackground(new java.awt.Color(96, 83, 150));

        btn_close.setBackground(new java.awt.Color(96, 83, 150));
        btn_close.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_back_to_40px.png"))); // NOI18N
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
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(btn_close)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_close, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 0, 230, 70));

        jLabel13.setBackground(new java.awt.Color(41, 216, 95));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(96, 83, 150));
        jLabel13.setText("Welcome back ");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 23, 130, 37));

        lblPatientName.setBackground(new java.awt.Color(41, 216, 95));
        lblPatientName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPatientName.setForeground(new java.awt.Color(96, 83, 150));
        lblPatientName.setText("Dino Konstantopolos");
        add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 27, 240, 30));

        labelIcon.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        labelIcon.setForeground(new java.awt.Color(96, 83, 150));
        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_health_checkup_80px.png"))); // NOI18N
        add(labelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 140, 90));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(96, 83, 150));
        jLabel21.setText("Your next appointment is on ");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 66, 160, 30));

        lblAppointmentDate.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblAppointmentDate.setForeground(new java.awt.Color(96, 83, 150));
        lblAppointmentDate.setText(" 5th April 2020 ");
        add(lblAppointmentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 90, 20));

        jPanel11.setBackground(new java.awt.Color(232, 201, 232));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1120, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1120, -1));

        lblAppointmentDoc1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblAppointmentDoc1.setForeground(new java.awt.Color(96, 83, 150));
        lblAppointmentDoc1.setText("with Dr. Madhav ");
        add(lblAppointmentDoc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 90, 20));

        btnBookAppointment.setBackground(new java.awt.Color(96, 83, 150));
        btnBookAppointment.setForeground(new java.awt.Color(255, 255, 255));
        btnBookAppointment.setLabel("Book Appointment");
        btnBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentActionPerformed(evt);
            }
        });
        add(btnBookAppointment, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 130, 40));

        btnCancel.setBackground(new java.awt.Color(96, 83, 150));
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setLabel("Cancel Appointment");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 580, 130, 40));

        btnChange.setBackground(new java.awt.Color(96, 83, 150));
        btnChange.setForeground(new java.awt.Color(255, 255, 255));
        btnChange.setLabel("Change Date");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 130, 40));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(96, 83, 150));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Track Appointment");

        jScrollPane2.setBackground(new java.awt.Color(247, 247, 247));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        tblTrackAppointment.setBackground(new java.awt.Color(247, 247, 247));
        tblTrackAppointment.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tblTrackAppointment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Allan", "XLS", "2hrs"},
                {"Brian", "React", "1hr"},
                {"Romeo", "C#", "3 Days"},
                {"Alex", "C++ ", "10 hrs"}
            },
            new String [] {
                "Date", "Doctor ", "Appointment"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblTrackAppointment.setGridColor(new java.awt.Color(247, 247, 247));
        tblTrackAppointment.setRowHeight(20);
        tblTrackAppointment.setSelectionBackground(new java.awt.Color(96, 83, 150));
        jScrollPane2.setViewportView(tblTrackAppointment);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 570, 210));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
      //  System.exit(0);
              CardLayout layout = (CardLayout)rightPanel.getLayout();
        rightPanel.remove(this);
        layout.previous(rightPanel);

      
      
      
    }//GEN-LAST:event_btn_closeMouseClicked

    private void btnBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentActionPerformed
        // TODO add your handling code here:
        
        
  //      if (workReq.isEmpty() == false){
        String appointmentType= comboBoxAppmntType.getSelectedItem().toString();
        String specialistType = comboBoxSpecialistType.getSelectedItem().toString();
        String doctor = comboBoxDoctor.getSelectedItem().toString();
        Date date = jDateChooser1.getDate();
        
        workReq.setDoctor(doctor);
        workReq.setPatient(userAccount.getEmployee().getName());
        workReq.setEnterprise(enterprise);
        workReq.setRequestDate(date);
        workReq.setAppointmentType(appointmentType);
        
        
        
        
    //}    
    }//GEN-LAST:event_btnBookAppointmentActionPerformed
   
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangeActionPerformed

    private void comboBoxAppmntTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxAppmntTypeActionPerformed
        // TODO add your handling code here:
     //   comboBoxDoctor.removeAllItems();
        
        
    }//GEN-LAST:event_comboBoxAppmntTypeActionPerformed

    private void comboBoxSpecialistTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSpecialistTypeActionPerformed
        // TODO add your handling code here:
   //     comboBoxDoctor.removeAllItems();
       
    }//GEN-LAST:event_comboBoxSpecialistTypeActionPerformed

    private void comboBoxAppmntTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxAppmntTypeItemStateChanged

        // TODO add your handling code here:
        
        
        
        
        if(evt.getStateChange()==ItemEvent.SELECTED){
            comboBoxDoctor.removeAllItems();
            if(this.comboBoxAppmntType.getSelectedIndex()>=0){
                this.comboBoxSpecialistType.setModel(new DefaultComboBoxModel(this.populateSpecialistComboBox(this.comboBoxAppmntType.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_comboBoxAppmntTypeItemStateChanged

    private void comboBoxSpecialistTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxSpecialistTypeItemStateChanged
        // TODO add your handling code here:
        
        
        
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(this.comboBoxSpecialistType.getSelectedIndex()>=0){
                this.comboBoxDoctor.setModel(new DefaultComboBoxModel(this.populateDoctorComboBox(this.comboBoxSpecialistType.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_comboBoxSpecialistTypeItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnBookAppointment;
    private java.awt.Button btnCancel;
    private java.awt.Button btnChange;
    private javax.swing.JLabel btn_close;
    private javax.swing.JComboBox<String> comboBoxAppmntType;
    private javax.swing.JComboBox<String> comboBoxDoctor;
    private javax.swing.JComboBox<String> comboBoxSpecialistType;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel lblAppointmentDate;
    private javax.swing.JLabel lblAppointmentDoc1;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JTable tblBooking;
    private javax.swing.JTable tblTrackAppointment;
    // End of variables declaration//GEN-END:variables
}
