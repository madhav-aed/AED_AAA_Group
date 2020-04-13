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
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
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
//        this.workReq = business.getWorkQueue().createWorkRequest();
 //       populateComboBox();
 
    }
    
//  DONOT DELETE---UNCOMMENT ONCE THE CONNECTION IS MADE    
//    public void populateComboBox(){
//         DefaultComboBoxModel dm=new DefaultComboBoxModel();
//           for(Network n:business.getNetworkList()){
//           dm.addElement(n);    
//   }
//       comboBoxCityNetwork.setModel(dm);
//    }
    
    public String[] populateHospitalEnterpriseComboBox(String s1){
    
//         DONOT DELETE ------ Uncode when the object call is successfully done -------
//            public Enterprise[] populateHospitalEnterpriseComboBox(Network s1){
//            String sp[] = new String[5];
//            Enterprise epList[] = new Enterprise[5];
//            int count = 0;
//            for(Network n:business.getNetworkList()){
//                if(n.equals(s1)){
//                 for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
//                     epList[count] = e;
//                     count++;
//                 }
//                }
//            }
//            return epList;


        String s[] = new String[3]; 
         if(s1.equals("Massachussets")){
            s[0]= "Boston City Hospital";
            s[1]= "Cambridge Lifeline Hospital";
            
         }
         if(s1.equals("California")){
             s[0]= "Valley Sunshine Hospital";
             s[1]= "Fremont RedCross Hospital";
             
       }

        return s;
    }

    
       public String[] populateDoctorComboBox(String s1){
//      DONOT DELETE ---UNCODE WHEN THE OBJECT CALL IS DONE

//          int count = 0;
//          String sp[] = new String[10];
//          
//          List<String> docLabSpecializationList;
//          docLabSpecializationList = business.getEmployeeDirectory().getDocLabSpecializationList();
//          Network n1 = (Network)comboBoxStateNetwork.getSelectedItem();
//          Enterprise e1 = (Enterprise)comboBoxhospitalEnterprise.getSelectedItem();
////          String speciality = comboBoxSpecialistType.getSelectedItem().toString();
//          
//          for(Network n : business.getNetworkList()){
//              if(n.equals(n1)){
//              for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
//                  if(e.equals(e1)){
//                  for(Organization org : e.getOrganizationDirectory().getOrganizationList()){
//                      if(org.getOrgType()=="Doctor Organization"){
//                      for(String l : docLabSpecializationList){
//                          if(l.equals(s1)){
//                          for(Employee emp : org.getEmployeeDirectory().getEmployeeList()){
//                              sp[count] = emp.getName();
//                              count++;
////                              continue;
//                          }
//                          }else{
//                          sp[count] = "No Doctor";     
//                          }
//                      }
//                          
//                      }
//                      
//                      
//                      if(org.getOrgType()=="Lab Organization"){
//                      for(String l : docLabSpecializationList){
//                          if(l.equals(s1)){
//                          for(Employee emp : org.getEmployeeDirectory().getEmployeeList()){
//                              sp[count] = emp.getName();
//                              count++;
////                              continue;
//                          }
//                          }else{
//                          sp[count] = "No LabPerson";     
//                          }
//                      }
//                          
//                      }
//                 
//                  }
//                  }else{
//                      sp[count] = "No Hospitals";
//                     }
//              }
//              } else{
//                  sp[count] = "No network";
//                  }
//          }
//         return sp;




   
        String sp[] = new String[10]; 
         if(s1.equals("Primary Physician")){
            sp[0]="Julia Brown";
         }
         if(s1.equals("Cardiologist")){
            sp[0]="Deepak BalaSubramaniam";
            sp[1]="Zhang Wei";
         }
         if(s1.equals("Rheumatologist")){
            sp[0]="Ryan Gosling";
            sp[1]="Emma Watson";
         }
         if(s1.equals("General Surgeon")){
            sp[0]="Bruce Lee";
            sp[1]="Jackie Chan";
         }
         if(s1.equals("Psychiatrist")){
            sp[0]="Rihanna";
            sp[1]="Kal Penn";
         }
         if(s1.equals("Dermatologist")){
            sp[0]="Cameroon Diaz";
            sp[1]="Charlize Theron";
         }
         if(s1.equals("Neurologist")){
            sp[0]="Erner Werhard";
            sp[1]="James Cameroon";
         }
         
        return sp;
    }
    
    
    
  
