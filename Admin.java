/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Toeols | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;
import javax.swing.*;
import java.awt.event.*;
import java.util.Scanner;
/**
 *
 * @author Fame
 */
public class Admin {
  private final String username;
  private final String password;
   private Doctor doctors[];
    private Patients patient[];
    private int count=0;
    private int size;
    private Bill bills;
public Admin(){
    this.username="HOSPITAL@gmail.com";
    this.password="PIMS123";
    size=0;
}
    public Admin(String username, String password) {
         this.username = "HOSPITAL@gmail.com";
        this.password = "PIMS123";
       if(this.username.equals(username)&&this.password.equals(password)){
           System.out.println("YOU HAVE SUCCESSFULLY LOGGED IN");
       }
       else{
           System.out.println("INVALID USERNAME OR PASSWORD");
       }
       size=0;
    }
public Admin(int size){
    doctors=new Doctor[size];
    patient=new Patients[size];
       this.username="HOSPITAL@gmail.com";
    this.password="PIMS123";
    this.size=size;
}
    public String getUsername() {
        return "HOSPITAL@gmail.com";
    }

    public String getPassword() {
        return "PIMS123";
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return "Admin{" + "username=" + username + ", password=" + password + '}';
    }
  
   public void admitNewPatient(Patients p){
       
        try{
            if(count<size){
               patient[count]=p;
               count++;
                System.out.println(count);
               System.out.println("PATIENT ADDED SUCCESSFULLY");
            }
            else{
                throw new Exception();
            }
        }
        catch(Exception e){
            System.out.println("NO MORE SAPCE!!");   
        }
   }
   public Patients dischargePatient(int id){
       
     Patients pat=new Patients();
       for(int i=0;i<count;i++){
           if(id==patient[i].getId()){
                patient[i].getName();
              patient[i].getAge();
              patient[i].getDisease();
               patient[i].getGender();
               patient[i].getId();
             
              patient[i]=null;
               System.out.println("DISCHARGED SUCCESSFULLY!!");
              
           }
       }
    
       return pat;
   }
   public void viewPatientDetails(){
        System.out.println("***********PATIENTS ADMITTED ARE************");
         for(int j=0;j<count;j++){
             
             System.out.println(patient[j]);
         }
   }
    public void addDoctor(Doctor d){
        try{
       if(count<size){
           doctors[count]=d;
           count++;
            System.out.println(count);
              System.out.println("DOCTOR ADDED SUCCESSFULLY!!");
       }
       else{
           throw new Exception();
       }
        }
        catch(Exception e){
            System.out.println("NO MORE SAPCE!!");
        }
   }
   public Doctor fireDoctor(int id){
               Doctor doc=new Doctor();
       for(int i=0;i<count;i++){
           if(id==doctors[i].getId()){
              doctors[i].getName();
             doctors[i].getId();
               doctors[i].getContact();
               doctors[i].getFee();
              doctors[i].getSpecialization();
               doctors[i]=null;
               System.out.println("FIRED SUCCESSFULLY!!");
            
           }
           
       }
       
       return doc;
   }
   public void confirmAppointment(){
       try{
    System.out.println("PATIENTS WHO GOT APPOINTMENT ARE");
    for(int i=0;i<count;i++){
       System.out.println( "NAME OF PATIENT "+(i+1)+" IS "+patient[i].getName());
        System.out.println( "ID OF PATIENT "+(i+1)+" IS "+patient[i].getId());
    }
       }catch(NullPointerException e){
         
       }
}
   public void viewDoctorDetails(){
          System.out.println("DOCTOR'S ADDED ARE");
          for(int i=0;i<count;i++){
                 System.out.println(doctors[i]);
          }
   }
   public void testsBill(int pId){
     try{
       Bill bill=new Bill();
      Scanner input=new Scanner(System.in);
    for(int i=0;i<count;i++){
        if(pId==patient[i].getId()){
            System.out.println("ENTER THE NAME OF TEST WHICH DOCTOR HAS RECOMMENDED YOU");
        String name=input.nextLine();
            if(name.equalsIgnoreCase("XRAY")){
              bill.setBillNo(i+1);
             bill.setName(patient[i].getName());
            bill.setAmount( bill.calculateBill(name));
              System.out.println("\t\t*********BILL RECIEPT***********");
              System.out.println(bill.toString());
            }
            else if(name.equalsIgnoreCase("CTSCAN")){
                bill.setBillNo(i+1);
              bill.setName(patient[i].getName());
            bill.setAmount( bill.calculateBill(name));
              System.out.println("\t\t*********BILL RECIEPT***********");
              System.out.println(bill.toString());
            }
            else if(name.equalsIgnoreCase("BLOODTEST")){
              bill.setName(patient[i].getName());
              bill.setAmount( bill.calculateBill(name));
              System.out.println("\t\t*********BILL RECIEPT***********");
              System.out.println(bill.toString());
              }
            else{
                System.out.println("NO SUCH TEST FACILITY IS REQUIRED IN THIS HOSPITAL");
            }
            }
        }
     }
     catch(NullPointerException e){
         
     }
    }
   public void seeDoctorFee(int dId){
      try{
          for(int i=0;i<count;i++){
              if(dId==doctors[i].getId()){
                  System.out.println("DOCTOR "+doctors[i].getName()+" FEE IS "+doctors[i].getFee());
              }
          }
   }
   
   catch(NullPointerException e){
    
}
   }}
