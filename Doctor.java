/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;
import java.util.Objects;
import javax.swing.*;
import java.util.Scanner;
/**
 *
 * @author Fame
 */
public class Doctor {
    private String name;
    private int fee;
    private int id;
    private String contact;
    private String specialization;
    private final String username;
    private final String password;
   
    public Doctor(){
    this.username="DOCTOR@gmail.com";
    this.password="PIMS123";
  
        this.name=null;
        this.fee=0;
        this.id=0;
        this.contact=null;
        this.specialization=null;
      
    }
    public Doctor(String n,String c,String s,int i,int f){
         this.username="DOCTOR@gmail.com";
    this.password="PIMS123";
  
        this.name=n;
        this.id=i;
        this.fee=f;
        this.contact=c;
        this.specialization=s;
        
    }
 public String getUsername() {
        return "DOCTOR@gmail.com";
    }

    public String getPassword() {
        return "PIMS123";
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
     public String getName(){
        return name;
    }
    public int getFee(){
        return fee;
    }
    public int getId(){
        return id;
    }
    public String getContact(){
        return contact;
    }
    public String getSpecialization(){
        return specialization;
    }
    public String toString(){
        return "****DOCTOR INFO IS****\nNAME IS "+name+"\nFEE IS "+fee+"\nID IS "+id+"\nCONTACT IS "+contact+"\nSPECIALIZATION IS "
                +specialization;
    }
public boolean equals(Object obj){
    if(this==obj){
        return true;
    }
    if(obj==null){
        return false;
    }
    if(getClass()!=obj.getClass()){
        return false;
    }
    final Doctor other=(Doctor)obj;
    if(!Objects.equals(this.name,other.name)){
        return false;
    }
     if(!Objects.equals(this.contact,other.contact)){
        return false;
    }
      if(!Objects.equals(this.specialization,other.specialization)){
        return false;
    }
        if (this.id!=other.id){
        return false;
    }
    if(this.fee!=other.fee){
        return false;
    }
    return true;
}

}