//      DONOT DELETE ---UNCODE WHEN THE OBJECT CALL IS DONE   
       
    public String[] populateAppointmentTypeOrganizationComboBox(String s1){
//    //    public Organization[] populateAppointmentTypeOrganizationComboBox(Enterprise s1){

//       public String[] populateAppointmentTypeOrganizationComboBox(Enterprise s1){ 
//            Organization org[] = new Organization[5];
//            String sp[] = new String[5];
//            int count = 0;
//            
//            
//            for(Network n:business.getNetworkList()){
//                for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
//                    if(e.equals(s1)){

//                       for(Organization o1: e.getOrganizationDirectory().getOrganizationList()){
//                           if(o1.getOrgType()=="Doctor Organization"){
//                               sp[count] = "Doctor";
//                               org[count] = o1;
//                               count++;
//                          //     continue;
//                           }
//                           if(o1.getOrgType()=="Lab Organization"){
//                               sp[count] = "Vitals Test";
//                               org[count] = o1;
//                               count++;
//                               sp[count] = "Tests For Insurance";
//                               org[count] = o1;
//                          //     continue;
//                           }
//                            
//                       }
//                       
//                    }
//                }
//            }
//            return sp;
//    //        return org;
            
            
// ---CODE ABOVE DONOT DELETE ------            
        String s[] = new String[3];
         s[0] = "Doctor Appointment";
         s[1] = "Lab Appointment";
         s[2] = "Tests for Insurance";
          

        
        return s;
    
    }
    
       public String[] populateSpecialistComboBox(String s1){
//         DONOT DELETE ------ Uncode when the object call is successfully done -------
//
//          int count = 0;
//          String sp[] = new String[10];
//          
//          List<String> docLabSpecializationList;
//          docLabSpecializationList = business.getEmployeeDirectory().getDocLabSpecializationList();
//          Network n1 = (Network)comboBoxStateNetwork.getSelectedItem();
//          Enterprise e1 = (Enterprise)comboBoxhospitalEnterprise.getSelectedItem();
//          for(Network n : business.getNetworkList()){
//              if(n.equals(n1)){
//              for(Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()){
//                  if(e.equals(e1)){
//                  for(Organization org : e.getOrganizationDirectory().getOrganizationList()){
//                      if((org.getOrgType()=="Doctor Organization")&&(s1=="Doctor")){
//                          for(Employee emp : org.getEmployeeDirectory().getEmployeeList()){
//                              sp[count] = emp.getSpeciality();
//                              count++;
////                              continue;
//                          }
//                      }
//                      
//                      if((org.getOrgType()=="Lab Organization")&&((s1=="Vitals Test")||(s1=="Tests For Insurance"))){
//                          for(Employee emp : org.getEmployeeDirectory().getEmployeeList()){
//                              sp[count] = emp.getSpeciality();
//                              count++;
////                              continue;
//                          }
//                      }
//                  }
//                  }
//              }
//              }
//          }
//         return sp;
// ---DONOT DELETE ABOVE----

        String sp[] = new String[10]; 
      
         if((s1.equals("Lab Appointment"))||(s1.equals("Tests for Insurance"))){
            sp[0]= "Lab Technician";
         }
         if(s1.equals("Doctor Appointment")){
             sp[0]= "Primary Physician";
             sp[1]= "Cardiologist";
             sp[2]= "Rheumatologist";
             sp[3]= "General Surgeon";
             sp[4]= "Psychiatrist";
             sp[5]= "Dermatologist";
             sp[6]= "Neurologist";
         }

        return sp;
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
        comboBoxAppTypeOrganization = new javax.swing.JComboBox<>();
        comboBoxDoctor = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        comboBoxStateNetwork = new javax.swing.JComboBox<>();
        comboBoxhospitalEnterprise = new javax.swing.JComboBox<>();
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
        jLabel16.setText("Doctor/Lab");

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

        comboBoxAppTypeOrganization.setEditable(true);
        comboBoxAppTypeOrganization.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxAppTypeOrganizationItemStateChanged(evt);
            }
        });
        comboBoxAppTypeOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxAppTypeOrganizationActionPerformed(evt);
            }
        });

        comboBoxDoctor.setEditable(true);

        jDateChooser1.setMinSelectableDate(new java.util.Date(1586581275000L));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(96, 83, 150));
        jLabel9.setText("Hospital Name");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(96, 83, 150));
        jLabel17.setText("State");

        comboBoxStateNetwork.setEditable(true);
        comboBoxStateNetwork.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Massachussets", "California", " " }));
        comboBoxStateNetwork.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxStateNetworkItemStateChanged(evt);
            }
        });
        comboBoxStateNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxStateNetworkActionPerformed(evt);
            }
        });

        comboBoxhospitalEnterprise.setEditable(true);
        comboBoxhospitalEnterprise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        comboBoxhospitalEnterprise.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxhospitalEnterpriseItemStateChanged(evt);
            }
        });
        comboBoxhospitalEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxhospitalEnterpriseActionPerformed(evt);
            }
        });

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
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxSpecialistType, javax.swing.GroupLayout.Alignment.LEADING, 0, 150, Short.MAX_VALUE)
                            .addComponent(comboBoxAppTypeOrganization, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxhospitalEnterprise, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxStateNetwork, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxDoctor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(9, 9, 9)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxStateNetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxhospitalEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxAppTypeOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxSpecialistType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 320, 410));

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
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 570, 220));

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
        add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 370, 130, 40));

        btnChange.setBackground(new java.awt.Color(96, 83, 150));
        btnChange.setForeground(new java.awt.Color(255, 255, 255));
        btnChange.setLabel("Change Date");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 130, 40));
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
        
        String org;
        String state = comboBoxStateNetwork.getSelectedItem().toString();
        String hospital = comboBoxhospitalEnterprise.getSelectedItem().toString();
        String appointmentType= comboBoxAppTypeOrganization.getSelectedItem().toString();
        if(appointmentType=="Doctor"){
             org = "Doctor Organization";
        }else{
            org = "Lab Organization";
        }
        String specialistType = comboBoxSpecialistType.getSelectedItem().toString();
        String doctor = comboBoxDoctor.getSelectedItem().toString();
        Date date = jDateChooser1.getDate();
        
        
        workReq.setNetworkState(state);
        workReq.setEnterpriseHospital(hospital);
        workReq.setOrgRequested(state);
        workReq.setAppointmentType(appointmentType);
        workReq.setSpecialistType(specialistType);
        workReq.setRequestDate(date);
        workReq.setDoctor(doctor);
        workReq.setPatient(userAccount.getEmployee().getName());
        workReq.setRequestDate(date);
        workReq.setStatus("Appointment requested");
        workReq.setUserName(userAccount.getEmployee().getUserId());
        workReq.setInsDetail(userAccount.getEmployee().getInsDetail());
        workReq.setPatientEmpId(userAccount.getEmployee().getId());
        
        
        JOptionPane.showMessageDialog(null, "Appointment is requested");
        
