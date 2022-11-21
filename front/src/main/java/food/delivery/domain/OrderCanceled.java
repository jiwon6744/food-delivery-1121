package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String foodId;
    private String customerId;

    public OrderCanceled(Oder aggregate){
        super(aggregate);
    }
    public OrderCanceled(){
        super();
    }
}
