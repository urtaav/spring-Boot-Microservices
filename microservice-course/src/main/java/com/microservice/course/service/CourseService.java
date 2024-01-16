package com.microservice.course.service;

import com.microservice.course.entities.Course;
import com.microservice.course.httpResponse.StudentByCourseResponse;

import java.util.List;

public interface CourseService {
    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findStudentsByIdCourse(Long idCourse);
}
