package food.delivery.domain;

import food.delivery.domain.*;
import food.delivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private String foodId;
    private Long orderdId;
    private List<String> options;
    private String cusomerId;
    private String status;
    private String storeAddress;

    public OrderAccepted(StoredOrder aggregate){
        super(aggregate);
    }
    public OrderAccepted(){
        super();
    }
}
