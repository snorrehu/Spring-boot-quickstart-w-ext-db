package io.javabrains.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Stereotype annotation @Service
@Service
public class TopicService {

    //When spring creates an instance of a topicservice, it is going to inject an instance of
    //a topicrepository to it:
    @Autowired
    private TopicRepository topicRepository;

    //Create
    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    //Read all
    public List<Topic> getAllTopics(){
        //return topics;
        //The following does this: Connect to db,queery for all the topics, convert each of the rows
        //onto topic instances and get it back!!
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    //Read one
    public Topic getTopic(String id){
        //return topics.stream().filter(t -> t .getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).get();
    }


    //Update
    public void updateTopic(String id, Topic topic) {
        topicRepository.save(topic);
    }

    //Delete
    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
    }
}
