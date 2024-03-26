package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.lang.model.type.UnionType;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.zip.CheckedOutputStream;

@Data
public class UniversityService {

    public static double calcAverageCourseGrade(List<Course> courses) {
        return courses.stream()
                .flatMap(course -> course.getStudent().stream())
                .mapToDouble(Student::getGrade)
                .sum();
    }

    public double calcAverageUniversityGrade(University university) {
        List<Course> uniCourses = university.getCourses();
        return calcAverageCourseGrade(uniCourses);
    }
}
