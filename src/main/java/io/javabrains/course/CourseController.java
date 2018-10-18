package io.javabrains.course;

import io.javabrains.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Restcontroller: Whatever you return will be given as json-format
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        //create io.javabrains.course objects "on the fly":
        System.out.println("Courses called!");
        return courseService.getAllCourses(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicID}/courses")
    public void createCourse(@RequestBody Course course, @PathVariable String topicID){
        course.setTopic(new Topic(topicID,"",""));
        courseService.addCourse(course);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Course readCourse(@PathVariable String id){
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicID}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String id, @PathVariable String topicID){
        course.setTopic(new Topic(topicID,"",""));
        courseService.updateCourse(course);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{topicID}/courses/{id}")
    public void deleteCourse(@PathVariable String id){
        courseService.deleteCourse(id);
    }


}
