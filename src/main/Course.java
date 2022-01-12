package main;

enum CourseType {
    compulsory,
    module,
    majorBasic,
    majorOptional,
    direction
}

public class Course {
    String name;
    int credit;
    CourseType type;

    public Course(String name, int credit, CourseType type) {
        this.name = name;
        this.credit = credit;
        this.type = type;
    }
}
