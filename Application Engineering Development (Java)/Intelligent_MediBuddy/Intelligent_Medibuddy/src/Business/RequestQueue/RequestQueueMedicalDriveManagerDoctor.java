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
public class RequestQueueMedicalDriveManagerDoctor {
        private ArrayList<WorkRequestMedicalDriveManagerDoctor> workRequestMedicalDriveManagerDoctor;
    
    public RequestQueueMedicalDriveManagerDoctor() {
        workRequestMedicalDriveManagerDoctor = new ArrayList<>();
    }

    public ArrayList<WorkRequestMedicalDriveManagerDoctor> getWorkRequestMedicalDriveManagerDoctor() {
        return workRequestMedicalDriveManagerDoctor;
    }
    
}
