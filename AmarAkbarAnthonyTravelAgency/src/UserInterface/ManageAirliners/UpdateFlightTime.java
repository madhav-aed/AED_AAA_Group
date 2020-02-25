/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliners.AircraftFlights;
import Business.Airliners.Airliner;
import Business.Airliners.Airplane;
import Business.Airliners.Flight;
import Business.Airliners.FlightDates;
import Business.TravelOffice.MainTravelAgency;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rohit
 */
public class UpdateFlightTime extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewAirlinerPanel
     */
    
//    Airliner airliner;
    MainTravelAgency mainTravelAgency;
    JPanel displayPanel;
    Airliner airliner;
    AircraftFlights flight;
    FlightDates flightDates;
    Airplane aircraft;
    
    public UpdateFlightTime(Airplane aircraft,AircraftFlights flight,FlightDates flightDates,MainTravelAgency mainTravelAgency, JPanel displayPanel) {
        initComponents();
        this.displayPanel = displayPanel;
        this.aircraft = aircraft;
        this.flight = flight;
        this.flightDates = flightDates;
        this.airliner = airliner;
        this.mainTravelAgency= mainTravelAgency;


        
        warningLabel2.setForeground(Color.red);
        warningLbl.setForeground(Color.red);
        warningLbl.setVisible(false);
        warningLabel2.setVisible(false);
        saveAirlinerBtn.setEnabled(false);
        updateBtn.setEnabled(true);             
        setValues();
    }

    void setValues(){
        origin.setText("<html><font size=4> Origin City: <i> <b>"+flight.getOriginCity());
        dest.setText("<html><font size=4> Destination City: <i><b>"+flight.getDestinationCity());
        price.setText("<html><font size=4> Price : <i><b>"+flight.getPrice());        
        flightNum.setText("<html><font size=4> Flight Number : <i><b>"+flight.getFlightNumber());
        aircraftName.setText("<html><font size=4> Flight Number : <i><b>"+aircraft.getName());
        aircraftSeats.setText("<html><font size=4> Flight Number : <i><b>"+aircraft.getNoOfSeats());
        aircraftType.setText("<html><font size=4> Flight Number : <i><b>"+aircraft.getType());
  
        Float f = flightDates.getFlightTime();
        String time = Float.toString(f);
        String[] arrOfStr = time.split("\\.");
        String hr =   arrOfStr[0];
        String min =   arrOfStr[1];
        getTimeHr.setSelectedItem(hr);
        getTimeMins.setSelectedItem(min);
              
        datePick.setDate(flightDates.getDates());
        
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
        jSeparator1 = new javax.swing.JSeparator();
        backButton = new javax.swing.JButton();
        saveAirlinerBtn = new javax.swing.JButton();
        warningLbl = new javax.swing.JLabel();
        warningLabel2 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        datePick = new org.jdesktop.swingx.JXDatePicker();
        flightNum = new javax.swing.JLabel();
        origin = new javax.swing.JLabel();
        dest = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        aircraftName = new javax.swing.JLabel();
        aircraftType = new javax.swing.JLabel();
        aircraftSeats = new javax.swing.JLabel();
        getTimeHr = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        getTimeMins = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setText("<html><font size=5> <u> <b>Update Flight Time");

        jLabel2.setText("Flight Time* :");

        jLabel3.setText("Flight Date* :");

        backButton.setText("<<");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        saveAirlinerBtn.setText("Save");
        saveAirlinerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAirlinerBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        flightNum.setText("flightNum");

        origin.setText("originCity");

        dest.setText("destination");

        price.setText("price");

        aircraftName.setText("aircraftName");

        aircraftType.setText("aircraftType");

        aircraftSeats.setText("aircraftSeats");

        getTimeHr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel9.setText("<html> <i> Minutes");

        getTimeMins.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));

        jLabel6.setText("<html><i>Hrs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton)
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(saveAirlinerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(datePick, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(getTimeHr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(getTimeMins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(62, 62, 62)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(warningLbl)
                                    .addComponent(warningLabel2)))
                            .addComponent(origin)
                            .addComponent(dest)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(flightNum, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(130, 130, 130))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(aircraftName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(aircraftType)
                                        .addGap(64, 64, 64)))
                                .addComponent(aircraftSeats))
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aircraftName)
                    .addComponent(aircraftType)
                    .addComponent(aircraftSeats))
                .addGap(12, 12, 12)
                .addComponent(flightNum)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(warningLbl)
                        .addGap(23, 23, 23)
                        .addComponent(warningLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(origin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dest)
                        .addGap(10, 10, 10)
                        .addComponent(price)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(getTimeHr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(getTimeMins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(datePick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(saveAirlinerBtn)
                            .addComponent(updateBtn))
                        .addGap(84, 84, 84))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveAirlinerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAirlinerBtnActionPerformed
        Date d1 = datePick.getDate();
        boolean resultDate = true;
        int hr = Integer.parseInt(getTimeHr.getSelectedItem().toString());
        int min = Integer.parseInt(getTimeMins.getSelectedItem().toString());
        
        String s = hr+"."+min;
        
        Float time = Float.parseFloat(s);
          
        if(!d1.equals(flightDates.getDates())){
            for(FlightDates f : flight.getFlightDates()){
                if(f.equals(d1)){
                    JOptionPane.showMessageDialog(null, "Flight already scheduled for the given date.");
                    resultDate = false;    
                }
                else{
                    resultDate = true;
                }

            }
        }
        
    }//GEN-LAST:event_saveAirlinerBtnActionPerformed
   
    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed



        
        Component[] comps = this.displayPanel.getComponents();
        for(Component comp: comps){
            if(comp instanceof ManageAirlinersJPanel){
                ManageAirlinersJPanel manageAdmin = (ManageAirlinersJPanel) comp;
                manageAdmin.populate();
            
            }
        
        
        }
        
        CardLayout layout = (CardLayout)displayPanel.getLayout();
        displayPanel.remove(this);
        layout.previous(displayPanel);
       
    }//GEN-LAST:event_backButtonActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        saveAirlinerBtn.setEnabled(true);
        updateBtn.setEnabled(false);
    //    flightTime.setEnabled(true);
     
    }//GEN-LAST:event_updateBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aircraftName;
    private javax.swing.JLabel aircraftSeats;
    private javax.swing.JLabel aircraftType;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private org.jdesktop.swingx.JXDatePicker datePick;
    private javax.swing.JLabel dest;
    private javax.swing.JLabel flightNum;
    private javax.swing.JComboBox<String> getTimeHr;
    private javax.swing.JComboBox<String> getTimeMins;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel origin;
    private javax.swing.JLabel price;
    private javax.swing.JButton saveAirlinerBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel warningLabel2;
    private javax.swing.JLabel warningLbl;
    // End of variables declaration//GEN-END:variables
}
