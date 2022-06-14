package SchoolManagementSystem;

import java.util.ArrayList;

public class School {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public School(String name) {
        this.name = name;
        students = new ArrayList<>();
        courses = new ArrayList<>();
    }

    void admitStudent(Student newStudent){
        students.add(newStudent);
    }

    public ArrayList<Student> getAllStudents(){
        return students;
    }

    void createCourse(String courseName, String courseID, boolean courseStatus){
        Course newCourse = new Course(courseName, courseID, courseStatus);
        courses.add(newCourse);
    }

    void deleteCourse(String courseName) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseName(courseName) == courseName) {
                courses.remove(i);
            }
        }
    }

    ArrayList<Course> getAllCourses() {
        return courses;
    }

    void deleteStudent(String studentID) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentID().equals(studentID)) {
                students.remove(i);
            }
        }
    }

}
