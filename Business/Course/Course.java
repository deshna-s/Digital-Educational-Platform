/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Faculty.Faculty;

/**
 *
 * @author dhirt, deshna, anisha
 */
public class Course {
    private static int count = 0;
    String courseId;
    String courseName;
    int credits;
    float price;
    String language;
    String topic;
    Faculty faculty;
    float reputationIndex;
    String semester;


    
    public Course() {
        
    }
      public Course(String courseName) {
          this.courseId = "CR-" + count++;
          this.courseName=courseName;
//          this.professor = professor;
      }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Course.count = count;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public float getReputationIndex() {
        return reputationIndex;
    }

    public void setReputationIndex(float reputationIndex) {
        this.reputationIndex = reputationIndex;
    }
    
        public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    
      
}
