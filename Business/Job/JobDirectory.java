/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Job;


import Business.Faculty.Faculty;
import Business.Recruiter.Recruiter;
import Business.Role.StudentRole;
import Business.Student.Student;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author dhirt, deshna, anisha
 */
public class JobDirectory {
    ArrayList<Job> jobList;
    
    public JobDirectory() {
        this.jobList = new ArrayList<Job>();
    }

    public ArrayList<Job> getJobList() {
        return jobList;
    }

    public void setJobList(ArrayList<Job> jobList) {
        this.jobList = jobList;
    }
    
    public Job AddJob(Job job)
    {
        this.jobList.add(job);
        return job;
    }
    public Job createJob(String jobPosition, String companyName, String jobDescription, String field, String salary, Recruiter recruiter)
    {
        Job job = new Job(jobPosition);
        
        job.setJobPosition(jobPosition);
        job.setCompanyName(companyName);
        job.setJobDescription(jobDescription);
        job.setField(field);
        job.setSalary(salary);
        job.setRecruiter(recruiter);

        
        this.jobList.add(job);
        
        return job;
    }        
    
    public Job createJob (String jobPosition)
    {
        Job job = new Job(jobPosition);
        this.jobList.add(job);
        return job;
    }
    
    public Job findJob(String jobId)
    {
        for(Job job: this.jobList) {
            if(job.getJobId().equals(jobId)) {
                return job;
            }
        }
        return null;
    }
    
    public ArrayList<Job> findJobByJobPosition (String jobPosition) 
    {
        ArrayList<Job> jobs = new ArrayList<Job>();
        for(Job job: this.jobList) {
            if(job.getRecruiter().getName().equals(jobPosition)) {
                jobs.add(job);
            }
        }
        return jobs;
    }
    
    public ArrayList<Job> findJobsByField (String field)
    {
        ArrayList<Job> jobs = new ArrayList<Job>();
        for(Job job: this.jobList) {
            if(job.getField().equals(field)) {
                jobs.add(job);
            }
        }      
        return jobs;
    }
    
//    public ArrayList<Job> findCoursesByCompanyName (String companyName)
//    {
//        ArrayList<Job> jobs = new ArrayList<Job>();
//        for(Job job: this.jobList) {
//            if(job.getCompanyName().equals(companyName)) {
//                jobs.add(job);
//            }
//        }      
//        return jobs;
//    }
    
//    public ArrayList<Job> findCoursesByRegion(String region)
//    {
//        ArrayList<Job> courses = new ArrayList<Job>();
//        for(Job course: this.jobList) {
//            if(course.getFaculty().getLocation().equals(region)) {
//                courses.add(course);
//            }
//        }      
//        return courses;
//    }
}
