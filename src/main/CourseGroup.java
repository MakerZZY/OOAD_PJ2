package main;

import java.util.ArrayList;

public class CourseGroup {
    ArrayList<Course> basicCompulsory;
    ArrayList<Course> majorCompulsory;
    ArrayList<Course> majorElective;
    ArrayList<ArrayList<Course>> module;

    // 任意选修需要达到的学分数
    int electiveCredits;

    // 第n个模块课需要达到的门数
    ArrayList<Integer> moduleCount;
}
