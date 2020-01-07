/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount.UserAccountMedicalBooth;

import Business.MedicalBooth.MedicalBooths;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Tanvi Tembhurne
 */
public class UserAccountMedicalBooth extends UserAccount{
    
    private MedicalBooths medicalBooth;    

    public MedicalBooths getMedicalBooth() {
        return medicalBooth;
    }

    public void setMedicalBooth(MedicalBooths medicalBooth) {
        this.medicalBooth = medicalBooth;
    }
    
    
        
}
