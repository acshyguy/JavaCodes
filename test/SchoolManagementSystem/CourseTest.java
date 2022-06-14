package SchoolManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    Course course;

    @BeforeEach
    void setUp() {
        course = new Course("Theology", "101",true);
    }

    @Test
    void testThatCourseNameIsSet(){
        assertEquals("Theology",course.getCourseName("Theology"));
    }

    @Test
    void testThatIDIsSet(){
        assertEquals("101",course.getCourseID());
    }

    @Test
    void courseCanBeActivated(){
        assertTrue(course.getCourseStatus());
    }

    @Test
    void courseCanBeDeactivated(){
        course.deactivateCourseName("Theology");
        assertEquals(false, course.getCourseStatus());
    }
}