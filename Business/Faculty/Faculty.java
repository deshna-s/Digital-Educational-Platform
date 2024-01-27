/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Faculty;

import Business.Course.Course;
import Business.Person.Person;
import Business.UserAccount.UserAccount;

/**
 *
 * @author dhirt, deshna, anisha
 */
public class Faculty extends Person {
    private static int count = 0;
    String email;
    boolean subPaid;
    String location;
    String language;
    String topic;
    Course course;
    Float rating;
    Float totalRevenue;
    String roleFaculty;
    String semester;
    
    UserAccount userAccount;
    
      public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public String getRoleFaculty() {
        return roleFaculty;
    }

    public void setRoleFaculty(String roleFaculty) {
        this.roleFaculty = roleFaculty;
    }
  
  public Float getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(Float totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public Faculty () {
        this.userAccount = new UserAccount(); 
        //this.course = new Course();
    }
     public Faculty(String profName) {
         super();
         this.id = "PROF-" + count++;
         this.name = profName;
         this.userAccount = new UserAccount();
         this.rating = Float.valueOf("0.0");
    }
     
    public  String getFacultyId() {
        return id;
    }

    public void setFacultyId(String facultyId) {
        this.id = facultyId;
    }
    
    public  String getFacultyName() {
        return name;
    }

    public void setFacultyName(String name) {
        this.name = name;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
    

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean getSubPaid() {
        return subPaid;
    }

    public void setSubPaid(boolean subPaid) {
        this.subPaid = subPaid;
    }

   public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
       this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    
}
