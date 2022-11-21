package food.delivery.domain;

import food.delivery.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="storedOrders", path="storedOrders")
public interface StoredOrderRepository extends PagingAndSortingRepository<StoredOrder, Long>{

}
