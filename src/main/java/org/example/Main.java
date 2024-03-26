package org.example;


import lombok.Builder;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("ifqi", "Karl", "Strape Str. 9", 20);
        Student student2 = new Student("fqil", "John", "Merkerbrade Str. 9", 40);

        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);

        Teacher teacher1 = new Teacher("vuiq", "Martin", "Mathe");

        Course course1 = new Course("fjixi", "Mathe Course", teacher1, studentList);
        System.out.println(course1);

        Student student3 = Student.builder()
                .id(UUID.randomUUID().toString())
                .name("Adam")
                .address("blaStr.")
                .grade(2.4)
                .build();

        System.out.println(student3);

        studentList.add(student3);

        Course course2 = Course.builder()
                .id(UUID.randomUUID().toString())
                .name("Sport Course")
                .teacher(teacher1)
                .student(studentList)
                .build();

        Course course3 = Course.builder()
                .id(UUID.randomUUID().toString())
                .name("bla Course")
                .teacher(teacher1)
                .student(studentList)
                .build();

        System.out.println(course2);

        System.out.println("Changing course name using with");

        System.out.println(course2.withName("Programming Course"));

        List<Course> courseList1 = new ArrayList<>();
        courseList1.add(course1);
        courseList1.add(course2);

        List<Course> courseList2 = new ArrayList<>();
        courseList2.add(course3);

        // Bonus
        University university1 = new University();
        university1.setId(UUID.randomUUID().toString());
        university1.setName("Cambridge University");
        university1.setCourses(courseList2);

        System.out.println(university1);

        UniversityService universityService = new UniversityService();
        System.out.println(courseList1);
        System.out.println(universityService.calcAverageCourseGrade(courseList1));

        System.out.println(universityService.calcAverageUniversityGrade(university1));
    }
}