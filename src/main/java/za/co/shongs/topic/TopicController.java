package za.co.shongs.topic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public  Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @PostMapping("/topics/")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }
}
