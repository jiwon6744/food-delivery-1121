package food.delivery.domain;

import food.delivery.infra.AbstractEvent;
import lombok.Data;
import java.util.*;

@Data
public class ReviewWrite extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String review;
    private Integer point;
    private Date date;
}
