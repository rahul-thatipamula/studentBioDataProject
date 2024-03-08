/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.studentbiodata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rahul
 */
public class DisplayAllStudentPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayAllStudentPanel
     */
    public DisplayAllStudentPanel() {
        initComponents();
        
        try {
            Connection con = GetConnection.createConnection();
            String query = "select * from studentBiodata";
            PreparedStatement statement = con.prepareStatement(query);
            ResultSet rs;

            rs = statement.executeQuery();
           DefaultTableModel model = (DefaultTableModel) studentDataTable.getModel();
            int i = 1;
            while (rs.next()) {
                Object[] obj = {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getDouble(9), rs.getDouble(10), rs.getString(11), rs.getString(12)};
                model.addRow(obj);
            }

        } catch (SQLException ex) {
            Logger.getLogger(AdminPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        displayAllBackBtn = new javax.swing.JButton();
        displayAllStudentScroll = new javax.swing.JScrollPane();
        studentDataTable = new javax.swing.JTable();

        displayAllBackBtn.setText("Back");
        displayAllBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAllBackBtnActionPerformed(evt);
            }
        });

        displayAllStudentScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        displayAllStudentScroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        studentDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "Roll Number", "Father Name", "Mother Name", "Date Of Birth", "Gender", "Mail", "Branch", "Attendance", "Cgpa", "courseDuration", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        displayAllStudentScroll.setViewportView(studentDataTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(displayAllBackBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(displayAllStudentScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(displayAllBackBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(displayAllStudentScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void displayAllBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAllBackBtnActionPerformed
       adminPanelRef.adminHomePanel.remove(this);
       adminPanelRef.adminHomePanel.add(adminPanelRef.homePanel);
       adminPanelRef.adminHomePanel.repaint();
       adminPanelRef.adminHomePanel.revalidate();
    }//GEN-LAST:event_displayAllBackBtnActionPerformed
AdminPanel adminPanelRef=null;
        public void AdminPanelReference(AdminPanel adminPanelRef){
            this.adminPanelRef = adminPanelRef;
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton displayAllBackBtn;
    private javax.swing.JScrollPane displayAllStudentScroll;
    private javax.swing.JTable studentDataTable;
    // End of variables declaration//GEN-END:variables
}