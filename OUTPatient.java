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
public class OUTPatient extends Patients{
     private String patientName;
    private int id;
    private String contact;

    public OUTPatient(){
          this.patientName = null;
        this.id = 0;
        this.contact = null;
    }
    public OUTPatient(String patientName, int id, String contact) {
        this.patientName = patientName;
        this.id = id;
        this.contact = contact;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "OUTPatient{" + "patientName=" + patientName + ", id=" + id + ", contact=" + contact + '}';
    }
    
}
