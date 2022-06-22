package HospitalManagement;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {
    Doctor doctor;


    @BeforeEach
    void setUp() {
        doctor = new Doctor("Odogwu","Agu","Male","Pediatrician");

    }

    @Test
    public void testForDocFirstName() {
        assertEquals("Odogwu",doctor.getFirstName());
    }
    @Test
    public void testForDocLastName() {
        assertEquals("Agu",doctor.getLastName());
    }
    @Test
    public void testForDocGender() {
        assertEquals("Male",doctor.getGender());
    }
    @Test
    public void testForDocSpecialty() {
        assertEquals("Pediatrician",doctor.getSpecialty());
    }
}