/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import Business.Course.CourseDirectory;
import Business.Role.StudentRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author dhirt, deshna, anisha
 */
public class StudentDirectory {
    ArrayList<Student> studentList;
    
    public StudentDirectory() {
        this.studentList = new ArrayList<Student>();
    }
    
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    
    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    
    public Student createStudent(String studentName, String degreeName, String email, String username, String password)
    {
        Student student = new Student(studentName);
        //student.setStudentId(studentID);
        //student.setName(studentName);
        student.setDegreeName(degreeName);
        student.setEmail(email);
        UserAccount ua = new UserAccount();
        ua.setUsername(username);
        ua.setPassword(password);
        ua.setRole(new StudentRole());
        ua.setPersonId(student.getId());
        student.setUserAccount(ua);
        student.setRegisteredCourses(new CourseDirectory());
        //student.getUseraccount().setUsername(username);
        //student.getUseraccount().setPassword(password);
        this.studentList.add(student);
        return student;        
    }        
    
    public boolean checkIfStudentExists(int studentId) {
        for(Student student: this.studentList) {
            if(student.getPersonID().equals(studentId))
            {
                return true;
            }
        }
        return false;
    }
    
    public Student findStudent(String studentId)
    {
        for(Student student: this.studentList) {
            if(student.getPersonID().equals(studentId)) {
                return student;
            }
        }
        return null;
    }
}
