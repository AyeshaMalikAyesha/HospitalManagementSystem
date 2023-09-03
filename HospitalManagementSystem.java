/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Fame
 */
public class HospitalManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        StartFrame sf=new StartFrame();
       sf.setVisible(true);
        Hospital H=new Hospital();
        Admin an=new Admin();
        Admin adm=new Admin(20);
        adm.setSize(20);
        Patients p=new Patients();
        INPatient in=new INPatient();
        Doctor d=new Doctor();
      
                     Admin a1=new Admin(10);
                     a1.setSize(10);
        System.out.println("\t\t\t|*******WELCOME TO PIMS HOSPITAL********|\n"+H);
        System.out.println("\t\t\nENTER 1 IF YOU ARE ADMIN");
         System.out.println("\t\t\nENTER 2 IF YOU ARE DOCTOR");
          System.out.println("\t\t\nENTER 3 IF YOU ARE PATIENT");
            System.out.println("ENTER 4 TO QUIT");
        System.out.println("SELECT YOUR POSITION FROM THE FOLLOWING");
        int choice1=input.nextInt();
do{
if(choice1==1){
            input.nextLine();
            System.out.println("ENTER USERNAME");
            String username=input.nextLine();
            System.out.println("ENTER PASSWORD");
            String password=input.nextLine();
           Admin a=new Admin(username,password);
             System.out.println("\t\t******MODULES*********");
            System.out.println("\t\tSELECT ONE OF THE FOLLOWING MODULES");
            System.out.println("\t\tPRESS 1 FOR PATIENT MODULES");
            System.out.println("\t\tPRESS 2 FOR DOCTOR MODULES");
            System.out.println("\t\tPRESS 3 QUIT");
            int choice2=input.nextInt();
            while(choice2!=3)   {
            if(choice2==1){
             System.out.println("\t\t********WHAT YOU WANT TO DO********** ");
                 System.out.println("\t\tPRESS 1 TO ADD PATIENT");
                 System.out.println("\t\tPRESS 2 TO VIEW PATIENT DETAILS");
                 System.out.println("\t\tPRESS 3 TO DISCHARGE PATIENT");
                  System.out.println("\t\tPRESS 4 TO QUIT");
                  int choice3=input.nextInt();
                
                    while(choice3!=4){

                 if(choice3==1){
                         input.nextLine();
                      System.out.println("ENTER PATIENT NAME");
                      String name=input.nextLine();
                       System.out.println("ENTER PATIENT GENDER");
                       String gender=input.nextLine();
                       System.out.println("ENTER PATIENT ID");
                        int id=input.nextInt();
                        System.out.println("ENTER PATIENT AGE");
                        int age=input.nextInt();
                        input.nextLine();
                          System.out.println("ENTER PATIENT DISEASES");
                          String diseases=input.nextLine();
                              System.out.println("ENTER PATIENT ADMIT DATE");
                              String admitDate=input.nextLine();
                                System.out.println("ENTER ROOM NO ");
                              int roomNo=input.nextInt();
                                 p=new Patients(name,gender,diseases,admitDate,id,age);
                                 H=new Hospital(p);
                                adm.admitNewPatient(p);
                                in.setRoomNo(roomNo);
                                System.out.println("ROOM ALLOTED IS "+in.getRoomNo());
                 }
                 
                 else if(choice3==2){
                     adm.viewPatientDetails();}
                 else if(choice3==3){
                     Patients pp;
                     System.out.println("ENTER THE ID OF PATIENT YOU WANT TO DISCHARGE");
                     int id=input.nextInt();
               pp=adm.dischargePatient(id);
            System.out.println(" PATIENT REMOVED IS : "+ pp);
            
                 }
                  System.out.println("\t\t********WHAT YOU WANT TO DO********** ");
                 System.out.println("\t\tPRESS 1 TO ADD PATIENT");
                 System.out.println("\t\tPRESS 2 TO VIEW PATIENT DETAILS");
                 System.out.println("\t\tPRESS 3 TO DISCHARGE PATIENT");
                  System.out.println("\t\tPRESS 4 TO QUIT");
                   choice3=input.nextInt();
              
            }
            }
            else if(choice2==2){
              System.out.println("\t\t********WHAT YOU WANT TO DO********** ");
                 System.out.println("\t\tPRESS 1 TO ADD DOCTOR");
                 System.out.println("\t\tPRESS 2 TO VIEW DOCTOR DETAILS");
                 System.out.println("\t\tPRESS 3 TO FIRE DOCTOR");
                  System.out.println("\t\tPRESS 4 TO QUIT");
                 int choice3=input.nextInt();

            while(choice3!=4){
                 if(choice3==1){
                         input.nextLine();
                      System.out.println("ENTER DOCTOR NAME");
                      String name=input.nextLine();
                       System.out.println("ENTER DOCTOR FEE");
                       int fee=input.nextInt();
                       System.out.println("ENTER DOCTOR ID");
                        int id=input.nextInt();
                        input.nextLine();
                        System.out.println("ENTER DOCTOR CONTACT");
                        String contact=input.nextLine();
                          System.out.println("ENTER DOCTOR SPECIALIZATION");
                          String specialization=input.nextLine();
                                 d=new Doctor(name,contact,specialization,fee,id);
                                 H=new Hospital(d);
                                a1.addDoctor(d);
                 }
                 
                 else if(choice3==2){
                     a1.viewDoctorDetails();}
                 else if(choice3==3){
                     Doctor dd;
                     System.out.println("ENTER THE ID OF DOCTOR YOU WANT TO FIRE");
                     int id=input.nextInt();
                dd= a1.fireDoctor(id);
           System.out.println(" DOCTOR FIRED IS : "+ dd);
            
                 }
                 
             System.out.println("\t\t********WHAT YOU WANT TO DO********** ");
                 System.out.println("\t\tPRESS 1 TO ADD DOCTOR");
                 System.out.println("\t\tPRESS 2 TO VIEW DOCTOR DETAILS");
                 System.out.println("\t\tPRESS 3 TO FIRE DOCTOR");
                  System.out.println("\t\tPRESS 4 TO QUIT");
                  choice3=input.nextInt();
            }
            }
            System.out.println("\t\t******MODULES*********");
            System.out.println("\t\tSELECT ONE OF THE FOLLOWING MODULES");
            System.out.println("\t\tPRESS 1 FOR PATIENT MODULES");
            System.out.println("\t\tPRESS 2 FOR DOCTOR MODULES");
            System.out.println("\t\tPRESS 3 QUIT");
            choice2=input.nextInt();
            }
}
            
else if(choice1==2){
            System.out.println("\t\tWHAT TO YOU WANT TO DO FROM GIVEN FUNCTIONS ");
     System.out.println("\t\tPRESS 1 TO VIEW APPOINTMENT ");
     System.out.println("\t\tPRESS 2 TO VIEW PATIENT DETAILS ");
           System.out.println("\t\tPRESS 3 TO QUIT"); 
            int choic=input.nextInt();
            while(choic!=3){
            if(choic==1){
           adm.confirmAppointment();
            }
            else if(choic==2){
              adm.viewPatientDetails();
            }
             System.out.println("\t\tWHAT TO YOU WANT TO DO FROM GIVEN FUNCTIONS ");
     System.out.println("\t\tPRESS 1 TO VIEW APPOINTMENT ");
     System.out.println("\t\tPRESS 2 TO VIEW PATIENT DETAILS ");
           System.out.println("\t\tPRESS 3 TO QUIT"); 
             choic=input.nextInt();
            }
        }
else if(choice1==3){
    System.out.println("\t\tWHAT YOU WANT TO SEE");
    System.out.println("\t\tPRESS 1 TO SEE TESTS BILL ");
      System.out.println("\t\tPRESS 2 TO SEE DOCTOR FEE ");
      int pdch=input.nextInt();
      if(pdch==1){
            System.out.println("ENTER YOUR ID ");
            int pId=input.nextInt();
            adm.testsBill(pId);
        }
      else if(pdch==2){
           System.out.println("ENTER DOCTOR ID ");
            int dId=input.nextInt();
            a1.seeDoctorFee(dId);
      }
      else{
          System.out.println("INVALID CHOICE");
      }
}
        else{
            System.out.println("INVALID CHOICE");
        }

 System.out.println("ENTER 1 IF YOU ARE ADMIN");
         System.out.println("ENTER 2 IF YOU ARE DOCTOR");
          System.out.println("ENTER 3 IF YOU ARE PATIENT");
            System.out.println("ENTER 4 TO QUIT");
        System.out.println("SELECT YOUR POSITION FROM THE FOLLOWING");
         choice1=input.nextInt();
}
            while(choice1!=4);
            } 
}

