/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Pages.adminPages;

import Business.Database.DB4OUtil;
import Business.Departments.Organization;
import Business.EcoSystem;
import Business.Employees.Employee;
import Business.Enterprises.Enterprise;
import Business.Network.Network;
import Business.Role.AdminRole;
import Business.Role.DoctorAssistantRole;
import Business.Role.DoctorRole;
import Business.Role.HospitalAdminRole;
import Business.Role.HospitalBillingRole;
import Business.Role.InsuranceAdminRole;
import Business.Role.LabAssistantRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author madhav437
 */
public class Add_Hospital_Employees extends javax.swing.JPanel {

    
    JPanel rightPanel;
    Network network;
    UserAccount userAccount;
    Enterprise enterprise;
    EcoSystem system;
    Organization org;
    Image image;
    String orgType; //
    DB4OUtil db4outil;
    Role role;
    
    
    Boolean userUnique;
    
    
    

    public Add_Hospital_Employees(JPanel rightPanel, UserAccount ua, Enterprise e, Organization org ,EcoSystem system, DB4OUtil db4outil) {
        this.network = network;
        this.rightPanel =rightPanel;
        this.userAccount =ua;
        this.system = system;
        this.org = org;
        this.role = org.getSupportedRole();
        this.enterprise = e;
        this.db4outil = db4outil;        
        initComponents();
        jPhoto1.setVisible(false);
        init();
        populateAdminTable();
        employeeTypeJComboBox.setVisible(false);
        jLabel8.setVisible(false);
        
    }

        public void init(){
            
            
            
            
         // Setting welcome string
         
         welcomelabel.setText(" Hospital Name : "+enterprise.getName());
         DepartmentNameLabel.setText("Department Name : "+this.org.getName());
    //     jLabel7.setText("Department Name : "+this.org.getName());
               
            
            
        // Setting color of JTable
        
        
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.white);
       // headerRenderer.set(Color.BLACK);

        for (int i = 0; i < adminTable.getModel().getColumnCount(); i++) {
          adminTable.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
           
        }
    
