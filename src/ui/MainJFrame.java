/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.CardLayout;
import model.City;
import model.CityCatalog;
import model.Community;
import model.Encounter;
import model.EncounterHistory;
import model.House;
import model.People;
import model.VitalSigns;
import ui.City.ManageCity;
import ui.Patient.PatientDictory;
import ui.People.PeopleDirctory;


/**
 *
 * @author archil
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    CityCatalog cityCatalog;
 
    public MainJFrame() {
        initComponents();
        cityCatalog=new CityCatalog();
        City city1=new City();
        city1.setCityNmae("boston");
        Community community1=new Community();
        community1.setCommunityName("95 saint");
        Community community2=new Community();
        community2.setCommunityName("longwood");
        city1.getCommunityCatalog().addCommunity(community1);
        city1.getCommunityCatalog().addCommunity(community2);
        House house1=new House();
        house1.setHouseName("503");
        House house2=new House();
        house2.setHouseName("323");
        House house3=new House();
        house3.setHouseName("424");
        community1.getHouseCatalog().addHouse(house1);
        community1.getHouseCatalog().addHouse(house2);
        community1.getHouseCatalog().addHouse(house3);
          House house4=new House();
        house4.setHouseName("110");
        House house5=new House();
        house5.setHouseName("211");
        community2.getHouseCatalog().addHouse(house4);
        community2.getHouseCatalog().addHouse(house5);
         cityCatalog.addCity(city1);
        People people1=house1.getPeopleCatalog().addPeople();
        people1.setName("Peixin Yao");
        people1.setCity("boston");
        people1.setCommunity("95 saint");
        people1.setHouse("503");
        People people2=house1.getPeopleCatalog().addPeople();
        people2.setName("Jack");
        people2.setCity("boston");
        people2.setCommunity("95 saint");
        people2.setHouse("503");
    
        VitalSigns v1=new VitalSigns();
        v1.setAge(23);
        v1.setHigh(180);
        v1.setWeight(75);
        v1.setBloodpressure(150);
        Encounter e1=new Encounter();
        e1.setVitalsigns(v1);
        e1.setEncounterTime("2021/10/30");
        e1.setHospital("boston hospital");
        EncounterHistory encounterHistory1=new EncounterHistory();
        encounterHistory1.addEncounter(e1);
        people2.setEncounterHistory(encounterHistory1);
        People people3=house1.getPeopleCatalog().addPeople();
        people3.setName("Tony");
        people3.setCity("boston");
        people3.setCommunity("95 saint");
        people3.setHouse("503");
        VitalSigns v2=new VitalSigns();
        v2.setAge(25);
        v2.setHigh(175);
        v2.setWeight(70);
        v2.setBloodpressure(167);
        Encounter e2=new Encounter();
        e2.setVitalsigns(v2);
        e2.setEncounterTime("2021/9/10");
        e2.setHospital("boston hospital");
        EncounterHistory encounterHistory2=new EncounterHistory();
        encounterHistory2.addEncounter(e2);
        people3.setEncounterHistory(encounterHistory2);
        People people4=house2.getPeopleCatalog().addPeople();
        people4.setName("Tifiny");
        people4.setCity("boston");
        people4.setCommunity("95 saint");
        people4.setHouse("323");
   
        People people5=house2.getPeopleCatalog().addPeople();
        people5.setName("Kiwi");
        people5.setCity("boston");
        people5.setCommunity("95 saint");
        people5.setHouse("323");
     
        VitalSigns v3=new VitalSigns();
        v3.setAge(19);
        v3.setHigh(169);
        v3.setWeight(65);
        v3.setBloodpressure(163);
        Encounter e3=new Encounter();
        e3.setVitalsigns(v3);
        e3.setEncounterTime("2021/8/30");
        e3.setHospital("boston hospital");
        EncounterHistory encounterHistory3=new EncounterHistory();
        encounterHistory3.addEncounter(e3);
        people5.setEncounterHistory(encounterHistory3);
        People people6=house3.getPeopleCatalog().addPeople();
        people6.setName("Weiwei");
        people6.setCity("boston");
        people6.setCommunity("95 saint");
        people6.setHouse("424");
      
        People people7=house4.getPeopleCatalog().addPeople();
        people7.setName("zizi");
        people7.setCity("boston");
        people7.setCommunity("longwood");
        people7.setHouse("110");
     
        People people8=house4.getPeopleCatalog().addPeople();
        people8.setName("hilotl");
        people8.setCity("boston");
        people8.setCommunity("longwood");
        people8.setHouse("110");
     
        People people9=house5.getPeopleCatalog().addPeople();
        people9.setName("mimi");
        people9.setCity("boston");
        people9.setCommunity("longwood");
        people9.setHouse("211");
        VitalSigns v4=new VitalSigns();
        v4.setAge(21);
        v4.setHigh(166);
        v4.setWeight(63);
        v4.setBloodpressure(177);
        Encounter e4=new Encounter();
        e4.setVitalsigns(v4);
        e4.setEncounterTime("2021/7/30");
        e4.setHospital("boston hospital");
        EncounterHistory encounterHistory4=new EncounterHistory();
        encounterHistory4.addEncounter(e4);
        people9.setEncounterHistory(encounterHistory4);
        setSize(830,600);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        controlPanel = new javax.swing.JPanel();
        btnAdmin = new javax.swing.JButton();
        btnSupplier = new javax.swing.JButton();
        btnSupplier1 = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lab 5 Skeleton");
        setBackground(new java.awt.Color(240, 240, 240));

        splitPane.setDividerLocation(150);
        splitPane.setOpaque(false);

        controlPanel.setBackground(new java.awt.Color(240, 240, 240));

        btnAdmin.setText("city");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnSupplier.setText("People");
        btnSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierActionPerformed(evt);
            }
        });

        btnSupplier1.setText("patient");
        btnSupplier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplier1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAdmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSupplier, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSupplier1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdmin, btnSupplier});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnAdmin)
                .addGap(18, 18, 18)
                .addComponent(btnSupplier)
                .addGap(18, 18, 18)
                .addComponent(btnSupplier1)
                .addContainerGap(411, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(controlPanel);

        userProcessContainer.setBackground(new java.awt.Color(240, 240, 240));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
    ManageCity ms = new ManageCity(userProcessContainer, cityCatalog);
    userProcessContainer.add("ManageSupplierAdministrative", ms);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);

    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierActionPerformed
    PeopleDirctory ms = new PeopleDirctory(userProcessContainer, cityCatalog);
    userProcessContainer.add("ManageSupplierAdministrative", ms);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSupplierActionPerformed

    private void btnSupplier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplier1ActionPerformed
        // TODO add your handling code here:
     PatientDictory ms = new PatientDictory(userProcessContainer, cityCatalog);
    userProcessContainer.add("ManageSupplierAdministrative", ms);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSupplier1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnSupplier;
    private javax.swing.JButton btnSupplier1;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
