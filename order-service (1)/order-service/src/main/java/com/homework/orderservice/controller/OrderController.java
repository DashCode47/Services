package com.homework.orderservice.controller;

import com.homework.orderservice.common.Payment;
import com.homework.orderservice.common.TransactionRequest;
import com.homework.orderservice.common.TransactionResponse;
import com.homework.orderservice.entity.Order;
import com.homework.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request){

        return service.saveOrder(request);
    }
}
