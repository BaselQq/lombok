package org.example;


import lombok.Builder;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("ifqi", "Karl", "Strape Str. 9", 20);
        Student student2 = new Student("fqil", "John", "Merkerbrade Str. 9", 40);

        Map<String, Student> studentList = new HashMap<>();
        studentList.put(UUID.randomUUID().toString(), student1);
        studentList.put(UUID.randomUUID().toString(), student2);

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

        studentList.put(UUID.randomUUID().toString(), student3);

        Course course2 = Course.builder()
                .id(UUID.randomUUID().toString())
                .name("Sport Course")
                .teacher(teacher1)
                .build();

        System.out.println(course2);

        System.out.println("Changing course name using with");

        System.out.println(course2.withName("bla Course"));
    }
}