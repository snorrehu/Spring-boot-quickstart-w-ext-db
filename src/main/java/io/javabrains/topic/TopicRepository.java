package io.javabrains.topic;


import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {

    //In a typical class you would do...:
    // getAllTopics()
    // getTopic(String id)
    // updateTopic(Topic t)
    // deleteTopic(String id)
    // The above is unnecessary! Make interface!

}
