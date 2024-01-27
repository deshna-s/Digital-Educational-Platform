/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ThirdPartyAuthority;

import Business.Student.Student;
import java.util.ArrayList;

/**
 *
 * @author dhirt, deshna, anisha
 */
public class TranscriptApplicationDirectory {
    ArrayList<TranscriptApplication> transcriptApplications;
    
    public ArrayList<TranscriptApplication> getTranscriptRequests() {
        return transcriptApplications;
    }
    
    public void setTranscriptRequests(ArrayList<TranscriptApplication> transcriptRequests) {
        this.transcriptApplications = transcriptApplications;
    }
    
    public TranscriptApplicationDirectory()
    {
        this.transcriptApplications = new ArrayList<TranscriptApplication>();
    }
    
    public TranscriptApplication createTranscript(Student student)
    {
        var transcriptApplication = new TranscriptApplication(student);
        this.transcriptApplications.add(transcriptApplication);
        return transcriptApplication;
    }
    
    public TranscriptApplication findTranscriptApplication(String transcriptId) 
    {
        for(TranscriptApplication x: this.transcriptApplications) {
            if(x.getTrId().equals(transcriptId)) {
                return x;
            }
        }
        return null;
    }
    
    public boolean isTranscriptApproved(Student student)
    {
        for(TranscriptApplication x: this.transcriptApplications) {
            if(x.getStudent().getId().equals(student.getId())) {
                if(x.getStatus().equals("approved"))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
}
