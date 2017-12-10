/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fyukie
 */
public class Ticket {
    public final int TBS = 1, PUDU = 2, KELANG = 3, GENTING = 4, KLIA = 5, TSK = 6, ASBS = 7, LSBT = 8;
    private double price = 0.00;
    
    public Ticket(Passenger pass){
        
    }
    
    public void setPrice(int loc1, int loc2){
        switch (loc1){
            case TBS :
                if (loc2 == PUDU){
                    price = 30;
                }
                else if (loc2 == KELANG){
                    price = 40;
                }
                else if (loc2 == GENTING){
                    price = 50;
                }
                else if (loc2 == KLIA){
                    price = 60;
                }
                else if (loc2 == TSK){
                    price = 70;
                }
                else if (loc2 == ASBS){
                    price = 80;
                }
                else if (loc2 == LSBT){
                    price = 90;
                }
                break;
                
            case PUDU  :
                if (loc2 == TBS){
                    price = 30;
                }
                else if (loc2 == KELANG){
                    price = 40;
                }
                else if (loc2 == GENTING){
                    price = 50;
                }
                else if (loc2 == KLIA){
                    price = 60;
                }
                else if (loc2 == TSK){
                    price = 70;
                }
                else if (loc2 == ASBS){
                    price = 80;
                }
                else if (loc2 == LSBT){
                    price = 90;
                }
                break;   
                
            case KELANG :
                if (loc2 == PUDU){
                    price = 30;
                }
                else if (loc2 == TBS){
                    price = 40;
                }
                else if (loc2 == GENTING){
                    price = 50;
                }
                else if (loc2 == KLIA){
                    price = 60;
                }
                else if (loc2 == TSK){
                    price = 70;
                }
                else if (loc2 == ASBS){
                    price = 80;
                }
                else if (loc2 == LSBT){
                    price = 90;
                }
                break;  
                
            case GENTING  :
                if (loc2 == PUDU){
                    price = 30;
                }
                else if (loc2 == KELANG){
                    price = 40;
                }
                else if (loc2 == TBS){
                    price = 50;
                }
                else if (loc2 == KLIA){
                    price = 60;
                }
                else if (loc2 == TSK){
                    price = 70;
                }
                else if (loc2 == ASBS){
                    price = 80;
                }
                else if (loc2 == LSBT){
                    price = 90;
                }
                break;   
                
            case KLIA  :
                if (loc2 == PUDU){
                    price = 30;
                }
                else if (loc2 == KELANG){
                    price = 40;
                }
                else if (loc2 == GENTING){
                    price = 50;
                }
                else if (loc2 == TBS){
                    price = 60;
                }
                else if (loc2 == TSK){
                    price = 70;
                }
                else if (loc2 == ASBS){
                    price = 80;
                }
                else if (loc2 == LSBT){
                    price = 90;
                }
                break;  
                
            case TSK  :
                if (loc2 == PUDU){
                    price = 30;
                }
                else if (loc2 == KELANG){
                    price = 40;
                }
                else if (loc2 == GENTING){
                    price = 50;
                }
                else if (loc2 == KLIA){
                    price = 60;
                }
                else if (loc2 == TBS){
                    price = 70;
                }
                else if (loc2 == ASBS){
                    price = 80;
                }
                else if (loc2 == LSBT){
                    price = 90;
                }
                break;
                
            case ASBS  :
                if (loc2 == PUDU){
                    price = 30;
                }
                else if (loc2 == KELANG){
                    price = 40;
                }
                else if (loc2 == GENTING){
                    price = 50;
                }
                else if (loc2 == KLIA){
                    price = 60;
                }
                else if (loc2 == TSK){
                    price = 70;
                }
                else if (loc2 == TBS){
                    price = 80;
                }
                else if (loc2 == LSBT){
                    price = 90;
                }
                break;
                
            case LSBT  :
                if (loc2 == PUDU){
                    price = 30;
                }
                else if (loc2 == KELANG){
                    price = 40;
                }
                else if (loc2 == GENTING){
                    price = 50;
                }
                else if (loc2 == KLIA){
                    price = 60;
                }
                else if (loc2 == TSK){
                    price = 70;
                }
                else if (loc2 == ASBS){
                    price = 80;
                }
                else if (loc2 == TBS){
                    price = 90;
                }
                break;  
        }
    }
}
