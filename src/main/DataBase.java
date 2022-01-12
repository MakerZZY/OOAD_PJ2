package main;

import java.util.ArrayList;

public class DataBase {
    static DataBase dataBase = null;

    ArrayList<Student> students;
    ArrayList<Plan> plans;
    ArrayList<Course> courses;
    ArrayList<LearnRecord> learnRecords;

    private DataBase() {
    }

    static DataBase getDataBase() {
        if (dataBase == null)
            dataBase = new DataBase();
        return dataBase;
    }
}
