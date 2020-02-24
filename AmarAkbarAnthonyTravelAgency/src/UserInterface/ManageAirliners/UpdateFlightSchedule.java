/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliners;

import Business.Airliners.Airliner;
import Business.Airliners.Airplane;
import Business.Airliners.Flight;
import Business.Airliners.FlightDates;
import Business.TravelOffice.MainTravelAgency;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author rohit
 */
public class UpdateFlightSchedule extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewAirlinerPanel
     */
    
//    Airliner airliner;
    MainTravelAgency mainTravelAgency;
    JPanel displayPanel;
    
    Airplane aircraft;
    Flight flight;

    
    public UpdateFlightSchedule(Airplane aircraft, Flight flight, MainTravelAgency mainTravelAgency, JPanel displayPanel) {
        initComponents();
        this.displayPanel = displayPanel;
        this.mainTravelAgency = mainTravelAgency;
        this.aircraft = aircraft;
        this.flight = flight;
        
        aircraftNameTxt.setText("<html> Aircraft Type <font size=5>"+aircraft.getName());
        AircraftCodeTxt.setText("<html> Aircraft Type <font size=5>"+aircraft.getType());
        setFieldsEnabled(false);
        setDataValues();
        
        populate();

    }
    public void populate(){
         DefaultTableModel dtm = (DefaultTableModel)tblDirectory.getModel();
        dtm.setRowCount(0);
        
        

            for(FlightDates a : flight.getFlightDates()){
                Object[] row = new Object[dtm.getColumnCount()];
                row[4]=a;
                String time = Float.toString(a.getFlightTime());
                String[] arrOfStr = time.split(".", 2);
                row[5] = " "+arrOfStr[0]+" Hours " + arrOfStr[1]+ " Minutes ";
                dtm.addRow(row);
            }
        
   
    
    
    
    
    
    }
    public void setDataValues(){
    
        flightNumTxt.setText(flight.getFlightNumber());
        originTxt.setText(flight.getOriginCity());
        destTxt.setText(flight.getDestinationCity());
        priceTxt.setText(Double.toString(flight.getPrice()));
        
        
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        destTxt = new javax.swing.JTextField();
        originTxt = new javax.swing.JTextField();
        flightNumTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        priceTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        warningFlightNumberLbl = new javax.swing.JLabel();
        warningOriginLbl = new javax.swing.JLabel();
        warningDestLbl = new javax.swing.JLabel();
        warningtTckLbl = new javax.swing.JLabel();
        warningtimeLbl = new javax.swing.JLabel();
        aircraftNameTxt = new javax.swing.JLabel();
        AircraftCodeTxt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        hrTxt = new javax.swing.JTextField();
        minTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        datePicker = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDirectory = new javax.swing.JTable();
        updateFlightTime = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setText("<html><font size=5> <u> <b> Update Flight Schedule ");

        jLabel2.setText("Origin City :");

        jLabel3.setText("Destination City :");

        jLabel4.setText("Ticket Price :");

        jLabel7.setText("Flight Number :");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<<");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Time :");

        warningFlightNumberLbl.setText("warningFlightNum");

        warningOriginLbl.setText("Origin");

        warningDestLbl.setText("Dest");

        warningtTckLbl.setText("tickPrice");

        warningtimeLbl.setText("warningTime");

        aircraftNameTxt.setText("<html><font size = 3>");

        jLabel6.setText("<html><i>Hrs");

        jLabel9.setText("<html> <i> Minutes");

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Flight Date:");

        jLabel10.setText("<html> <i> YYYY/MM/DD");

        tblDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Dates", "Flight Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblDirectory);

        updateFlightTime.setText("Update Time");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(flightNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(originTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(destTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(warningFlightNumberLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(warningOriginLbl)
                                    .addComponent(warningDestLbl)
                                    .addComponent(warningtTckLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(hrTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(minTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(warningtimeLbl))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateFlightTime, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(aircraftNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(224, 224, 224)
                        .addComponent(AircraftCodeTxt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aircraftNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AircraftCodeTxt)))
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(flightNumTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warningFlightNumberLbl))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(originTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(warningOriginLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(destTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(warningDestLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(warningtTckLbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(warningtimeLbl)
                            .addComponent(minTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hrTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateFlightTime, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(209, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        String flightNum = flightNumTxt.getText();
        String origin = originTxt.getText();
        String dest = destTxt.getText();
    
        float time = 0.0F;
        double price = 0.0;
        
        
        if(this.mainTravelAgency.getMasterFlightSchedule().flightNumberExists(flightNum))
        {
            warningFlightNumberLbl.setForeground(Color.red);
            warningFlightNumberLbl.setText("Flight number already exists!");         
        }
        
        
        
        try{
             
        }
        catch(Exception e){
        
        }
        try{
      //   time = Float.parseFloat(timeTxt.getText());
         
//         time = Float.parseFloat(s);
         
        }
        catch(Exception e){
            warningtimeLbl.setVisible(true);
            warningtimeLbl.setText("Invalid time. Use 24-hour clock digit seperated by a dot ( . )  ");            
            
        
        }
        try{
         price = Double.parseDouble(priceTxt.getText());
        }
        catch(Exception e){
            warningtTckLbl.setVisible(true);
            warningtTckLbl.setText("Invalid price. Please enter correct number.");
            
        }
        
        
        if(origin.length() == 0){
            
            warningOriginLbl.setVisible(true);
            warningOriginLbl.setText("Origin City cannot be empty");
        
        
        }
        else{
            warningOriginLbl.setVisible(false);
            warningOriginLbl.setText("Origin City cannot be empty");
        }
        
        if(dest.length() == 0){
            warningDestLbl.setVisible(true);
            warningDestLbl.setText("Destination City cannot be empty");        
        
        }
        
        else{
            warningDestLbl.setVisible(false);
            warningDestLbl.setText("Origin City cannot be empty");              
        }
        
        if(origin.equals(dest)){
            warningOriginLbl.setVisible(true);
            warningOriginLbl.setText("Origin and Destination city cannot be same");              
           
        }

        
        if((origin.length() != 0) &&
            (dest.length() != 0) &&
                (price != 0) && 
                (time != 0) &&
                (flightNum.length() != 0) &&
                !(this.mainTravelAgency.getMasterFlightSchedule().flightNumberExists(flightNum)) &&
                !(origin.equals(dest))
                ){
            int i = 0;            // proxy delete later
            Date d1 = new Date(); // proxy
            warningDestLbl.setText("");
            warningOriginLbl.setText("");
            warningFlightNumberLbl.setText("");
            
            warningtTckLbl.setText("");
            warningtimeLbl.setText("");


            if(d1 != null && i == 0){
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date dateWithoutTime = d1;
                    FlightDates flightdate = new FlightDates(dateWithoutTime, time, aircraft.getNoOfSeats());
                    aircraft.getFlightDetails().setFlightSchedule(flightNum, origin,  dest, price, flightdate);
//                    mainTravelAgency.getMasterFlightSchedule().addFlights(new Flight(flightNum, origin, dest, price, flightdate));
                    JOptionPane.showMessageDialog(null, "Successfully added!");
            }
            else if(d1 == null && i != 0)
            {
                Date d2 = new Date();
                for(int j = 0; j < i; j++)
                {
                        d2 = getNextDate(d2);
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        FlightDates flightdate = new FlightDates(new Date(), time, aircraft.getNoOfSeats());         
                        aircraft.getFlightDetails().setFlightSchedule(flightNum, origin,  dest, price, flightdate);
                
                }
                    JOptionPane.showMessageDialog(null, "Successfully added!");
            }
        }

    }//GEN-LAST:event_saveBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed

        Component[] comps = this.displayPanel.getComponents();
        for(Component comp: comps){
            if(comp instanceof ViewAircraftDetails){
                ViewAircraftDetails viewAircraftDet = (ViewAircraftDetails) comp;
                viewAircraftDet.populate();            
            }
    
        }
        
        CardLayout layout = (CardLayout)displayPanel.getLayout();
        displayPanel.remove(this);
        layout.previous(displayPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        saveBtn.setEnabled(true);
        setFieldsEnabled(true);

        
        




    }//GEN-LAST:event_updateBtnActionPerformed
    public static Date getNextDate(Date  curDate) {
      final Calendar calendar = Calendar.getInstance();
      calendar.setTime(curDate);
      calendar.add(Calendar.DAY_OF_YEAR, 1);
      return  calendar.getTime(); 
      

    }
    
    
    public void setFieldsEnabled(boolean b){
        flightNumTxt.setEnabled(b);
        originTxt.setEnabled(b);
        destTxt.setEnabled(b);
        priceTxt.setEnabled(b);
        hrTxt.setEnabled(b);
        minTxt.setEnabled(b);
        datePicker.setEnabled(b);
              
            }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AircraftCodeTxt;
    private javax.swing.JLabel aircraftNameTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private org.jdesktop.swingx.JXDatePicker datePicker;
    private javax.swing.JTextField destTxt;
    private javax.swing.JTextField flightNumTxt;
    private javax.swing.JTextField hrTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField minTxt;
    private javax.swing.JTextField originTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTable tblDirectory;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton updateFlightTime;
    private javax.swing.JLabel warningDestLbl;
    private javax.swing.JLabel warningFlightNumberLbl;
    private javax.swing.JLabel warningOriginLbl;
    private javax.swing.JLabel warningtTckLbl;
    private javax.swing.JLabel warningtimeLbl;
    // End of variables declaration//GEN-END:variables
}
