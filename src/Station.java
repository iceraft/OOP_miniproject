/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fyukie
 */
public class Station extends Location{
    private int place;
    
    public Station(){
        //public constructor
    }
    
    public void setStation(String lName){
            
        switch (lName){
            case "TBS" :
                this.lName = "Terminal Bersepadu Selatan";
                place = TBS;
                break;
                
            case "PUDU"  :
                this.lName = "Pudu Sentral";
                place = PUDU;
                break;   
                
            case "KELANG" :
                this.lName = "Kelang Sentral";
                place = KELANG;
                break;  
                
            case "GENTING"  :
                this.lName = "Genting Highland Station";
                place = GENTING;
                break;   
                
            case "KLIA"  :
                this.lName = "Kuala Lumpur International Airport";
                place = KLIA; 
                break;  
                
            case "TSK"  :
                this.lName = "Terminal Sentral Kuantan";
                place = TSK;
                break; 
                
            case "ASBS"  :
                this.lName = "Alor Star Bus Station";
                place = ASBS;
                break;
                
            case "LSBT"  :
                this.lName = "Larkin Bus Station";
                place = LSBT;
                break; 
            default:
                this.lName = "Location ERROR";
                place = 0;
        }
    }
    
    @Override
    public String getlName(){
        return this.lName;
    }
    
    @Override
    public String[] getLocation(){
        return this.locations;
    }
    
        
    public int getPlace(){
        return this.place;
    }
}