        // Set combo box color
        employeeTypeJComboBox.getEditor().getEditorComponent().setBackground(Color.white);
        populateComboBox();

        
    }
      
    void userUniqueValidation(){
        String username = adminusername.getText();
        
          for(UserAccount ua : this.enterprise.getUserAccountDirectory().getUserAccountList()){
            if (ua!= null){
            if(ua.getUsername().equals(username)){
                 userUnique = false;
            return;}
            }
      }
      for(UserAccount ua : this.system.getUserAccountDirectory().getUserAccountList()){
            if (ua!= null){;
            if(ua.getUsername().equals(username)){
                  userUnique = false;
            return;}
            }
      }    
      
       
       for(Network net : system.getNetworkList()){
            for(Enterprise e : net.getEnterpriseDirectory().getEnterpriseList()){
                
            for(UserAccount ua : e.getUserAccountDirectory().getUserAccountList()){
            if (ua!= null){
            if(ua.getUsername().equals(username)){
                  userUnique = false;
            return;}
            }
            }
            
            for(Organization org :e.getOrganizationDirectory().getOrganizationList()){
                
                for(UserAccount ua1 : org.getUserAccountDirectory().getUserAccountList()){
                
                if(ua1.getUsername().equals(username)){
                  userUnique = false;
                  return;}
            
       
                      }
             
        }
        
       }
       }
       
       // Check if this user exists in Patient Directory
       
            if (system.getPatientDirectory().checkIfUsernameIsUnique(" ") == false){
                  userUnique = false;
                  return;
            }
        
    }

    
    public void populateAdminTable(){
       DefaultTableModel model1 = (DefaultTableModel) adminTable.getModel();
        model1.setRowCount(0);
       for (UserAccount userAccount : this.org.getUserAccountDirectory().getUserAccountList())
               {
                        Object[] row = new Object[5];
                        
//                        if(userAccount.getRole() == this.org.getSupportedRole())
                           String str = String.valueOf(userAccount.getRole());
                           String st1 = String.valueOf(this.org.getSupportedRole());
                           if(str == st1)
                        {
                            row[0] = userAccount.getEmployee().getOrg();
                            row[1] = userAccount.getEmployee().getName();
                            row[2] = userAccount.getEmployee().getId();
                            row[3] = userAccount;
                            row[4] = userAccount.getPassword();
                            model1.addRow(row);                
                        
                        }
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

        jPanel15 = new javax.swing.JPanel();
        btn_close = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        welcomelabel = new javax.swing.JLabel();
        addAdminPanel = new javax.swing.JPanel();
        adminLabel = new javax.swing.JLabel();
        adminName = new javax.swing.JTextField();
        adminUser = new javax.swing.JLabel();
        adminusername = new javax.swing.JTextField();
        adminPasswordLabel = new javax.swing.JLabel();
        addAdminBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        inPhotoBtn1 = new javax.swing.JButton();
        jPhoto1 = new javax.swing.JLabel();
        adminpassword = new javax.swing.JPasswordField();
        jScrollPane3 = new javax.swing.JScrollPane();
        adminTable = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        DepartmentNameLabel = new javax.swing.JLabel();
        employeeTypeJComboBox = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(172, Short.MAX_VALUE)
                .addComponent(btn_close)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_close, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
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
            .addGap(0, 10, Short.MAX_VALUE)
        );

        welcomelabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        welcomelabel.setForeground(new java.awt.Color(96, 83, 150));
        welcomelabel.setText("Hello");

        addAdminPanel.setBackground(new java.awt.Color(255, 255, 255));

        adminLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        adminLabel.setForeground(new java.awt.Color(96, 83, 150));
        adminLabel.setText("Name");

        adminName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        adminName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adminName.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        adminName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminNameMouseClicked(evt);
            }
        });

        adminUser.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        adminUser.setForeground(new java.awt.Color(96, 83, 150));
        adminUser.setText("Username");

        adminusername.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        adminusername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adminusername.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        adminusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminusernameMouseClicked(evt);
            }
        });
        adminusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminusernameActionPerformed(evt);
            }
        });

        adminPasswordLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        adminPasswordLabel.setForeground(new java.awt.Color(96, 83, 150));
        adminPasswordLabel.setText("Password");

        addAdminBtn.setBackground(new java.awt.Color(247, 247, 247));
        addAdminBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/Images/icons8_add_40px_1.png"))); // NOI18N
        addAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAdminBtnActionPerformed(evt);
            }
        });

        inPhotoBtn1.setBackground(new java.awt.Color(247, 247, 247));
        inPhotoBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8-client_management.png"))); // NOI18N
        inPhotoBtn1.setText("Upload Photo");
        inPhotoBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inPhotoBtn1ActionPerformed(evt);
            }
        });

        adminpassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        adminpassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane3.setBackground(new java.awt.Color(247, 247, 247));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        adminTable.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        adminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Organization", "Name", "Id", "User Name", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        adminTable.setGridColor(new java.awt.Color(247, 247, 247));
        adminTable.setRowHeight(20);
        adminTable.setSelectionBackground(new java.awt.Color(96, 83, 150));
        jScrollPane3.setViewportView(adminTable);

        jButton5.setBackground(new java.awt.Color(247, 247, 247));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/icons8_minus_40px_2.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        DepartmentNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        DepartmentNameLabel.setForeground(new java.awt.Color(96, 83, 150));
        DepartmentNameLabel.setText("Enterprises");

        employeeTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(96, 83, 150));
        jLabel8.setText("Employee Type");

        javax.swing.GroupLayout addAdminPanelLayout = new javax.swing.GroupLayout(addAdminPanel);
        addAdminPanel.setLayout(addAdminPanelLayout);
        addAdminPanelLayout.setHorizontalGroup(
            addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addAdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addAdminPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addAdminPanelLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(addAdminPanelLayout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jPhoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(inPhotoBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(addAdminBtn))
                                .addGroup(addAdminPanelLayout.createSequentialGroup()
                                    .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(adminUser)
                                        .addComponent(adminPasswordLabel)
                                        .addComponent(adminLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(adminName, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(adminusername, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(adminpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addAdminPanelLayout.createSequentialGroup()
                                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DepartmentNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(addAdminPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(employeeTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(29, 29, 29)))))
                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        addAdminPanelLayout.setVerticalGroup(
            addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addAdminPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addAdminPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(addAdminPanelLayout.createSequentialGroup()
                        .addComponent(DepartmentNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addAdminPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))
                            .addGroup(addAdminPanelLayout.createSequentialGroup()
                                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(employeeTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(adminName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adminLabel))
                                .addGap(18, 18, 18)
                                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(adminUser)
                                    .addComponent(adminusername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(adminPasswordLabel)
                                    .addComponent(adminpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(addAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addAdminBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inPhotoBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPhoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(welcomelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(addAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(welcomelabel)))
                .addGap(16, 16, 16)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
        
        
        Component[] comps = this.rightPanel.getComponents();// k nnm,nm
        for(Component comp: comps){
            if(comp instanceof Hospital_Admin_WorkArea){
                Hospital_Admin_WorkArea manageAdmin = (Hospital_Admin_WorkArea) comp;
                manageAdmin.populateNetworkTable();
                manageAdmin.init();
            
            }
        
        
        }
        
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        rightPanel.remove(this);
        layout.previous(rightPanel);
        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btn_closeMouseClicked
    
    private void populateComboBox() {
        employeeTypeJComboBox.removeAllItems();
        
            employeeTypeJComboBox.addItem(this.org.getSupportedRole());
           // employeeTypeJComboBox.addItem(Role.RoleType.LabAssistant);

    }
    
    private void adminNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adminNameMouseClicked

    private void adminusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminusernameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_adminusernameMouseClicked

    private void addAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAdminBtnActionPerformed
        String username = adminusername.getText();
        String password = String.valueOf(adminpassword.getPassword());
        String name = adminName.getText();
          name = name.trim();
       
         if (name.isEmpty()){
            JOptionPane.showMessageDialog(null, "Name is empty");
            return;}
        
        
        
           userUnique = true;
           userUniqueValidation();
           if (userUnique == false){
           JOptionPane.showMessageDialog(null, "Username should be unique. UserName is already in use.");
                  return;}
        
        
      for(UserAccount ua : this.org.getUserAccountDirectory().getUserAccountList()){
            if (ua!= null){;
            if(ua.getUsername().equals(username)){
                 JOptionPane.showMessageDialog(null, "Username should be unique. UserName is already in use.");
            return;}}
            }
      
            if (usernamePatternCorrect()==false){
                adminUser.setForeground (Color.red);
                adminusername.setBorder(BorderFactory.createLineBorder(Color.RED));
                JOptionPane.showMessageDialog(null, "Username should be in the format of xx_xx@xx.xx");
                return;
        } else{
            adminUser.setForeground (Color.BLACK);
            adminusername.setBorder(BorderFactory.createLineBorder(Color.black));
        }
            if (passwordPatternCorrect()==false){
            adminPasswordLabel.setForeground (Color.red);
            adminpassword.setBorder(BorderFactory.createLineBorder(Color.RED));
            JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
            return;
        }else{
            adminPasswordLabel.setForeground (Color.BLACK);
            adminpassword.setBorder(BorderFactory.createLineBorder(Color.black));
        }

        
        Employee employee = this.org.getEmployeeDirectory().createEmployee(name);
        
        // below two are just for the sake of it..
        
        employee.setEnterprise(enterprise);
        employee.setOrg(org);
        
        if (image != null)
        {
            
            employee.setPicture(image);
        
        }
        
        // Adding to lists..
        this.org.getEmployeeDirectory().getEmployeeList().add(employee);
//        this.system.getEmployeeDirectory().getEmployeeList().add(employee);
//        this.enterprise.getEmployeeDirectory().getEmployeeList().add(employee);
        //String s = (String)(((Role.RoleType)employeeTypeJComboBox.getSelectedItem()).getValue());
//        String s = ((Role.RoleType)employeeTypeJComboBox.getSelectedItem()).getValue();
        UserAccount account = this.org.getUserAccountDirectory().createUserAccount(username, password, employee, this.org.getSupportedRole());
        
        
   /*     
        if(s.equals("Lab Assistant")){
        
        // Create account Within the enterprise
        UserAccount account = this.org.getUserAccountDirectory().createUserAccount(username, password, employee, new HospitalAdminRole());
        // Create account  Within the ecosystem
     //   this.system.getUserAccountDirectory().createUserAccount(username, password, employee, new LabAssistantRole());
        
        }
        else if(s.equals("Doctor Assistant")){
        // Create account Within the enterprise
            System.out.println("DA");
        UserAccount account = this.org.getUserAccountDirectory().createUserAccount(username, password, employee, new HospitalAdminRole());
        // Create account  Within the Organization
       // this.org.getUserAccountDirectory().createUserAccount(username, password, employee, new DoctorAssistantRole());
        
        }
        else if(s.equals("Billing Accountant")){
        // Create account Within the Organization
        
        UserAccount account = this.org.getUserAccountDirectory().createUserAccount(username, password, employee, new HospitalBillingRole());
        // Create account  Within the ecosystem
       // this.org.getUserAccountDirectory().createUserAccount(username, password, employee, new HospitalBillingRole());
        
        
        } */
        
        
        
        JOptionPane.showMessageDialog(null, "User Created");
      
        db4outil.storeSystem(system);
        
        adminusername.setText("");
        adminpassword.setText("");
        adminName.setText("");
        jPhoto1.setVisible(false);
        populateAdminTable();
      
    }//GEN-LAST:event_addAdminBtnActionPerformed
      private boolean usernamePatternCorrect(){
        Pattern p=Pattern.compile("^[a-zA-Z0-9]+_[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");
        Matcher m=p.matcher(adminusername.getText());
        boolean b=m.matches();
        return b;
    }
    
     private boolean passwordPatternCorrect(){
        Pattern p1;
        p1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1=p1.matcher(String.valueOf(adminpassword.getPassword()));
        boolean b1=m1.matches();
        return b1;
    }
    private void adminusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminusernameActionPerformed

    private void inPhotoBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inPhotoBtn1ActionPerformed
        // Code to upload Image: Reference - Stackoverflow.com

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
            "JPG & PNG Images", "jpg","png");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(Add_Hospital_Employees.this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this file: " +
                chooser.getSelectedFile().getName());}

        //photoPath = chooser.getSelectedFile().getPath();

        ImageIcon icon = new ImageIcon(chooser.getSelectedFile().getPath());
        image = icon.getImage();
        Image newimg = image.getScaledInstance(70,70,Image.SCALE_SMOOTH);
        ImageIcon icon2 = new ImageIcon(newimg);
        jPhoto1.setVisible(true);
        
        jPhoto1.setIcon(icon2);

    }//GEN-LAST:event_inPhotoBtn1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        int selectedRow = adminTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                UserAccount airliner = (UserAccount)adminTable.getValueAt(selectedRow, 3);
                Employee e = airliner.getEmployee();
                org.getEmployeeDirectory().getEmployeeList().remove(e);
                org.getUserAccountDirectory().getUserAccountList().remove(airliner);
                
                populateAdminTable();
                db4outil.storeSystem(system);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please make a selection first.");
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DepartmentNameLabel;
    private javax.swing.JButton addAdminBtn;
    private javax.swing.JPanel addAdminPanel;
    private javax.swing.JLabel adminLabel;
    private javax.swing.JTextField adminName;
    private javax.swing.JLabel adminPasswordLabel;
    private javax.swing.JTable adminTable;
    private javax.swing.JLabel adminUser;
    private javax.swing.JPasswordField adminpassword;
    private javax.swing.JTextField adminusername;
    private javax.swing.JLabel btn_close;
    private javax.swing.JComboBox employeeTypeJComboBox;
    private javax.swing.JButton inPhotoBtn1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JLabel jPhoto1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel welcomelabel;
    // End of variables declaration//GEN-END:variables
}
