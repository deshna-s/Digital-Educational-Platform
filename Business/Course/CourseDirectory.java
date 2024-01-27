/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Faculty.Faculty;
import Business.Role.StudentRole;
import Business.Student.Student;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author dhirt, deshna, anisha
 */
public class CourseDirectory {
    ArrayList<Course> courseList;
    
    public CourseDirectory() {
        this.courseList = new ArrayList<Course>();
    }
    
    public ArrayList<Course> getCourseList() {
        return courseList;
    }
    
    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    
    public Course AddCourse(Course course)
    {
        this.courseList.add(course);
        return course;
    }
    public Course createCourse(String courseName, int credits, float price, String language, String topic, Faculty faculty, String semester)
    {
        Course course = new Course(courseName);
        
        course.setCredits(credits);
        course.setPrice(price);
        course.setLanguage(language);
        course.setTopic(topic);
//        course.setReputationIndex(reputationIndex);
        course.setFaculty(faculty);
        course.setSemester(semester);
        
        this.courseList.add(course);
        
        return course;
    }        
    
    public Course createCourse(String courseName)
    {
        Course course = new Course(courseName);
        this.courseList.add(course);
        return course;
    }
    
    public Course findCourse(String courseId)
    {
        for(Course course: this.courseList) {
            if(course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }
    
    public ArrayList<Course> findCoursesByFacultyName(String facultyName) 
    {
        ArrayList<Course> courses = new ArrayList<Course>();
        for(Course course: this.courseList) {
            if(course.getFaculty().getName().equals(facultyName)) {
                courses.add(course);
            }
        }
        return courses;
    }
    
    public ArrayList<Course> findCoursesByLanguage(String language)
    {
        ArrayList<Course> courses = new ArrayList<Course>();
        for(Course course: this.courseList) {
            if(course.getLanguage().equals(language)) {
                courses.add(course);
            }
        }      
        return courses;
    }
    
    public ArrayList<Course> findCoursesByTopic(String topic)
    {
        ArrayList<Course> courses = new ArrayList<Course>();
        for(Course course: this.courseList) {
            if(course.getTopic().equals(topic)) {
                courses.add(course);
            }
        }      
        return courses;
    }
    
    public ArrayList<Course> findCoursesByRegion(String region)
    {
        ArrayList<Course> courses = new ArrayList<Course>();
        for(Course course: this.courseList) {
            if(course.getFaculty().getLocation().equals(region)) {
                courses.add(course);
            }
        }      
        return courses;
    }
}
