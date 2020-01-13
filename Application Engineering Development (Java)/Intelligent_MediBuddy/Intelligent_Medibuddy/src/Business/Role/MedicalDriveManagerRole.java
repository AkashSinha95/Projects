/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.MedicalBoothOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountMedicalBooth.UserAccountMedicalBooth;
import javax.swing.JPanel;
import userinterface.MedicalDriveManagerRole.MedicalDriveManagerWorkAreaJPanel;

/**
 *
 * @author anubc
 */
public class MedicalDriveManagerRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new MedicalDriveManagerWorkAreaJPanel(userProcessContainer,(UserAccountMedicalBooth) account, (MedicalBoothOrganization)organization, enterprise, business);
    }
    
}
