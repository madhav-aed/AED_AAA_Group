/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.TravelOffice.MainTravelAgency;
import UserInterface.ManageCustomer.ManageCustomerForm;
import UserInterface.SearchFlights.ViewSearchFlightsForm;
import java.awt.CardLayout;

/**
 *
 * @author rohit
 */
public class AAATravelAgencyJFrame extends javax.swing.JFrame {

    
    private MainTravelAgency mainTravelAgency;
    
    /**
     * Creates new form AAATravelAgencyJFrame
     */
    public AAATravelAgencyJFrame() {
        initComponents();
        mainTravelAgency = new MainTravelAgency();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        manageAirlinesBtn = new javax.swing.JButton();
        searchFlightsBtn = new javax.swing.JButton();
        manageCustomersBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        displayPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(100);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        manageAirlinesBtn.setText("Manage Airlines");
        manageAirlinesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageAirlinesBtnActionPerformed(evt);
            }
        });

        searchFlightsBtn.setText("Search Flights");
        searchFlightsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFlightsBtnActionPerformed(evt);
            }
        });

        manageCustomersBtn.setText("Manage Customer");
        manageCustomersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomersBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("<html> <b> <u> AAA Travel Agency <b>");

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(manageAirlinesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchFlightsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manageCustomersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(controlPanelLayout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchFlightsBtn)
                    .addComponent(manageCustomersBtn)
                    .addComponent(manageAirlinesBtn))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(controlPanel);

        displayPanel.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(displayPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFlightsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFlightsBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)displayPanel.getLayout();
        displayPanel.add(new ViewSearchFlightsForm(displayPanel, mainTravelAgency));
        layout.next(displayPanel);

    }//GEN-LAST:event_searchFlightsBtnActionPerformed

    private void manageAirlinesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageAirlinesBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)displayPanel.getLayout();
        displayPanel.add(new ManageAirlinersJPanel(displayPanel, mainTravelAgency)); 
        layout.next(displayPanel);

    }//GEN-LAST:event_manageAirlinesBtnActionPerformed

    private void manageCustomersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomersBtnActionPerformed
        CardLayout layout = (CardLayout)displayPanel.getLayout();
        displayPanel.add(new ManageCustomerForm(displayPanel, mainTravelAgency)); // , (Admin)adminUser
        layout.next(displayPanel);
    }//GEN-LAST:event_manageCustomersBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AAATravelAgencyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AAATravelAgencyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AAATravelAgencyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AAATravelAgencyJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AAATravelAgencyJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel displayPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton manageAirlinesBtn;
    private javax.swing.JButton manageCustomersBtn;
    private javax.swing.JButton searchFlightsBtn;
    // End of variables declaration//GEN-END:variables
}
