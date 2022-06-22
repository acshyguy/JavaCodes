package HospitalManagement;

public class Doctor {

    private String firstName;
    private String lastName;
    private String gender;
    private String doctorSpecialty;

    public Doctor(String firstName, String lastName, String gender, String doctorSpecialty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.doctorSpecialty = doctorSpecialty;
    }
    public String getFirstName(){
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public String getSpecialty() {
        return doctorSpecialty;
    }
}
