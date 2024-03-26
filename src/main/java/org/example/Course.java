package org.example;

import lombok.*;

import java.util.List;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Value
public class Course {

    String id;
    @With String name;
    Teacher teacher;
    List<Student> student;
}
