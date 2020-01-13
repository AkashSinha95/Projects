/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NurseRole;

import Business.Enterprise.Enterprise;
import Business.Organizations.MedicalBoothOrganization;
import Business.UserAccount.UserAccountMedicalBooth.UserAccountMedicalBooth;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author annubc
 */
public class CheckOrBookBedsPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    MedicalBoothOrganization organization;
    private UserAccountMedicalBooth userAccount;
    static JLabel selectedSeat;
    static JLabel labelText;
    static JLabel label1 = new JLabel("Camp Room 1", JLabel.CENTER);
    static JLabel label2 = new JLabel("Camp Room 2", JLabel.CENTER);
    static int count = 0;
    static int row, col, flag = 0;
    private static ArrayList<String> bedNos;
    private static String text1, rowName;
    
    public CheckOrBookBedsPanel(JPanel userProcessContainer, UserAccountMedicalBooth account, MedicalBoothOrganization organization) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.userAccount = account;
        this.bedNos = new ArrayList<>();
        RefreshSeats();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(backButton)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(backButton)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(691, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(412, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        NurseWorkAreaJPanel ccjp = (NurseWorkAreaJPanel) component;
        ccjp.populateRequestTable();
        ccjp.populateRequestToDoctorTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButtonActionPerformed

    public void RefreshSeats() {
        try {
            setLayout(new GridLayout(7, 2, 10, 2));
            setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));

            JPanel labelPanel1 = new JPanel();
            labelPanel1.add(label1);
            add(labelPanel1);
            JPanel labelPanel2 = new JPanel();
            labelPanel2.add(label2);
            add(labelPanel2);            

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 2; j++) {
                    JPanel pan = new JPanel();

                    pan.setEnabled(true);
                    pan.setBackground(Color.WHITE);

//                pan.setPreferredSize(new Dimension(10, 10));
                    pan.setSize(10, 20);
                    pan.setBorder(BorderFactory.createLineBorder(Color.BLACK));

                    if (organization.getBedsMedicalBooths().getSeatsBool()[i][j] == false) {
                        pan.setBackground(Color.CYAN);
                        pan.addMouseListener(new BoxListener()); // add a mouse listener to make the panels clickable
                    } else {
                        pan.setBackground(Color.GRAY);
                        pan.setEnabled(false);
                    }
                    if (j == 0) {
                        labelText = new JLabel("A" + (i + 1), JLabel.CENTER);
                    } else if (j == 1) {
                        labelText = new JLabel("B" + (i + 1), JLabel.CENTER);
                    } 
                    pan.add(labelText);

                    add(pan);
                }
            }
            JButton saveButton = new JButton("Save!");
            add(saveButton);

            saveButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    // display/center the jdialog when the button is pressed

                    String reservedBedsNo = "";
                    if (flag >= 1) {                        
//                        customer.setBookedAirline(airliner);
//                        customer.setBookedFlightNo(flight.getFlightNumber());
//                        customer.setBookedFlightOrigin(flight.getFlightSchedule().getOrigin());
//                        customer.setBookedFlightDestination(flight.getFlightSchedule().getDestination());
//                        customer.setBookedFlightTimeOFDay(flight.getFlightSchedule().getPreferredTimeOfTheDay());
                        for (String bedNo : bedNos) {
                            reservedBedsNo += bedNo + " ";
                            int availableBedsCount = organization.getBedsMedicalBooths().getTotalSeatsCount();
                            organization.getBedsMedicalBooths().setTotalSeatsCount(availableBedsCount - 1);
                            rowName = String.valueOf(bedNo.charAt(0));
                            text1 = bedNo.substring(1);
                            count = Integer.parseInt(text1);
                            row = count - 1;
                            if ("A".equals(rowName)) {
                                col = 0;
                            } else if ("B".equals(rowName)) {
                                col = 1;
                            }
                            organization.getBedsMedicalBooths().getSeatsBool()[row][col] = true;
//                            customer.setBookedTickets(seatNo);
                        }
                        flag = 0;
                        JOptionPane.showMessageDialog(null, "Beds : " + reservedBedsNo + ":Reserved Successfully! ");
                    } else {
                        JOptionPane.showMessageDialog(null, "No Beds Booked!");
                    }
                }
            });
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Array Index Out Of Bounds Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
    }

    //Class that defines what happens when a panel is clicked
    public static class BoxListener extends MouseAdapter {

        public void mouseClicked(MouseEvent me) {
            try {
                JPanel clickedBox = (JPanel) me.getSource();
                clickedBox.setBackground(Color.LIGHT_GRAY);
                Component[] c = clickedBox.getComponents();

                if (c[0] instanceof JLabel) {
                    JLabel label = (JLabel) c[0];
                    text1 = label.getText();
                    bedNos.add(text1);
                }
                flag++;
                clickedBox.revalidate();
            } catch (NullPointerException ex) {
                JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
