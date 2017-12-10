/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fyukie
 */
public abstract class Location {
    protected String[] locations ={"Please Choose Location","TBS", "PUDU", "KELANG", "GENTING","KLIA","TSK","ASBS","LSBT"};
    public final int TBS = 1, PUDU = 2, KELANG = 3, GENTING = 4, KLIA = 5, TSK = 6, ASBS = 7, LSBT = 8;
    protected String lName; 
    
    protected Location(){
        //public constructor
    }
    
    protected abstract String getlName();
    protected abstract String[] getLocation();
    
}
