/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliners.Airliner;
import Business.Airliners.Airplane;
import Business.TravelOffice.MainTravelAgency;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rohit
 */
public class UpdateAircraft extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewAirlinerPanel
     */
    
    Airliner airliner;
    MainTravelAgency mainTravelAgency;
    JPanel displayPanel;
    Airplane aircraft;
    
    public UpdateAircraft(MainTravelAgency mainTravelAgency, Airliner airliner, JPanel displayPanel, Airplane aircraft) {
        initComponents();
        this.displayPanel = displayPanel;
        this.mainTravelAgency = mainTravelAgency;
        this.airliner = airliner;
        this.aircraft = aircraft;
        
        airlineName.setText("<html> Airline : <font size=5> "+airliner.getAirlineName());
        airlineCode.setText("<html> Type : <font size=5> "+airliner.getAirlineCode());

        warningNameLbl.setVisible(false);
        warningTypeLbl.setVisible(false);
        warningNoLbl.setVisible(false);
        
        saveBtn.setEnabled(false);
        updateBtn.setEnabled(true);
        aircraftNametxt.setEnabled(false);
        aircraftTypetxt.setEnabled(false);
        aircraftSeatsTxt.setEnabled(false);
        aircraftNametxt.setText(this.aircraft.getName());
        aircraftTypetxt.setText(this.aircraft.getType());
        aircraftSeatsTxt.setText(""+this.aircraft.getNoOfSeats());        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        aircraftTypetxt = new javax.swing.JTextField();
        aircraftSeatsTxt = new javax.swing.JTextField();
        aircraftNametxt = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        warningNameLbl = new javax.swing.JLabel();
        warningTypeLbl = new javax.swing.JLabel();
        warningNoLbl = new javax.swing.JLabel();
        airlineName = new javax.swing.JLabel();
        airlineCode = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setText("<html><font size=5> <u> <b>Update New Aircraft");

        jLabel2.setText("Aircraft Name :");

        jLabel3.setText("Aircraft Type :");

        jLabel4.setText("Number of seats:");

        backButton.setText("<<");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        warningNameLbl.setText("Name");

        warningTypeLbl.setText("Type");

        warningNoLbl.setText("Num Warning");

        airlineName.setText("jLabel5");

        airlineCode.setText("jLabel6");

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(airlineName)
                        .addGap(163, 163, 163)
                        .addComponent(airlineCode))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aircraftNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aircraftTypetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aircraftSeatsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(warningNameLbl)
                                    .addComponent(warningTypeLbl)
                                    .addComponent(warningNoLbl)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(airlineName)
                    .addComponent(airlineCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(aircraftNametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(warningNameLbl)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(aircraftTypetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warningTypeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(aircraftSeatsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warningNoLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(updateBtn))
                .addContainerGap(147, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String name = aircraftNametxt.getText();
        String type = aircraftTypetxt.getText();
        String seats = aircraftSeatsTxt.getText();
        int i = 0;
        try{
             i =(Integer.parseInt(aircraftSeatsTxt.getText()));
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Number of seats can only be an Integer.");
        }
        
        
        
        if(!aircraft.getName().equals(name)){
                    if(!aircraftNameExists(name) 
                       && !(type.length() == 0) && (i != 0)
                       && aircraftNameCheck()
                       && aircraftTypeCheck()
                       && aircraftSeatsCheck()
                       )
                    {
                        aircraft.setName(name);
                        aircraft.setNoOfSeats(i);
                        aircraft.setType(type);          
                        JOptionPane.showMessageDialog(null, "Aircraft Details Updated successfully!");
                        warningNameLbl.setVisible(false);
                        warningTypeLbl.setVisible(false);
                        warningNoLbl.setVisible(false);
        
                    }
        }
        else{
            if(!(type.length() == 0)&& (i != 0))
            {
                    aircraft.setNoOfSeats(i);
                    aircraft.setType(type);          
                    JOptionPane.showMessageDialog(null, "Aircraft Details Updated successfully!");
                    warningNameLbl.setVisible(false);
                    warningTypeLbl.setVisible(false);
                    warningNoLbl.setVisible(false);




            }
        }
        
        
        if(!(type.length() == 0)){
        
        }
        else{
            warningNameLbl.setVisible(true);
            warningNameLbl.setForeground(Color.red);
            warningNameLbl.setText("Aircraft Type can't be empty");
                
        
        }
//        if(!(type.length() == 0) &&  (airliner.getFleet().searchPlanes(name).isEmpty())){
//            aircraft.setName(name);
//            aircraft.setNoOfSeats(i);
//            aircraft.setType(type);          
//            JOptionPane.showMessageDialog(null, "Aircraft Details Updated successfully!");    
//        }        
        
    }//GEN-LAST:event_saveBtnActionPerformed

    private boolean aircraftNameExists(String name){
            if(!(airliner.getFleet().searchPlanes(name).size() == 0)){
                warningNameLbl.setVisible(true);
                warningNameLbl.setForeground(Color.red);
                warningNameLbl.setText("Aircraft Name already exists.");
                return true;
            }
            else{
                warningNameLbl.setVisible(false);
                return false;
            }    
    }
    
    
        private boolean aircraftNameCheck(){
        Pattern p = Pattern.compile("^[a-zA-Z0-9-]+$");
        Matcher m = p.matcher(aircraftNametxt.getText());
        boolean b = m.matches();
        if(b == false){
            warningNameLbl.setVisible(true);
            warningNameLbl.setForeground(Color.red);
            warningNameLbl.setText("Aircraft Name can only be alphanumberic");
        }
        else
            warningNameLbl.setVisible(false);             

        return b;
    
        }
        private boolean aircraftTypeCheck(){
        Pattern p = Pattern.compile("^[a-zA-Z0-9-]+$");
        Matcher m = p.matcher(aircraftTypetxt.getText());
        boolean b = m.matches();
        if(b == false){
            warningTypeLbl.setVisible(true);
            warningTypeLbl.setForeground(Color.red);
            warningTypeLbl.setText("Aircraft Type can only be alphanumberic");        
        }
        else{
            warningTypeLbl.setVisible(false);
        
        }
        return b;
    
        }
        
        private boolean aircraftSeatsCheck(){
        Pattern p = Pattern.compile("^[0-9]+$");
        Matcher m = p.matcher(aircraftSeatsTxt.getText());
        boolean b = m.matches();
        if(b == false){
            warningNoLbl.setVisible(true);
            warningNoLbl.setForeground(Color.red);
            warningNoLbl.setText("please insert valid number.");        
        }    
        else{
            warningNoLbl.setVisible(false);
        
        }
        return b;
    
    }        
        
    
    
    
    
    
    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        
        Component[] comps = this.displayPanel.getComponents();
        for(Component comp: comps){
            if(comp instanceof ViewAirlinerJPanel){
                ViewAirlinerJPanel viewAirliner = (ViewAirlinerJPanel) comp;
                viewAirliner.populate();
            
            }
        
        
        }
        
        CardLayout layout = (CardLayout)displayPanel.getLayout();
        displayPanel.remove(this);
        layout.previous(displayPanel);
        
        

                
        
        
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        
        saveBtn.setEnabled(true);
        updateBtn.setEnabled(false);
        aircraftNametxt.setEnabled(true);
        aircraftTypetxt.setEnabled(true);
        aircraftSeatsTxt.setEnabled(true);
        
    }//GEN-LAST:event_updateBtnActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aircraftNametxt;
    private javax.swing.JTextField aircraftSeatsTxt;
    private javax.swing.JTextField aircraftTypetxt;
    private javax.swing.JLabel airlineCode;
    private javax.swing.JLabel airlineName;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel warningNameLbl;
    private javax.swing.JLabel warningNoLbl;
    private javax.swing.JLabel warningTypeLbl;
    // End of variables declaration//GEN-END:variables
}
