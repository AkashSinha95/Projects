/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RequestQueue;

import Business.UserAccount.UserAccountFoodSupplier.UserAccountFoodSupplier;
import Business.UserAccount.UserAccountMedicalBooth.UserAccountMedicalBooth;
import java.util.Date;

/**
 *
 * @author Tanvi Tembhurne
 */
public class WorkRequestMedicalDriveManagerFoodSupplier {
     private String message;
    private UserAccountMedicalBooth sender;
    private UserAccountFoodSupplier receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    
    public WorkRequestMedicalDriveManagerFoodSupplier(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccountMedicalBooth getSender() {
        return sender;
    }

    public void setSender(UserAccountMedicalBooth sender) {
        this.sender = sender;
    }

    public UserAccountFoodSupplier getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccountFoodSupplier receiver) {
        this.receiver = receiver;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    } 
    @Override
    public String toString(){
        return message;
    }
}
