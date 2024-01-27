/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Recruiter;

import Business.Student.Student;
import Business.Job.JobDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

import Business.Role.StudentRole;
import Business.Role.RecruiterRole;

/**
 *
 * @author dhirt, deshna, anisha
 */
public class RecruiterDirectory {
    ArrayList<Recruiter> recruiterList;
    JobDirectory jobDirectory;
    
    public RecruiterDirectory() {
        this.recruiterList = new ArrayList<Recruiter>();
        this.jobDirectory = jobDirectory;
    }
    
    public ArrayList<Recruiter> getRecruiterList() {
        return recruiterList;
    }
    
    public void setRecruiterList(ArrayList<Recruiter> recruiterList) {
        this.recruiterList = recruiterList;
    }
    
    public JobDirectory getJobDirectory() {
        return jobDirectory;
    }
    
    public void setJobDirectory(JobDirectory jobDirectory) {
        this.jobDirectory = jobDirectory;
    }
    
    public Recruiter createRecruiter(String name, String companyName, String location, String email, String username, String password)
    {
        Recruiter recruiter = new Recruiter(name);
//        recruiter.setId(recruiterId);
        recruiter.setName(companyName);  
        recruiter.setLocation(location);
        recruiter.setEmail(email);


        UserAccount ua = new UserAccount();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setRole(new RecruiterRole());
        ua.setPersonId(recruiter.getId());
        recruiter.setUserAccount(ua);
        this.recruiterList.add(recruiter);
        return recruiter;
    }
    
    public boolean checkIfRecruiterExists(String recruiterId) {
        for(Recruiter recruiter: this.recruiterList) {
            if(recruiter.getId().equals(recruiterId))
            {
                return true;
            }
        }
        return false;
    }
    
    public Recruiter findRecruiter(String recruiterId) 
    {
        for(Recruiter recruiter: this.recruiterList) {
            if(recruiter.getRecruiterId().equals(recruiterId)) {
                return recruiter;
            }
        }
        return null;
    }
}


