package SchoolManagementSystem;

public class Course {

    private String courseName;
    private String courseID;
    private boolean courseStatus;


    public Course(String courseName, String courseID,boolean activation) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.courseStatus = activation;
    }

    public String getCourseName(String courseName) {
        if (this.courseName == courseName) {
            return courseName;
        }
        return "not found";
    }
    public String getCourseName(){
        return courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public boolean getCourseStatus() {
        return courseStatus;
    }

    public void deactivateCourseName(String courseName) {
        if (getCourseName(courseName) == this.courseName){
            courseStatus = false;
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseID='" + courseID + '\'' +
                ", courseStatus=" + courseStatus +
                '}';
    }
}
