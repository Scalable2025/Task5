package com.example.CartMQ.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    
    public static final String USER_QUEUE = ""; // name should be user.queue_<Your ID>
    public static final String CART_QUEUE = ""; // name should be cart.queue_<Your ID>
    
    public static final String EXCHANGE_NAME = "shared.exchange";
    public static final String ROUTING_KEY_TO_CART = "route.to.cart";
    public static final String ROUTING_KEY_TO_USER = "route.to.user";

    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE_NAME);
    }

    @Bean
    public Queue userQueue() {
        return new Queue(USER_QUEUE);
    }

    @Bean
    public Queue cartQueue() {
        return new Queue(CART_QUEUE);
    }

    @Bean
    public Binding bindingUserQueue(Queue userQueue, TopicExchange exchange) {
        return BindingBuilder.bind(userQueue).to(exchange).with(ROUTING_KEY_TO_USER);
    }

    @Bean
    public Binding bindingCartQueue(Queue cartQueue, TopicExchange exchange) {
        return BindingBuilder.bind(cartQueue).to(exchange).with(ROUTING_KEY_TO_CART);
    }
}