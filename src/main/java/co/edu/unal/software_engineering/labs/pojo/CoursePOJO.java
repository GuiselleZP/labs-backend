package co.edu.unal.software_engineering.labs.pojo;

public class CoursePOJO{

    private String courseName;
    private Integer durationHours;

    public String getCourseName( ){
        return courseName;
    }

    public void setCourseName( String courseName ){
        if(courseName.length() > 1){
            this.courseName = "courseTest";
        }
    }

    public Integer getDurationHours( ){
        return durationHours;
    }

    public void setDurationHours( Integer durationHours ){
        this.durationHours = durationHours;
    }
}