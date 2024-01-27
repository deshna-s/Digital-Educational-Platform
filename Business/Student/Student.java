/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import Business.Course.CourseDirectory;
import Business.Person.Person;
import Business.UserAccount.UserAccount;

/**
 *
 * @author dhirt, deshna, anisha
 */
public class Student extends Person {
    private static int count = 0;
    String degreeName;
    String email;
    String roleValue;

    public String getRoleValue() {
        return roleValue;
    }

    public void setRoleValue(String role) {
        this.roleValue = role;
    }
    UserAccount userAccount;
    CourseDirectory registeredCourses;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }



    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public CourseDirectory getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(CourseDirectory courses) {
        this.registeredCourses = courses;
    }
    
    public Student() {
        this.userAccount = new UserAccount();
    }
    
    public Student(String studentName) {
        super();
        this.id = "STU-" + count++;
        this.name = studentName;
        this.userAccount = new UserAccount();
    }
    
    public  String getStudentId() {
        return id;
    }

    public void setStudentId(String studentId) {
        this.id = studentId;
    }
    
}
