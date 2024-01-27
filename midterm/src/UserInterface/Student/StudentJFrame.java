/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface.Student;

import Business.Model.Model;
import Business.ThirdPartyAuthority.TranscriptApplication;
import Business.Course.Course;
import Business.Course.CourseDirectory;
import Business.Faculty.Faculty;
import Business.Job.Job;
import Business.Student.Student;
import UserInterface.MainJFrame.MainJFrame;
import UserInterface.Faculty.RegisterFacultyJFrame;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author divya
 */
public class StudentJFrame extends javax.swing.JFrame {

    /**
     * Creates new form StudentJFrame
     */
    private Model model;
    private UserAccountDirectory userAccountDirectory;
    private UserAccount userAccount;
    DefaultTableModel coursesTableModel;
    DefaultTableModel registeredCoursesTableModel;
    DefaultTableModel jobsTableModel;

    private Student student;

    /*public StudentJFrame() {
        initComponents();
    }*/
    public StudentJFrame(Model model, UserAccount userAccount) {
        initComponents();
        this.model = model;
        this.userAccount = userAccount;
        this.coursesTableModel = (DefaultTableModel) courseSearchTable.getModel();
        this.registeredCoursesTableModel = (DefaultTableModel) registeredCoursesTable.getModel();
        this.jobsTableModel = (DefaultTableModel) jobsJTable.getModel();
        //this.student= student;
        this.setVisible(true);

        displayRegisteredCourses();
//      displayAvailableJobs();
    }

    public void displayAvailableJobs(ArrayList<Job> jobs) {
        System.out.println("display jobs StudentJFrame");
        if (jobs.size() >= 0) {
            System.out.println("displayAvailableJobs :: start");
            jobsTableModel.setRowCount(0);
            for (Job j : jobs) {
                System.out.println("displayAvailableJobs :: loop");
                Object row[] = new Object[5];
                row[0] = j.getJobPosition();
                row[1] = j.getCompanyName();
                row[2] = j.getJobDescription();
                row[3] = j.getField();
                row[4] = j.getSalary();

                jobsTableModel.addRow(row);
                System.out.println("displayAvailableJobs :: end "+jobsTableModel);
            }
        }
    }

    public void displayRegisteredCourses() {
        String studentId = userAccount.getPersonId();
        Student currentStudent = this.model.getStudentDirectory().findStudent(studentId);

        txtStudentId.setText(studentId);
        txtName.setText(currentStudent.getName());
        txtStudentEmail.setText(currentStudent.getEmail());

        ArrayList<Course> registeredCourses = currentStudent.getRegisteredCourses().getCourseList();

        if (registeredCourses.size() >= 0) {
            registeredCoursesTableModel.setRowCount(0);
            for (Course c : registeredCourses) {
                Object row[] = new Object[5];
                row[0] = c.getCourseId();
                row[1] = c.getCourseName();
                row[2] = c.getFaculty().getName();
                row[3] = c.getCredits();
                row[4] = c.getPrice();

                registeredCoursesTableModel.addRow(row);
            }
        }

    }

    public void displayCourses(ArrayList<Course> courses) {
        if (courses.size() >= 0) {
            coursesTableModel.setRowCount(0);
            for (Course c : courses) {
                Object row[] = new Object[10];
                row[0] = c.getCourseId();
                row[1] = c.getCourseName();
                row[2] = c.getFaculty().getName();
                row[3] = c.getFaculty().getRating();
                row[4] = c.getLanguage();
                row[5] = c.getTopic();
                row[6] = c.getFaculty().getLocation();
                row[7] = c.getPrice();
                row[8] = c.getReputationIndex();
                row[9] = c.getCredits();

                coursesTableModel.addRow(row);
            }
        }
    }
    
    public void displayJobs(ArrayList<Job> job)
    {
        if(job.size() >= 0) {
            jobsTableModel.setRowCount(0);
            for(Job j: job) {
//                if (j.getRecruiter().getId().equals(currentRecruiter.getId()))
                      System.out.println("display jobs StudentJFrame");
                      Object row[] = new Object[5];
                      row[0] = j.getJobPosition();
                      row[1] =   j.getCompanyName();  
                      row[2] = j.getJobDescription();                    
                      row[3] = j.getField();
                      row[4] = j.getSalary();
                
                
               jobsTableModel.addRow(row);
               System.out.println("end of display jobs StudentJFrame "+jobsTableModel);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel15 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        lblStudentId = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtStudentEmail = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblCourseTaken = new javax.swing.JLabel();
        jScrollPane30 = new javax.swing.JScrollPane();
        registeredCoursesTable = new javax.swing.JTable();
        btnRequestForTranscript = new javax.swing.JButton();
        btnViewTranscript = new javax.swing.JButton();
        txtCourseRating = new javax.swing.JTextField();
        btnCourseRating = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblSearchCourse = new javax.swing.JLabel();
        searchTypeCBox = new javax.swing.JComboBox<>();
        txtCourseSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane29 = new javax.swing.JScrollPane();
        courseSearchTable = new javax.swing.JTable();
        btnRegisterCourse = new javax.swing.JButton();
        btnRateFaculty = new javax.swing.JButton();
        txtRateFaculty = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        lblSearchJob = new javax.swing.JLabel();
        searchTypeCBox1 = new javax.swing.JComboBox<>();
        txtJobSearch = new javax.swing.JTextField();
        btnSearch1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jobsJTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel15.setBackground(new java.awt.Color(204, 204, 255));

        lblName.setText("Name");

        lblStudentId.setText("Student ID");

        lblEmail.setText("email");

        loginBtn.setText("back");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        lblCourseTaken.setText("Courses Taken:");

        registeredCoursesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Course ID", "Course name", "Professor name", "Credits", "Fees Paid"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane30.setViewportView(registeredCoursesTable);

        btnRequestForTranscript.setText("Request for transcript");
        btnRequestForTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestForTranscriptActionPerformed(evt);
            }
        });

