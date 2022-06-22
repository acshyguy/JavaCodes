package SchoolManagementSystem;

import java.util.ArrayList;

public class Student2 {
    private String firstName;
    private String lastName;
    private int studentID;
    private String gender;

    private int uniqueID = 1;

    private ArrayList<Course2> coursesInCourseClass = new ArrayList<>();

    public Student2(String firstName, String lastName, int studentID, String gender, int uniqueID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = uniqueID++;
        this.gender = gender;
//        this.coursesInCourseClass = new ArrayList<>();

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentGender() {
        return gender;
    }


    public void selectCourses(Course2 newCourse) {
        coursesInCourseClass.add(newCourse);
    }

    public ArrayList<Course2> getArrayList() {
        return coursesInCourseClass;
    }

    public void viewCourses() {
        
    }

//    public void withdrawCourses(Course2 withdrawnCourse) {
//        coursesInCourseClass
//    }
}
