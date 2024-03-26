package org.example;

import lombok.*;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {

    private String id;
    private String name;
    private Teacher teacher;
    private Map<String, Student> student;
}
