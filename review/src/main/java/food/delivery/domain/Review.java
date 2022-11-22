package food.delivery.domain;

import food.delivery.domain.ReviewWrite;
import food.delivery.domain.ReviewDelete;
import food.delivery.ReviewApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Review_table")
@Data

public class Review  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Long orderId;
    
    
    
    
    
    private String review;
    
    
    
    
    
    private Integer point;
    
    
    
    
    
    private Date date;

    @PostPersist
    public void onPostPersist(){


        ReviewWrite reviewWrite = new ReviewWrite(this);
        reviewWrite.publishAfterCommit();

    }
    @PostRemove
    public void onPostRemove(){


        ReviewDelete reviewDelete = new ReviewDelete(this);
        reviewDelete.publishAfterCommit();

    }
    @PreRemove
    public void onPreRemove(){
    }

    public static ReviewRepository repository(){
        ReviewRepository reviewRepository = ReviewApplication.applicationContext.getBean(ReviewRepository.class);
        return reviewRepository;
    }




    public static void writeAReview(Delivered delivered){

        /** Example 1:  new item 
        Review review = new Review();
        repository().save(review);

        */

        /** Example 2:  finding and process
        
        repository().findById(delivered.get???()).ifPresent(review->{
            
            review // do something
            repository().save(review);


         });
        */

        
    }


}
