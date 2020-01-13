/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RequestQueue;

import java.util.ArrayList;

/**
 *
 * @author Tanvi Tembhurne
 */
public class RequestQueueMedicalDriveManagerFoodSupplier {
     private ArrayList<WorkRequestMedicalDriveManagerFoodSupplier> workRequestMedicalDriveManagerFoodSupplier;
    
    public RequestQueueMedicalDriveManagerFoodSupplier() {
        workRequestMedicalDriveManagerFoodSupplier = new ArrayList<>();
    }

    public ArrayList<WorkRequestMedicalDriveManagerFoodSupplier> getWorkRequestMedicalDriveManagerFoodSupplier() {
        return workRequestMedicalDriveManagerFoodSupplier;
    }
}
