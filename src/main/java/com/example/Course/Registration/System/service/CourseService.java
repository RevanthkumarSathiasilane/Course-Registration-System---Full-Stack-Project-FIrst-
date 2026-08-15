package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.CourseRegistry;
import com.example.Course.Registration.System.respository.CourseRepo;
import com.example.Course.Registration.System.respository.CourseRegistryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;

    @Autowired
    CourseRegistryRepo courseRegistryRepo;

    public List<Course> getAllCourses() {
        return courseRepo.findAll();
    }
    public List<CourseRegistry> enrolledStudents(){
        return courseRegistryRepo.findAll();
    }
}
