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
public class FileHandlerPatient {
     public void delete(Patients s1){
        ArrayList <Patients> s = read();
        for(Patients i: s)
        {
            if(s1.equals(i)){
                s.remove(i);
                break;
            }
            }
        
            writeNew(s);
    }
    
    public ArrayList<Patients> read(){
        ArrayList <Patients> s = new <Patients> ArrayList();
        try{
            FileReader fr = new FileReader("PATIENTs.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while(line !=null)
            {
                String name = line;
                line=br.readLine();
                String gender=line;
                line=br.readLine();
                String disease=line;
                 line=br.readLine();
                String admitDate=line;
                 line=br.readLine();
                int id = Integer.parseInt(line);
                line = br.readLine();
                int age = Integer.parseInt(line);
                line = br.readLine();
                s.add(new Patients(name,gender,disease,admitDate,id,age));
            }
            
        }catch(IOException e){
            e.printStackTrace();
            }
        for(Patients i: s)
            System.out.println(i);
        return s;
    }
    
    public void write(Patients s){
        try{
            FileWriter fw = new FileWriter("PATIENTs.txt",true);
            //fw.write("\n");
            fw.write(s.getName()+"\n");
            fw.write(s.getGender()+"\n");
            fw.write(s.getDisease()+"\n");
            fw.write(s.getAdmitDate()+"\n");
            fw.write(s.getId()+"\n");
            fw.write(s.getAge()+"\n");
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public ArrayList<Patients> getArray(){
        ArrayList<Patients> s=read();
        return s;
    }
    public void update(Patients p){
       ArrayList<Patients> s=read();
       for(Patients pp:s){
           if(pp.getId()==p.getId()){
               pp.setName(p.getName());
               pp.setGender(p.getGender());
               pp.setDisease(p.getDisease());
               pp.setAdmitDate(p.getAdmitDate());
               pp.setId(p.getId());
               pp.setAge(p.getAge());
           }
       }
        writeNew(s);
        
    }
    public void writeNew(ArrayList <Patients>s1){

        FileWriter fw;
        try{
                fw = new FileWriter("PATIENTs.txt");

            
        for(Patients s: s1){
                fw.write(s.getName()+"\n");
                fw.write(s.getGender()+"\n");
            fw.write(s.getDisease()+"\n");
            fw.write(s.getAdmitDate()+"\n");
                 fw.write(s.getId()+"\n");
                fw.write(s.getAge()+"\n");
        
            }
                fw.close();
        }catch(IOException e){
                 e.printStackTrace();

            }
        }
}
