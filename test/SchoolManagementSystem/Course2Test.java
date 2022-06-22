package SchoolManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Course2Test {
    public Course2 courses;

    @BeforeEach
    void setUp() {
        courses = new Course2("English","Eng101",true);
    }

    @Test
    public void testThatCourseNameExist(){
        Course2 courseTwo = new Course2("Nigeria Constituency",
                "NGR101",false);
        assertEquals("English",courses.getCourseName("English"));
        assertFalse(courseTwo.getCourseStatus());

    }
    @Test
    public void testThatCourseIdExist() {
        assertEquals("Eng101",courses.getCourseId());

    }
    @Test
    public void testThatCourseCanBeActivated() {
        assertTrue(courses.getCourseStatus());
    }
    @Test
    public void testThatCourseCanBeDeactivated() {
        courses.deactivateCourseName("English");
        assertEquals(false,courses.getCourseStatus());
    }

}