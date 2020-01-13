/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MedicalDriveManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Notifications.Send;
import Business.Organizations.FoodSupplierOrganization;
import Business.Organizations.MedicalBoothOrganization;
import Business.Organizations.Organization;
import Business.RequestQueue.NewRequestToFoodSupplier;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountMedicalBooth.UserAccountMedicalBooth;
import javax.swing.JPanel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Akash Sinha
 */
public class RequestAFoodSupplierJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestAFoodSupplierJPanel
     */
    private JPanel userProcessContainer;
    private UserAccountMedicalBooth account;
    private MedicalBoothOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;
    private String foodItemName;
    private static int pdfCount = 0;
    private Send send = new Send();

    public RequestAFoodSupplierJPanel(JPanel userProcessContainer, UserAccountMedicalBooth account, Enterprise enterprise, EcoSystem business, MedicalBoothOrganization organization, String foodItemName) {
        try {
            initComponents();
            this.userProcessContainer = userProcessContainer;
            this.account = account;
            this.organization = organization;
            this.business = business;
            this.enterprise = enterprise;
            this.foodItemName = foodItemName;
            foodItemNameTextField.setText(foodItemName);
            populateFoodSupplierOrganizationComboBox();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
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

        jLabel5 = new javax.swing.JLabel();
        quantityRequiredTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        requestTestJButton = new javax.swing.JButton();
        saveAsPDFButton = new javax.swing.JButton();
        foodSupplierOrganizationComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        foodItemNameTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel5.setText("Quantity Required");

        quantityRequiredTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantityRequiredTextFieldKeyTyped(evt);
            }
        });

        jLabel3.setText("Description");

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionTextArea);

        requestTestJButton.setText("Send Request");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        saveAsPDFButton.setText("Save As PDF");
        saveAsPDFButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsPDFButtonActionPerformed(evt);
            }
        });

        foodSupplierOrganizationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Food Supplier Organization");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Request A Food Supplier Panel");

        jLabel2.setText("Food Item Name");

        foodItemNameTextField.setEnabled(false);

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(quantityRequiredTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foodItemNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(requestTestJButton)
                                .addGap(18, 18, 18)
                                .addComponent(saveAsPDFButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(foodSupplierOrganizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(backJButton)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(94, 94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(foodItemNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(foodSupplierOrganizationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(quantityRequiredTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(requestTestJButton)
                            .addComponent(saveAsPDFButton))))
                .addGap(18, 18, 18)
                .addComponent(backJButton)
                .addContainerGap(19, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateFoodSupplierOrganizationComboBox() {
        foodSupplierOrganizationComboBox.removeAllItems();
        for (Network network : business.getNetworkList()) {
            for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                    if (org instanceof FoodSupplierOrganization) {
                        FoodSupplierOrganization fsOrg = (FoodSupplierOrganization) org;
                        Iterator it = fsOrg.getFoodSuppliesInventory().getFoodInventory().entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry pair = (Map.Entry) it.next();
                            if (pair.getKey().equals(foodItemNameTextField.getText())) {
                                foodSupplierOrganizationComboBox.addItem(fsOrg);
                                break;
                            }
                        }
                    }
                }
            }
        }

    }

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed
        try {
            String message = descriptionTextArea.getText();
            NewRequestToFoodSupplier request = new NewRequestToFoodSupplier();
            request.setMessage(message);
            request.setQuantity(Integer.parseInt(quantityRequiredTextField.getText()));
            request.setFoodSupplies(foodItemNameTextField.getText(), Integer.parseInt(quantityRequiredTextField.getText()));
            request.setSender(account);
            request.setStatus("Sent");

            ArrayList<Organization> orgList = new ArrayList<Organization>();
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof FoodSupplierOrganization) {
                    orgList.add(organization);
                }
            }
            for (Organization org : orgList) {
            if (org != null) {
                org.getRequestQueueMedicalDriveManagerFoodSupplier().getWorkRequestMedicalDriveManagerFoodSupplier().add(request);
            }
            }
            
                account.getRequestQueueMedicalDriveManagerFoodSupplier().getWorkRequestMedicalDriveManagerFoodSupplier().add(request);
            String recepient = "";
            for (UserAccount ua : enterprise.getMedicalBoothUADirectory().getUserAccountList()) {
                if (ua.getEmail() != null) {
                    recepient = recepient + ua.getEmail() + ",";
                }
            }
            if (!recepient.isEmpty()) {
                send.mail(recepient, "Require "+foodItemNameTextField.getText()+" - Quantity - "+ quantityRequiredTextField.getText(), message);
            }
            for (Network network : business.getNetworkList()) {
                for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization org1 : ent.getOrganizationDirectory().getOrganizationList()) {
                        if (org1 == foodSupplierOrganizationComboBox.getSelectedItem()) {
                            FoodSupplierOrganization fsOrg = (FoodSupplierOrganization) org1;
                            Iterator it = fsOrg.getFoodSuppliesInventory().getFoodInventory().entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry pair = (Map.Entry) it.next();
                                if (pair.getKey().equals(foodItemNameTextField.getText())) {
                                    pair.setValue(Integer.parseInt(pair.getValue().toString()) - Integer.parseInt(quantityRequiredTextField.getText()));
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Request succesfully sent to Food suppliers");
            quantityRequiredTextField.setText("");
            descriptionTextArea.setText("");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void saveAsPDFButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsPDFButtonActionPerformed
        Document newDocument = new Document();
        String myFilepath = account.getUsername() + "_RequestToFoodSupplier_" + pdfCount + ".pdf";
        try {
            PdfWriter.getInstance(newDocument, new FileOutputStream(myFilepath));
        } catch (DocumentException | FileNotFoundException ex) {
            Logger.getLogger(RequestToDoctorJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            newDocument.open();
            newDocument.add(new Paragraph("Hi,"));
            newDocument.add(new Paragraph(account.getUsername().toUpperCase()));
            newDocument.add(new Paragraph(" "));
            newDocument.add(new Paragraph("Your Request has been send to Food Supplier - " + foodSupplierOrganizationComboBox.getSelectedItem().toString()));
            newDocument.add(new Paragraph(" "));
//            newDocument.add(new Paragraph("Request Category - "+ foodItemComboBox.getSelectedItem()));
            newDocument.add(new Paragraph("You have ordered " + foodItemNameTextField.getText() + " of quantity " + quantityRequiredTextField.getText()));
            newDocument.add(new Paragraph(" "));
            newDocument.add(new Paragraph("Description of your request - " + descriptionTextArea.getText()));
            newDocument.add(new Paragraph(" "));
            newDocument.add(new Paragraph("Thanks."));
            newDocument.close();
            JOptionPane.showMessageDialog(null, " Report Generated where the project is placed!");
            if (Desktop.isDesktopSupported()) {
                try {
                    File myFile = new File(myFilepath);
                    Desktop.getDesktop().open(myFile);
                } catch (IOException ex) {

                }
            }

        } catch (DocumentException ex) {
            Logger.getLogger(RequestToDoctorJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Out of Papers!");
        }
        pdfCount += 1;
    }//GEN-LAST:event_saveAsPDFButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        try {
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 2];
            MedicalDriveManagerWorkAreaJPanel ccqjp = (MedicalDriveManagerWorkAreaJPanel) component;
            ccqjp.populateDoctorRequestTable();
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_backJButtonActionPerformed

    private void quantityRequiredTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityRequiredTextFieldKeyTyped
        onlyNumbers(evt);
    }//GEN-LAST:event_quantityRequiredTextFieldKeyTyped

    private void onlyNumbers(java.awt.event.KeyEvent evt) {
        try {
            char keyTyped = evt.getKeyChar();
            if (!(Character.isDigit(keyTyped)) || (keyTyped == KeyEvent.VK_BACK_SPACE) || (keyTyped == KeyEvent.VK_DELETE)) {
                evt.consume();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "<html>Error: Exception Occurred: <br></html>" + ex.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JTextField foodItemNameTextField;
    private javax.swing.JComboBox foodSupplierOrganizationComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField quantityRequiredTextField;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JButton saveAsPDFButton;
    // End of variables declaration//GEN-END:variables
}