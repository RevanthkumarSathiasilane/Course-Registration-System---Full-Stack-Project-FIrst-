package com.example.Course.Registration.System.respository;

import com.example.Course.Registration.System.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {

}
