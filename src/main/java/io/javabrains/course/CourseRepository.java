package io.javabrains.course;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String> {

    //In a typical class you would do...:
    // getAllTopics()
    // getTopic(String id)
    // updateTopic(Course t)
    // deleteTopic(String id)
    // The above is unnecessary! Make interface!

    public List<Course> findByTopicId(String topicid);

}
