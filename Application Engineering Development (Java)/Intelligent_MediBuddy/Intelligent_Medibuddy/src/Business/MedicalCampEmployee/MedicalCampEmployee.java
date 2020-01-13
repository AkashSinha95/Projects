/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalCampEmployee;

/**
 *
 * @author anubc
 */
public class MedicalCampEmployee {
    
    private String name;
    private int id;
    private static int count = 1;
    private String roleType;

    public MedicalCampEmployee() {
        id = count;
        count++;
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

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
