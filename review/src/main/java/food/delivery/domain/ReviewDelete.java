package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ReviewDelete extends AbstractEvent {

    private Long id;
    private Long orderId;

    public ReviewDelete(Review aggregate){
        super(aggregate);
    }
    public ReviewDelete(){
        super();
    }
}
