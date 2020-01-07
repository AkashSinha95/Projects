/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Inventories.FoodSuppliesInMedicalBooth;
import Business.Inventories.FoodSuppliesInMedicalBoothInventory;
import Business.Inventories.MedicalSuppliesInMedicalBooth;
import Business.Inventories.MedicalSuppliesInMedicalBoothInventory;
import Business.Role.MedicalDriveManagerRole;
import Business.Role.NurseRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Akash Sinha
 */
public class MedicalBoothOrganization extends Organization{

    private BedsMedicalBooths bedsMedicalBooths;
    private FoodSuppliesInMedicalBoothInventory foodSuppliesInMedicalBooth;
    private MedicalSuppliesInMedicalBoothInventory medicalSuppliesInMedicalBooth;
    
    MedicalBoothOrganization() {
     super(Organization.Type.MedicalBooths.getValue());  
     bedsMedicalBooths = new BedsMedicalBooths();
     foodSuppliesInMedicalBooth = new FoodSuppliesInMedicalBoothInventory();
     medicalSuppliesInMedicalBooth = new MedicalSuppliesInMedicalBoothInventory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NurseRole());
        roles.add(new MedicalDriveManagerRole());
        return roles;
    }

    public FoodSuppliesInMedicalBoothInventory getFoodSuppliesInMedicalBooth() {
        return foodSuppliesInMedicalBooth;
    }

    

    public void setFoodSuppliesInMedicalBooth(FoodSuppliesInMedicalBoothInventory foodSuppliesInMedicalBooth) {
        this.foodSuppliesInMedicalBooth = foodSuppliesInMedicalBooth;
    }

    public MedicalSuppliesInMedicalBoothInventory getMedicalSuppliesInMedicalBooth() {
        return medicalSuppliesInMedicalBooth;
    }

    public void setMedicalSuppliesInMedicalBooth(MedicalSuppliesInMedicalBoothInventory medicalSuppliesInMedicalBooth) {
        this.medicalSuppliesInMedicalBooth = medicalSuppliesInMedicalBooth;
    }

    public BedsMedicalBooths getBedsMedicalBooths() {
        return bedsMedicalBooths;
    }

    public void setBedsMedicalBooths(BedsMedicalBooths bedsMedicalBooths) {
        this.bedsMedicalBooths = bedsMedicalBooths;
    }
    
}
