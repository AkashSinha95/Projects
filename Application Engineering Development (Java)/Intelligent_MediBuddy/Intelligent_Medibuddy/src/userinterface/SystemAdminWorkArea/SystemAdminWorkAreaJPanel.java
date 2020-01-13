/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Tanvi Tembhurne
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    int orgCount = 0;

    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        try {
            initComponents();
            this.userProcessContainer = userProcessContainer;
            this.ecosystem = ecosystem;
            populateTree();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Array Out of Bound Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }

    public void populateTree() {
        try {
            DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();
            ArrayList<Network> networkList = ecosystem.getNetworkList();
            ArrayList<Enterprise> enterpriseList;
            ArrayList<Organization> organizationList;

            Network network;
            Enterprise enterprise;
            Organization organization;

            DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
            DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
            root.removeAllChildren();
            root.insert(networks, 0);

            DefaultMutableTreeNode networkNode;
            DefaultMutableTreeNode enterpriseNode;
            DefaultMutableTreeNode organizationNode;

            for (int i = 0; i < networkList.size(); i++) {
                network = networkList.get(i);
                networkNode = new DefaultMutableTreeNode(network.getName());
                networks.insert(networkNode, i);

                enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();
                for (int j = 0; j < enterpriseList.size(); j++) {
                    enterprise = enterpriseList.get(j);
                    enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                    networkNode.insert(enterpriseNode, j);
                    orgCount = 0;
                    organizationList = enterprise.getOrganizationDirectory().getOrganizationList();
                    for (int k = 0; k < organizationList.size(); k++) {
                        organization = organizationList.get(k);
                        organizationNode = new DefaultMutableTreeNode(organization.getName());
                        enterpriseNode.insert(organizationNode, k);
                    }
                }
            }
            model.reload();
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Array Out of Bound Exception Occurred!");
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel(){

            public void paintComponent(Graphics g)
            {
                ImageIcon img=new ImageIcon("sysadminworkarea.jpg");
                Image i=img.getImage();

                g.drawImage(i, 0, 0, this.getSize().width, this.getSize().height,this);
            }};
            jLabel1 = new javax.swing.JLabel();
            lblSelectedNode = new javax.swing.JLabel();
            btnManageNetwork = new javax.swing.JButton();
            btnManageEnterprise = new javax.swing.JButton();
            btnManageAdmin = new javax.swing.JButton();
            jScrollPane1 = new javax.swing.JScrollPane();
            jTree = new javax.swing.JTree();
            jSeparator1 = new javax.swing.JSeparator();
            jSeparator2 = new javax.swing.JSeparator();
            jSeparator3 = new javax.swing.JSeparator();

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 513, Short.MAX_VALUE)
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 397, Short.MAX_VALUE)
            );

            jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel1.setText("Selected Node:");
            jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

            lblSelectedNode.setBackground(new java.awt.Color(255, 255, 255));
            lblSelectedNode.setText("<View_selected_node>");
            jPanel1.add(lblSelectedNode, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 146, -1));

            btnManageNetwork.setBackground(new java.awt.Color(153, 204, 255));
            btnManageNetwork.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            btnManageNetwork.setForeground(java.awt.Color.white);
            btnManageNetwork.setText("Manage Network");
            btnManageNetwork.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnManageNetworkActionPerformed(evt);
                }
            });
            jPanel1.add(btnManageNetwork, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 634, 80));

            btnManageEnterprise.setBackground(new java.awt.Color(153, 204, 255));
            btnManageEnterprise.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            btnManageEnterprise.setForeground(java.awt.Color.white);
            btnManageEnterprise.setText("Manage Enterprise");
            btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnManageEnterpriseActionPerformed(evt);
                }
            });
            jPanel1.add(btnManageEnterprise, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 634, 80));

            btnManageAdmin.setBackground(new java.awt.Color(153, 204, 255));
            btnManageAdmin.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
            btnManageAdmin.setForeground(java.awt.Color.white);
            btnManageAdmin.setText("Manage Enterprise Admin");
            btnManageAdmin.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    btnManageAdminActionPerformed(evt);
                }
            });
            jPanel1.add(btnManageAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 634, 80));

            jTree.setBackground(new java.awt.Color(153, 204, 255));
            jTree.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(153, 204, 255), null, null));
            jTree.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
            jTree.setForeground(java.awt.Color.white);
            jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
                public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                    jTreeValueChanged(evt);
                }
            });
            jScrollPane1.setViewportView(jTree);

            jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 120, 313, 470));
            jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 634, 10));
            jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 634, 10));
            jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 590, 634, 10));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
            );
        }// </editor-fold>//GEN-END:initComponents

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged
        try {
            DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
            if (selectedNode != null) {
                lblSelectedNode.setText(selectedNode.toString());
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_jTreeValueChanged

    private void btnManageAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAdminActionPerformed
        try {
            ManageEnterpriseAdminJPanel manageEnterpriseAdminJPanel = new ManageEnterpriseAdminJPanel(userProcessContainer, ecosystem, 0);

            userProcessContainer.add("manageEnterpriseAdminJPanel", manageEnterpriseAdminJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_btnManageAdminActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        try {
            ManageEnterpriseJPanel manageEnterpriseJPanel = new ManageEnterpriseJPanel(userProcessContainer, ecosystem);
            userProcessContainer.add("manageEnterpriseJPanel", manageEnterpriseJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageNetworkActionPerformed
        try {
            ManageNetworkJPanel manageNetworkJPanel = new ManageNetworkJPanel(userProcessContainer, ecosystem);
            userProcessContainer.add("manageNetworkJPanel", manageNetworkJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }//GEN-LAST:event_btnManageNetworkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageAdmin;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageNetwork;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    // End of variables declaration//GEN-END:variables
}