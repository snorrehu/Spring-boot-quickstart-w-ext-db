package io.javabrains.course;

import io.javabrains.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
//Create a table called "Course"
public class Course {

    //Table "Course" will have an id column, a name column and a description column.
    @Id
    private String id;  //id will be primary key:

    private String name;
    private String description;

    //You can have many courses that have one topic:
    @ManyToOne
    private Topic topic;

    public Course() {

    }

    public Course(String id, String name, String description, String topicID) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicID,"","");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
