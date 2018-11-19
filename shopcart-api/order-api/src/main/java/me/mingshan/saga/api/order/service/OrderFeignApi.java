package me.mingshan.saga.api.order.service;

import me.mingshan.saga.api.order.model.dto.OrderDTO;
import me.mingshan.saga.api.order.service.hystrix.OrderFeignHystrix;
import me.mingshan.saga.common.base.model.ResultModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author mingshan
 */
@FeignClient(value = "order-service", fallback = OrderFeignHystrix.class)
public interface OrderFeignApi {

    /**
     * Gets order by id.
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/api/order/{id}")
    ResponseEntity<ResultModel> getById(@PathVariable("id") Long id);

    /**
     * Gets orders by user id.
     *
     * @param userId
     * @return
     */
    @GetMapping(value = "/api/order/getByUserId/{userId}")
    ResponseEntity<ResultModel> getByUserId(@PathVariable("userId") long userId);

    /**
     * Saves order
     *
     * @param orderDTO
     * @return
     */
    @PostMapping(value = "/api/order")
    ResponseEntity<ResultModel> save(OrderDTO orderDTO);

    /**
     *
     * @param orderDTO
     */
    @PutMapping(value = "/api/order")
    void update(OrderDTO orderDTO);

    /**
     *
     * @param id
     */
    @DeleteMapping(value = "/api/order/{id}")
    void delete(@PathVariable("id") String id);
}
