package lesson;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class StudentTest {

    @Test
    public void testCollegeStudent() {

        Student s = new CollegeStudent("bob");
        assertEquals(s.name(), "bob");
        assertFalse(s.isMinor());
    }   

    @Test
    public void testGradeSchoolStudent(){
        Student s = new GradeSchoolStudent("anne");
        assertEquals(s.name(), "anne");
        assertTrue(s.isMinor());
    }
}