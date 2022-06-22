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
        Course courseTwo = new Course("Nigeria Constituency",
                "NGR101", false);
        assertEquals("Theology",course.getCourseName("Theology"));
        assertFalse(courseTwo.getCourseStatus());
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