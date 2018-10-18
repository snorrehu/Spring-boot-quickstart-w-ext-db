package io.javabrains.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//Stereotype annotation @Service
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    //Create
    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    //Read all
    public List<Course> getAllCourses(String id){
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(id).forEach(courses::add);
        return courses;
    }

    //Read one
    public Course getCourse(String id){
        return courseRepository.findById(id).get();
    }

    //Update
    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    //Delete
    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
