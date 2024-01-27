/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Model;

import Business.Course.CourseDirectory;
import Business.Faculty.FacultyDirectory;
import Business.Job.JobDirectory;
import Business.Recruiter.RecruiterDirectory;
import Business.Student.StudentDirectory;
import Business.ThirdPartyAuthority.TranscriptApplicationDirectory;
import Business.UserAccount.UserAccountDirectory;
import Business.Role.ThirdPartyRole;
import Business.Role.AdminRole;

/**
 *
 * @author dhirt, deshna, anisha
 */
public class Model {
    UserAccountDirectory topLevelUserAccountDirectory;
    StudentDirectory studentDirectory;
    FacultyDirectory facultyDirectory;
    RecruiterDirectory recruiterDirectory;
    CourseDirectory courseDirectory;
    TranscriptApplicationDirectory transcriptApplication;
    JobDirectory jobDirectory;
    
    public Model() {
        this.topLevelUserAccountDirectory = new UserAccountDirectory();
        this.studentDirectory = new StudentDirectory();
        this.facultyDirectory = new FacultyDirectory();
        this.recruiterDirectory = new RecruiterDirectory();
        this.courseDirectory = new CourseDirectory();
        this.jobDirectory = new JobDirectory();
        this.transcriptApplication = new TranscriptApplicationDirectory();
        this.topLevelUserAccountDirectory.createUserAccount("admin", "pass", new AdminRole());
        this.topLevelUserAccountDirectory.createUserAccount("tp", "tp", new ThirdPartyRole());
        
    }


    public UserAccountDirectory getTopLevelUserAccountDirectory() {
        return topLevelUserAccountDirectory;
    }

    public void setTopLevelUserAccountDirectory(UserAccountDirectory topLevelUserAccountDirectory) {
        this.topLevelUserAccountDirectory = topLevelUserAccountDirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public void setStudentDirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public FacultyDirectory getFacultyDirectory() {
        return facultyDirectory;
    }

    public void setFacultyDirectory(FacultyDirectory facultyDirectory) {
        this.facultyDirectory = facultyDirectory;
    }

    public RecruiterDirectory getRecruiterDirectory() {
        return recruiterDirectory;
    }

    public void setRecruiterDirectory(RecruiterDirectory recruiterDirectory) {
        this.recruiterDirectory = recruiterDirectory;
    }

    public CourseDirectory getCourseDirectory() {
        return courseDirectory;
    }

    public void setCourseDirectory(CourseDirectory courseDirectory) {
        this.courseDirectory = courseDirectory;
    }

    public JobDirectory getJobDirectory() {
        return jobDirectory;
    }

    public void setJobDirectory(JobDirectory jobDirectory) {
        this.jobDirectory = jobDirectory;
    }

    public TranscriptApplicationDirectory getTranscriptRequests() {
        return transcriptApplication;
    }

    public void setTranscriptRequests(TranscriptApplicationDirectory transcriptApplication) {
        this.transcriptApplication = transcriptApplication;
    }
    
    public static Model getInstance() {
        return new Model();
    }
    
}
