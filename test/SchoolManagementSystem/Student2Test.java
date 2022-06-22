package SchoolManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Student2Test {

    Student2 studentDetails;

    Course2 course2;


    @BeforeEach
    void setUp() {
        studentDetails = new Student2("Odogwu","Agu",01,"Male",001);

        course2 = new Course2("Maths","Math101",true);
    }
    @Test
    public void testForFirstName() {
        assertEquals("Odogwu",studentDetails.getFirstName());
    }

    @Test
    public void testForLastName() {
        assertEquals("Agu",studentDetails.getLastName());
    }

    @Test
    public void testForStudentID() {
        assertEquals(001,studentDetails.getStudentID());
    }
    @Test
    public void testForStudentGender() {
        assertEquals("Male",studentDetails.getStudentGender());
    }
    @Test
    public void testThatCourseCanBeSelected() {
        studentDetails.selectCourses(course2);
        assertNotNull(studentDetails.getArrayList());
    }
    @Test
    public void testThatStudentCanViewCourses() {
        Course2 course1 = new Course2("Maths","Math101",true);
        Course2 course3 = new Course2("Maths","Math101",true);
        Course2 course4 = new Course2("Maths","Math101",true);
        studentDetails.selectCourses(course2);
        studentDetails.selectCourses(course3);
studentDetails.selectCourses(course1);
studentDetails.selectCourses(course4);
        assertEquals(4, studentDetails.getArrayList().size());
//        assertNotNull(studentDetails);
    }
    @Test
    public void testThatStudentCanWithdrawCourse() {
//        studentDetails.withdrawCourses(course2);
    }




}