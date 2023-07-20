package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.order.service.domain.event.OrderCreatedEvent;
import com.food.ordering.system.order.service.domain.ports.output.message.publisher.payment.OrderCreatedPaymentPublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Slf4j
@Component
public class OrderCreatedEventApplicationListener {

    private final OrderCreatedPaymentPublisher orderCreatedPaymentPublisher;

    public OrderCreatedEventApplicationListener(OrderCreatedPaymentPublisher orderCreatedPaymentPublisher) {
        this.orderCreatedPaymentPublisher = orderCreatedPaymentPublisher;
    }

    @TransactionalEventListener
    void process(OrderCreatedEvent orderCreatedEvent) {
        orderCreatedPaymentPublisher.publish(orderCreatedEvent);
    }

}
