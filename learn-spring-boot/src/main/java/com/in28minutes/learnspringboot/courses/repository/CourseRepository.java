package com.in28minutes.learnspringboot.courses.repository;

import com.in28minutes.learnspringboot.courses.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<Course, Long> {

    Optional<Course> findAllById(long id);

}
