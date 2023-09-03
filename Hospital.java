/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;

/**
 *
 * @author Fame
 */
public class Hospital {
       private final String name;
    private final String address;
    private final String phone;
    private Doctor d;
    private Patients p;
    public Hospital(){
        this.name="PIMS HOSPITAL";
        this.address=" Ibn-e-Sina Rd, G-8/3 G 8/3 G-8, Islamabad, Islamabad Capital Territor";
        this.phone="(051) 9261170";
        
    }
    public Hospital(String n,String a,String p){      
        this.name="PIMS HOSPITAL";
        this.address=" Ibn-e-Sina Rd, G-8/3 G 8/3 G-8, Islamabad, Islamabad Capital Territor";
        this.phone="(051) 9261170";
    }
    public Hospital(Doctor doc){
         this.name="PIMS HOSPITAL";
        this.address=" Ibn-e-Sina Rd, G-8/3 G 8/3 G-8, Islamabad, Islamabad Capital Territor";
        this.phone="(051) 9261170";
        this.d=doc;
    }
    public Hospital(Patients pat){
         this.name="PIMS HOSPITAL";
        this.address=" Ibn-e-Sina Rd, G-8/3 G 8/3 G-8, Islamabad, Islamabad Capital Territor";
        this.phone="(051) 9261170";
        this.p=pat;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }
    public String toString(){
        return "\t\t\t\t******HOSPITAL INFO IS****"+"\n\t\t\tNAME IS "+name+"\n\t\t\tADDRESS IS "+
                address+"\n\t\t\tPHONE IS "+phone;
    }
}
