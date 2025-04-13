package com.example.CartMQ.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CartMQ.model.Cart;
import com.example.CartMQ.rabbitmq.RabbitMQConfig;
import com.example.CartMQ.rabbitmq.RabbitMQProducer;

@Service
public class CartService {
    @Autowired
    private RabbitMQProducer rabbitMQProducer;

    @RabbitListener(queues = RabbitMQConfig.CART_QUEUE)
    public void receiveMessage(String message) {
        System.out.println("Received message from Cart Queue: " + message);
        // Create New Cart
        // Send it to UserMQ
        
    }

}
