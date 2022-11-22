package food.delivery.domain;

import food.delivery.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="StoredOrder_table")
@Data

public class StoredOrder  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private Long orderdId;
    
    
    
    @ElementCollection
    
    private List<String> options;
    
    
    
    
    
    private String cusomerId;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String storeAddress;

    @PostPersist
    public void onPostPersist(){
    }

    public static StoredOrderRepository repository(){
        StoredOrderRepository storedOrderRepository = StoreApplication.applicationContext.getBean(StoredOrderRepository.class);
        return storedOrderRepository;
    }



    public void accept(){
        OrderAccepted orderAccepted = new OrderAccepted(this);
        orderAccepted.publishAfterCommit();

    }
    public void startCook(){
        CookStarted cookStarted = new CookStarted(this);
        cookStarted.publishAfterCommit();

    }
    public void finishCook(){
        CookFinished cookFinished = new CookFinished(this);
        cookFinished.publishAfterCommit();

    }
    public void reject(){
        OrderRejected orderRejected = new OrderRejected(this);
        orderRejected.publishAfterCommit();

    }

    public static void addToOrderList(Paid paid){

        /** Example 1:  new item 
        StoredOrder storedOrder = new StoredOrder();
        repository().save(storedOrder);

        */

        /** Example 2:  finding and process
        
        repository().findById(paid.get???()).ifPresent(storedOrder->{
            
            storedOrder // do something
            repository().save(storedOrder);


         });
        */

        
    }
    public static void cancelOrder(OrderCanceled orderCanceled){

        /** Example 1:  new item 
        StoredOrder storedOrder = new StoredOrder();
        repository().save(storedOrder);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderCanceled.get???()).ifPresent(storedOrder->{
            
            storedOrder // do something
            repository().save(storedOrder);


         });
        */

        
    }


}
