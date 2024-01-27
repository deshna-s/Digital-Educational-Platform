/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Faculty;

import Business.Course.Course;
import Business.Student.Student;
import Business.Course.CourseDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

import Business.Role.StudentRole;
import Business.Role.FacultyRole;

/**
 *
 * @author dhirt, deshna, anisha
 */
public class FacultyDirectory {
    ArrayList<Faculty> facultyList;
    CourseDirectory courseDirectory;
    String FacultyName;

    public String getFacultyName() {
        return FacultyName;
    }

    public void setFacultyName(String FacultyName) {
        this.FacultyName = FacultyName;
    }
    
    public FacultyDirectory() {
        this.facultyList = new ArrayList<Faculty>();
        this.courseDirectory = courseDirectory;
    }
    
    public ArrayList<Faculty> getFacultyList() {
        return facultyList;
    }
    
    public void setFacultyList(ArrayList<Faculty> facultyList) {
        this.facultyList = facultyList;
    }
    
    public CourseDirectory getCourseDirectory() {
        return courseDirectory;
    }
    
    public void setCourseDirectory(CourseDirectory courseDirectory) {
        this.courseDirectory = courseDirectory;
    }
    
    public Faculty createFaculty(String facultyName, String email, String location, String username, String password)
    {
        Faculty faculty = new Faculty(facultyName);
//        faculty.setId(facultyId);
//        faculty.setName(facultyName);  
        faculty.setEmail(email);
        faculty.setLocation(location);
        faculty.setTotalRevenue(Float.parseFloat("0.00"));
//        faculty.setLanguage(language);
//        faculty.setTopic(topic);

        UserAccount ua = new UserAccount();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setRole(new FacultyRole());
        ua.setPersonId(faculty.getId());
        faculty.setUserAccount(ua);
        this.facultyList.add(faculty);
        return faculty;
    }
    
    public boolean checkIfFacultyExists(String facultyId) {
        for(Faculty faculty: this.facultyList) {
            if(faculty.getId().equals(facultyId))
            {
                return true;
            }
        }
        return false;
    }
    
    public Faculty findFaculty(String facultyId) 
    {
        for(Faculty faculty: this.facultyList) {
            if(faculty.getFacultyId().equals(facultyId)) {
                return faculty;
            }
        }
        return null;
    }
}
