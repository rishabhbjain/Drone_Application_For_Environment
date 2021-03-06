/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ForestProtectorRequestData;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.CityNetwork;
import Business.Network.CountryNetwork;
import Business.Network.StateNetwork;
import Business.Organization.EnvironmentalSendDataOrganization;
import Business.Organization.ForestProtectorRequestDataOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InventoryWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rishabhjain
 */
public class ForestWillRequestDataJPanel extends javax.swing.JPanel {
    private JPanel container;
    private UserAccount account;
    private ForestProtectorRequestDataOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    /**
     * Creates new form ForestWillRequestDataJPanel
     */
    
    public ForestWillRequestDataJPanel(JPanel container, UserAccount account, ForestProtectorRequestDataOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.container = container;
        this.account =account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        populateCountryComboBox();
        populateTable();
    }

    private void populateCountryComboBox() {
        comboCountry.removeAllItems();
        for(CountryNetwork countryNetwork:business.getCountryNetworkDirectory().getCountryNetworkList()){
            comboCountry.addItem(countryNetwork);
        }
    }
    private void populateStateComboBox(CountryNetwork countryNetwork) {
        comboState.removeAllItems();
     
       for(StateNetwork stateNetwork:countryNetwork.getStateNetworkDirectory().getStateNetworkList()){
           comboState.addItem(stateNetwork);
       }
    }
    private void populateCityComboBox(StateNetwork stateNetwork) {
      comboCity.removeAllItems();
      
      for(CityNetwork cityNetwork:stateNetwork.getCityNetworkDirectory().getCityNetworkList()){
          comboCity.addItem(cityNetwork);
      }
    }
    
    private  void populateEnvironmentCombo(CityNetwork cityNetwork){
        comboEnvironment.removeAllItems();
                    for(Enterprise enterprise1: cityNetwork.getEnterpriseDirectory().getEnterpriseList()){
                        if(enterprise1.getEnterpriseType().getValue().equals("Environmental")){
                            comboEnvironment.addItem(enterprise1);
                        }
                    
        }
    }
    private void populateTable(){
   
        DefaultTableModel dtm;
        dtm = (DefaultTableModel)tblR.getModel();
        dtm.setRowCount(0);
        for(WorkRequest request:account.getWorkqueue().getWorkRequestList()){
            Object[] row1 = new Object[10];
            row1[0]=request.getId();
            row1[1]=request.getCountry();
            row1[2]=request.getState();
            row1[3]=request.getCity();
            row1[4]=request.getFrom();
            row1[5]=request.getTo();
            row1[6]= request.getEnvironment();
            row1[7]=request;
            row1[8]=request.getSender();
            row1[9]=request.getReceiver();
            dtm.addRow(row1)  ;
       
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FromdateChooserCombo = new datechooser.beans.DateChooserCombo();
        TodateChooserCombo = new datechooser.beans.DateChooserCombo();
        jLabel4 = new javax.swing.JLabel();
        comboCity = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboCountry = new javax.swing.JComboBox();
        comboState = new javax.swing.JComboBox();
        btnRequest = new javax.swing.JButton();
        tblRequest1 = new javax.swing.JScrollPane();
        tblR = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        comboEnvironment = new javax.swing.JComboBox();
        btnBack = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("STATE:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setText("REQUEST DATA");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("FROM:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, -1, -1));

        FromdateChooserCombo.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    FromdateChooserCombo.setFieldFont(new java.awt.Font("Verdana", java.awt.Font.PLAIN, 12));
    add(FromdateChooserCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 170, -1));

    TodateChooserCombo.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
TodateChooserCombo.setFieldFont(new java.awt.Font("Verdana", java.awt.Font.PLAIN, 12));
add(TodateChooserCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 170, -1));

jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
jLabel4.setText("ENVIRONMENT:");
add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, -1, -1));

