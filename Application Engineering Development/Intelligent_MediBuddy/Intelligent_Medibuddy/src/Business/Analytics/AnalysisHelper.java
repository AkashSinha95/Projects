/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Analytics;

import Business.Organizations.FoodSupplierOrganization;
import Business.Organizations.MedicalBoothOrganization;
import Business.Organizations.MedicalCampOrganization;
import Business.Organizations.MedicalSupplierOrganization;
import Business.Organizations.Organization;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author anubc
 */
public class AnalysisHelper {
    
    public void BedStats(Organization organization){
        int availableSeats=0;
        int totalSeats=0;
        int percentSeatsAvailable=0;
        if (organization instanceof MedicalCampOrganization){
            MedicalCampOrganization Medicalorg=(MedicalCampOrganization) organization;
            int colCount=Medicalorg.getBedsMedicalCamps().getTotalColCount();
            int rowCount=Medicalorg.getBedsMedicalCamps().getTotalRowCount();
            totalSeats=colCount*rowCount;
            for(int i=0;i<rowCount;i++){
                for(int j=0;j<colCount;j++){
                
                    if(Medicalorg.getBedsMedicalCamps().getSeatsBool()[i][j]==false){
                    availableSeats++;
                    }
                }
            }
        }
        
        if (organization instanceof MedicalBoothOrganization){
            int colCount=((MedicalBoothOrganization) organization).getBedsMedicalBooths().getTotalColCount();
            int rowCount=((MedicalBoothOrganization) organization).getBedsMedicalBooths().getTotalRowCount();
            totalSeats=colCount*rowCount;
            for(int i=0;i<rowCount;i++){
                for(int j=0;j<colCount;j++){
                
                    if(((MedicalBoothOrganization) organization).getBedsMedicalBooths().getSeatsBool()[i][j]==false){
                    availableSeats++;
                    }
                }
            }
        }
        
        
        percentSeatsAvailable=(availableSeats/totalSeats)*100;
        System.out.println("Total Seats: "+totalSeats);
        System.out.println("Available Seats: "+availableSeats);
        if(percentSeatsAvailable<20){
            System.out.println("ALERT ! you may run out of beds soon");
        }
        else{
            System.out.println("you have sufficient seats available");
        }    
            
    }
    
    public void FoodSuppliesStats(Organization organization){
        Iterator it=null;
        int size=0;
        if (organization instanceof MedicalBoothOrganization){
            MedicalBoothOrganization org=(MedicalBoothOrganization) organization;
            size=org.getFoodSuppliesInMedicalBooth().getFoodInventory().size();
            it = org.getFoodSuppliesInMedicalBooth().getFoodInventory().entrySet().iterator();
        }
        if (organization instanceof FoodSupplierOrganization){
            FoodSupplierOrganization org=(FoodSupplierOrganization) organization;
            size=org.getFoodSuppliesInventory().getFoodInventory().size();
            it = org.getFoodSuppliesInventory().getFoodInventory().entrySet().iterator();
        }
        System.out.println("Total number of Items: "+size);
        while(it.hasNext()){
                Map.Entry pair = (Map.Entry)it.next();
                System.out.println(pair.getKey()+" -- "+pair.getValue());
            }
        
    }
    
    public void MedicalSuppliesStats(Organization organization){
       Iterator it=null;
        int size=0;
        if (organization instanceof MedicalBoothOrganization){
            MedicalBoothOrganization org=(MedicalBoothOrganization) organization;
            size=org.getMedicalSuppliesInMedicalBooth().getMedicalInventory().size();
            it = org.getMedicalSuppliesInMedicalBooth().getMedicalInventory().entrySet().iterator();
        }
        
        if (organization instanceof MedicalSupplierOrganization){
            MedicalSupplierOrganization org=(MedicalSupplierOrganization) organization;
            size=org.getMedicalSuppliesInventory().getMedicalInventory().size();
            it = org.getMedicalSuppliesInventory().getMedicalInventory().entrySet().iterator();
        }
        System.out.println("Total number of Items: "+size);
        while(it.hasNext()){
                Map.Entry pair = (Map.Entry)it.next();
                System.out.println(pair.getKey()+" -- "+pair.getValue());
            }
        
    }
    
}
