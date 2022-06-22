package SchoolManagementSystem;

public class Course2 {
    private String courseName;
    private String courseId;
    private boolean courseStatus;


    public Course2(String courseName, String courseId, boolean courseStatus) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseStatus = courseStatus;
    }

    public String getCourseName(String courseName) {
        if (this.courseName == courseName) {
            return courseName;
        }
        return "not found";
    }
    public String getCourseId() {
        return courseId;
    }

    public boolean getCourseStatus() {
        return courseStatus;
    }


    public void deactivateCourseName(String courseName) {
        if (getCourseName(courseName) == this.courseName){
            courseStatus = false;
        }
    }
}
