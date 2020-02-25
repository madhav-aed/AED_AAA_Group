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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rohit
 */
public class AddFlightSchedule extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewAirlinerPanel
     */
    
//    Airliner airliner;
    MainTravelAgency mainTravelAgency;
    JPanel displayPanel; 
    Airplane aircraft;

    
    public AddFlightSchedule(Airplane aircraft,MainTravelAgency mainTravelAgency, JPanel displayPanel) {
        initComponents();
        this.displayPanel = displayPanel;
        this.mainTravelAgency = mainTravelAgency;
        this.aircraft = aircraft;
        
        aircraftNameTxt.setText("<html> Aircraft Type <font size=5>"+aircraft.getName());
        AircraftCodeTxt.setText("<html> Aircraft Type <font size=5>"+aircraft.getType());
        
        buttonGroup1.add(specificDateRadBtn);
        buttonGroup1.add(scheduleRadio);
        
        specificDates.setVisible(false);
        scheduleTxt.setVisible(false);    
        infoLabel.setVisible(false);
        

        
        
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
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        destTxt = new javax.swing.JTextField();
        originTxt = new javax.swing.JTextField();
        specificDates = new org.jdesktop.swingx.JXDatePicker();
        specificDateRadBtn = new javax.swing.JRadioButton();
        scheduleRadio = new javax.swing.JRadioButton();
        scheduleTxt = new javax.swing.JTextField();
        infoLabel = new javax.swing.JLabel();
        flightNumTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        addScheduleBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        priceTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        warningFlightNumberLbl = new javax.swing.JLabel();
        warningOriginLbl = new javax.swing.JLabel();
        warningDestLbl = new javax.swing.JLabel();
        warningtTckLbl = new javax.swing.JLabel();
        warningSpecificLbl = new javax.swing.JLabel();
        warningSchLbl = new javax.swing.JLabel();
        warningtimeLbl = new javax.swing.JLabel();
        aircraftNameTxt = new javax.swing.JLabel();
        AircraftCodeTxt = new javax.swing.JLabel();
        getTimeHr = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        getTimeMins = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

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

        jLabel1.setText("<html><font size=5> <u> <b> Add Flight Schedule ");

        jLabel2.setText("Origin City :");

        jLabel3.setText("Destination City :");

        jLabel4.setText("Ticket Price :");

        jLabel5.setText("Flight Details :");

        specificDateRadBtn.setText("Specific Date");
        specificDateRadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specificDateRadBtnActionPerformed(evt);
            }
        });

        scheduleRadio.setText("Schedule");
        scheduleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scheduleRadioActionPerformed(evt);
            }
        });

        infoLabel.setText("<html>  ^ <i> flies for these many days");

        jLabel7.setText("Flight Number :");

        addScheduleBtn.setText("Add Schedule");
        addScheduleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addScheduleBtnActionPerformed(evt);
            }
        });

        backBtn.setText("<<");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel8.setText("Time :");

        aircraftNameTxt.setText("<html><font size = 3>");

        AircraftCodeTxt.setText("mn");

        getTimeHr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        jLabel6.setText("<html><i>Hrs");

        getTimeMins.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60" }));

        jLabel9.setText("<html> <i> Minutes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addGap(121, 121, 121)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(jLabel8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(warningSpecificLbl))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(getTimeHr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(getTimeMins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                                        .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(warningFlightNumberLbl)
                            .addComponent(warningOriginLbl)
                            .addComponent(warningDestLbl)
                            .addComponent(warningtTckLbl)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scheduleRadio)
                                    .addComponent(specificDateRadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(specificDates, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(scheduleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(warningtimeLbl)
                                            .addComponent(warningSchLbl)))))
                            .addComponent(addScheduleBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(254, Short.MAX_VALUE))
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
                    .addComponent(warningtTckLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(getTimeHr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getTimeMins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(warningtimeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(specificDateRadBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scheduleRadio))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(specificDates, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(scheduleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(warningSchLbl))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addScheduleBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(warningSpecificLbl)
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void specificDateRadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specificDateRadBtnActionPerformed
        specificDates.setVisible(true);
        scheduleTxt.setVisible(false);      
        infoLabel.setVisible(false);
    }//GEN-LAST:event_specificDateRadBtnActionPerformed

    private void scheduleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scheduleRadioActionPerformed
        specificDates.setVisible(false);
        infoLabel.setVisible(true);
        scheduleTxt.setVisible(true);
    }//GEN-LAST:event_scheduleRadioActionPerformed

    private void addScheduleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addScheduleBtnActionPerformed
        String flightNum = flightNumTxt.getText();
        String origin = originTxt.getText();
        String dest = destTxt.getText();
        Date d1 = specificDates.getDate();
        int i = 0;
        float time = 0.0F;
        double price = 0.0;
        
        
        checkFlightNum();
        
        
        try{
             if(!scheduleTxt.getText().trim().isEmpty())
                i = Integer.parseInt(scheduleTxt.getText());
             
        }
        catch(Exception e){
            warningSchLbl.setVisible(true);
            warningSchLbl.setText("Invalid Characters. Please enter a number.");            
        
        }
        try{
      //   time = Float.parseFloat(timeTxt.getText());
         
         int hr = Integer.parseInt(getTimeHr.getSelectedItem().toString());
         
         String mins = getTimeMins.getSelectedItem().toString();
         if(mins.length() == 2)
             if(mins.toCharArray()[1] == '0')
                 mins = mins+"11";
         int min = Integer.parseInt(mins);
         String s = hr+"."+min;
         time = Float.parseFloat(s);
         
        }
        catch(Exception e){
            warningtimeLbl.setVisible(true);
                        warningtimeLbl.setForeground(Color.red);
            warningtimeLbl.setText("Invalid time.");            
            
        
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
            warningOriginLbl.setForeground(Color.red);
            warningOriginLbl.setText("Origin City cannot be empty");
        
        
        }
        else{
            warningOriginLbl.setVisible(false);
            warningOriginLbl.setText("Origin City cannot be empty");
        }
        
        if(dest.length() == 0){
            warningDestLbl.setVisible(true);
                        warningDestLbl.setForeground(Color.red);
            warningDestLbl.setText("Destination City cannot be empty");        
        
        }
        
        else{
            warningDestLbl.setVisible(false);
            warningDestLbl.setText("Origin City cannot be empty");              
        }
        
        if(origin.equals(dest)){
            warningOriginLbl.setVisible(true);
                        warningOriginLbl.setForeground(Color.RED);
            warningOriginLbl.setText("Origin and Destination city cannot be same");              
           
        }

        
        if((origin.length() != 0) 
                &&
          (dest.length() != 0) 
                &&
          (price != 0) 
                && 
          (d1 != null || i != 0) 
                &&
          (time != 0) 
                &&
          (flightNum.length() != 0) 
                &&
           !(origin.equals(dest))
                &&  
            !checkFlightNum()){
            
                warningDestLbl.setText("");
                warningOriginLbl.setText("");
                warningFlightNumberLbl.setText("");
                warningSchLbl.setText("");
                warningtTckLbl.setText("");
                warningtimeLbl.setText("");


                if(d1 != null 
                     && specificDateRadBtn.isSelected()
                    ){
                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                        Date dateWithoutTime;
                    try {
                        dateWithoutTime = sdf.parse(sdf.format(d1));
                        FlightDates flightdate = new FlightDates(dateWithoutTime, time, aircraft.getNoOfSeats(), price);
                        AircraftFlights flight = new AircraftFlights(flightNum, origin,  dest, price, flightdate);
                        aircraft.getFlights().add(flight);
                        mainTravelAgency.getMasterFlightSchedule().addFlights(flight);
    //                    aircraft.getFlightDetails().setFlightSchedule(flightNum, origin,  dest, price, flightdate);
    //                    mainTravelAgency.getMasterFlightSchedule().addFlights(new Flight(flightNum, origin, dest, price, flightdate));

                    } catch (ParseException ex) {
                        Logger.getLogger(AddFlightSchedule.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        JOptionPane.showMessageDialog(null, "Successfully added!");
                }
                else if(scheduleRadio.isSelected() && i != 0 
                        )

                {
                    Date d2 = new Date();
                    for(int j = 0; j < i; j++)
                    {
                        try {
                            d2 = getNextDate(d2);
                            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                            Date dateWithoutTime = sdf.parse(sdf.format(d2));
                            FlightDates flightdate = new FlightDates(dateWithoutTime, time, aircraft.getNoOfSeats(), price);  
                            AircraftFlights flight = new AircraftFlights(flightNum, origin,  dest, price, flightdate);
                            aircraft.getFlights().add(flight);
                            mainTravelAgency.getMasterFlightSchedule().addFlights(flight);
    //                        aircraft.getFlightDetails().setFlightSchedule(flightNum, origin,  dest, price, flightdate);
                        } catch (ParseException ex) {
                            Logger.getLogger(AddFlightSchedule.class.getName()).log(Level.SEVERE, null, ex);
                        }

                    }
                        JOptionPane.showMessageDialog(null, "Successfully added!");
                }
        }

    }//GEN-LAST:event_addScheduleBtnActionPerformed

    public boolean checkFlightNum(){
            boolean b = this.mainTravelAgency.getMasterFlightSchedule().flightNumberExists(flightNumTxt.getText());
            if(b == true)
            {
                warningFlightNumberLbl.setVisible(true);
                warningFlightNumberLbl.setForeground(Color.red);
                warningFlightNumberLbl.setText("Flight number already exists!");   
                
            }
            else
            {
                warningFlightNumberLbl.setVisible(false);
            }
            
            return b;
    }
    
    
    
    
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
    public static Date getNextDate(Date  curDate) {
      final Calendar calendar = Calendar.getInstance();
      calendar.setTime(curDate);
      calendar.add(Calendar.DAY_OF_YEAR, 1);
      return  calendar.getTime(); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AircraftCodeTxt;
    private javax.swing.JButton addScheduleBtn;
    private javax.swing.JLabel aircraftNameTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField destTxt;
    private javax.swing.JTextField flightNumTxt;
    private javax.swing.JComboBox<String> getTimeHr;
    private javax.swing.JComboBox<String> getTimeMins;
    private javax.swing.JLabel infoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField originTxt;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JRadioButton scheduleRadio;
    private javax.swing.JTextField scheduleTxt;
    private javax.swing.JRadioButton specificDateRadBtn;
    private org.jdesktop.swingx.JXDatePicker specificDates;
    private javax.swing.JLabel warningDestLbl;
    private javax.swing.JLabel warningFlightNumberLbl;
    private javax.swing.JLabel warningOriginLbl;
    private javax.swing.JLabel warningSchLbl;
    private javax.swing.JLabel warningSpecificLbl;
    private javax.swing.JLabel warningtTckLbl;
    private javax.swing.JLabel warningtimeLbl;
    // End of variables declaration//GEN-END:variables
}
