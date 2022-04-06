package lecture19MoreInheritance;

import java.util.ArrayList;
import java.util.List;

public class USFFaculty extends USFEmployee {
    private String position; // Assistant, Associate or Full
    private List<String> courses; // courses that this professor is usually teaching

    public USFFaculty(String name, int id, int officeNumber, String position) {
        super(name, id, officeNumber);
        this.position = position;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    // Overloading

    @Override
    public void print() {
        super.print();
        System.out.println(position);
        System.out.println("Courses: ");
        for (String course: courses)
            System.out.println(course);


    }




}
