/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.RequestQueue.RequestQueueDoctorMedicalSupplier;
import Business.RequestQueue.RequestQueueMedicalDriveManagerDoctor;
import Business.RequestQueue.RequestQueueMedicalDriveManagerFoodSupplier;
import Business.RequestQueue.RequestQueueMedicalDriveManagerMedicalDriveManager;
import Business.RequestQueue.RequestQueueNurseDoctor;
import Business.RequestQueue.RequestQueueNurseMedicalDriveManager;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;
    private String email;
    private String phoneNumber;
    private Role role;
    private RequestQueueNurseMedicalDriveManager requestQueue;
    private RequestQueueMedicalDriveManagerFoodSupplier requestQueueMedicalDriveManagerFoodSupplier;
    private RequestQueueDoctorMedicalSupplier requestQueueDoctorMedicalSupplier;
    private RequestQueueMedicalDriveManagerDoctor requestQueueMedicalDriveManagerDoctor;
    private RequestQueueNurseDoctor requestQueueNurseDoctor;
    private RequestQueueMedicalDriveManagerMedicalDriveManager requestQueueMedicalDriveManagerMedicalDriveManager;

    public UserAccount() {
        requestQueue = new RequestQueueNurseMedicalDriveManager();
        requestQueueMedicalDriveManagerFoodSupplier = new RequestQueueMedicalDriveManagerFoodSupplier();
        requestQueueDoctorMedicalSupplier = new RequestQueueDoctorMedicalSupplier();
        requestQueueMedicalDriveManagerDoctor = new RequestQueueMedicalDriveManagerDoctor();
        requestQueueNurseDoctor = new RequestQueueNurseDoctor();
        requestQueueMedicalDriveManagerMedicalDriveManager = new RequestQueueMedicalDriveManagerMedicalDriveManager();
    }
    
    public String getUsername() {
        return username;
    }

    public RequestQueueMedicalDriveManagerMedicalDriveManager getRequestQueueMedicalDriveManagerMedicalDriveManager() {
        return requestQueueMedicalDriveManagerMedicalDriveManager;
    }

    public void setRequestQueueMedicalDriveManagerMedicalDriveManager(RequestQueueMedicalDriveManagerMedicalDriveManager requestQueueMedicalDriveManagerMedicalDriveManager) {
        this.requestQueueMedicalDriveManagerMedicalDriveManager = requestQueueMedicalDriveManagerMedicalDriveManager;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public void setUsername(String username) {
        this.username = username;
    }

    public RequestQueueMedicalDriveManagerFoodSupplier getRequestQueueMedicalDriveManagerFoodSupplier() {
        return requestQueueMedicalDriveManagerFoodSupplier;
    }

    public void setRequestQueueMedicalDriveManagerFoodSupplier(RequestQueueMedicalDriveManagerFoodSupplier requestQueueMedicalDriveManagerFoodSupplier) {
        this.requestQueueMedicalDriveManagerFoodSupplier = requestQueueMedicalDriveManagerFoodSupplier;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public RequestQueueNurseMedicalDriveManager getRequestQueue() {
        return requestQueue;
    }

    @Override
    public String toString() {
        return username;
    }
    
}