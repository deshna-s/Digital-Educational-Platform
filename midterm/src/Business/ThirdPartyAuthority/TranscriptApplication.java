/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ThirdPartyAuthority;

import Business.Student.Student;

/**
 *
 * @author dhirt, deshna, anisha
 */
public class TranscriptApplication {
    private static int count = 0;
    String trId;
    Student student;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        TranscriptApplication.count = count;
    }

    public String getTrId() {
        return trId;
    }

    public void setTrId(String trId) {
        this.trId = trId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    String status;

    public TranscriptApplication(Student student) {
        this.trId = "TR-" + count++;
        this.student = student;
        this.status = "requested";
    }
    
}
