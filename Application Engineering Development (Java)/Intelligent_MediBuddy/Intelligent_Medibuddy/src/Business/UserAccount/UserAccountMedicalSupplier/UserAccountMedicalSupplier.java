/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount.UserAccountMedicalSupplier;

import Business.MedicalSupplierEmployee.MedicalSupplierEmployee;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Tanvi Tembhurne
 */
public class UserAccountMedicalSupplier extends UserAccount{
    private MedicalSupplierEmployee medicalSupplierEmployee;

    public MedicalSupplierEmployee getMedicalSupplierEmployee() {
        return medicalSupplierEmployee;
    }

    public void setMedicalSupplierEmployee(MedicalSupplierEmployee medicalSupplierEmployee) {
        this.medicalSupplierEmployee = medicalSupplierEmployee;
    }
}
