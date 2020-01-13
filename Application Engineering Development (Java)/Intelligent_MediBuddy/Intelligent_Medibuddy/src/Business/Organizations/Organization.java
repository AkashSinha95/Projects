/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.RequestQueue.RequestQueueNurseMedicalDriveManager;
import Business.Role.Role;
import Business.MedicalBooth.MedicalBoothDirectory;
import java.util.ArrayList;
import Business.MedicalSupplierEmployee.MedicalSupplierEmployeeDirectory;
import Business.FoodSupplierEmployee.FoodSupplierEmployeeDirectory;
import Business.RequestQueue.RequestQueueMedicalDriveManagerMedicalDriveManager;
import Business.RequestQueue.RequestQueueMedicalDriveManagerDoctor;
import Business.RequestQueue.RequestQueueMedicalDriveManagerFoodSupplier;
import Business.RequestQueue.RequestQueueDoctorMedicalSupplier;
import Business.RequestQueue.RequestQueueNurseDoctor;
import Business.UserAccount.UserAccountMedicalBooth.UserAccountDirectory;
import Business.UserAccount.UserAccountMedicalSupplier.UserAccountMedicalSupplierDirectory;
import Business.UserAccount.UserAccountFoodSupplier.UserAccountFoodSupplierDirectory;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private RequestQueueNurseMedicalDriveManager requestQueue;
    private RequestQueueMedicalDriveManagerFoodSupplier requestQueueMedicalDriveManagerFoodSupplier;
    private RequestQueueDoctorMedicalSupplier requestQueueDoctorMedicalSupplier;
    private MedicalBoothDirectory medicalBoothDirectory;
    private MedicalSupplierEmployeeDirectory medicalSupplierAccountDirectory;
    private FoodSupplierEmployeeDirectory foodSupplierEmployeeDirectory;
    private UserAccountDirectory medicalBoothUADirectory;
    private UserAccountFoodSupplierDirectory foodSupplierUADirectory;
    private UserAccountMedicalSupplierDirectory medicalSupplierUADirectory;
    private RequestQueueMedicalDriveManagerMedicalDriveManager requestQueueMedicalDriveManagerMedicalDriveManager;
    private int organizationID;
    private static int counter;
    private RequestQueueMedicalDriveManagerDoctor requestQueueMedicalDriveManagerDoctor;
    private RequestQueueNurseDoctor requestQueueNurseDoctor;
    
    private String longitute;
    private String latitute;
    
    public enum Type{
        Admin("Admin Organization"), 
        MedicalBooths("Medical Organization"), 
        MedicalSuppliers("Medical Suppliers Organization"),
        FoodSuppliers("Food Suppliers Organization"),
        Doctors("Medical Camp Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        requestQueue = new RequestQueueNurseMedicalDriveManager();
        requestQueueMedicalDriveManagerFoodSupplier = new RequestQueueMedicalDriveManagerFoodSupplier();
        requestQueueMedicalDriveManagerDoctor = new RequestQueueMedicalDriveManagerDoctor();
        medicalBoothDirectory = new MedicalBoothDirectory();
        foodSupplierEmployeeDirectory = new FoodSupplierEmployeeDirectory();
        medicalSupplierAccountDirectory = new MedicalSupplierEmployeeDirectory();
        medicalBoothUADirectory = new UserAccountDirectory();
        medicalSupplierUADirectory = new UserAccountMedicalSupplierDirectory();
        foodSupplierUADirectory = new UserAccountFoodSupplierDirectory();
        requestQueueDoctorMedicalSupplier = new RequestQueueDoctorMedicalSupplier();
        requestQueueNurseDoctor = new RequestQueueNurseDoctor();
        requestQueueMedicalDriveManagerMedicalDriveManager = new RequestQueueMedicalDriveManagerMedicalDriveManager();
        organizationID = counter;        
        ++counter;
    }

    
     public abstract ArrayList<Role> getSupportedRole();
     
    public int getOrganizationID() {
        return organizationID;
    }

    public String getLongitute() {
        return longitute;
    }

    public void setLongitute(String longitute) {
        this.longitute = longitute;
    }

    public String getLatitute() {
        return latitute;
    }

    public void setLatitute(String latitute) {
        this.latitute = latitute;
    }

    public RequestQueueMedicalDriveManagerMedicalDriveManager getRequestQueueMedicalDriveManagerMedicalDriveManager() {
        return requestQueueMedicalDriveManagerMedicalDriveManager;
    }

    public void setRequestQueueMedicalDriveManagerMedicalDriveManager(RequestQueueMedicalDriveManagerMedicalDriveManager requestQueueMedicalDriveManagerMedicalDriveManager) {
        this.requestQueueMedicalDriveManagerMedicalDriveManager = requestQueueMedicalDriveManagerMedicalDriveManager;
    }

    public RequestQueueNurseDoctor getRequestQueueNurseDoctor() {
        return requestQueueNurseDoctor;
    }

    public void setRequestQueueNurseDoctor(RequestQueueNurseDoctor requestQueueNurseDoctor) {
        this.requestQueueNurseDoctor = requestQueueNurseDoctor;
    }

    public RequestQueueDoctorMedicalSupplier getRequestQueueDoctorMedicalSupplier() {
        return requestQueueDoctorMedicalSupplier;
    }

    public RequestQueueMedicalDriveManagerDoctor getRequestQueueMedicalDriveManagerDoctor() {
        return requestQueueMedicalDriveManagerDoctor;
    }

    public void setRequestQueueMedicalDriveManagerDoctor(RequestQueueMedicalDriveManagerDoctor requestQueueMedicalDriveManagerDoctor) {
        this.requestQueueMedicalDriveManagerDoctor = requestQueueMedicalDriveManagerDoctor;
    }

    public void setRequestQueueDoctorMedicalSupplier(RequestQueueDoctorMedicalSupplier requestQueueDoctorMedicalSupplier) {
        this.requestQueueDoctorMedicalSupplier = requestQueueDoctorMedicalSupplier;
    }

    public RequestQueueMedicalDriveManagerFoodSupplier getRequestQueueMedicalDriveManagerFoodSupplier() {
        return requestQueueMedicalDriveManagerFoodSupplier;
    }

    public void setRequestQueueMedicalDriveManagerFoodSupplier(RequestQueueMedicalDriveManagerFoodSupplier requestQueueMedicalDriveManagerFoodSupplier) {
        this.requestQueueMedicalDriveManagerFoodSupplier = requestQueueMedicalDriveManagerFoodSupplier;
    }

    public MedicalBoothDirectory getMedicalBoothDirectory() {
        return medicalBoothDirectory;
    }

    public UserAccountDirectory getMedicalBoothUADirectory() {
        return medicalBoothUADirectory;
    }

    public void setMedicalBoothUADirectory(UserAccountDirectory medicalBoothUADirectory) {
        this.medicalBoothUADirectory = medicalBoothUADirectory;
    }

    public UserAccountFoodSupplierDirectory getFoodSupplierUADirectory() {
        return foodSupplierUADirectory;
    }

    public void setFoodSupplierUADirectory(UserAccountFoodSupplierDirectory foodSupplierUADirectory) {
        this.foodSupplierUADirectory = foodSupplierUADirectory;
    }

    public UserAccountMedicalSupplierDirectory getMedicalSupplierUADirectory() {
        return medicalSupplierUADirectory;
    }

    public void setMedicalSupplierUADirectory(UserAccountMedicalSupplierDirectory medicalSupplierUADirectory) {
        this.medicalSupplierUADirectory = medicalSupplierUADirectory;
    }
    
    public String getName() {
        return name;
    }

    public MedicalSupplierEmployeeDirectory getMedicalSupplierAccountDirectory() {
        return medicalSupplierAccountDirectory;
    }

    public void setMedicalSupplierAccountDirectory(MedicalSupplierEmployeeDirectory medicalSupplierAccountDirectory) {
        this.medicalSupplierAccountDirectory = medicalSupplierAccountDirectory;
    }

    public FoodSupplierEmployeeDirectory getFoodSupplierEmployeeDirectory() {
        return foodSupplierEmployeeDirectory;
    }

    public void setFoodSupplierEmployeeDirectory(FoodSupplierEmployeeDirectory foodSupplierEmployeeDirectory) {
        this.foodSupplierEmployeeDirectory = foodSupplierEmployeeDirectory;
    }

    public RequestQueueNurseMedicalDriveManager getRequestQueue() {
        return requestQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRequestQueue(RequestQueueNurseMedicalDriveManager requestQueue) {
        this.requestQueue = requestQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
