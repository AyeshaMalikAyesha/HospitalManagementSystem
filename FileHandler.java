/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Fame
 */
public class FileHandler {
     public void delete(Doctor s1){
        ArrayList <Doctor> s = read();
        for(Doctor i: s)
        {
            if(s1.equals(i)){
                s.remove(i);
                break;
            }
            }
        
            writeNew(s);
    }
    
    public ArrayList<Doctor> read(){
        ArrayList <Doctor> s = new <Doctor> ArrayList();
        try{
            FileReader fr = new FileReader("DOCTOR.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line !=null)
            {
                String name = line;
                line=br.readLine();
                String contact=line;
                line=br.readLine();
                String specialization=line;
                 line=br.readLine();
                int id = Integer.parseInt(line);
                line = br.readLine();
                int fee = Integer.parseInt(line);
                line = br.readLine();
                s.add(new Doctor(name,contact,specialization,id,fee));
            }
            
        }catch(IOException e){
            e.printStackTrace();
            }
        for(Doctor i: s)
            System.out.println(i);
        return s;
    }
    
    public void write(Doctor s){
        try{
            FileWriter fw = new FileWriter("DOCTOR.txt",true);
            //fw.write("\n");
            fw.write(s.getName()+"\n");
            fw.write(s.getContact()+"\n");
            fw.write(s.getSpecialization()+"\n");
            fw.write(s.getId()+"\n");
            fw.write(s.getFee()+"\n");
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public ArrayList<Doctor> getArray(){
        ArrayList<Doctor> s=read();
        return s;
    }
    public void update(Doctor p){
       ArrayList<Doctor> s=read();
       for(Doctor pp:s){
           if(pp.getId()==p.getId()){
               pp.setName(p.getName());
               pp.setContact(p.getContact());
               pp.setSpecialization(p.getSpecialization());
               pp.setId(p.getId());
               pp.setFee(p.getFee());
           }
       }
        writeNew(s);
        
    }
    public void writeNew(ArrayList <Doctor>s1){

        FileWriter fw;
        try{
                fw = new FileWriter("DOCTOR.txt");

            
        for(Doctor s: s1){
                fw.write(s.getName()+"\n");
                fw.write(s.getContact()+"\n");
            fw.write(s.getSpecialization()+"\n");
                 fw.write(s.getId()+"\n");
                fw.write(s.getFee()+"\n");
        
            }
                fw.close();
        }catch(IOException e){
                 e.printStackTrace();

            }
        }
}