        btnViewTranscript.setText("view transcript");
        btnViewTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTranscriptActionPerformed(evt);
            }
        });

        btnCourseRating.setText("Rate Course");
        btnCourseRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseRatingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCourseRating, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnCourseRating)
                .addGap(266, 266, 266))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCourseTaken)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRequestForTranscript)
                            .addComponent(btnViewTranscript, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(btnRequestForTranscript)
                        .addGap(38, 38, 38)
                        .addComponent(btnViewTranscript))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblCourseTaken)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCourseRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCourseRating))))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Courses taken", jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        lblSearchCourse.setText("Search Course By");

        searchTypeCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Faculty Name", "Topic", "Language", "Region" }));
        searchTypeCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTypeCBoxActionPerformed(evt);
            }
        });

        txtCourseSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseSearchActionPerformed(evt);
            }
        });

        btnSearch.setText("search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        courseSearchTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CourseId", "CourseName", "FacultyName", "Rating", "Language", "Topic", "Region", "Price", "Reputation Index", "Credits"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane29.setViewportView(courseSearchTable);

        btnRegisterCourse.setText("register");
        btnRegisterCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterCourseActionPerformed(evt);
            }
        });

        btnRateFaculty.setText("Rate Faculty");
        btnRateFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRateFacultyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblSearchCourse)
                                .addGap(33, 33, 33)
                                .addComponent(searchTypeCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(txtCourseSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(btnSearch))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnRegisterCourse)
                        .addGap(259, 259, 259)
                        .addComponent(btnRateFaculty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRateFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchCourse)
                    .addComponent(searchTypeCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCourseSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterCourse)
                    .addComponent(btnRateFaculty)
                    .addComponent(txtRateFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("Search for courses", jPanel2);

        lblSearchJob.setText("Search Job By");

        searchTypeCBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Job Position", "Field" }));
        searchTypeCBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTypeCBox1ActionPerformed(evt);
            }
        });

        txtJobSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJobSearchActionPerformed(evt);
            }
        });

        btnSearch1.setText("search");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        jobsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Job Position", "Company Name", "Job Description ", "Field", "Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jobsJTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(572, Short.MAX_VALUE)
                .addComponent(btnSearch1)
                .addGap(123, 123, 123))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(120, 120, 120)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(lblSearchJob)
                            .addGap(60, 60, 60)
                            .addComponent(searchTypeCBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(txtJobSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(120, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnSearch1)
                .addContainerGap(283, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSearchJob)
                        .addComponent(searchTypeCBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtJobSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(97, 97, 97)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(48, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Job Details", jPanel3);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(lblStudentId)
                        .addGap(18, 18, 18)
                        .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(lblEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtStudentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(42, 42, 42)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginBtn)
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentId)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtStudentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(318, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel15, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTranscriptActionPerformed
        // TODO add your handling code here:
        String studentId = userAccount.getPersonId();
        Student currentStudent = this.model.getStudentDirectory().findStudent(studentId);
        if (this.model.getTranscriptRequests().isTranscriptApproved(currentStudent)) {
            TranscriptJFrame saf = new TranscriptJFrame(this.model, this.userAccount);
            saf.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "No approved transcripts found for this student");
        }
    }//GEN-LAST:event_btnViewTranscriptActionPerformed


    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:

        String selectedSearchType = searchTypeCBox.getSelectedItem().toString();
        String searchString = txtCourseSearch.getText();
        ArrayList<Course> courses;

        switch (selectedSearchType.toLowerCase()) {
            //prof name
            case "faculty name":
                courses = this.model.getCourseDirectory().findCoursesByFacultyName(searchString);
                displayCourses(courses);
                break;
            //region
            case "region":
                courses = this.model.getCourseDirectory().findCoursesByRegion(searchString);
                displayCourses(courses);
                break;
            //topic
            case "topic":
                courses = this.model.getCourseDirectory().findCoursesByTopic(searchString);
                displayCourses(courses);
                break;
            //language
            case "language":
                courses = this.model.getCourseDirectory().findCoursesByLanguage(searchString);
                displayCourses(courses);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainJFrame(model, userAccount);

    }//GEN-LAST:event_loginBtnActionPerformed

    private void btnRegisterCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterCourseActionPerformed
        String studentId = userAccount.getPersonId();
        Student currentStudent = this.model.getStudentDirectory().findStudent(studentId);
        int selectedRowIndex = courseSearchTable.getSelectedRow();
        String courseId = courseSearchTable.getValueAt(selectedRowIndex, 0).toString();

        if (currentStudent.getRegisteredCourses().findCourse(courseId) != null) {
            JOptionPane.showMessageDialog(null, "You are already registered for this course");
        } else {
            Course course = this.model.getCourseDirectory().findCourse(courseId);

            float currentRev = course.getFaculty().getTotalRevenue();
            course.getFaculty().setTotalRevenue(currentRev + course.getPrice());

            CourseDirectory currentCourses = currentStudent.getRegisteredCourses();
            currentCourses.AddCourse(course);

            currentStudent.setRegisteredCourses(currentCourses);
        }

        displayRegisteredCourses();
    }//GEN-LAST:event_btnRegisterCourseActionPerformed

    private void btnRequestForTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestForTranscriptActionPerformed
        String studentId = userAccount.getPersonId();
        Student currentStudent = this.model.getStudentDirectory().findStudent(studentId);
        TranscriptApplication transcriptApplication = this.model.getTranscriptRequests().createTranscript(currentStudent);
    }//GEN-LAST:event_btnRequestForTranscriptActionPerformed

    private void btnRateFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRateFacultyActionPerformed
        String studentId = userAccount.getPersonId();
        Student currentStudent = this.model.getStudentDirectory().findStudent(studentId);
        int selectedRowIndex = registeredCoursesTable.getSelectedRow();
        String courseId = registeredCoursesTable.getValueAt(selectedRowIndex, 0).toString();

        Float newRating = Float.valueOf(txtRateFaculty.getText());

        Course course = this.model.getCourseDirectory().findCourse(courseId);
        Faculty faculty = course.getFaculty();
        Float currentRating = faculty.getRating();

        if (currentRating == 0.0) {
            faculty.setRating(newRating);
        } else {
            faculty.setRating((currentRating + newRating) / 2);
        }

        displayRegisteredCourses();
    }//GEN-LAST:event_btnRateFacultyActionPerformed

    private void btnCourseRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseRatingActionPerformed
        String studentId = userAccount.getPersonId();
        Student currentStudent = this.model.getStudentDirectory().findStudent(studentId);
        int selectedRowIndex = registeredCoursesTable.getSelectedRow();
        String courseId = registeredCoursesTable.getValueAt(selectedRowIndex, 0).toString();

        Float newRating = Float.valueOf(txtCourseRating.getText());

        Course course = this.model.getCourseDirectory().findCourse(courseId);
        Float currentRating = course.getReputationIndex();

        if (currentRating == 0.0) {
            course.setReputationIndex(newRating);
        } else {
            course.setReputationIndex((currentRating + newRating) / 2);
        }

        displayRegisteredCourses();
    }//GEN-LAST:event_btnCourseRatingActionPerformed

    private void searchTypeCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTypeCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTypeCBoxActionPerformed

    private void txtCourseSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseSearchActionPerformed

    private void searchTypeCBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTypeCBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTypeCBox1ActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        // TODO add your handling code here:
        System.out.println("enter btnSearch1ActionPerformed");
        String dropDownList = searchTypeCBox1.getSelectedItem().toString();
        System.out.println("dropDownList "+dropDownList);
        String jobSearchString = txtJobSearch.getText();
        System.out.println("dropDownList "+jobSearchString);
        ArrayList<Job> jobs;

        switch (dropDownList) {
            //job Position
            case "Job Position":
                System.out.println("jobPosition");
                jobs = this.model.getJobDirectory().findJobByJobPosition(jobSearchString);
                displayAvailableJobs(jobs);
                break;
            //d=field
            case "Field":
                System.out.println("Field");
                jobs = this.model.getJobDirectory().findJobsByField(jobSearchString);
                displayAvailableJobs(jobs);
                break;

            default:
                break;
        }
    }//GEN-LAST:event_btnSearch1ActionPerformed

    private void txtJobSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJobSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJobSearchActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new StudentJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCourseRating;
    private javax.swing.JButton btnRateFaculty;
    private javax.swing.JButton btnRegisterCourse;
    private javax.swing.JButton btnRequestForTranscript;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnViewTranscript;
    private javax.swing.JTable courseSearchTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jobsJTable;
    private javax.swing.JLabel lblCourseTaken;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSearchCourse;
    private javax.swing.JLabel lblSearchJob;
    private javax.swing.JLabel lblStudentId;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTable registeredCoursesTable;
    private javax.swing.JComboBox<String> searchTypeCBox;
    private javax.swing.JComboBox<String> searchTypeCBox1;
    private javax.swing.JTextField txtCourseRating;
    private javax.swing.JTextField txtCourseSearch;
    private javax.swing.JTextField txtJobSearch;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRateFaculty;
    private javax.swing.JTextField txtStudentEmail;
    private javax.swing.JTextField txtStudentId;
    // End of variables declaration//GEN-END:variables

//    private void displayJobs(ArrayList<Job> jobs) {
//        
//    }
}
