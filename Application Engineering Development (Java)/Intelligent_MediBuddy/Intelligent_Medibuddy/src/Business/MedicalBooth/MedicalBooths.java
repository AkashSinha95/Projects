/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalBooth;

/**
 *
 * @author anubc
 */
public class MedicalBooths {
    
    private String name;
    private int id;
    private static int count = 1;
    private String roleType;
    
    public enum RequestCategory{
        Beds("Beds Needed"), 
        MedicalSupplies("Medical Supplies Needed"), 
        ApplyLeave("Apply Leave"),
        FoodSupplies("Food Supplies Needed"),
        SendingPatients("Sending Patients"),
        RelievingNurse("Send Relieving Nurse"),
        DoctorsNeeded("Extra Doctors needed");
        private String value;
        private RequestCategory(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    
    public MedicalBooths() {
        id = count;
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