//        populateBookingHistory();
        
        comboBoxStateNetwork.removeAllItems();
        comboBoxhospitalEnterprise.removeAllItems();
        comboBoxAppTypeOrganization.removeAllItems();
        comboBoxSpecialistType.removeAllItems();
        comboBoxDoctor.removeAllItems();
        
        
        
    //}    
    }//GEN-LAST:event_btnBookAppointmentActionPerformed
   
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangeActionPerformed

    private void comboBoxAppTypeOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxAppTypeOrganizationActionPerformed
        // TODO add your handling code here:
     //   comboBoxDoctor.removeAllItems();
        
        
    }//GEN-LAST:event_comboBoxAppTypeOrganizationActionPerformed

    private void comboBoxSpecialistTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxSpecialistTypeActionPerformed
        // TODO add your handling code here:
   //     comboBoxDoctor.removeAllItems();
       
    }//GEN-LAST:event_comboBoxSpecialistTypeActionPerformed

    private void comboBoxAppTypeOrganizationItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxAppTypeOrganizationItemStateChanged

        // TODO add your handling code here:
        
        if(evt.getStateChange()==ItemEvent.SELECTED){
           
            comboBoxDoctor.removeAllItems();
            if(this.comboBoxAppTypeOrganization.getSelectedIndex()>=0){
                this.comboBoxSpecialistType.setModel(new DefaultComboBoxModel(this.populateSpecialistComboBox(this.comboBoxAppTypeOrganization.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_comboBoxAppTypeOrganizationItemStateChanged

    private void comboBoxSpecialistTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxSpecialistTypeItemStateChanged
        // TODO add your handling code here:
        
        
        
        if(evt.getStateChange()==ItemEvent.SELECTED){
            if(this.comboBoxSpecialistType.getSelectedIndex()>=0){
                this.comboBoxDoctor.setModel(new DefaultComboBoxModel(this.populateDoctorComboBox(this.comboBoxSpecialistType.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_comboBoxSpecialistTypeItemStateChanged

    private void comboBoxStateNetworkItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxStateNetworkItemStateChanged
        // TODO add your handling code here:
        
        if(evt.getStateChange()==ItemEvent.SELECTED){
            comboBoxAppTypeOrganization.removeAllItems();
            comboBoxSpecialistType.removeAllItems();
            comboBoxDoctor.removeAllItems();
            if(this.comboBoxStateNetwork.getSelectedIndex()>=0){
                this.comboBoxhospitalEnterprise.setModel(new DefaultComboBoxModel(this.populateHospitalEnterpriseComboBox(this.comboBoxStateNetwork.getSelectedItem().toString())));
//                this.comboBoxhospitalEnterprise.setModel(new DefaultComboBoxModel(this.populateHospitalEnterpriseComboBox((Network)this.comboBoxStateNetwork.getSelectedItem())));
            }
        }  
    }//GEN-LAST:event_comboBoxStateNetworkItemStateChanged

    private void comboBoxStateNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxStateNetworkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxStateNetworkActionPerformed

    private void comboBoxhospitalEnterpriseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboBoxhospitalEnterpriseItemStateChanged
        // TODO add your handling code here:
        
        if(evt.getStateChange()==ItemEvent.SELECTED){
           
            comboBoxSpecialistType.removeAllItems();
            comboBoxDoctor.removeAllItems();
            if(this.comboBoxhospitalEnterprise.getSelectedIndex()>=0){
                this.comboBoxAppTypeOrganization.setModel(new DefaultComboBoxModel(this.populateAppointmentTypeOrganizationComboBox(this.comboBoxhospitalEnterprise.getSelectedItem().toString())));
//                this.comboBoxAppTypeOrganization.setModel(new DefaultComboBoxModel(this.populateAppointmentTypeOrganizationComboBox((Enterprise)this.comboBoxhospitalEnterprise.getSelectedItem())));
            }
        }
    }//GEN-LAST:event_comboBoxhospitalEnterpriseItemStateChanged

    private void comboBoxhospitalEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxhospitalEnterpriseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxhospitalEnterpriseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnBookAppointment;
    private java.awt.Button btnCancel;
    private java.awt.Button btnChange;
    private javax.swing.JLabel btn_close;
    private javax.swing.JComboBox<String> comboBoxAppTypeOrganization;
    private javax.swing.JComboBox<String> comboBoxDoctor;
    private javax.swing.JComboBox<String> comboBoxSpecialistType;
    private javax.swing.JComboBox<String> comboBoxStateNetwork;
    private javax.swing.JComboBox<String> comboBoxhospitalEnterprise;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel lblAppointmentDate;
    private javax.swing.JLabel lblAppointmentDoc1;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JTable tblBooking;
    // End of variables declaration//GEN-END:variables
}
