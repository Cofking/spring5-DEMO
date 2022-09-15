package com.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {

    //1.数组类型属性
    private String[] courses;
    //2.list 集合类型属性
    private List<String> list;
    //3.map 集合类型属性
    private Map<String, String> map;
    //4.set 集合类型属性
    private Set<String> set;

    private List<course> courseList;

    public void setCourseList(List<course> courseList) {
        this.courseList = courseList;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }


    public void setList(List<String> list) {
        this.list = list;
    }


    public void setMap(Map<String, String> map) {
        this.map = map;
    }


    @Override
    public String toString() {
        return "Stu{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", courseList=" + courseList +
                '}';
    }
}
