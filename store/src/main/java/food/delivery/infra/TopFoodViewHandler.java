package food.delivery.infra;

import food.delivery.domain.*;
import food.delivery.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class TopFoodViewHandler {


    @Autowired
    private TopFoodRepository topFoodRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderPlaced_then_CREATE_1 (@Payload OrderPlaced orderPlaced) {
        try {

            if (!orderPlaced.validate()) return;

            // view 객체 생성
            TopFood topFood = new TopFood();
            // view 객체에 이벤트의 Value 를 set 함
            topFood.setFoodId(orderPlaced.getFoodId());
            topFood.setOrderCount(0);
            // view 레파지 토리에 save
            topFoodRepository.save(topFood);

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenOrderPlaced_then_UPDATE_1(@Payload OrderPlaced orderPlaced) {
        try {
            if (!orderPlaced.validate()) return;
                // view 객체 조회

                List<TopFood> topFoodList = topFoodRepository.findByFoodId(orderPlaced.getFoodId());
                for(TopFood topFood : topFoodList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    topFood.setOrderCount(topFood.getOrderCount() + 1);
                // view 레파지 토리에 save
                topFoodRepository.save(topFood);
                }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenReviewWrite_then_UPDATE_2(@Payload ReviewWrite reviewWrite) {
        try {
            if (!reviewWrite.validate()) return;
                // view 객체 조회
            Optional<TopFood> topFoodOptional = topFoodRepository.findById(reviewWrite.getOrderId());

            if( topFoodOptional.isPresent()) {
                 TopFood topFood = topFoodOptional.get();
            // view 객체에 이벤트의 eventDirectValue 를 set 함
                topFood.setId("작성됨");    
                // view 레파지 토리에 save
                 topFoodRepository.save(topFood);
                }


        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

