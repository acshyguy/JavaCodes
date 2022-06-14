package Chapter3Ex;

public class Ex317HealthRecords {
    private String firstName;
    private String lastName;
    private String gender;
    private String monthOfBirth;
    private int dayOfBirth;
    private int yearOfBirth;
    private double height;
    private double weight;

    public Ex317HealthRecords(String fName, String lName, String gender, String mBirth,
                              int dBirth, int yBirth, double height, double weight) {
        firstName = fName;
        lastName = lName;
        this.gender = gender;
        monthOfBirth = mBirth;
        dayOfBirth = dBirth;
        yearOfBirth =yBirth;
        this.height = height;
        this.weight = weight;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public int age(){
        int age = 2022 - yearOfBirth;
        return age;
    }

    public int maximumHeartRate() {
        int maximumHeartRate = 220 - age();
        return maximumHeartRate;
    }

    public double lowerTargetHeartRate() {
        double lowerTargetHeartRate = 0.5 * maximumHeartRate();
        return lowerTargetHeartRate;
    }


    public double higherTargetHeartRate() {
        double higherTargetHeartRate = 0.85 * maximumHeartRate();
        return higherTargetHeartRate;

    }

    public double bodyMassIndex() {
        double bmi = weight / height * height;
        return bmi;
    }


}

