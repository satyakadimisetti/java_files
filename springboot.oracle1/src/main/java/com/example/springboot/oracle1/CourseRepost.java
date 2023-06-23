package com.example.springboot.oracle1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CourseRepost extends JpaRepository<Course,Integer>{


}
