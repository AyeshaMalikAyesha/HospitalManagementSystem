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
public class INPatient extends Patients{
    private String patientName;
private int id;
    private int roomNo;
    public INPatient(){
         this.patientName = null;
        this.id = 0;
        this.roomNo = 0;
    }
    public INPatient(String patientName, int id, int roomNo) {
        this.patientName = patientName;
        this.id = id;
        this.roomNo = roomNo;
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

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "INPatient{" + "patientName=" + patientName + ", id=" + id + ", roomNo=" + roomNo + '}';
    }
}
