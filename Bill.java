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
public class Bill {
     private int billNo;
    private String name;
    private int amount;
public Bill(){
    this.name = null;
        this.amount = 0;
        this.billNo=0;
}
    public Bill( String name, int amount) {
     
        this.name = name;
        this.amount = amount;
    }

    public int getBillNo() {
        return billNo;
    }

    public void setBillNo(int billNo) {
        this.billNo = billNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
     @Override
    public String toString() {
        return "\n\t\tBILL NO IS "+billNo+"\t\t\nNAME OF PATIENT IS "+name+"\t\t\nAMOUNT IS"+amount;
    }
    public int calculateBill(String testName){
            int amount=0;
        if(testName.equalsIgnoreCase("blood test")){
            
        amount=1500;
         System.out.println("YOUR BILL FOR BLOOD TEST IS "+amount);
        }
        else if(testName.equalsIgnoreCase("x-ray")){
        amount=1000;
         System.out.println("YOUR BILL FOR XRAY IS "+amount);
        }
        else if(testName.equalsIgnoreCase("CT SCAN")){
        amount=10000;
         System.out.println("YOUR BILL FOR CT-SCAN IS "+amount);
        }
       else if(testName.equalsIgnoreCase("sugar test")){
        amount=500;
         System.out.println("YOUR BILL FOR SUGAR TEST IS "+amount);
        }
       else if(testName.equalsIgnoreCase("thyroid test")){
        amount=2000;
         System.out.println("YOUR BILL FOR THYROID TEST IS "+amount);
        }
       if(testName.equalsIgnoreCase("COVID-19")){
        amount=8000;
         System.out.println("YOUR BILL FOR COVID-19 IS "+amount);
        }
        else if(testName.equalsIgnoreCase("none")){
        amount=0;
         
        }
        return amount;
    }
}
