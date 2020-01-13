/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount.UserAccountMedicalBooth;

import Business.MedicalBooth.MedicalBooths;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Tanvi Tembhurne
 */
public class UserAccountDirectory {
     private ArrayList<UserAccountMedicalBooth> userAccountList;
    
     public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }
     
     public ArrayList<UserAccountMedicalBooth> getUserAccountList() {
        return userAccountList;
    }
     
       public UserAccountMedicalBooth authenticateUser(String username, String password){
        for (UserAccountMedicalBooth ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
     public UserAccountMedicalBooth createUserAccount(String username, String password, MedicalBooths medicalBooth, Role role,String email,String phone){
        UserAccountMedicalBooth userAccount = new UserAccountMedicalBooth();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setMedicalBooth(medicalBooth);
        userAccount.setRole(role);
        userAccount.setEmail(email);
        userAccount.setPhoneNumber(phone);
        userAccountList.add(userAccount);
        return userAccount;
    }
       public boolean checkIfUsernameIsUnique(String username){
        for (UserAccountMedicalBooth ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
}
