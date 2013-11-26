/**
 * 
 */
package lab10;

/**<p>Represents a course taken at school and keeps track
 * of up to five students</p>
 * 
 * @author Vincent Law
 * @version 1.0
 *
 */
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Student>students;
    private Student shaco;
    private Student twitch;
    private Student karthus;
    private Student morgana;
    private Student annie;
    
    public Course(String name) {
        this.name = name;
        
        students = new ArrayList<Student>();
    }
    
    /**
     * <p>Adds a new student into the list. </p>
     */
    public void addStudent(Student student) 
    {
        students.add(student);
    }
    
    /**
     * <p>Enrolls the students into the course. </p>
     */
    public void enroll() {
        System.out.println("Course Name: " +name);
        System.out.println("Students: ");
        
        for (Student student : students) {
            System.out.println(""+student.getlastName()
                    +", "+student.getfirstName());
        }
    }
    
    /**
     * <p>Calculates the average of all the students. </p>
     */
    public float average()
    {
        float average = (shaco.average()+twitch.average()+karthus.average()
                +morgana.average()+annie.average())/5;
        return average;
    }
    
    /**
     * <p>Returns the value of the class average. </p>
     */
    public String toString()
    {
        String result;
		result = "The overall class average is: "+average;
        return result;
    }
}