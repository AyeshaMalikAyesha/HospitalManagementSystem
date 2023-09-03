/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;
import java.util.Date;
import java.util.Scanner;
import java.util.Objects;
/**
 *
 * @author Fame
 */
public class Patients {
     private String name;
   private String gender;
   private String admitDate;
   private String admitTime;
   private int age;
    private int id;
   private String disease;
   public Patients(){
       this.name="no name";
       this.gender=null;
       this.age=0;
       this.admitDate=null;
       this.admitTime=null;
       this.disease=null;
       this.id=0;
   }
   public Patients(String n,String g,String disease,String admitDate,int id,int a){
       this.name=n;
       this.id=id;
       this.gender=g;
       this.age=a; 
       this.disease=disease;
       this.admitDate=admitDate;
   }
     public Patients(String n,String g,String disease,int id,int a){
       this.name=n;
       this.id=id;
       this.gender=g;
       this.age=a; 
       this.disease=disease;
   }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAdmitDate(String admitDate) {
        this.admitDate = admitDate;
    }

    public void setAdmitTime(String admitTime) {
        this.admitTime = admitTime;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
 public String getName(){
       return name;
   }
   public String getAdmitDate(){
       return admitDate;
   }
 
   public int getId()
   {
       return id;
   }
   public String getGender(){
       return gender;
   }

 
   public int getAge(){
       return age;
   }
   public String getDisease(){
       return disease;
   }
   public String toString(){
       return "\n*******PATIENTS INFO IS********* \n NAME OF PATIENT IS "+name+"\nGENDER IS "+gender+
               "\nAGE IS "+age+"\n DISEASE IS "+disease+"\nID IS "+id;
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
    final Patients other=(Patients)obj;
    if(!Objects.equals(this.name,other.name)){
        return false;
    }
     if(!Objects.equals(this.gender,other.gender)){
        return false;
    }
      if(!Objects.equals(this.disease,other.disease)){
        return false;
    }
       if(!Objects.equals(this.admitDate,other.admitDate)){
        return false;
    }
        if (this.id!=other.id){
        return false;
    }
    if(this.age!=other.age){
        return false;
    }
    return true;
}
}
