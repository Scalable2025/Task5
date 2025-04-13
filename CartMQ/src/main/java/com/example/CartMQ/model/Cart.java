package com.example.CartMQ.model;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class Cart {

    private UUID cartId;
    private String userId;

    public Cart() {
        this.cartId = UUID.randomUUID();
    }
    public Cart(String userId) {
        this.cartId = UUID.randomUUID();
        this.userId = userId;
    }
    public UUID getCartId() {
        return cartId;
    }
    public void setCartId(UUID cartId) {
        this.cartId = cartId;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String toString() {
        return "Cart [cartId=" + cartId + ", userId=" + userId + "]";
    }

    
}