comboCity.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
comboCity.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        comboCityActionPerformed(evt);
    }
    });
    add(comboCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 170, -1));

    jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
    jLabel5.setText("CITY:");
    add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, -1, -1));

    jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
    jLabel6.setText("COUNTRY:");
    add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

    comboCountry.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
    comboCountry.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            comboCountryActionPerformed(evt);
        }
    });
    add(comboCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 170, -1));

    comboState.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
    comboState.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            comboStateActionPerformed(evt);
        }
    });
    add(comboState, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 170, -1));

    btnRequest.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
    btnRequest.setText("Request");
    btnRequest.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnRequestActionPerformed(evt);
        }
    });
    add(btnRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, 160, -1));

    tblR.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
    tblR.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null}
        },
        new String [] {
            "ID", "COUNTRY", "STATE", "CITY", "FROM", "TO", "Environmental", "Status", "Sender", "Reeiver"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false, false, false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    tblRequest1.setViewportView(tblR);

    add(tblRequest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 1040, 220));

    jLabel7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
    jLabel7.setText("TO:");
    add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 40, -1));

    comboEnvironment.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
    add(comboEnvironment, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 300, 170, -1));

    btnBack.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
    btnBack.setText("<<Back");
    btnBack.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnBackActionPerformed(evt);
        }
    });
    add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, -1, -1));

    jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/background2.png"))); // NOI18N
    jLabel8.setText("jLabel8");
    add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed
        // TODO add your handling code here:
        System.out.println("1111111111");
        String country = String.valueOf(comboCountry.getSelectedItem());
        String state = String.valueOf(comboState.getSelectedItem());
        String city = String.valueOf(comboCity.getSelectedItem());
        String fromdate = FromdateChooserCombo.getText();
        String todate = TodateChooserCombo.getText();
        String env = String.valueOf(comboEnvironment.getSelectedItem());
        Date joindatefrom = new Date();
        Date joindateto = new Date();
        try {
            joindatefrom =new SimpleDateFormat("MM/dd/yyyy").parse(fromdate);
            joindateto =new SimpleDateFormat("MM/dd/yyyy").parse(todate);
        }
        catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Please enter a valid date");
        }
        
        InventoryWorkRequest fprequest = new InventoryWorkRequest();
        fprequest.getId();
        fprequest.setCity(city);
        fprequest.setState(state);
        fprequest.setCountry(country);
        fprequest.setFrom(joindatefrom);
        fprequest.setTo(joindateto);
        fprequest.setStatus("Sent");
       
        fprequest.setSender(account);
         System.out.println("SENDER"+fprequest.getSender());
        fprequest.setEnvironment(env);
        
        Enterprise environmental = (Enterprise)comboEnvironment.getSelectedItem();
        Organization org = null;
        for(Organization organization2 : environmental.getOrganizationDirectory().getOrganizationList()){
            System.out.println(organization2);
            if(organization2 instanceof EnvironmentalSendDataOrganization){
                org = organization2;
                break;
            }
        }
        
        if(org != null){
              fprequest.setReceiver(null);
              fprequest.setSender(account);
              org.getWorkQueue().getWorkRequestList().add(fprequest);
            //  System.out.println("ORGANIZATIONWORK"+ org.getWorkQueue().getWorkRequestList().add(fprequest));
              System.out.println("honey"+org.getWorkQueue().getWorkRequestList());
               account.getWorkqueue().getWorkRequestList().add(fprequest);
            //   System.out.println("ACCOUNTWORK"+ account.getWorkqueue().getWorkRequestList().add(fprequest));
         }
        
        System.out.println("WORKREQUEST"+account.getWorkqueue().getWorkRequestList());
        populateTable();
       
    }//GEN-LAST:event_btnRequestActionPerformed

    private void comboCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCountryActionPerformed
        // TODO add your handling code here:
        CountryNetwork countryNetwork = (CountryNetwork) comboCountry.getSelectedItem();
        if(countryNetwork != null){
            populateStateComboBox(countryNetwork);
        }
    }//GEN-LAST:event_comboCountryActionPerformed

    private void comboStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboStateActionPerformed
        // TODO add your handling code here:
          StateNetwork stateNetwork = (StateNetwork) comboState.getSelectedItem();
        if(stateNetwork != null){
            populateCityComboBox(stateNetwork);
        }
    }//GEN-LAST:event_comboStateActionPerformed

    private void comboCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCityActionPerformed
        // TODO add your handling code here:
        CityNetwork cityNetwork = (CityNetwork) comboCity.getSelectedItem();
        if(cityNetwork != null){
            populateEnvironmentCombo(cityNetwork);
        }
    }//GEN-LAST:event_comboCityActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo FromdateChooserCombo;
    private datechooser.beans.DateChooserCombo TodateChooserCombo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRequest;
    private javax.swing.JComboBox comboCity;
    private javax.swing.JComboBox comboCountry;
    private javax.swing.JComboBox comboEnvironment;
    private javax.swing.JComboBox comboState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTable tblR;
    private javax.swing.JScrollPane tblRequest1;
    // End of variables declaration//GEN-END:variables
}
