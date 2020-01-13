/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organizations.MedicalCampOrganization;
import Business.Organizations.Organization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountMedicalBooth.UserAccountMedicalBooth;
import userinterface.DoctorRole.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class DoctorRole extends Role{

     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new DoctorWorkAreaJPanel(userProcessContainer,(UserAccountMedicalBooth) account, (MedicalCampOrganization)organization, enterprise, business);
    }
    
    
}
