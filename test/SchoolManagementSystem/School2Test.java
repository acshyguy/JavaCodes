package SchoolManagementSystem;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class School2Test {

    School2 school;

    Student2 studentDetails;

    @BeforeEach
    void setUp() {
        school = new School2("Semicolon","Sabo Yaba");
        studentDetails = new Student2("Odogwu","Agu",
                01,"Male",001);

    }
}