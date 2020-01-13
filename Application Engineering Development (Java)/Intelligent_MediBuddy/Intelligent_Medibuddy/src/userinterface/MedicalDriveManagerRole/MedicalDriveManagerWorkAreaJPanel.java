/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MedicalDriveManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.MedicalBoothOrganization;
import Business.Organizations.Organization;
import Business.Organizations.OrganizationDirectory;
import Business.RequestQueue.NewRequestFromMedicalDriveManagerToMedicalDriveManager;
import Business.UserAccount.UserAccountMedicalBooth.UserAccountMedicalBooth;
import Business.RequestQueue.NewRequestToMedicalDriveManager;
import Business.RequestQueue.NewRequestToDoctor;
import Business.RequestQueue.NewRequestToFoodSupplier;
import Business.RequestQueue.WorkRequestMedicalDriveManagerMedicalDriveManager;
import Business.RequestQueue.WorkRequestMedicalDriveManagerDoctor;
import Business.RequestQueue.WorkRequestNurseMedicalDriveManager;
import Business.RequestQueue.WorkRequestMedicalDriveManagerFoodSupplier;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Tanvi Tembhurne
 */
public class MedicalDriveManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccountMedicalBooth userAccount;
    private MedicalBoothOrganization MedicalBooth;
    private Enterprise enterprise;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public MedicalDriveManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccountMedicalBooth account, Organization organization, Enterprise enterprise, EcoSystem business) {
        try {
            initComponents();

            this.userProcessContainer = userProcessContainer;
            this.userAccount = account;
            this.business = business;
            this.MedicalBooth = (MedicalBoothOrganization) organization;
            this.enterprise = enterprise;
            populateTable();
            populateFoodRequestTable();
            populateDoctorRequestTable();
            populateMedicalDriveManagerTable();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequestNurseMedicalDriveManager request : MedicalBooth.getRequestQueue().getWorkRequestList()) {
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender().getMedicalBooth().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getMedicalBooth().getName();
            row[3] = request.getStatus();
            String result = ((NewRequestToMedicalDriveManager) request).getResult();
            row[4] = result == null ? "Waiting" : result;
            model.addRow(row);
        }
    }

    public void populateFoodRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestFoodJTable.getModel();

        model.setRowCount(0);
        for (WorkRequestMedicalDriveManagerFoodSupplier request : userAccount.getRequestQueueMedicalDriveManagerFoodSupplier().getWorkRequestMedicalDriveManagerFoodSupplier()) {
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender();
            row[2] = request.getReceiver();
            row[3] = request.getStatus();
            String result = ((NewRequestToFoodSupplier) request).getResult();
            row[4] = result == null ? "Waiting" : result;
            model.addRow(row);
        }
    }

    public void populateDoctorRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestDoctorJTable.getModel();

        model.setRowCount(0);
        for (WorkRequestMedicalDriveManagerDoctor request : userAccount.getRequestQueueMedicalDriveManagerDoctor().getWorkRequestMedicalDriveManagerDoctor()) {
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender();
            row[2] = request.getReceiver();
            row[3] = request.getStatus();
            String result = ((NewRequestToDoctor) request).getResult();
            row[4] = result == null ? "Waiting" : result;
            model.addRow(row);
        }
    }

    public void populateMedicalDriveManagerTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestMedicalDriveManagerJTable.getModel();

        model.setRowCount(0);
        for (WorkRequestMedicalDriveManagerMedicalDriveManager request : MedicalBooth.getRequestQueueMedicalDriveManagerMedicalDriveManager().getworkRequestMedicalDriveManagerMedicalDriveManager()) {
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender();
            row[2] = request.getReceiver();
            row[3] = request.getStatus();
            String result = ((NewRequestFromMedicalDriveManagerToMedicalDriveManager) request).getResult();
            row[4] = result == null ? "Waiting" : result;
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g)
            {
                ImageIcon img=new ImageIcon("camp.jpg");
                Image i=img.getImage();

                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height,this);
            }

        };
        jPanel2 = new javax.swing.JPanel();
        processJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Tbl1Lbl1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        refreshFoodJButton = new javax.swing.JButton();
        Tbl2Lbl1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestFoodJTable = new javax.swing.JTable();
        manageFoodSuppliesButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        refreshDoctorJButton = new javax.swing.JButton();
        Tbl3Lbl = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        workRequestDoctorJTable = new javax.swing.JTable();
        requestDoctorJButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        refreshCampCommanderJButton = new javax.swing.JButton();
        Tbl3Lbl1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        workRequestMedicalDriveManagerJTable = new javax.swing.JTable();
        assignToMedicalDriveManagerJButton = new javax.swing.JButton();
        processMedicalDriveManagerJButton = new javax.swing.JButton();
        requestaMedicalDriveManagerJButton = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255,150));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Nurse", "Medical Drive Manager", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 520, 96));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jButton1.setText("Check Or Book Beds");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        Tbl1Lbl1.setText("Request from Nurse: ");
        jPanel2.add(Tbl1Lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 570, 210));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255,150));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshFoodJButton.setText("Refresh");
        refreshFoodJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshFoodJButtonActionPerformed(evt);
            }
        });
        jPanel3.add(refreshFoodJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        Tbl2Lbl1.setText("Request to  FoodSupplier: ");
        jPanel3.add(Tbl2Lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        workRequestFoodJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Medical Drive Manager", "Supplier", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestFoodJTable);
        if (workRequestFoodJTable.getColumnModel().getColumnCount() > 0) {
            workRequestFoodJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestFoodJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestFoodJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestFoodJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 520, 96));

        manageFoodSuppliesButton.setText("Manage Food Supplies");
        manageFoodSuppliesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageFoodSuppliesButtonActionPerformed(evt);
            }
        });
        jPanel3.add(manageFoodSuppliesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 570, 210));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255,150));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshDoctorJButton.setText("Refresh");
        refreshDoctorJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshDoctorJButtonActionPerformed(evt);
            }
        });
        jPanel4.add(refreshDoctorJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 120, -1));

        Tbl3Lbl.setText("Request to  Doctor: ");
        jPanel4.add(Tbl3Lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        workRequestDoctorJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Medical Drive Manager", "Doctor", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(workRequestDoctorJTable);
        if (workRequestDoctorJTable.getColumnModel().getColumnCount() > 0) {
            workRequestDoctorJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestDoctorJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestDoctorJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestDoctorJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 510, 96));

        requestDoctorJButton.setText("Request Doctor");
        requestDoctorJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestDoctorJButtonActionPerformed(evt);
            }
        });
        jPanel4.add(requestDoctorJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, 570, 210));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255,150));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshCampCommanderJButton.setText("Refresh");
        refreshCampCommanderJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshCampCommanderJButtonActionPerformed(evt);
            }
        });
        jPanel5.add(refreshCampCommanderJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, 100, -1));

        Tbl3Lbl1.setText("Request/Process Another Medical Drive Manager: ");
        jPanel5.add(Tbl3Lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        workRequestMedicalDriveManagerJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Medical Drive Manager", "Medical Drive Manager", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(workRequestMedicalDriveManagerJTable);
        if (workRequestMedicalDriveManagerJTable.getColumnModel().getColumnCount() > 0) {
            workRequestMedicalDriveManagerJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestMedicalDriveManagerJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestMedicalDriveManagerJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestMedicalDriveManagerJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel5.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 510, 96));

        assignToMedicalDriveManagerJButton.setText("Assign to me");
        assignToMedicalDriveManagerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignToMedicalDriveManagerJButtonActionPerformed(evt);
            }
        });
        jPanel5.add(assignToMedicalDriveManagerJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        processMedicalDriveManagerJButton.setText("Process");
        processMedicalDriveManagerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processMedicalDriveManagerJButtonActionPerformed(evt);
            }
        });
        jPanel5.add(processMedicalDriveManagerJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        requestaMedicalDriveManagerJButton.setText("Request a Medical Drive Manager");
        requestaMedicalDriveManagerJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestaMedicalDriveManagerJButtonActionPerformed(evt);
            }
        });
        jPanel5.add(requestaMedicalDriveManagerJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 570, 210));

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        try {
            int selectedRow = workRequestJTable.getSelectedRow();

            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "Select a row!");
                return;
            }

            WorkRequestNurseMedicalDriveManager request = (WorkRequestNurseMedicalDriveManager) workRequestJTable.getValueAt(selectedRow, 0);
            if (request.getStatus() == "Approved" || request.getStatus() == "Rejected") {
                JOptionPane.showMessageDialog(null, "request already processed");
            } else {
                if (request.getStatus() == "Pending") {
                    JOptionPane.showMessageDialog(null, "request already in process");
                } else {
                    request.setReceiver(userAccount);
                    request.setStatus("Pending");
                    populateTable();
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        try {
            int selectedRow = workRequestJTable.getSelectedRow();

            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "Select a row!");
                return;
            }

            NewRequestToMedicalDriveManager request = (NewRequestToMedicalDriveManager) workRequestJTable.getValueAt(selectedRow, 0);
            if ("Approved".equals(request.getStatus()) || "Rejected".equals(request.getStatus())) {
                JOptionPane.showMessageDialog(null, "request already processed");
            }
            {
                if (!"Pending".equals(request.getStatus()) || !userAccount.getUsername().equals(request.getReceiver().getUsername())) {
                    JOptionPane.showMessageDialog(null, " Request is not assigned to you");
                } else {
                    request.setStatus("Processing");
                    ProcessNurseWorkRequestJPanel processWorkRequestJPanel = new ProcessNurseWorkRequestJPanel(userProcessContainer, request);
                    userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void refreshFoodJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshFoodJButtonActionPerformed
        populateFoodRequestTable();
    }//GEN-LAST:event_refreshFoodJButtonActionPerformed

    private void refreshDoctorJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshDoctorJButtonActionPerformed
        populateDoctorRequestTable();
    }//GEN-LAST:event_refreshDoctorJButtonActionPerformed

    private void requestDoctorJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestDoctorJButtonActionPerformed
        try {
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("RequestToDoctorJPanel", new RequestToDoctorJPanel(userProcessContainer, userAccount, enterprise, business));
            layout.next(userProcessContainer);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_requestDoctorJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("CheckOrBookBedsPanel", new CheckOrBookBedsPanel(userProcessContainer, userAccount, MedicalBooth));
            layout.next(userProcessContainer);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void manageFoodSuppliesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageFoodSuppliesButtonActionPerformed
        try {
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("ManageFoodSuppliesJPanel", new ManageFoodSuppliesJPanel(userProcessContainer, userAccount, enterprise, business, MedicalBooth));
            layout.next(userProcessContainer);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_manageFoodSuppliesButtonActionPerformed

    private void refreshCampCommanderJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshCampCommanderJButtonActionPerformed
        populateMedicalDriveManagerTable();
    }//GEN-LAST:event_refreshCampCommanderJButtonActionPerformed

    private void requestaMedicalDriveManagerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestaMedicalDriveManagerJButtonActionPerformed
        try {
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add("RequestToAnotherMedicalDriveManager", new RequestToAnotherMedicalDriveManager(userProcessContainer, userAccount, enterprise, business, MedicalBooth));
            layout.next(userProcessContainer);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_requestaMedicalDriveManagerJButtonActionPerformed

    private void assignToMedicalDriveManagerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignToMedicalDriveManagerJButtonActionPerformed
        try {
            int selectedRow = workRequestMedicalDriveManagerJTable.getSelectedRow();

            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "Select a row!");
                return;
            }

            WorkRequestMedicalDriveManagerMedicalDriveManager request = (WorkRequestMedicalDriveManagerMedicalDriveManager) workRequestMedicalDriveManagerJTable.getValueAt(selectedRow, 0);
            if (request.getStatus() == "Approved" || request.getStatus() == "Rejected") {
                JOptionPane.showMessageDialog(null, "request already processed");
            } else if (request.getSender().toString().equals(userAccount.getUsername())) {
                JOptionPane.showMessageDialog(null, "It's your Request!");
            } else {
                if (request.getStatus() == "Pending") {
                    JOptionPane.showMessageDialog(null, "request already in process");
                } else {
                    request.setReceiver(userAccount);
                    request.setStatus("Pending");
                    populateMedicalDriveManagerTable();
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_assignToMedicalDriveManagerJButtonActionPerformed

    private void processMedicalDriveManagerJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processMedicalDriveManagerJButtonActionPerformed
        try {
            int selectedRow = workRequestMedicalDriveManagerJTable.getSelectedRow();

            if (selectedRow < 0) {
                JOptionPane.showMessageDialog(null, "Select a row!");
                return;
            }

            NewRequestFromMedicalDriveManagerToMedicalDriveManager request = (NewRequestFromMedicalDriveManagerToMedicalDriveManager) workRequestMedicalDriveManagerJTable.getValueAt(selectedRow, 0);
            if ("Approved".equals(request.getStatus()) || "Rejected".equals(request.getStatus())) {
                JOptionPane.showMessageDialog(null, "request already processed");
            }
            {
                if (!"Pending".equals(request.getStatus()) || !userAccount.getUsername().equals(request.getReceiver().getUsername())) {
                    JOptionPane.showMessageDialog(null, " Request is not assigned to you");
                } else {
                    request.setStatus("Processing");
                    ProcessAnotherMedicalDriveManagerRequestJPanel processAnotherCampCommanderRequestJPanel = new ProcessAnotherMedicalDriveManagerRequestJPanel(userProcessContainer, request);
                    userProcessContainer.add("processAnotherCampCommanderRequestJPanel", processAnotherCampCommanderRequestJPanel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_processMedicalDriveManagerJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Tbl1Lbl1;
    private javax.swing.JLabel Tbl2Lbl1;
    private javax.swing.JLabel Tbl3Lbl;
    private javax.swing.JLabel Tbl3Lbl1;
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton assignToMedicalDriveManagerJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton manageFoodSuppliesButton;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton processMedicalDriveManagerJButton;
    private javax.swing.JButton refreshCampCommanderJButton;
    private javax.swing.JButton refreshDoctorJButton;
    private javax.swing.JButton refreshFoodJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton requestDoctorJButton;
    private javax.swing.JButton requestaMedicalDriveManagerJButton;
    private javax.swing.JTable workRequestDoctorJTable;
    private javax.swing.JTable workRequestFoodJTable;
    private javax.swing.JTable workRequestJTable;
    private javax.swing.JTable workRequestMedicalDriveManagerJTable;
    // End of variables declaration//GEN-END:variables
}
