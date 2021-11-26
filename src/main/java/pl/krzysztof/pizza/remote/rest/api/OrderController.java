package pl.krzysztof.pizza.remote.rest.api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.krzysztof.pizza.domain.model.OrderStatusType;
import pl.krzysztof.pizza.remote.rest.dto.request.AddOrderDto;
import pl.krzysztof.pizza.remote.rest.dto.response.OrderDto;
import pl.krzysztof.remote.rest.dto.response.OrderCollectionDto;
import pl.krzysztof.remote.rest.dto.request.UpdateOrderDto;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping( value = "/api/v1/orders", produces = APPLICATION_JSON_VALUE)
@RestController

public class OrderController {

    @PostMapping
    public ResponseEntity<Object> addOrder (@RequestBody AddOrderDto addOrderDto){

        return ResponseEntity.ok(null);
    }

    @GetMapping("/status/{token}")
    public ResponseEntity<Object> getStatus(@PathVariable("token") String token){
        return ResponseEntity.ok(null);
    }

    @GetMapping
    public ResponseEntity<OrderCollectionDto> getOrders(@RequestParam("status") OrderStatusType orderStatusType,
                                                        @RequestHeader("Access-Token") String token){
        return ResponseEntity.ok(null);
    }
    
    @DeleteMapping("/{order-id}")
    public ResponseEntity<Void> deleteOrder(@RequestHeader("Access-Token") String token,
                                            @PathVariable("order-id") Integer orderId){

        return ResponseEntity.ok().build();
    }

    @PutMapping("/{order-id}")
    public ResponseEntity<OrderDto> updateOrder(@PathVariable("order-id") Integer orderId,
                                                @RequestHeader("Access-Token") String token,
                                                @RequestBody UpdateOrderDto updateOrderDto){
        return ResponseEntity.ok(null);
    }

}
