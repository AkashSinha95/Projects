package Business;

import Business.Employee.Employee;
import Business.MedicalBooth.MedicalBooths;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountMedicalBooth.UserAccountMedicalBooth;
import javax.swing.JOptionPane;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        try{    
            MedicalBooths medicalBooths = system.getMedicalBoothDirectory().CreateMedicalBooth("Annu", Role.RoleType.MedicalDriveManager.getValue());
            
            UserAccountMedicalBooth ua = system.getMedicalBoothUADirectory().createUserAccount("sysadmin", "sysadmin", medicalBooths, new SystemAdminRole(),"intelligent.medibuddy@gmail.com","annuakashtanvi@4");
            }
        catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Null Pointer Exception Occurred!");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Some Exception Occurred!");
        }
        finally{
        
            return system;
        }
    }
    
}
