package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ReviewWrite extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String review;
    private Integer point;
    private Date date;

    public ReviewWrite(Review aggregate){
        super(aggregate);
    }
    public ReviewWrite(){
        super();
    }
}
