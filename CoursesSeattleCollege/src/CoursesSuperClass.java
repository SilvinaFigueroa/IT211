

public class CoursesSuperClass {

    private String courseNum;
    private String title;

    // Constructor 

    CoursesSuperClass(){

    }

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public void printCourseInfo(String courseNum, String title){
        courseNum = getCourseNum();
        title = getTitle();

      System.out.println("Course number: " + courseNum + "Course Title: " + title);
        
    }
    

}

