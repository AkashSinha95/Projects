/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Inventories.FoodSuppliesInventory;
import Business.Role.FoodSupplierRole;
import Business.Role.MedicalSupplierRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Akash Sinha
 */
public class FoodSupplierOrganization extends Organization{
 
    private FoodSuppliesInventory foodSuppliesInventory;
     FoodSupplierOrganization() {
     super(Organization.Type.FoodSuppliers.getValue());   
     this.foodSuppliesInventory = new FoodSuppliesInventory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FoodSupplierRole());
        return roles;
    }

    public FoodSuppliesInventory getFoodSuppliesInventory() {
        return foodSuppliesInventory;
    }

    public void setFoodSuppliesInventory(FoodSuppliesInventory foodSuppliesInventory) {
        this.foodSuppliesInventory = foodSuppliesInventory;
    }
}
