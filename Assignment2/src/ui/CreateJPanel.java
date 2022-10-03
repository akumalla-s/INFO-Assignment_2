/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.io.File;
import static java.lang.System.exit;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.EmployeeHistory;
import model.Employee;

/**
 *
 * @author srinredd
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    EmployeeHistory employeeHistory;
    public CreateJPanel(EmployeeHistory employeeHistory) {
        initComponents();
        this.employeeHistory = employeeHistory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupRadioButtons = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        lblPersonalDetails = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        lblProjectDetails = new javax.swing.JLabel();
        lblEmployeeId = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        lblStartDate = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        lblLevel = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        lblTeamInfo = new javax.swing.JLabel();
        txtTeamInfo = new javax.swing.JTextField();
        lblPositionTitle = new javax.swing.JLabel();
        txtPositionTitle = new javax.swing.JTextField();
        lblContactInformation = new javax.swing.JLabel();
        lblCellphoneNumber = new javax.swing.JLabel();
        txtCellphoneNumber = new javax.swing.JTextField();
        lblEmailAddress = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        lblUploadPhoto = new javax.swing.JLabel();
        filePhoto = new javax.swing.JFileChooser();
        btnSave = new javax.swing.JButton();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        btnOthers = new javax.swing.JRadioButton();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Employee");

        lblPersonalDetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPersonalDetails.setText("Personal Details");

        lblFirstName.setText("First Name:");

        txtFirstName.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFirstNameCaretUpdate(evt);
            }
        });
        txtFirstName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtFirstNameMouseReleased(evt);
            }
        });
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });
        txtFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFirstNameKeyTyped(evt);
            }
        });

        lblLastName.setText("Last Name:");

        lblAge.setText("Age:");

        lblGender.setText("Gender:");

        lblProjectDetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblProjectDetails.setText("Project Details");

        lblEmployeeId.setText("Employee ID:");

        lblStartDate.setText("Start Date:");

        txtDate.setText("dd/mm/yyyy");

        lblLevel.setText("Level:");

        lblTeamInfo.setText("Team Info:");

        lblPositionTitle.setText("Position Title:");

        lblContactInformation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblContactInformation.setText("Contact Information");

        lblCellphoneNumber.setText("Cellphone Number:");

        lblEmailAddress.setText("Email Address:");

        lblUploadPhoto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUploadPhoto.setText("Upload Photo (Recommended 200 X 200)");

        filePhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filePhotoActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        buttonGroupRadioButtons.add(btnMale);
        btnMale.setText("Male");
        btnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaleActionPerformed(evt);
            }
        });

        buttonGroupRadioButtons.add(btnFemale);
        btnFemale.setText("Female");

        buttonGroupRadioButtons.add(btnOthers);
        btnOthers.setText("Others");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPersonalDetails)
                    .addComponent(lblContactInformation)
                    .addComponent(lblUploadPhoto)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(filePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)
                        .addComponent(btnSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblLevel)
                                    .addComponent(lblEmployeeId)
                                    .addComponent(lblPositionTitle))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtLevel, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(txtPositionTitle)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCellphoneNumber)
                                .addGap(18, 18, 18)
                                .addComponent(txtCellphoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmailAddress)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmailAddress))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblStartDate)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblTeamInfo)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(lblProjectDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAge)
                                    .addComponent(lblFirstName))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFirstName)
                                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLastName)
                            .addComponent(lblGender))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMale)
                                .addGap(18, 18, 18)
                                .addComponent(btnFemale)
                                .addGap(18, 18, 18)
                                .addComponent(btnOthers)))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPersonalDetails)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFirstName)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblLastName)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGender)
                            .addComponent(btnMale)
                            .addComponent(btnFemale)
                            .addComponent(btnOthers))
                        .addGap(18, 18, 18)
                        .addComponent(lblProjectDetails)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmployeeId)
                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStartDate)
                            .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLevel)
                            .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTeamInfo)
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPositionTitle)
                            .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblContactInformation)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCellphoneNumber)
                            .addComponent(txtCellphoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmailAddress)
                            .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblUploadPhoto)
                        .addGap(18, 18, 18)
                        .addComponent(filePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void filePhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filePhotoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this," Upload Success");
    }//GEN-LAST:event_filePhotoActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(validateInformation() == true){
            JOptionPane.showMessageDialog(this," Information Saved Successfully");
        }
        else{
            JOptionPane.showMessageDialog(this, "Information is not saved try again");
           
        }
        
        clearTextFields();
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaleActionPerformed
        // TODO add your handling code here:
        String gender = btnMale.getText();
        
    }//GEN-LAST:event_btnMaleActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtFirstNameMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFirstNameMouseReleased
        // TODO add your handling code here:
        validateName(txtFirstName.getText());
    }//GEN-LAST:event_txtFirstNameMouseReleased

    private void txtFirstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFirstNameKeyTyped
        // TODO add your handling code here:
        validateName(txtFirstName.getText());
    }//GEN-LAST:event_txtFirstNameKeyTyped

    private void txtFirstNameCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFirstNameCaretUpdate
        // TODO add your handling code here:
        validateName(txtFirstName.getText());
    }//GEN-LAST:event_txtFirstNameCaretUpdate
    private boolean validateInformation() {
        
        boolean saveFlag = true;
        
        Employee employee = employeeHistory.addNewEmployee();
        
        //First name
        String firstName = txtFirstName.getText();
        validateName(firstName);
        if(validateName(firstName) == true){
             employee.setEmployeeFirstName(firstName);
        }else{
           JOptionPane.showMessageDialog(this, "Invalid First Name input");
           saveFlag = false;
        }
        
        //LastName
        String lastName = txtLastName.getText();
        validateName(lastName);
        if(validateName(lastName) == true){
             employee.setEmployeeLastName(lastName);
        }else{
            JOptionPane.showMessageDialog(this, "Invalid Last Name input");
            saveFlag = false;           
        }
        
        //Age
        int age = Integer.parseInt(txtAge.getText());
        employee.setEmployeeAge(age);
        
        //Gender
        if(btnMale.isSelected()){
            String genderMale = btnMale.getText();
            employee.setEmployeeGender(genderMale);
        }else if(btnFemale.isSelected()){
             String genderFemale = btnFemale.getText();
            employee.setEmployeeGender(genderFemale);
        }else{
            String genderOther = btnOthers.getText();
            employee.setEmployeeGender(genderOther);
        }
        
        //Employee ID
        
        int empId=0;
        if(txtEmployeeID.getText() == null){
            JOptionPane.showMessageDialog(this, "Employee ID must be entered");
        }else {
             empId = Integer.parseInt(txtEmployeeID.getText());
        }
        boolean empResult = validateEmployeeID(empId);
        if(empResult == true){
             employee.setEmployeeId(empId);
        }else{
            JOptionPane.showMessageDialog(this, "Invalid Employee ID");
            saveFlag = false;           
        }
        
        //Date
        Date startDate;  
        try {
            startDate = new SimpleDateFormat("dd/mm/yyyy").parse(txtDate.getText());
            employee.setEmployeeStartDate(startDate);
        } catch (ParseException ex) {
            Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Level
        String level = txtLevel.getText();
        employee.setEmployeeLevel(level);
        //Team Info
        String teamInfo = txtTeamInfo.getText();
        employee.setEmployeeTeamInfo(teamInfo);
        
        //Position Title
        String positionTitle = txtPositionTitle.getText();
        employee.setEmployeePositionTitle(positionTitle);
        
        //Contact Number
        Long contactNumber = Long.parseLong(txtCellphoneNumber.getText());
        employee.setEmployeeContactNumber(contactNumber);
        
        //Email Address
        String emailAddress = txtEmailAddress.getText();
        employee.setEmployeeEmailAddress(emailAddress);
        
        //Photo
        File photoPath = filePhoto.getSelectedFile();
        employee.setEmployeePhotoPath(photoPath);
        
        if(saveFlag == false){
            employeeHistory.deleteEmployee(employee);
        }
        
        return saveFlag;
    }
    private boolean validateName(String employeeName) {
         String regex = "[A-Z][a-z]*\\s*?";
        
        if(employeeName == null){
            JOptionPane.showMessageDialog(this, "Name must be entered");
            return false;
        }        
        return employeeName.matches(regex);        
    }
    
    private boolean validateEmployeeID(int empId)
    {
        boolean resultFlag = false;
        ArrayList<Employee> employee = employeeHistory.getEmployeeHistory();
        if(empId == 0){
            JOptionPane.showMessageDialog(this, "Employee ID must be entered");
            return false;
        }
        for(Employee employee1: employeeHistory.getEmployeeHistory())
        {
            if(employee1.getEmployeeId() == empId)
            {
                 resultFlag = false;
                 JOptionPane.showMessageDialog(this, "Employee with this ID already Exists");
                 return false;
            }
                else resultFlag = true;
        }    
        
        return resultFlag;
    }
    
    private void clearTextFields() {
        //Clear Text Fields
        txtFirstName.setText("");
        txtLastName.setText("");
        txtAge.setText("");
        //txtGender.setText("");
        btnMale.setSelected(false);
        btnFemale.setSelected(false);
        btnOthers.setSelected(false);
        txtEmployeeID.setText("");
        txtDate.setText("dd/mm/yyyy");
        txtLevel.setText("");
        txtTeamInfo.setText("");
        txtPositionTitle.setText("");
        txtCellphoneNumber.setText("");
        txtEmailAddress.setText("");
        File fileName = new File("Documents");
        filePhoto.setSelectedFile(fileName);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JRadioButton btnOthers;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroupRadioButtons;
    private javax.swing.JFileChooser filePhoto;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCellphoneNumber;
    private javax.swing.JLabel lblContactInformation;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblEmployeeId;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblPersonalDetails;
    private javax.swing.JLabel lblPositionTitle;
    private javax.swing.JLabel lblProjectDetails;
    private javax.swing.JLabel lblStartDate;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUploadPhoto;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellphoneNumber;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

    

    
    

    
}