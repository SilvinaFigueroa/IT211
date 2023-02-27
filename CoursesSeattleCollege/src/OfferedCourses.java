


public class OfferedCourses extends OfferedCourseSubClass{
    public static void main(String[] args) {

    OfferedCourseSubClass fullCourse = new OfferedCourseSubClass();

    fullCourse.setCourseNum("IT111");
    fullCourse.setTitle(" Python Fundamentals");
    fullCourse.setInstructorName("Professor Webb");
    fullCourse.setClassTime("Tue and Thur 10.30 to 12.30");
    fullCourse.setLocation("Virtual");


    fullCourse.printCourseInfo(null, null, null, null, null);

    }
    
}
