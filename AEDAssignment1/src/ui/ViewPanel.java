/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import javax.swing.ImageIcon;
import model.Person;

/**
 *
 * @author harshaljaiswal
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    Person person;
    ImageIcon myImage;

    public ViewPanel(Person person) {
        initComponents();
        this.person = person;
        displayPerson();
    }
    public ImageIcon setIcon(String m, byte[] image){
        if(m!=null){
            myImage = new ImageIcon(m);
        }else{
            myImage = new ImageIcon(image);
            
        }
        Image img1 = myImage.getImage();
        Image img2 = img1.getScaledInstance(120,120, Image.SCALE_SMOOTH);
        ImageIcon i = new ImageIcon(img2);
        return i;
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labCreate = new javax.swing.JLabel();
        labName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        labGeoData = new javax.swing.JLabel();
        labDob = new javax.swing.JLabel();
        labTelNo = new javax.swing.JLabel();
        labFaxNo = new javax.swing.JLabel();
        labEmail = new javax.swing.JLabel();
        labSSN = new javax.swing.JLabel();
        labMedicalRec = new javax.swing.JLabel();
        labHealthPlanNo = new javax.swing.JLabel();
        labAccountNo = new javax.swing.JLabel();
        labCertfNo = new javax.swing.JLabel();
        labVehicleLicence = new javax.swing.JLabel();
        labDeviceSerialNo = new javax.swing.JLabel();
        labLinkedin = new javax.swing.JLabel();
        labIntProtocolAdd = new javax.swing.JLabel();
        labBiometricId = new javax.swing.JLabel();
        labUniqueId = new javax.swing.JLabel();
        txtGeoData = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtTelNo = new javax.swing.JTextField();
        txtFaxNo = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtMedRecNo = new javax.swing.JTextField();
        txtHealthPlanNo = new javax.swing.JTextField();
        txtBankAccNo = new javax.swing.JTextField();
        txtCertNo = new javax.swing.JTextField();
        txtVehLicence = new javax.swing.JTextField();
        txtDeviceNo = new javax.swing.JTextField();
        txtLinkedIn = new javax.swing.JTextField();
        txtIPA = new javax.swing.JTextField();
        txtBiometricId = new javax.swing.JTextField();
        txtUniqueId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        labCreate.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labCreate.setText("View");

        labName.setText("Name");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        labGeoData.setText("Geographic data/Address");

        labDob.setText("Date of Birth");

        labTelNo.setText("Telephone Number");

        labFaxNo.setText("Fax Number");

        labEmail.setText("Email address");

        labSSN.setText("Social Security Number");

        labMedicalRec.setText("Medical record number");

        labHealthPlanNo.setText("Health Plan beneficiary No.");

        labAccountNo.setText("Bank Account Number");

        labCertfNo.setText("Certificate/license number");

        labVehicleLicence.setText("Vehicle licence plates");

        labDeviceSerialNo.setText("Device Serial Nimber");

        labLinkedin.setText("LinkedIn");

        labIntProtocolAdd.setText("Internet Protocol Addresses");

        labBiometricId.setText("Biometric identifiers");

        labUniqueId.setText("Unique Id");

        txtGeoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeoDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labEmail)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(labMedicalRec)
                                        .addComponent(labSSN))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(labIntProtocolAdd)
                                            .addComponent(labBiometricId)
                                            .addComponent(labUniqueId)
                                            .addComponent(labAccountNo)
                                            .addComponent(labHealthPlanNo)
                                            .addComponent(labCertfNo)
                                            .addComponent(labDeviceSerialNo)
                                            .addComponent(labLinkedin)
                                            .addComponent(labVehicleLicence))
                                        .addGap(1, 1, 1))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labFaxNo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labTelNo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labDob, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labGeoData, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labName, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(txtGeoData)
                            .addComponent(txtDob)
                            .addComponent(txtTelNo)
                            .addComponent(txtFaxNo)
                            .addComponent(txtEmail)
                            .addComponent(txtSSN)
                            .addComponent(txtMedRecNo)
                            .addComponent(txtHealthPlanNo)
                            .addComponent(txtBankAccNo)
                            .addComponent(txtCertNo)
                            .addComponent(txtVehLicence)
                            .addComponent(txtDeviceNo)
                            .addComponent(txtLinkedIn)
                            .addComponent(txtIPA)
                            .addComponent(txtBiometricId)
                            .addComponent(txtUniqueId))
                        .addContainerGap(29, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labCreate)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labGeoData, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGeoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labDob)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labTelNo)
                            .addComponent(txtTelNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labFaxNo)
                            .addComponent(txtFaxNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labSSN)
                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labMedicalRec)
                            .addComponent(txtMedRecNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labHealthPlanNo)
                            .addComponent(txtHealthPlanNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labAccountNo)
                            .addComponent(txtBankAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCertNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labCertfNo))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labVehicleLicence, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVehLicence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labDeviceSerialNo)
                    .addComponent(txtDeviceNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labIntProtocolAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBiometricId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labBiometricId))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labLinkedin, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labUniqueId)
                            .addComponent(txtUniqueId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtGeoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeoDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labAccountNo;
    private javax.swing.JLabel labBiometricId;
    private javax.swing.JLabel labCertfNo;
    private javax.swing.JLabel labCreate;
    private javax.swing.JLabel labDeviceSerialNo;
    private javax.swing.JLabel labDob;
    private javax.swing.JLabel labEmail;
    private javax.swing.JLabel labFaxNo;
    private javax.swing.JLabel labGeoData;
    private javax.swing.JLabel labHealthPlanNo;
    private javax.swing.JLabel labIntProtocolAdd;
    private javax.swing.JLabel labLinkedin;
    private javax.swing.JLabel labMedicalRec;
    private javax.swing.JLabel labName;
    private javax.swing.JLabel labSSN;
    private javax.swing.JLabel labTelNo;
    private javax.swing.JLabel labUniqueId;
    private javax.swing.JLabel labVehicleLicence;
    private javax.swing.JTextField txtBankAccNo;
    private javax.swing.JTextField txtBiometricId;
    private javax.swing.JTextField txtCertNo;
    private javax.swing.JTextField txtDeviceNo;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFaxNo;
    private javax.swing.JTextField txtGeoData;
    private javax.swing.JTextField txtHealthPlanNo;
    private javax.swing.JTextField txtIPA;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtMedRecNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtTelNo;
    private javax.swing.JTextField txtUniqueId;
    private javax.swing.JTextField txtVehLicence;
    // End of variables declaration//GEN-END:variables

    private void displayPerson() {
        
        txtBankAccNo.setText(person.getBankAccNumber());
        txtBiometricId.setText(person.getBiomerticIdentif());
        txtCertNo.setText(person.getCertfNumber());
        txtDeviceNo.setText(person.getSerialNo());
        txtDob.setText(person.getDob());
        txtEmail.setText(person.getEmail());
        txtFaxNo.setText(person.getFaxNumber());
//        txtFullFacePhoto.setText(person.getFace());
        txtGeoData.setText(person.getGeoData());
        txtHealthPlanNo.setText(person.getHealthPlanNumber());
        txtIPA.setText(person.getInternetProtocolAdd());
        txtLinkedIn.setText(person.getLinkedIn());
        txtMedRecNo.setText(person.getMedRecNumber());
        txtName.setText(person.getName());
        txtSSN.setText(person.getName());
        txtTelNo.setText(person.getTelNumber());
        txtUniqueId.setText(person.getIdCode());
        txtVehLicence.setText(person.getLicencePlate());
        jLabel1.setIcon(setIcon(person.getFace(), null));

    }
}
