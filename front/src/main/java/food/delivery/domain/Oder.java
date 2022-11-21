package food.delivery.domain;

import food.delivery.domain.OrderPlaced;
import food.delivery.domain.OrderCanceled;
import food.delivery.FrontApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Oder_table")
@Data

public class Oder  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String foodId;
    
    
    
    
    
    private String customerId;
    
    
    
    @ElementCollection
    
    private List<String> options;
    
    
    
    
    
    private String address;
    
    
    
    
    
    private String status;

    @PostPersist
    public void onPostPersist(){


        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

    }
    @PostRemove
    public void onPostRemove(){


        OrderCanceled orderCanceled = new OrderCanceled(this);
        orderCanceled.publishAfterCommit();

    }
    @PreRemove
    public void onPreRemove(){
    }

    public static OderRepository repository(){
        OderRepository oderRepository = FrontApplication.applicationContext.getBean(OderRepository.class);
        return oderRepository;
    }




    public static void pay(OrderPlaced orderPlaced){

        /** Example 1:  new item 
        Oder oder = new Oder();
        repository().save(oder);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(oder->{
            
            oder // do something
            repository().save(oder);


         });
        */

        
    }
    public static void cancel(OrderRejected orderRejected){

        /** Example 1:  new item 
        Oder oder = new Oder();
        repository().save(oder);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderRejected.get???()).ifPresent(oder->{
            
            oder // do something
            repository().save(oder);


         });
        */

        
    }
    public static void updateStatus(OrderAccepted orderAccepted){

        /** Example 1:  new item 
        Oder oder = new Oder();
        repository().save(oder);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderAccepted.get???()).ifPresent(oder->{
            
            oder // do something
            repository().save(oder);


         });
        */

        
    }
    public static void updateStatus(OrderRejected orderRejected){

        /** Example 1:  new item 
        Oder oder = new Oder();
        repository().save(oder);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderRejected.get???()).ifPresent(oder->{
            
            oder // do something
            repository().save(oder);


         });
        */

        
    }
    public static void updateStatus(CookStarted cookStarted){

        /** Example 1:  new item 
        Oder oder = new Oder();
        repository().save(oder);

        */

        /** Example 2:  finding and process
        
        repository().findById(cookStarted.get???()).ifPresent(oder->{
            
            oder // do something
            repository().save(oder);


         });
        */

        
    }


}
