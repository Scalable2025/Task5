package com.example.UserMQ.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserMQ.rabbitmq.RabbitMQConfig;
import com.example.UserMQ.rabbitmq.RabbitMQProducer;

@Service
public class UserService {

    @Autowired
    private RabbitMQProducer rabbitMQProducer;

    public void sendMessageToCart(String message) {
        // Logic to send message to CartMQ
        // For example, you can use RabbitMQProducer to send the message to CartMQ
        
    }

    @RabbitListener(queues = RabbitMQConfig.USER_QUEUE)
    public void receiveMessageFromCart(String message) {
        System.out.println("Received message from Cart: " + message);
        
    }

}
