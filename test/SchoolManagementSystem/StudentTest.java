package SchoolManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StudentTest {

    Student studentOne;
    Course course;

    @BeforeEach
    void setUp() {
        course = new Course("Physics", "PHY101", true);
        studentOne = new Student("Yul", "Pete", "1001", course );
    }

    @Test
    public void testThatCourseIsAdded(){
        Course courseTwo = new Course("Chemistry", "CHEM101", true);
        studentOne.addNewCourse(course);
        studentOne.addNewCourse(courseTwo);
        studentOne.addNewCourse(new Course("Biology", "BIO101", true));
        studentOne.addNewCourse(new Course("Geology", "GEO101", true));
        assertEquals("Chemistry", studentOne.getCourseName("Chemistry"));
        assertEquals("Biology",studentOne.getListOfCourses().get(2).getCourseName());
        assertEquals(4,studentOne.getListOfCourses().size());
    }




//    @Test
//    public void courseCanBeSelected(){
//        studentOne.selectCourse();
//        assertEquals();
//    }

}