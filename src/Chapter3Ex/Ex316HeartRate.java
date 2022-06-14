package Chapter3Ex;
public class Ex316HeartRate {
    private String firstName;
    private String lastName;
    private String birthMonth;
    private int birthDay;
    private int birthYear;

    public Ex316HeartRate(String fName, String lName, String bMonth, int bDay, int bYear){
        firstName = fName;
        lastName = lName;
        birthMonth = bMonth;
        birthDay = bDay;
        birthYear = bYear;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }


    public int age() {
        int age = 2022 - birthYear;
        return age;
    }


    public int maximumHeartRate() {
        int maximumRate = 220 - age();
        return maximumRate;
    }

    public double lowerTargetHeartRate() {
        double lowerTargetRate = 0.5 * maximumHeartRate();
        return lowerTargetRate;
    }

    public double higherTargetHeartRate() {
        double higherTargetRate = 0.85 * maximumHeartRate();
        return higherTargetRate;

    }
}
