/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.studentbiodata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Rahul
 */
public class AddStudentPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddStudentPanel
     */
    public AddStudentPanel() {
        setGetStudentData = new SetGetStudentData();
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender = new javax.swing.ButtonGroup();
        studentNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rollNumberField = new javax.swing.JTextField();
        fatherNameField = new javax.swing.JTextField();
        motherNameField = new javax.swing.JTextField();
        emailIdField = new javax.swing.JTextField();
        branchField = new javax.swing.JTextField();
        attendaceField = new javax.swing.JTextField();
        courseDurationField = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        addressField = new javax.swing.JTextArea();
        photoSelect = new javax.swing.JButton();
        submitBtn = new javax.swing.JButton();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        others = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        gpaField = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        dateOfBirthField = new javax.swing.JTextField();

        studentNameField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
       

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Roll Number");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Course Duration");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Student Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Father Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Mother Name");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Date of Birth");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Branch");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Attendance Percentage");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Gender");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Photo");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Address");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Email ID");

        rollNumberField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rollNumberField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rollNumberFieldFocusLost(evt);
            }
        });
        

        fatherNameField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
       

        motherNameField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
       

        emailIdField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        emailIdField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailIdFieldFocusLost(evt);
            }
        });
       

        branchField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
       

        attendaceField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
       

        courseDurationField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2023-2027", "2022-2026", "2021-2025 ", "2020-2024", "2019-2023 ", "2018-2022", "2017-2021 ", "2016-2020", "2015-2019" }));
       

        addressField.setColumns(20);
        addressField.setRows(5);
      
        jScrollPane2.setViewportView(addressField);

        photoSelect.setText("Select Photo");
        photoSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoSelectActionPerformed(evt);
            }
        });

        submitBtn.setText("submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        gender.add(male);
        male.setText("Male");
       

        gender.add(female);
        female.setText("Female");

        gender.add(others);
        others.setText("Others");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Current CGPA");

        

        backBtn.setText("back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        dateOfBirthField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dateOfBirthFieldFocusLost(evt);
            }
        });
        dateOfBirthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateOfBirthFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseDurationField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(photoSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(branchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(male)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(female)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(others, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(emailIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(studentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rollNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fatherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(motherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(attendaceField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gpaField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(submitBtn)))
                .addGap(106, 106, 106))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {branchField, emailIdField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(studentNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(rollNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(motherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(dateOfBirthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(male)
                            .addComponent(female)
                            .addComponent(others))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(emailIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(branchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(attendaceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(gpaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(courseDurationField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(photoSelect)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(submitBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(fatherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {branchField, emailIdField, motherNameField});

    }// </editor-fold>//GEN-END:initComponents

    private void rollNumberFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rollNumberFieldFocusLost
        String rollNumber = rollNumberField.getText();
        if (rollNumberCheck(rollNumber)) {
            JOptionPane.showMessageDialog(null, "Roll number already exists!"); rollNumberField.setText("");
        }
    }//GEN-LAST:event_rollNumberFieldFocusLost
 public boolean rollNumberCheck(String rollNumber){
         try {
            Connection con = GetConnection.createConnection();

            String query = "Select * from studentBioData where rollnumber  = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, rollNumberField.getText());
            ResultSet rs = statement.executeQuery();       
             return rs.next();
        } catch (SQLException ex) {
              String errorMessage = ex.getMessage();
           JOptionPane.showMessageDialog(null, "An error occurred: " + errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
  
    private void photoSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_photoSelectActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                photoSelect.setText(selectedFile.getPath());
                uploadPhotoToDatabase(selectedFile);
            } catch (SQLException ex) {
                 String errorMessage = ex.getMessage();
           JOptionPane.showMessageDialog(null, "An error occurred: " + errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                 String errorMessage = ex.getMessage();
           JOptionPane.showMessageDialog(null, "An error occurred: " + errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_photoSelectActionPerformed
SetGetStudentData setGetStudentData=null;
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed

        setGetStudentData.setName(studentNameField.getText());
        setGetStudentData.setRollNumber(rollNumberField.getText());
        setGetStudentData.setFatherName(fatherNameField.getText());
        setGetStudentData.setMotherName(motherNameField.getText());
        setGetStudentData.setDateOfBirth(dateOfBirthField.getText());
        setGetStudentData.setEmail(emailIdField.getText());
        setGetStudentData.setBranch(branchField.getText());
        if(attendaceField.getText().isEmpty()){
            setGetStudentData.setAttendancePercentage(0.0);
        }
        else{
            setGetStudentData.setAttendancePercentage(Double.parseDouble(attendaceField.getText()));
        }
        if(gpaField.getText().isEmpty()){
            setGetStudentData.setCgpa(0.0);
        }
        else{
            setGetStudentData.setCgpa(Double.parseDouble(gpaField.getText()));
        }setGetStudentData.setAddress(addressField.getText());
        setGetStudentData.setCourseDuration((String) courseDurationField.getSelectedItem());

        Enumeration<AbstractButton> buttons = gender.getElements();
        while (buttons.hasMoreElements()) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                setGetStudentData.setGender(button.getText());
                break;
            }
        }
        if (setGetStudentData.getName() != null
            && setGetStudentData.getRollNumber() != null
            && setGetStudentData.getFatherName() != null
            && setGetStudentData.getMotherName() != null
            && setGetStudentData.getDateOfBirth() != null
            && setGetStudentData.getGender() != null
            && setGetStudentData.getEmail() != null
            && setGetStudentData.getBranch() != null
            && setGetStudentData.getAttendancePercentage() != 0
            && setGetStudentData.getCgpa() != 0
            && setGetStudentData.getCourseDuration() != null
            && setGetStudentData.getAddress() != null
            && setGetStudentData.getPhotoPath() != null) {
            try {
                Connection con = GetConnection.createConnection();

                String query = "INSERT INTO STUDENTBIODATA (NAME, ROLLNUMBER, FATHERNAME, MOTHERNAME, DATEOFBIRTH, GENDER, EMAIL, BRANCH, ATTENDANCEPERCENTAGE, CGPA, COURSEDURATION, ADDRESS, PHOTO) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                PreparedStatement preparedStatement = con.prepareStatement(query);
                preparedStatement.setString(1, setGetStudentData.getName());
                preparedStatement.setString(2, setGetStudentData.getRollNumber());
                preparedStatement.setString(3, setGetStudentData.getFatherName());
                preparedStatement.setString(4, setGetStudentData.getMotherName());
                preparedStatement.setString(5, setGetStudentData.getDateOfBirth());
                preparedStatement.setString(6, setGetStudentData.getGender());
                preparedStatement.setString(7, setGetStudentData.getEmail());
                preparedStatement.setString(8, setGetStudentData.getBranch());
                preparedStatement.setDouble(9, setGetStudentData.getAttendancePercentage());
                preparedStatement.setDouble(10, setGetStudentData.getCgpa());
                preparedStatement.setString(11, setGetStudentData.getCourseDuration());
                preparedStatement.setString(12, setGetStudentData.getAddress());
                preparedStatement.setBlob(13, setGetStudentData.getPhotoPath());

                int x = preparedStatement.executeUpdate();
                if (x == 1) {
                    JOptionPane.showMessageDialog(null, "Data successfully saved.");
                } else {
                    throw new SQLException("Error something went wrong!!!");
                }

            } catch (Exception s) {
                  String errorMessage = s.getMessage();
            if (errorMessage.contains("date") || errorMessage.contains("format")) {
                JOptionPane.showMessageDialog(null, "Date formatting error occurred: " + errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "An error occurred: " + errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
            }
            }
          
        } else {
            JOptionPane.showMessageDialog(null, "Enter all Fields to Save");
        }
    }//GEN-LAST:event_submitBtnActionPerformed

  
    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
          adminPanelRef.adminHomePanel.remove(this);
       adminPanelRef.adminHomePanel.add(adminPanelRef.homePanel);
        adminPanelRef.adminHomePanel.repaint();
        adminPanelRef.adminHomePanel.revalidate();
         
    }//GEN-LAST:event_backBtnActionPerformed
  AdminPanel adminPanelRef=null;
        public void AdminPanelReference(AdminPanel adminPanelRef){
            this.adminPanelRef = adminPanelRef;
        }
    private void dateOfBirthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateOfBirthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateOfBirthFieldActionPerformed

    private void emailIdFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailIdFieldFocusLost
        
        EmailVerifier ev = new EmailVerifier(emailIdField.getText());
        if(ev.verifyEmail()){
           
        }else{
            JOptionPane.showMessageDialog(null, "Email Format is not Correct");
            emailIdField.setText(null);
        }
        
    }//GEN-LAST:event_emailIdFieldFocusLost

    private void dateOfBirthFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateOfBirthFieldFocusLost
 
    
    
    }//GEN-LAST:event_dateOfBirthFieldFocusLost
 private void uploadPhotoToDatabase(File selectedFile) throws SQLException, IOException  {       
        try {
          
            FileInputStream studentPhotoFile = new FileInputStream(selectedFile);
            setGetStudentData.setPhotoPath(studentPhotoFile);

        } catch (Exception ex) {
            String errorMessage = ex.getMessage();
           JOptionPane.showMessageDialog(null, "An error occurred: " + errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea addressField;
    private javax.swing.JTextField attendaceField;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField branchField;
    private javax.swing.JComboBox<String> courseDurationField;
    private javax.swing.JTextField dateOfBirthField;
    private javax.swing.JTextField emailIdField;
    private javax.swing.JTextField fatherNameField;
    private javax.swing.JRadioButton female;
    private javax.swing.ButtonGroup gender;
    private javax.swing.JTextField gpaField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField motherNameField;
    private javax.swing.JRadioButton others;
    private javax.swing.JButton photoSelect;
    private javax.swing.JTextField rollNumberField;
    private javax.swing.JTextField studentNameField;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
