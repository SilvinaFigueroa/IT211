

public class OfferedCourseSubClass extends CoursesSuperClass{

    private String instructorName;
    private String location;
    private String classTime;

	public String getInstructorName() {
		return this.instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getClassTime() {
		return this.classTime;
	}

	public void setClassTime(String classTime) {
		this.classTime = classTime;
	}



    public void printCourseInfo(String courseNum, String title, String instructorName, String location, String classTime){
        courseNum = getCourseNum();
		title = getTitle();
		instructorName = getInstructorName();
        location = getLocation();
        classTime = getClassTime();


      System.out.println("\n Course number: " + courseNum + 
                         "\n Course Title: " + title + 
                         "\n Instructor: " + instructorName + 
                         "\n Location: " + location +
                         "\n Class time: " + classTime);
        
    }


}

