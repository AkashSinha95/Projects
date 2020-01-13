/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount.UserAccountFoodSupplier;

import Business.FoodSupplierEmployee.FoodSupplierEmployee;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Tanvi Tembhurne
 */
public class UserAccountFoodSupplier extends UserAccount{
    
    private FoodSupplierEmployee foodSupplierEmployee;

    
    public FoodSupplierEmployee getFoodSupplierEmployee() {
        return foodSupplierEmployee;
    }

    public void setFoodSupplierEmployee(FoodSupplierEmployee foodSupplierEmployee) {
        this.foodSupplierEmployee = foodSupplierEmployee;
    }
    
}

