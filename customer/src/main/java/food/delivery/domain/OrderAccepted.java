package food.delivery.domain;

import food.delivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class OrderAccepted extends AbstractEvent {

    private Long id;
    private String foodId;
    private Long orderdId;
    private List<String> options;
    private String cusomerId;
    private String status;
    private String storeAddress;
}
