package SchoolManagementSystem;

import java.util.ArrayList;

public class Student {
    private String studentID;
    private String lastName;
    private String firstName;
    private ArrayList<Course> listOfCourses;

    public Student(String firstName, String lastName, String studentID, Course course){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        listOfCourses = new ArrayList<>();
    }

    public ArrayList<Course> getListOfCourses() {
        return listOfCourses;
    }

    public void addNewCourse(Course newCourse) {
        this.listOfCourses.add(newCourse);
    }

    public String getCourseName(String courseName) {
        for (int i = 0; i < listOfCourses.size(); i++) {
            if (listOfCourses.get(i).getCourseName(courseName) == courseName) {
                return courseName;
            }
        }
        return courseName;
    }

    public String getStudentID(){
        return studentID;
    }

    public String getStudentName(){
        return firstName + " " + lastName;
    }


    public String toString(){
        String list = "";
        for (int i = 0; i < listOfCourses.size(); i++) {
            list+= listOfCourses.get(i).toString();
        }
        return list;
    }
}
