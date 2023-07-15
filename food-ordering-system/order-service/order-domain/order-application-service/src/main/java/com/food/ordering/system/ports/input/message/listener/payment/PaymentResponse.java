package com.food.ordering.system.ports.input.message.listener.payment;

public interface PaymentResponse {

    void paymentCompleted(com.food.ordering.system.dto.message.PaymentResponse paymentResponse);

    void paymentCancelled(com.food.ordering.system.dto.message.PaymentResponse paymentResponse);
}
