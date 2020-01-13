/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalSupplierEmployee;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author anubc
 */
public class MedicalSupplierEmployeeDirectory {
    
    private ArrayList<MedicalSupplierEmployee> medicalSupplierEmployeeList;

    public MedicalSupplierEmployeeDirectory() {
        medicalSupplierEmployeeList = new ArrayList();
    }

    public ArrayList<MedicalSupplierEmployee> getMedicalSupplierEmployeeList() {
        return medicalSupplierEmployeeList;
    }
    
    //create medical supplier
    public MedicalSupplierEmployee createMedicalSupplierEmployee(String name, String roleType){
        MedicalSupplierEmployee medicalSupplierEmployee = new MedicalSupplierEmployee();
        try{
            medicalSupplierEmployee.setName(name);
            medicalSupplierEmployee.setRoleType(roleType);
            medicalSupplierEmployeeList.add(medicalSupplierEmployee);
            }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
        return medicalSupplierEmployee;
    }
    
    //delete medical supplier
    public void removeMedicalSupplierEmployee(MedicalSupplierEmployee s){
    medicalSupplierEmployeeList.remove(s);
    }
    
}
