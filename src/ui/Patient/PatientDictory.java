/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Patient;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import ui.People.*;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.CityCatalog;
import model.Community;
import model.House;
import model.People;
import ui.City.ManagePeople;

/**
 *
 * @author yaopeixinmac
 */
public class PatientDictory extends javax.swing.JPanel {
    private JPanel userProcessContainer;
     private CityCatalog cityCatalog;
    /**
     * Creates new form People
     */
    public PatientDictory(JPanel upc,CityCatalog cc) {
        initComponents();
        userProcessContainer=upc;
        cityCatalog=cc;
        refreshTable();
    }
    public void refreshTable(){
        int rowCount = jTable2.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (City c : cityCatalog.getCityCatalog()) {
            for(Community com:c.getCommunityCatalog().getCommunityCatalog()){
                for(House house:com.getHouseCatalog().getHouseCatalog()){
            for(People p: house.getPeopleCatalog().getPeopleCatalog()){
                if(p.isBloodpressure()){
                String isPatitent="";
            if(p.isBloodpressure()) {
                 isPatitent="yes";
            }else{
                 isPatitent="no";
            }
            Object row[] = new Object[5];
            row[0]=p;
            row[1] = p.getCity();
            row[2]=p.getCommunity();
            row[3]=p.getHouse();
            row[4]=isPatitent;
            model.addRow(row);
        }}
        }
        }
        }
    }
      public void refreshTable(String name){
        int rowCount = jTable2.getRowCount();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        for(int i=rowCount-1;i>=0;i--){
            model.removeRow(i);
        }
        for (City c : cityCatalog.getCityCatalog()) {
            for(Community com:c.getCommunityCatalog().getCommunityCatalog()){
                for(House house:com.getHouseCatalog().getHouseCatalog()){
            for(People p: house.getPeopleCatalog().getPeopleCatalog()){
                if(p.isBloodpressure()&&p.getName().equals(name)){
                String isPatitent="";
            if(p.isBloodpressure()) {
                 isPatitent="yes";
            }else{
                 isPatitent="no";
            }
            Object row[] = new Object[5];
            row[0]=p;
            row[1] = p.getCity();
            row[2]=p.getCommunity();
            row[3]=p.getHouse();
            row[4]=isPatitent;
            model.addRow(row);
        }}
        }
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

        lblTitle1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        lblTitle1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle1.setText("Patient");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "name", "city", "community", "house", "is patitent"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("view");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("name:");

        jButton3.setText("search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(lblTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton3))))))
                .addContainerGap(201, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblTitle1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(146, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
               int row = jTable2.getSelectedRow();
        People c = (People) jTable2.getValueAt(row, 0);
        ViewPatient mpcjp = new ViewPatient(userProcessContainer, c);
        userProcessContainer.add("ManageProductCatalogJPanel", mpcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      int row = jTable2.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        People p = (People) jTable2.getValueAt(row, 0);
            for (City c : cityCatalog.getCityCatalog()) {
            for(Community com:c.getCommunityCatalog().getCommunityCatalog()){
                for(House house:com.getHouseCatalog().getHouseCatalog()){
            for(People pe: house.getPeopleCatalog().getPeopleCatalog()){
                if(pe.getName().equals(p.getName())){
                    house.getPeopleCatalog().removePeople(pe);
                         refreshTable();  
                }
            }
                }
            }
            }
              // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String searchName=jTextField1.getText();
        refreshTable(searchName);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTitle1;
    // End of variables declaration//GEN-END:variables
}