/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Recruiter to edit this template
 */
package Business.Recruiter;

import Business.Job.Job;
import Business.Person.Person;

import Business.UserAccount.UserAccount;


/**
 *
 * @author dhirt, deshna, anisha
 */
public class Recruiter extends Person {
    
    private static int count = 0;
    String name;
    String companyName;
    String jobDescription;
    String Salary; 
    String email;
    String location;
    String field;
    String roleRecruiter;
    String jobPosistion;
    
    Job job;
    
    UserAccount userAccount;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Recruiter.count = count;
    }

    public String getRoleRecruiter() {
        return roleRecruiter;
    }

    public void setRoleRecruiter(String roleRecruiter) {
        this.roleRecruiter = roleRecruiter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }
    
    public Recruiter () {
        this.userAccount = new UserAccount(); 
    }
    
    public Recruiter(String recruiterName) {
         super();
         this.id = "RECRU-" + count++;
         this.name = recruiterName;
         this.userAccount = new UserAccount();
    }

    public  String getRecruiterId() {
        return id;
    }

    public void setRecruiterId(String recruiterId) {
        this.id = recruiterId;
    }
    
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getJobPosistion() {
        return jobPosistion;
    }

    public void setJobPosistion(String jobPosistion) {
        this.jobPosistion = jobPosistion;
    }


    
    
    
}
