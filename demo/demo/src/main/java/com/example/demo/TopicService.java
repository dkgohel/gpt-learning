package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

//    private List<Topic> topics = new ArrayList<>( Arrays.asList(
//            new Topic("Spring","Spring name","Description"),
//            new Topic("Java","Java name","Java Description"),
//            new Topic("Python","Python name","Python Description")
//    ));

    public List<Topic> getAllTopics()
    {
        //return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Optional<Topic> getTopic(String id)
    {
        return topicRepository.findById(id);
        //return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic)
    {
        topicRepository.save(topic);
        //topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
//        for (int i=0;i<topics.size();i++){
//            Topic t = topics.get(i);
//            if(t.getId().equals(id)){
//                topics.set(i, topic);
//                return;
//            }
//        }
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.deleteById(id);
        //topics.removeIf(t -> t.getId().equals(id));
    }
}
