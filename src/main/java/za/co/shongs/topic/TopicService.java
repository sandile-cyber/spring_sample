package za.co.shongs.topic;

import org.jboss.logging.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    Logger logger  = Logger.getLogger(TopicService.class);

    private List<Topic> topics = new ArrayList<>(  Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Spring Framework", "Spring Framework Description"),
            new Topic("j", "Spring Framework", "Spring Framework Description")
    ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id) {
        return topics
                .stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
