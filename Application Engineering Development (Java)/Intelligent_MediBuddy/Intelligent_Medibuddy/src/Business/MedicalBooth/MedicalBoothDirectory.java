/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.MedicalBooth;

import Business.Role.Role;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author anubc
 */
public class MedicalBoothDirectory {
    private ArrayList<MedicalBooths> medicalBoothList;

    public MedicalBoothDirectory() {
        medicalBoothList = new ArrayList();
    }

    public ArrayList<MedicalBooths> getMedicalBoothList() {
        return medicalBoothList;
    }
    
    //to add a medical booth
    public MedicalBooths CreateMedicalBooth(String name, String roleType) {
        MedicalBooths medicalBooth = new MedicalBooths();
        try {
            medicalBooth.setName(name);
            medicalBooth.setRoleType(roleType);
            medicalBoothList.add(medicalBooth);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
        return medicalBooth;
    }
    
    //to delete a medical booth
    public void removeMedicalBooth(MedicalBooths s){
    medicalBoothList.remove(s);
    }
    
}
