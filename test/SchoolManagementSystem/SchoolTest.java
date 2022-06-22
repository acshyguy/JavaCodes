package SchoolManagementSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    School school;

    @BeforeEach
    void setUp() {
        school = new School("Elite");
    }

    @Test
    void testCourseCanBeAdded() {
        school.createCourse("SexEd", "SX101", false);

    }
}