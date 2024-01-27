/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Job;

import Business.Person.Person;
import Business.Recruiter.Recruiter;

/**
 *
 * @author dhirt, deshna, anisha
 */
public class Job extends Person {
    private static int count = 0;
    String jobId;
    String companyName;
    String jobPosition;
    String jobDescription;
    String field;
    String salary;

//    int credits;
//    float price;
    Recruiter recruiter;
//    float reputationIndex;
    
    public Job() {
        
    }
      public Job(String companyName) {
          this.jobId = "JOB-" + count++;
          this.companyName = companyName;
//          this.professor = professor;
      }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Job.count = count;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Recruiter getRecruiter() {
        return recruiter;
    }

    public void setRecruiter(Recruiter recruiter) {
        this.recruiter = recruiter;
    }
    
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    
    
      
}
