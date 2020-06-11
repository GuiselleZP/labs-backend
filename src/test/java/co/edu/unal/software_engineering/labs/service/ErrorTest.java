package co.edu.unal.software_engineering.labs.service;

import co.edu.unal.software_engineering.labs.model.Course;
import co.edu.unal.software_engineering.labs.pojo.CoursePOJO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith( MockitoJUnitRunner.class )
public class ErrorTest{

    @InjectMocks
    private CourseService courseService;


    public ErrorTest( ){ }


    @Test
    public void mapperCourseEntityTest( ){
        String courseName = "********* Sad course **********";
        Integer durationHours = 3;

        CoursePOJO pojo = new CoursePOJO( );
        pojo.setCourseName( courseName );
        pojo.setDurationHours( durationHours);
        Course course = courseService.mapperCourseEntity( pojo );

        assertNotNull( course );
        assertNotNull( course.getCourseName( ) );
        assertNotNull( course.getDurationHours( ) );

        assertEquals( durationHours, course.getCourseName( ) );
        assertEquals( course.getCourseName( ), pojo.getCourseName( ) );
        assertEquals( course.getDurationHours( ), pojo.getDurationHours( ) );

    }

}