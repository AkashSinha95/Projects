/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalCampEmployee;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author anubc
 */
public class MedicalCampEmployeeDirectory {
    
    private ArrayList<MedicalCampEmployee> medicalCampEmployeeList;

    public MedicalCampEmployeeDirectory() {
        medicalCampEmployeeList = new ArrayList();
    }

    public ArrayList<MedicalCampEmployee> getMedicalCampEmployeeList() {
        return medicalCampEmployeeList;
    }
    
    public MedicalCampEmployee createMedicalCampEmployee(String name, String roleType){
        MedicalCampEmployee medicalCampEmployee = new MedicalCampEmployee();
        try{
            medicalCampEmployee.setName(name);
            medicalCampEmployee.setRoleType(roleType);
            medicalCampEmployeeList.add(medicalCampEmployee);
        }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
        return medicalCampEmployee;
    }
    
}