/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI_Pages.HomePages;

import Business.Database.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprises.Enterprise;
import Business.Network.Network;
import Business.Role.AdminRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

import UI_Pages.adminPages.SysAdmin_CreateEnterprise;
import UI_Pages.adminPages.SysAdmin_WorkSpace;
import UI_Pages.customerPages.Customer_WorkSpace;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Rohit
 */
public class Login_Page_Admins extends javax.swing.JFrame {

    /**
     * Creates new form Home17
     */
    
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private int check = 0;
    
    
    public Login_Page_Admins() {
        system = dB4OUtil.retrieveSystem();

        initComponents();
        containerPanel.setSize(750, 540);
        
                    loader.hide();

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
        txt_email = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_login = new java.awt.Button();
        lbl_close = new javax.swing.JLabel();
        txt_pwd = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        loader = new javax.swing.JPanel();
        lbl_loader = new javax.swing.JLabel();
        img_loader = new javax.swing.JLabel();

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

        txt_email.setForeground(new java.awt.Color(102, 102, 102));
        txt_email.setText("Email");
        txt_email.setBorder(null);
        txt_email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_emailFocusGained(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(96, 83, 150));
        jSeparator1.setForeground(new java.awt.Color(96, 83, 150));

        jSeparator2.setBackground(new java.awt.Color(96, 83, 150));
        jSeparator2.setForeground(new java.awt.Color(96, 83, 150));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/unlock_18px.png"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/contacts_18px.png"))); // NOI18N

        btn_login.setBackground(new java.awt.Color(96, 83, 150));
        btn_login.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setLabel("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
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

        txt_pwd.setForeground(new java.awt.Color(102, 102, 102));
        txt_pwd.setText("jPasswordField1");
        txt_pwd.setBorder(null);
        txt_pwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_pwdFocusGained(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Admin Login");

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(loginLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(12, 12, 12)
                            .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel6)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(12, 12, 12)
                        .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(237, 237, 237))
            .addComponent(lbl_close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addComponent(lbl_close, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addComponent(txt_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        containerPanel.add(login, "card2");

        loader.setBackground(new java.awt.Color(255, 255, 255));

        lbl_loader.setFont(new java.awt.Font("Segoe UI Light", 3, 18)); // NOI18N
        lbl_loader.setText("Simply breathe while we connect..");

        img_loader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI_Pages/images/loadingRing.gif"))); // NOI18N

        javax.swing.GroupLayout loaderLayout = new javax.swing.GroupLayout(loader);
        loader.setLayout(loaderLayout);
        loaderLayout.setHorizontalGroup(
            loaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loaderLayout.createSequentialGroup()
                .addGroup(loaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loaderLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(img_loader))
                    .addGroup(loaderLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(lbl_loader)))
                .addContainerGap(364, Short.MAX_VALUE))
        );
        loaderLayout.setVerticalGroup(
            loaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loaderLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(img_loader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_loader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        containerPanel.add(loader, "card3");

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


    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // Get user name
        String username = txt_email.getText();
        String password = txt_pwd.getText();

    // Check for Sysadmin
        UserAccount ua = system.getUserAccountDirectory().authenticateUser(username, password);
        if((ua != null)){
                    loader.show();
                    login.hide();
                    new java.util.Timer().schedule(new TimerTask() {
                        @Override
                        public void run() {

                            JFrame m =  ua.getRole().createWorkArea(
                                containerPanel, 
                                ua, 
                                null,  
                                null, // ua.getEmployee().getEnterprise(),
                                system, 
                                dB4OUtil);
                                m.setExtendedState(MAXIMIZED_BOTH);
                                m.show();
                                dispose();
                           }
                    },1000*2);
           }
// Check for Admin
    else if(ua == null){
        
        for(Network net : system.getNetworkList()){
            for(Enterprise e : net.getEnterpriseDirectory().getEnterpriseList()){
              UserAccount ua1  =   e.getUserAccountDirectory().authenticateUser(username, password);
                if((ua1 != null)){
                            loader.show();
                            login.hide();
                            new java.util.Timer().schedule(new TimerTask() {
                                @Override
                                public void run() {
                                        JFrame m =  ua1.getRole().createWorkArea(
                                        containerPanel, 
                                        ua1, 
                                        null,  
                                        e,
                                        system, 
                                        dB4OUtil);
                                        m.setExtendedState(MAXIMIZED_BOTH);
                                        m.show();
                                        dispose();
                                        check = 1;
                                   }
                            },1000*3);
                        }
                    }              
                }
        }
    else if((ua == null) && (check != 1)){
            JOptionPane.showMessageDialog(null, "Check username/password and try again!");
        }
        
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_emailFocusGained
        // TODO add your handling code here:
        txt_email.setText("");
    }//GEN-LAST:event_txt_emailFocusGained

    private void txt_pwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_pwdFocusGained
        // TODO add your handling code here:
        txt_pwd.setText("");
    }//GEN-LAST:event_txt_pwdFocusGained

    private void lbl_closeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_closeMousePressed
        // TODO add your handling code here:
       dispose();
    }//GEN-LAST:event_lbl_closeMousePressed
    int xy, xx;
    private void loginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);

    }//GEN-LAST:event_loginMouseDragged

    private void loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMousePressed
        // TODO add your handling code here:

        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_loginMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btn_login;
    private javax.swing.JPanel containerPanel;
    private javax.swing.JLabel img_loader;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl_close;
    private javax.swing.JLabel lbl_loader;
    private javax.swing.JPanel loader;
    private javax.swing.JPanel login;
    private javax.swing.JTextField txt_email;
    private javax.swing.JPasswordField txt_pwd;
    // End of variables declaration//GEN-END:variables
}
