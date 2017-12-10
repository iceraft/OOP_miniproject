/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fyukie
 */
public class Passenger {
    private String pName,pic,pPhone;
    private int pAge;
    
    public Passenger(){
        //public constructor
    }
    
    public Passenger(String pName,String pic){
        this.pName = pName;
        this.pic = pic;
    }
        
    public Passenger(String pName,String pic,String pPhone,int pAge){
        this.pName = pName;
        this.pic = pic;
        this.pPhone = pPhone;
        this.pAge = pAge;
    }
    
    public void setName(String pName){
        this.pName = pName;
    }
    public String getName(){
        return this.pName;
    }
    public void setIC(String pic){
        this.pic = pic;
    }
    public String getIC(){
        return this.pic;
    }
    public void setPhone(String pPhone){
        this.pPhone = pPhone;
    }
    public String getPhone(){
        return this.pPhone;
    }
    public void setAge(int pAge){
        this.pAge = pAge;
    }
    public int getAge(){
        return this.pAge;
    }
    
}
