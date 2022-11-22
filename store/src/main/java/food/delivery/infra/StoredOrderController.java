package food.delivery.infra;
import food.delivery.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

@RestController
// @RequestMapping(value="/storedOrders")
@Transactional
public class StoredOrderController {
    @Autowired
    StoredOrderRepository storedOrderRepository;



    @RequestMapping(value = "storedOrders/{id}/accept",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public StoredOrder accept(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /storedOrder/accept  called #####");
            Optional<StoredOrder> optionalStoredOrder = storedOrderRepository.findById(id);
            
            optionalStoredOrder.orElseThrow(()-> new Exception("No Entity Found"));
            StoredOrder storedOrder = optionalStoredOrder.get();
            storedOrder.accept();
            
            storedOrderRepository.save(storedOrder);
            return storedOrder;
            
    }
    



    @RequestMapping(value = "storedOrders/{id}/startcook",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public StoredOrder startCook(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /storedOrder/startCook  called #####");
            Optional<StoredOrder> optionalStoredOrder = storedOrderRepository.findById(id);
            
            optionalStoredOrder.orElseThrow(()-> new Exception("No Entity Found"));
            StoredOrder storedOrder = optionalStoredOrder.get();
            storedOrder.startCook();
            
            storedOrderRepository.save(storedOrder);
            return storedOrder;
            
    }
    



    @RequestMapping(value = "storedOrders/{id}/finishcook",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public StoredOrder finishCook(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /storedOrder/finishCook  called #####");
            Optional<StoredOrder> optionalStoredOrder = storedOrderRepository.findById(id);
            
            optionalStoredOrder.orElseThrow(()-> new Exception("No Entity Found"));
            StoredOrder storedOrder = optionalStoredOrder.get();
            storedOrder.finishCook();
            
            storedOrderRepository.save(storedOrder);
            return storedOrder;
            
    }
    



    @RequestMapping(value = "storedOrders/{id}/reject",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8")
    public StoredOrder reject(@PathVariable(value = "id") Long id, HttpServletRequest request, HttpServletResponse response) throws Exception {
            System.out.println("##### /storedOrder/reject  called #####");
            Optional<StoredOrder> optionalStoredOrder = storedOrderRepository.findById(id);
            
            optionalStoredOrder.orElseThrow(()-> new Exception("No Entity Found"));
            StoredOrder storedOrder = optionalStoredOrder.get();
            storedOrder.reject();
            
            storedOrderRepository.save(storedOrder);
            return storedOrder;
            
    }
    



}
