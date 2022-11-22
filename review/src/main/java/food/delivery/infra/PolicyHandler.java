package food.delivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import food.delivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import food.delivery.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired ReviewRepository reviewRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Delivered'")
    public void wheneverDelivered_WriteAReview(@Payload Delivered delivered){

        Delivered event = delivered;
        System.out.println("\n\n##### listener WriteAReview : " + delivered + "\n\n");


        

        // Sample Logic //
        Review.writeAReview(event);
        

        

    }

}


