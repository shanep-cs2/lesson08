package lesson;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new CollegeStudent("sam"));
        students.add(new CollegeStudent("jen"));
        students.add(new GradeSchoolStudent("bob"));
        students.add(new GradeSchoolStudent("anne"));

        for(Student s : students){
            System.out.println(s.name() + " " + s.getClass().getCanonicalName());
        }
        
    }
}
