package food.delivery.infra;
import food.delivery.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class StoredOrderHateoasProcessor implements RepresentationModelProcessor<EntityModel<StoredOrder>>  {

    @Override
    public EntityModel<StoredOrder> process(EntityModel<StoredOrder> model) {
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/accept").withRel("accept"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/startcook").withRel("startcook"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/finishcook").withRel("finishcook"));
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/reject").withRel("reject"));

        
        return model;
    }
    
}
