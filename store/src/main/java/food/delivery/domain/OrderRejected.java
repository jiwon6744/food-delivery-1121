package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderRejected extends AbstractEvent {

    private Long id;

    public OrderRejected(StoredOrder aggregate){
        super(aggregate);
    }
    public OrderRejected(){
        super();
    }
}
